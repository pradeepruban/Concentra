package com.syntel.isap.provisioning.service.impl;


import java.util.ArrayList;
import java.util.List;

import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.isap.cloudmanager.responses.xsd.AddOpenstackFloatingIpResp;
import com.isap.cloudmanager.responses.xsd.GetOpenstackFlavorResp;
import com.syntel.isap.provisioning.bean.CustomVM;
import com.syntel.isap.provisioning.bean.CustomVMExt;
import com.syntel.isap.provisioning.bean.EnvironmentVDC;
import com.syntel.isap.provisioning.bean.EnvironmentVM;
import com.syntel.isap.provisioning.bean.EnvironmentVMExt;
import com.syntel.isap.provisioning.bean.Identity;
import com.syntel.isap.provisioning.bean.ServiceReqDts;
import com.syntel.isap.provisioning.bean.ServiceReqMst;
import com.syntel.isap.provisioning.bean.StackList;
import com.syntel.isap.provisioning.constants.ActiveMQCredentials;
import com.syntel.isap.provisioning.constants.OpenStackCredentials;
import com.syntel.isap.provisioning.constants.ScmConstants;
import com.syntel.isap.provisioning.dao.ILaunchDao;
import com.syntel.isap.provisioning.service.ILaunchService;

/**
 * @author KK5007843
 *
 */

@Service("launchService")
public class LaunchServiceImpl implements ILaunchService {

	@Autowired
	private ILaunchDao launchDao;
	
    @Autowired
	private com.syntel.isap.provisioning.soap.OpenStackServices openStackServices;
	
	
	private static final Logger LOGGER = Logger.getLogger(LaunchServiceImpl.class.getName());
	
	javax.jms.Connection jmsConnection = null;
	Session session = null;
	
	@Transactional
	public void customLaunch(String keypair,String image, String network, String security,String flavor, 
			CustomVM customVM,ServiceReqMst serviceReqMst) throws JMSException {
		ServiceReqDts reqDts=new ServiceReqDts();
		List<CustomVMExt> customVMExtDetails = new ArrayList<CustomVMExt>();
		/*int random=(int) Math.round(Math.random() * 9999 + 1);*/
		serviceReqMst.setService_req_flow_id(1);
		serviceReqMst.setStatus(OpenStackCredentials.OPENSTACK_CUSTOM_STATUS);
		launchDao.addServiceRequest(serviceReqMst);
		LOGGER.info("Generated RequestId"+serviceReqMst.getService_req_id());
		reqDts.setService_req_id(serviceReqMst.getService_req_id());
		reqDts.setReq_user_id(1);
		launchDao.addServiceRequestDts(reqDts);
		LOGGER.info("Generated RequestDetailsId"+reqDts.getService_req_dts_id());
		customVM.setService_req_id(serviceReqMst.getService_req_id());
		customVM.setService_req_dts_id(reqDts.getService_req_dts_id());
		customVM.setIsap_env_vdc_master_vdc_id(1);
		customVM.setStatus(OpenStackCredentials.OPENSTACK_CUSTOM_STATUS);
		customVM.setIp_addr("-");
		customVM.setPublic_ip_addr("-");
		launchDao.addCustomVMDetails(customVM);		
	    int customId=customVM.getVm_custom_id();	    
	    LOGGER.info("Generated CustomId"+customId);
		CustomVMExt networks = new CustomVMExt(OpenStackCredentials.OPENSTACK_CUSTOM_NETWORK,network,customId);
		CustomVMExt images= new CustomVMExt(OpenStackCredentials.OPENSTACK_CUSTOM_IMAGE,openStackServices.getImageDetails(OpenStackCredentials.OPENSTACK_IP, OpenStackCredentials.OPENSTACK_USER_NAME,OpenStackCredentials.OPENSTACK_USER_PASSWORD ,OpenStackCredentials.OPENSTACK_USER_TENANTNAME, image),customId);
		GetOpenstackFlavorResp flavResponse=openStackServices.getFlavorDetails( OpenStackCredentials.OPENSTACK_IP, OpenStackCredentials.OPENSTACK_USER_NAME,OpenStackCredentials.OPENSTACK_USER_PASSWORD ,OpenStackCredentials.OPENSTACK_USER_TENANTNAME,flavor);	
		CustomVMExt flavors= new CustomVMExt(OpenStackCredentials.OPENSTACK_CUSTOM_FLAVOR,flavResponse.getRam()+" MB  RAM | "+ flavResponse.getVcpus()+ "  VCPU | "+flavResponse.getDisk() +" GB Disk",customId);
		CustomVMExt securities= new CustomVMExt(OpenStackCredentials.OPENSTACK_CUSTOM_SECURITY,openStackServices.getSecurityGroupName(OpenStackCredentials.OPENSTACK_IP, OpenStackCredentials.OPENSTACK_USER_NAME,OpenStackCredentials.OPENSTACK_USER_PASSWORD ,OpenStackCredentials.OPENSTACK_USER_TENANTNAME,security),customId);
		CustomVMExt key= new CustomVMExt(OpenStackCredentials.OPENSTACK_CUSTOM_KEYPAIR,keypair,customId);
		customVMExtDetails.add(networks);
		customVMExtDetails.add(images);
		customVMExtDetails.add(flavors);
		customVMExtDetails.add(securities);	
		customVMExtDetails.add(key);	
		for(CustomVMExt cust:customVMExtDetails)
			launchDao.addCustomVMExt(cust);
	     ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(ActiveMQCredentials.MQ_URL);
	     jmsConnection = connectionFactory.createConnection();
	     jmsConnection.start();
	        // JMS messages are sent and received using a Session. We will
	        // create here a non-transactional session object. If you want
	        // to use transactions you should set the first parameter to 'true'
	     session = jmsConnection.createSession(false,Session.AUTO_ACKNOWLEDGE);
	        // Destination represents here our queue 'TESTQUEUE' on the
	        // JMS server. You don't have to do anything special on the
	        // server to create it, it will be created automatically.
	     Destination destination = session.createQueue(ActiveMQCredentials.QUEUE_NAME);
	     MessageProducer producer = session.createProducer(destination);       
	     String inputReq = "<?xml version='1.0' ?>" + "\n" 
	                +  "<env:Envelope xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:a=\"http://schemas.xmlsoap.org/soap/http\">\n"
			        +"<env:Header><a:soapAction>urn:getToken</a:soapAction></env:Header>\n"
					+ "<env:Body>\n"
			        + "<p:server_launch_inputs xmlns:p=\"http://inputs.server.isap.com\">\n"
			        +  "<p:vm_custom_id>"+customId+ "</p:vm_custom_id>\n"
					+  "<p:cloudType>"+"openstack"+ "</p:cloudType>\n"
					+  "<p:ip>"+OpenStackCredentials.OPENSTACK_IP+ "</p:ip>\n"
					+ "<p:userid>"+"kalyan"+ "</p:userid>\n"
					+ "<p:image_id>"+image+ "</p:image_id>\n"
					+ "<p:username>"+OpenStackCredentials.OPENSTACK_USER_NAME+ "</p:username>\n"
					+ "<p:password>"+OpenStackCredentials.OPENSTACK_USER_PASSWORD+ "</p:password>\n"
			        + "<p:tenantname>" +OpenStackCredentials.OPENSTACK_USER_TENANTNAME+"</p:tenantname>\n"
			        + "<p:inst_name>"+customVM.getVm_name()+"</p:inst_name>\n"			   
			        + "<p:flavour>"+flavor+"</p:flavour>\n"
			        + "<p:az_zone>"+"STG_CHN_ZA01"+"</p:az_zone>\n"
			        + "<p:network_id>"+network+"</p:network_id>\n"
			        + "<p:sec_group>"+security+"</p:sec_group>\n"
			        + "<p:keypair>"+keypair+"</p:keypair>\n"			       
			        + "<p:puppet_Master_IP>"+ScmConstants.PUPPET_HOSTIP+"</p:puppet_Master_IP>\n"
			        + "<p:puppet_Master_Hostname>"+ScmConstants.PUPPET_HOSTNAME+"</p:puppet_Master_Hostname>\n"
			        + "<p:scm>"+ScmConstants.PUPPET_DISABLE+"</p:scm>\n"
					+ "</p:server_launch_inputs>\n"
			        + "</env:Body>\n"
					+ "</env:Envelope>";
	        LOGGER.info("result" + inputReq);
	        TextMessage message = session.createTextMessage(inputReq);
	        // Here we are sending the message!
	        producer.send(message);
	        LOGGER.info("Sent message '" + message.getText() + "'");
    }
	
	@Transactional
	public List<CustomVM> getCustomList(int userId) throws Exception {
		List<CustomVMExt> customVMExtDetails = new ArrayList<CustomVMExt>();
		List<CustomVM> customList=new ArrayList<CustomVM>();
		List<CustomVM> customNewList=new ArrayList<CustomVM>();
		customList=launchDao.getCustomList(userId);
		LOGGER.info("Inside getCustomList"+customList);
		for(CustomVM customVM:customList){
			StackList list=new StackList();
			int customId=customVM.getVm_custom_id();
			LOGGER.info("CustomId"+customId);
			customVMExtDetails=launchDao.getCustomVMExtDetailsById(customId);
			for(CustomVMExt customVMExt:customVMExtDetails){
				 LOGGER.info("CustomVMExt Details:"+customVMExt.getParam_val()+":"+customVMExt.getParam_val());
						if(customVMExt.getParam_name().equalsIgnoreCase(OpenStackCredentials.OPENSTACK_CUSTOM_IMAGE)){							
							list.setImage(customVMExt.getParam_val());
						}
				        else if(customVMExt.getParam_name().equalsIgnoreCase(OpenStackCredentials.OPENSTACK_CUSTOM_FLAVOR)){				        					       				     
				        	list.setFlavor(customVMExt.getParam_val());				      
				        }
						else if(customVMExt.getParam_name().equalsIgnoreCase(OpenStackCredentials.OPENSTACK_CUSTOM_SECURITY)){
							list.setSecurity(customVMExt.getParam_val());
						}
						else if(customVMExt.getParam_name().equalsIgnoreCase(OpenStackCredentials.OPENSTACK_CUSTOM_NETWORK)){
							list.setNetwork(customVMExt.getParam_val());
						}
						else if(customVMExt.getParam_name().equalsIgnoreCase(OpenStackCredentials.OPENSTACK_CUSTOM_KEYPAIR)){
							list.setKeypair(customVMExt.getParam_val());
						}
			     }
				customVM.setCustomVMExts(customVMExtDetails);
				customVM.setStackList(list);
				customNewList.add(customVM);
		    }
		return customList;
	}

	@Transactional
	public List<Identity> getKeyPairList(int usr_id) {
		return launchDao.getKeyPairList(usr_id);
	}
	
	@Transactional
	public void addKeyPair(String name, String keyPairPrivate, int usrId) {
		Identity keypair=new Identity();
		keypair.setContent(keyPairPrivate);
		keypair.setUsr_id(usrId);
		keypair.setName(name);
		launchDao.addKeyPair(keypair);
	}
	
	@Transactional
	public Identity getIdentity(int keyId) {
		return launchDao.getIdentity(keyId);
	}
	
	@Transactional
	public int checkKeyPair(String name) {
		Identity identity=launchDao.checkKeyPair(name);
		LOGGER.info("CustomId"+identity);
		if(identity!=null){
			return 1;
		}
		return 0;
	}
	
	@Transactional
	public List<String> getKeyPairs(int usrId) {
		return launchDao.getKeyPairs(usrId);
	}
	
	@Transactional
	public void terminateInstance(String instId) {		
		for (String retval: instId.split(",")){
			String opensInstId= launchDao.getOpenStackInstanceId(Integer.parseInt(retval));
			launchDao.terminateInstance(Integer.parseInt(retval));	
			openStackServices.terminateInstance(OpenStackCredentials.OPENSTACK_IP, OpenStackCredentials.OPENSTACK_USER_NAME,OpenStackCredentials.OPENSTACK_USER_PASSWORD ,OpenStackCredentials.OPENSTACK_USER_TENANTNAME,opensInstId);
	      }
	}
	
	@Transactional
	public void addFloatingIP(String instId) {
		String opensInstId= launchDao.getOpenStackInstanceId(Integer.parseInt(instId));
		AddOpenstackFloatingIpResp flaotingIpResponse=openStackServices.addFloatinIp(OpenStackCredentials.OPENSTACK_IP, OpenStackCredentials.OPENSTACK_USER_NAME,OpenStackCredentials.OPENSTACK_USER_PASSWORD ,OpenStackCredentials.OPENSTACK_USER_TENANTNAME,OpenStackCredentials.OPENSTACK_POOL,opensInstId);
		launchDao.updatePublicIP(Integer.parseInt(instId),flaotingIpResponse.getFloatingIp().getValue());
	}
	
	@Transactional
	public void removeFloatingIP(String instId) {
		String opensInstId= launchDao.getOpenStackInstanceId(Integer.parseInt(instId));
		int returnCode=openStackServices.removeFloatinIp(OpenStackCredentials.OPENSTACK_IP, OpenStackCredentials.OPENSTACK_USER_NAME,OpenStackCredentials.OPENSTACK_USER_PASSWORD ,OpenStackCredentials.OPENSTACK_USER_TENANTNAME,OpenStackCredentials.OPENSTACK_POOL,opensInstId);
		
		if(returnCode==1)
		launchDao.updatePublicIPToNull(Integer.parseInt(instId));
	}
	

	@Transactional
	public EnvironmentVM getEnvVmDetailsByID(Integer envVMid) {
		EnvironmentVM envVM=launchDao.getEnvVmDetailsByID(envVMid);
		return envVM;
	}

	@Transactional
	public List<EnvironmentVMExt> getVMExtParamsByID(Integer envVMid) {
		List<EnvironmentVMExt> envVMExtDet=launchDao.getVMExtParamsByID(envVMid);
		return envVMExtDet;
	}

	@Transactional
	public List<EnvironmentVDC> getEnvVdcList() {
		 List<EnvironmentVDC> envVDCList=launchDao.getEnvVdcList();
		 return envVDCList;
	}
	
	@Transactional
	public List<EnvironmentVDC> getEnvVdcListById(int userid) {
		List<EnvironmentVDC> envVDCList=launchDao.getEnvVdcListById(userid);
		 return envVDCList;
	}
	
	@Transactional
	public List<EnvironmentVM> getEnvVmDetails() {
		  List<EnvironmentVM> envVMList=launchDao.getEnvVmDetails();
		return envVMList;
	}

	@Transactional
	public List<EnvironmentVMExt> getVMExtParams() {
		 List<EnvironmentVMExt> envVMExtList=launchDao.getVMExtParams();
		return envVMExtList;
	}

	

}

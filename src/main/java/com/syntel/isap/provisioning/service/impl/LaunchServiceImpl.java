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

import com.isap.cloudmanager.responses.xsd.GetOpenstackFlavorResp;
import com.syntel.isap.provisioning.bean.CustomVM;
import com.syntel.isap.provisioning.bean.CustomVMExt;
import com.syntel.isap.provisioning.bean.EnvironmentVM;
import com.syntel.isap.provisioning.bean.EnvironmentVMExt;
import com.syntel.isap.provisioning.bean.ServiceReqDts;
import com.syntel.isap.provisioning.bean.ServiceReqMst;
import com.syntel.isap.provisioning.bean.StackList;
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
	
	javax.jms.Connection jmsConnection = null;
	Session session = null;
	
	private static final Logger LOGGER = Logger.getLogger(LaunchServiceImpl.class.getName());
	
	@Transactional
	public void customLaunch(String image, String network, String security,
			                 String flavor, CustomVM customVM,ServiceReqMst serviceReqMst) throws JMSException {
	
		ServiceReqDts reqDts=new ServiceReqDts();
		List<CustomVMExt> customVMExtDetails = new ArrayList<CustomVMExt>();
		/*int random=(int) Math.round(Math.random() * 9999 + 1);*/
		serviceReqMst.setService_req_flow_id(1);
		serviceReqMst.setStatus("Requested");
		launchDao.addServiceRequest(serviceReqMst);
		LOGGER.info("Generated RequestId"+serviceReqMst.getService_req_id());
		reqDts.setService_req_id(serviceReqMst.getService_req_id());
		reqDts.setReq_user_id(1);
		launchDao.addServiceRequestDts(reqDts);
		LOGGER.info("Generated RequestDetailsId"+reqDts.getService_req_dts_id());
		customVM.setService_req_id(serviceReqMst.getService_req_id());
		customVM.setService_req_dts_id(reqDts.getService_req_dts_id());
		customVM.setIsap_env_vdc_master_vdc_id(1);
		customVM.setStatus("Requested");
		customVM.setIp_addr("-");
		launchDao.addCustomVMDetails(customVM);		
	    int customId=customVM.getVm_custom_id();	    
	    LOGGER.info("Generated CustomId"+customId);
	    
	   //GetOpenstackFlavorResp flav= openStackServices.getFlavorDetails(flavor, "192.168.175.153", "pramod_nelavalli@syntelinc.com", "syntel123$", "ISAP-STGMA");
	   //flavor=flav.getRam()+" MB RAM |"+flav.getVcpus()+" VCPU |"+ flav.getDisk()+" GB";

	   //openStackServices.getSecurityGroupDetails(security, "192.168.175.153", "pramod_nelavalli@syntelinc.com", "syntel123$", "ISAP-STGMA");
	   
	   
		CustomVMExt networks = new CustomVMExt("network",network,customId);
		CustomVMExt images= new CustomVMExt("image",image,customId);
		CustomVMExt flavors= new CustomVMExt("flavor",flavor,customId);
		CustomVMExt securities= new CustomVMExt("security",security,customId);
		customVMExtDetails.add(networks);
		customVMExtDetails.add(images);
		customVMExtDetails.add(flavors);
		customVMExtDetails.add(securities);	
		for(CustomVMExt cust:customVMExtDetails)
			launchDao.addCustomVMExt(cust);
		
	     ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://192.168.175.13:61616");
	     jmsConnection = connectionFactory.createConnection();
	     jmsConnection.start();

	        // JMS messages are sent and received using a Session. We will
	        // create here a non-transactional session object. If you want
	        // to use transactions you should set the first parameter to 'true'
	        session = jmsConnection.createSession(false,Session.AUTO_ACKNOWLEDGE);

	        // Destination represents here our queue 'TESTQUEUE' on the
	        // JMS server. You don't have to do anything special on the
	        // server to create it, it will be created automatically.
	        Destination destination = session.createQueue("IsapLaunchServerQ");

	        MessageProducer producer = session.createProducer(destination);
            int flav=2;
	        
	        String inputReq = "<?xml version='1.0' ?>" + "\n" 
	                +  "<env:Envelope xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:a=\"http://schemas.xmlsoap.org/soap/http\">\n"
			        +"<env:Header><a:soapAction>urn:getToken</a:soapAction></env:Header>\n"
					+ "<env:Body>\n"
			        + "<p:server_launch_inputs xmlns:p=\"http://inputs.server.isap.com\">\n"
			        +  "<p:vm_custom_id>"+customId+ "</p:vm_custom_id>\n"
					+  "<p:cloudType>"+"openstack"+ "</p:cloudType>\n"
					+  "<p:ip>"+"192.168.175.153"+ "</p:ip>\n"
					+ "<p:userid>"+"pramod"+ "</p:userid>\n"
					+ "<p:image_id>"+"490f5723-db50-4e37-82aa-3b4c52d8ae85"+ "</p:image_id>\n"
					+ "<p:username>"+"pramod_nelavalli@syntelinc.com"+ "</p:username>\n"
					+ "<p:password>"+"syntel123$"+ "</p:password>\n"
			        + "<p:tenantname>" +"ISAP-STGMA"+"</p:tenantname>\n"
			        + "<p:inst_name>"+customVM.getVm_name()+"</p:inst_name>\n"			   
			        + "<p:flavour>"+flav+"</p:flavour>\n"
			        + "<p:az_zone>"+"STG_CHN_ZA01"+"</p:az_zone>\n"
			        + "<p:network_id>"+"03d27216-3f30-46f6-b051-c91a0dc83ea0"+"</p:network_id>\n"
			        + "<p:sec_group>"+security+"</p:sec_group>\n"
			        + "<p:keypair>"+"pro"+"</p:keypair>\n"
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
	public List<CustomVM> getCustomList() {
		List<CustomVMExt> customVMExtDetails = new ArrayList<CustomVMExt>();
		List<CustomVM> customList=new ArrayList<CustomVM>();
		List<CustomVM> customNewList=new ArrayList<CustomVM>();
		customList=launchDao.getCustomList();
		LOGGER.info("Inside getCustomList"+customList);
		for(CustomVM customVM:customList){
			StackList list=new StackList();
			int customId=customVM.getVm_custom_id();
			LOGGER.info("CustomId"+customId);
			customVMExtDetails=launchDao.getCustomVMExtDetailsById(customId);
			for(CustomVMExt customVMExt:customVMExtDetails){
				 LOGGER.info("CustomVMExt Details:"+customVMExt.getParam_val()+":"+customVMExt.getParam_val());
						if(customVMExt.getParam_name().equalsIgnoreCase("image")){
							list.setImage(customVMExt.getParam_val());
						}
				        else if(customVMExt.getParam_name().equalsIgnoreCase("flavor")){
							if(customVMExt.getParam_val().equalsIgnoreCase("m1.tiny")){
								list.setFlavor("m1.tiny | 512MB  RAM | 1 VCPU | 1.0GB Disk");
							}
							else if(customVMExt.getParam_val().equalsIgnoreCase("m1.small")){
								list.setFlavor("m1.small | 2GB RAM | 1 VCPU | 20.0GB Disk"); 
							}
							else if(customVMExt.getParam_val().equalsIgnoreCase("m1.medium")){
								list.setFlavor("m1.medium | 4GB RAM | 2 VCPU | 40.0GB Disk"); 
							}
							else if(customVMExt.getParam_val().equalsIgnoreCase("m1.large")){
								list.setFlavor("m1.large | 8GB RAM | 4 VCPU | 80.0GB Disk"); 
							}
							else if(customVMExt.getParam_val().equalsIgnoreCase("m1.xlarge")){
								list.setFlavor("m1.xlarge | 16GB RAM | 8 VCPU | 160.0GB Disk"); 
							}
				        }
						else if(customVMExt.getParam_name().equalsIgnoreCase("security")){
							list.setSecurity(customVMExt.getParam_val());
						}
						else if(customVMExt.getParam_name().equalsIgnoreCase("network")){
							list.setNetwork(customVMExt.getParam_val());
						}
			     }
				customVM.setCustomVMExts(customVMExtDetails);
				customVM.setStackList(list);
				customNewList.add(customVM);
		    }
		return customList;
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

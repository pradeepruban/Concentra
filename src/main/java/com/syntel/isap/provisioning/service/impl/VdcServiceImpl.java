package com.syntel.isap.provisioning.service.impl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.isap.cloudmanager.responses.xsd.GetOpenstackFlavorResp;
import com.syntel.isap.provisioning.bean.CustomVM;
import com.syntel.isap.provisioning.bean.CustomVMExt;
import com.syntel.isap.provisioning.bean.Monitor;
import com.syntel.isap.provisioning.bean.Vdc;
import com.syntel.isap.provisioning.bean.VdcExt;
import com.syntel.isap.provisioning.bean.SCM;
import com.syntel.isap.provisioning.bean.StackList;
import com.syntel.isap.provisioning.bean.VdcList;
import com.syntel.isap.provisioning.constants.OpenStackCredentials;
import com.syntel.isap.provisioning.dao.IVdcDao;
import com.syntel.isap.provisioning.mapper.VdcMapper;
import com.syntel.isap.provisioning.service.IVdcService;

@Service("registerService")
public class VdcServiceImpl implements IVdcService {
	
	@Autowired
	private IVdcDao registerdao;
	
	
    @Autowired
	private com.syntel.isap.provisioning.soap.OpenStackServices openStackServices;
	

	

	@Transactional
	public List<Vdc> getUserOpenstack() {
		List<VdcExt> openstackVdcExtDetails = new ArrayList<VdcExt>();
		List<Vdc> vdcdetails=new ArrayList<Vdc>();
		List<Vdc> vdcNewList=new ArrayList<Vdc>();
		vdcdetails=registerdao.getVdcList();
		
		for(Vdc vdcdet:vdcdetails){
			VdcList list=new VdcList();
			int vdcId=vdcdet.getVdc_id();
			
			openstackVdcExtDetails=registerdao.getVdcExtDetailsById( vdcId);
			for(VdcExt VdcExt:openstackVdcExtDetails){
				
						if(VdcExt.getParam_name().equalsIgnoreCase("adminTenant")){							
							list.setAdminTenant(VdcExt.getParam_val());
						}
				        else if(VdcExt.getParam_name().equalsIgnoreCase("description")){				        					       				     
				        	list.setDescription(VdcExt.getParam_val());				      
				        }
						else if(VdcExt.getParam_name().equalsIgnoreCase("controllerEndpoint")){
							list.setControllerEndpoint(VdcExt.getParam_val());
						}
						else if(VdcExt.getParam_name().equalsIgnoreCase("keystoneEndpoint")){
							list.setKeystoneEndpoint(VdcExt.getParam_val());
						}
						else if(VdcExt.getParam_name().equalsIgnoreCase("subnetAddress")){
							list.setSubnetAddress(VdcExt.getParam_val());
						}
						else if(VdcExt.getParam_name().equalsIgnoreCase("version")){
							list.setVersion(VdcExt.getParam_val());
						}
			     }
			vdcdet.setVdcExt(openstackVdcExtDetails);
			vdcdet.setVdclist(list);
			vdcNewList.add(vdcdet);
		    }
		return vdcdetails;

		
	}

	
	

	@Transactional
	public int setOpenstack(Vdc openstack) {
		List<VdcExt> openStackVdcExtDetails = new ArrayList<VdcExt>();
		registerdao.setOpenstack(openstack);	
	    int vdc_id=openstack.getVdc_id();	    
	  
	    VdcExt adminTenant = new VdcExt("adminTenant",openstack.getTenant(),vdc_id);
	    VdcExt controllerEndpoint= new VdcExt("controllerEndpoint",openstack.getController_endpoint(),vdc_id);
		
		VdcExt description= new VdcExt("description",openstack.getDescription(),vdc_id);
		VdcExt keystoneEndpoint= new VdcExt("keystoneEndpoint",openstack.getKeystone_endpoint(),vdc_id);
		VdcExt subnetAddress= new VdcExt("subnetAddress",openstack.getSubnet_address(),vdc_id);
		VdcExt version= new VdcExt("version",openstack.getVersion(),vdc_id);
		openStackVdcExtDetails.add(adminTenant);
		openStackVdcExtDetails.add(controllerEndpoint);
		openStackVdcExtDetails.add(description);
		openStackVdcExtDetails.add(keystoneEndpoint);	
		openStackVdcExtDetails.add(subnetAddress);
		openStackVdcExtDetails.add(version);	
		for(VdcExt vdc:openStackVdcExtDetails)
			registerdao.addOpenStackVdcExt(vdc);
		return 1;
	}

	@Transactional
	public int getKeystone(String keystone_endpoint) {
		// TODO Auto-generated method stub
		return registerdao.getKeystone(keystone_endpoint);
	}

	
	@Transactional
	public int getControllerEndpoint(String controller_endpoint) {
		// TODO Auto-generated method stub
		return registerdao.getControllerEndpoint(controller_endpoint);
	}

	@Transactional
	public Vdc getDetails(Integer vdc_id) {
		Vdc vdc=new Vdc();
		List<VdcExt> openstackVdcExtDetails = new ArrayList<VdcExt>();
		List<Vdc> vdcdetails=new ArrayList<Vdc>();
		vdcdetails=registerdao.getVdcEditList(vdc_id);
	    
		
			openstackVdcExtDetails=registerdao.getVdcExtDetailsById(vdc_id );
			for(VdcExt VdcExt:openstackVdcExtDetails){
				
						if(VdcExt.getParam_name().equalsIgnoreCase("adminTenant")){							
							
							vdc.setTenant(VdcExt.getParam_val());
						}
				        else if(VdcExt.getParam_name().equalsIgnoreCase("description")){				        					       				     
				        	vdc.setDescription(VdcExt.getParam_val());				      
				        }
						else if(VdcExt.getParam_name().equalsIgnoreCase("controllerEndpoint")){
							vdc.setController_endpoint(VdcExt.getParam_val());
						}
						else if(VdcExt.getParam_name().equalsIgnoreCase("keystoneEndpoint")){
							vdc.setKeystone_endpoint(VdcExt.getParam_val());
						}
						else if(VdcExt.getParam_name().equalsIgnoreCase("subnetAddress")){
							vdc.setSubnet_address(VdcExt.getParam_val());
						}
			     }
			
		   for (Vdc vdcnew : vdcdetails) {
			vdc.setVdc_name(vdcnew.getVdc_name());
			vdc.setVdc_location(vdcnew.getVdc_location());
			vdc.setVdc_status(vdcnew.getVdc_status());
			
		}
		
		return vdc;

	}

	@Transactional
	public int updateOpenstack(Vdc openstack) {
		List<VdcExt> openStackVdcExtDetails = new ArrayList<VdcExt>();
		List<Vdc> vdclist=new ArrayList<Vdc>();
		registerdao.updateOpenstack(openstack);	
	    int vdc_id=openstack.getVdc_id();	    
	  
	    VdcExt adminTenant = new VdcExt("adminTenant",openstack.getTenant(),vdc_id);
		VdcExt description= new VdcExt("description",openstack.getDescription(),vdc_id);
		openStackVdcExtDetails.add(adminTenant);
		openStackVdcExtDetails.add(description);
		for(VdcExt vdc:openStackVdcExtDetails)
		registerdao.updateOpenStackVdcExt(vdc);
		return 1;
		
	}

	@Transactional
	public void deleteOpenstack(Integer vdc_id) {
		
		registerdao.deleteOpenstack(vdc_id);
	}

	@Transactional
	public List<SCM> getscm() {
		List<SCM> i=registerdao.getscm();	
		List<Vdc> vdc=null;
    	 for (SCM scm3 : i) {
			int b=scm3.getScm_id();
		    vdc=registerdao.getvdc(b);
		    scm3.setVdc(vdc);
			
		}
		return i;
	}

	@Transactional
	public int setscmpuppet(SCM scm) {
		// TODO Auto-generated method stub
		return registerdao.setscmpuppet(scm);
	}

	@Transactional
	public int setscmchef(SCM scm) {
		// TODO Auto-generated method stub
		return registerdao.setscmchef(scm);
	}

	@Transactional
	public SCM editScm(Integer scmid) {
		// TODO Auto-generated method stub
		return  registerdao.editSCm(scmid);
	
	}

	

	/*@Transactional
	public void updateScm(SCM scm) {
		// TODO Auto-generated method stub
		registerdao.updateScm(scm);
	}*/

	@Transactional
	public void update(SCM scm) {
		System.out.println("inside update service"+scm.getScm_id());
		registerdao.update(scm);
	}

	@Transactional
	public void deleteProject(Integer scm_id) {
			registerdao.deleteProject(scm_id);
			
	}
	
	@Transactional
	public int getScmEndpoint(String scm_endpoint) {
		// TODO Auto-generated method stub
		return registerdao.getScmEndpoint(scm_endpoint);
	}


	@Transactional
	public List<Monitor> getMonitorDetails() {
	  List<Monitor>i= registerdao.getMonitorDetails();
	  List<Vdc> vdc=null;		 
     	for (Monitor monitor1 : i) {
			int b=monitor1.getMon_id();
			vdc= registerdao.getMonitorVdc(b);
		    monitor1.setVdc(vdc);
			
		}
     	return i;
	
	}
	
	@Transactional
	public void deleteMonitor(Integer mon_id) {
		
		registerdao.deleteMonitor(mon_id);
	}

	@Transactional
	public void updateMonitor(Monitor monitor) {
		// TODO Auto-generated method stub
		registerdao.updateMonitor(monitor);
	}

	@Transactional
	public Monitor editMon(Integer mon_id) {
		// TODO Auto-generated method stub
		return  registerdao.editMon(mon_id);
	}

	@Transactional
	public int setMonNagio(Monitor monitor) {
		
		return registerdao.setMonNagio( monitor);
	}

	@Transactional
	public int setMonZabbix(Monitor monitor) {
		
		return registerdao.setMonZabbix( monitor);
	}
	
	@Transactional
	public int getMonEndpoint(String mon_endpoint) {
		// TODO Auto-generated method stub
		return registerdao.getMonEndpoint(mon_endpoint);
	}

	@Transactional
	public int getVdcName(String vdc_name) {
		// TODO Auto-generated method stub
		return registerdao.getVdcName(vdc_name);
	}

	@Transactional
	public int getScmName(String scm_name) {
		// TODO Auto-generated method stub
		return registerdao.getScmName(scm_name);
	}

	@Transactional
	public int getMonName(String mon_name) {
		// TODO Auto-generated method stub
		return registerdao.getMonName(mon_name);

	}
	
	@Transactional
	public int getScmid(String scm_name) {
		return registerdao.getScmid(scm_name);
	}

	@Transactional
	public void setMap(Vdc openstack) {
		registerdao.setMap(openstack);
	}

	
	@Transactional
	public int getMonid(String mon_name) {
		return registerdao.getMonid(mon_name);
	}

	@Transactional
	public int checkConnection(String subnet_address, String tenant,
			String user, String password) {
		return openStackServices.getIsapCloudAuthentication(subnet_address,user,password,tenant,OpenStackCredentials.OPENSTACK_TYPE);
	}



	@Transactional
	public int getSubnetAddress(String subnet_address) {
		return registerdao.getSubnetAddress(subnet_address);
	}


	@Transactional
	public void getUsage(int vdcId) {
		
		Vdc vdc=registerdao.getVdcExt(vdcId);
		
	}
    
	
	
}

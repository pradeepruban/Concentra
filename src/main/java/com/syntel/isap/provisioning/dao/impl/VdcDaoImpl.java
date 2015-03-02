package com.syntel.isap.provisioning.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.syntel.isap.provisioning.bean.Monitor;
import com.syntel.isap.provisioning.bean.Vdc;
import com.syntel.isap.provisioning.bean.VdcExt;
import com.syntel.isap.provisioning.bean.SCM;
import com.syntel.isap.provisioning.bean.Vdc;
import com.syntel.isap.provisioning.dao.IVdcDao;
import com.syntel.isap.provisioning.mapper.VdcMapper;

@Service("registerdao")
public class VdcDaoImpl implements IVdcDao{
	
	@Autowired
	private VdcMapper registerMapper;

	@Transactional
	public int setOpenstack(Vdc openstack) {
			 
	       return registerMapper.setVdcMaster(openstack);
				
			 }
	       
			
		
	@Transactional
	public int getKeystone(String keystone_endpoint) {
		// TODO Auto-generated method stub
	
		List<String> li=registerMapper.getKeystone(keystone_endpoint);
		
		System.out.println(li);
		
		if(li.size()==0 )
		   return 0;
		else
			return 1;
		
	
	}

	

	@Transactional
	public int updateOpenstack(Vdc openstack) {
		// TODO Auto-generated method stub
		
		int	i=registerMapper.updateOpenstackMaster(openstack);
		
		return i;
	}

	@Transactional
	public void deleteOpenstack(Integer vdc_id) {
		registerMapper.deleteOpenstack(vdc_id);
		
	}

	@Transactional
	public List<SCM> getscm() {
		
		
			List<SCM> i=registerMapper.getscm();
			
			return i;
	}

	@Transactional
	public int setscmpuppet(SCM scm) {
		// TODO Auto-generated method stub
		int i=registerMapper.setscmpuppet(scm);
		return i;
	}

	@Transactional
	public int setscmchef(SCM scm) {
		// TODO Auto-generated method stub
		int i=registerMapper.setscmchef(scm);
		return i;
	}

	

	@Transactional
	public List<Vdc> getvdc(int b) {
		// TODO Auto-generated method stub
		List<Vdc> i=registerMapper.getvdc(b);
		return i;
	}

	@Transactional
	public SCM editSCm(Integer scmid) {
		// TODO Auto-generated method stub
		return registerMapper.editScm(scmid);
	}


	public void updateScm(SCM scm) {
		// TODO Auto-generated method stub
	 registerMapper.updateScm(scm);
	}

	@Transactional
	public void update(SCM scm) {
		System.out.println("inside dao update"+scm.getScm_id());
		registerMapper.update(scm.getScm_id(),scm.getScm_name(),scm.getHost_name(),scm.getScm_endpoint(),scm.getAdmin_user(),scm.getAdmin_pass());
	}

	
	public void deleteProject(Integer proj_id) {
			
			registerMapper.deleteProject(proj_id);
	}
	
	@Transactional
	public int getVdcName(String vdc_name) {
		// TODO Auto-generated method stub
         List<String> li=registerMapper.getVdcName(vdc_name);
		
		System.out.println(li);
		
		if(li.size()!=0 )
		   return 1;
		else
		   return 0;
	}
	
	@Transactional
	public int getScmEndpoint(String scm_endpoint) {
		// TODO Auto-generated method stub
         List<String> li=registerMapper.getScmEndpoint(scm_endpoint);
		
		System.out.println(li);
		
		if(li.size()==0 )
		   return 0;
		else
			return 1;
	}
    
	@Transactional
	public int getControllerEndpoint(String controller_endpoint) {
		// TODO Auto-generated method stub
         List<String> li=registerMapper.getControllerEndpoint(controller_endpoint);
		
		System.out.println(li);
		
		if(li.size()==0 )
		   return 0;
		else
			return 1;
	}
	
	@Transactional
	public List<Monitor> getMonitorDetails() {
		
		return registerMapper.getMonitorDetails();
	}

	@Transactional
	public List<Vdc> getMonitorVdc(int b) {
			return registerMapper.getMonitorVdc(b);
	}

	@Transactional
	public void deleteMonitor(Integer mon_id) {
		registerMapper.deleteMonitor(mon_id);
		
	}

	@Transactional
	public Monitor editMon(Integer mon_id) {
		// TODO Auto-generated method stub
		return registerMapper.editMon(mon_id);
	}

	@Transactional
	public void updateMonitor(Monitor monitor) {
		 registerMapper.updateMonitor(monitor);
		
	}

	@Transactional
	public int setMonNagio(Monitor monitor) {
		// TODO Auto-generated method stub
		return registerMapper.setMonNagio(monitor);
	}

	@Transactional
	public int setMonZabbix(Monitor monitor) {
		
		return registerMapper.setMonZabbix(monitor);
	}
			
	@Transactional
	public int getMonEndpoint(String mon_endpoint) {
		// TODO Auto-generated method stub
	
		List<String> li=registerMapper.getMonEndpoint(mon_endpoint);
		
		System.out.println(li);
		
		if(li.size()==0 )
		   return 0;
		else
			return 1;
		
	
	}

	@Transactional
	public int getScmName(String scm_name) {
		// TODO Auto-generated method stub
		List<String> li=registerMapper.getScmName(scm_name);
		
		System.out.println(li);
		
		if(li.size()==0 )
		   return 0;
		else
			return 1;
		
	
	}

	@Transactional
	public int getMonName(String mon_name) {
		// TODO Auto-generated method stub
		List<String> li=registerMapper.getMonName(mon_name);
		
		System.out.println(li);
		
		if(li.size()==0 )
		   return 0;
		else
			return 1;
		
	}
	
	

	@Transactional
	public int getScmid(String scm_name) {
		
		return registerMapper.getScmid(scm_name);
	}

	@Transactional
	public void setMap(Vdc openstack) {
		registerMapper.setMap(openstack);
		
	}

	
	@Transactional
	public int getMonid(String mon_name) {
		// TODO Auto-generated method stub
		return registerMapper.getMonid(mon_name);
	}



	public void addOpenStackVdcExt(VdcExt vdc) {
	
	 registerMapper.addOpenStackVdcExt(vdc);
		
	}


	public List<Vdc> getVdcList() {
		// TODO Auto-generated method stub
		return registerMapper.getVdcList();
	}



	public List<VdcExt> getVdcExtDetailsById(int vdcId) {
		// TODO Auto-generated method stub
		return registerMapper.getVdcExtDetailsById(vdcId);
	}



	public List<Vdc> getVdcEditList(Integer vdc_id) {
		// TODO Auto-generated method stub
		return registerMapper.getVdcEditList(vdc_id);
	}



	public void updateOpenStackVdcExt(VdcExt vdc) {
		
		registerMapper.updateOpenStackVdcExt(vdc);
		
	}



	public int getSubnetAddress(String subnet_address) {
		// TODO Auto-generated method stub
     List<String> li=registerMapper.getSubnetAddress(subnet_address);
		
		System.out.println(li);
		
		if(li.size()==0 )
		   return 0;
		else
			return 1;
	}



	public Vdc getVdcExt(int vdcId) {
		return registerMapper.getVdcExt(vdcId);
	}



}

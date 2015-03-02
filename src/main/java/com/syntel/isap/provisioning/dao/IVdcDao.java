package com.syntel.isap.provisioning.dao;

import java.util.List;

import com.syntel.isap.provisioning.bean.Monitor;
import com.syntel.isap.provisioning.bean.Vdc;
import com.syntel.isap.provisioning.bean.VdcExt;
import com.syntel.isap.provisioning.bean.SCM;
import com.syntel.isap.provisioning.bean.Vdc;
import com.syntel.isap.provisioning.bean.VdcExt;

public interface IVdcDao {

	int setOpenstack(Vdc openstack);

	int getKeystone(String keystone_endpoint);
	
	int getControllerEndpoint(String controller_endpoint);

	int updateOpenstack(Vdc openstack);

	void deleteOpenstack(Integer vdc_id);
	
	List<SCM> getscm();

	int setscmpuppet(SCM scm);

	int setscmchef(SCM scm);

	List<Vdc> getvdc(int b);

	SCM editSCm(Integer scmid);

	void updateScm(SCM scm);

	void update(SCM scm);

	void deleteProject(Integer scm_id);
	
	int getScmEndpoint(String scm_endpoint);

	List<Monitor> getMonitorDetails();

	List<Vdc> getMonitorVdc(int b);

	void deleteMonitor(Integer mon_id);

	Monitor editMon(Integer mon_id);

	void updateMonitor(Monitor monitor);

	int setMonNagio(Monitor monitor);

	int setMonZabbix(Monitor monitor);

	int getMonEndpoint(String mon_endpoint);

	int getVdcName(String vdc_name);

	int getScmName(String scm_name);

	int getMonName(String mon_name);

	int getScmid(String scm_name);

	void setMap(Vdc openstack);

	int getMonid(String mon_name);

	void addOpenStackVdcExt(VdcExt vdc);

	List<Vdc> getVdcList();

	List<VdcExt> getVdcExtDetailsById(int vdcId);

	List<Vdc> getVdcEditList(Integer vdc_id);

	void updateOpenStackVdcExt(VdcExt vdc);

	int getSubnetAddress(String subnet_address);

	Vdc getVdcExt(int vdcId);


}

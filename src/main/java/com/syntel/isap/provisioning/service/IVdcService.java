package com.syntel.isap.provisioning.service;

import java.util.List;

import com.syntel.isap.provisioning.bean.Monitor;
import com.syntel.isap.provisioning.bean.Vdc;
import com.syntel.isap.provisioning.bean.SCM;
import com.syntel.isap.provisioning.bean.Vdc;

public interface IVdcService {

List<Vdc> getUserOpenstack();



int setOpenstack(Vdc openstack);

int getKeystone(String keystone_endpoint);

int getControllerEndpoint(String controller_endpoint);

Vdc getDetails(Integer vdc_id);

int updateOpenstack(Vdc openstack);

void deleteOpenstack(Integer vdc_id);

List<SCM> getscm();

int setscmpuppet(SCM scm);

int setscmchef(SCM scm);

SCM editScm(Integer scmid);

void update(SCM scm);

void deleteProject(Integer scm_id);

int getScmEndpoint(String scm_endpoint);

List<Monitor> getMonitorDetails();

void deleteMonitor(Integer mon_id);

void updateMonitor(Monitor monitor);

Monitor editMon(Integer mon_id);

int setMonNagio(Monitor monitor);

int setMonZabbix(Monitor monitor);

int getMonEndpoint(String mon_endpoint);

int getVdcName(String vdc_name);

int getScmName(String scm_name);

int getMonName(String mon_name);

int getScmid(String scm_name);

void setMap(Vdc openstack);

int getMonid(String mon_name);

int checkConnection(String subnet_address, String tenant, String user,
		String password);

int getSubnetAddress(String subnet_address);

void getUsage(int vdcId);	

}

package com.syntel.isap.provisioning.dao.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syntel.isap.provisioning.bean.CustomVM;
import com.syntel.isap.provisioning.bean.CustomVMExt;
import com.syntel.isap.provisioning.bean.EnvironmentVDC;
import com.syntel.isap.provisioning.bean.EnvironmentVM;
import com.syntel.isap.provisioning.bean.EnvironmentVMExt;
import com.syntel.isap.provisioning.bean.Identity;
import com.syntel.isap.provisioning.bean.ServiceReqDts;
import com.syntel.isap.provisioning.bean.ServiceReqMst;
import com.syntel.isap.provisioning.dao.ILaunchDao;
import com.syntel.isap.provisioning.mapper.LaunchMapper;

/**
 * @author KK5007843
 *
 */

@Service("launchDao")
public class LaunchDaoImpl implements ILaunchDao {
	
    @Autowired
    private LaunchMapper launchMapper;
	
	public void addCustomVMDetails(CustomVM customVM) {
		launchMapper.addCustomVM(customVM);
	}

	public void addCustomVMExt(CustomVMExt cust) {
		launchMapper.addCustomVMExt(cust);
	}

	public void addServiceRequest(ServiceReqMst reqMst) {
		launchMapper.addServiceRequest(reqMst);
	}

	public void addServiceRequestDts(ServiceReqDts reqDts) {
		launchMapper.addServiceRequestDts(reqDts);
	}

	public List<CustomVM> getCustomList(int userId) {
		return launchMapper.getCustomList(userId);
	}

	public List<CustomVMExt> getCustomVMExtDetailsById(int customId) {
		return launchMapper.getCustomVMExtDetailsById(customId);
	}

	public List<EnvironmentVM> getEnvVmDetails() {
		 List<EnvironmentVM> envVMList=launchMapper.getEnvVmDetails();
		return envVMList;
	}

	public List<EnvironmentVMExt> getVMExtParams() {
		
		 List<EnvironmentVMExt> envVMExtList=launchMapper.getVMExtParams();
			return envVMExtList;
	}

	public List<Identity> getKeyPairList(int usr_id) {
		return launchMapper.getKeyPairList(usr_id);
	}

	public void addKeyPair(Identity keypair) {
		launchMapper.addKeyPair(keypair);
		
	}

	public Identity getIdentity(int keyId) {
		return launchMapper.getIdentity(keyId);
	}

	public Identity checkKeyPair(String name) {
		return launchMapper.checkKeyPair(name);
	}

	public List<String> getKeyPairs(int usrId) {
		return launchMapper.getKeyPairs(usrId);
	}

	public void terminateInstance(int instId) {
		launchMapper.terminateInstance(instId);
		
	}


	public EnvironmentVM getEnvVmDetailsByID(Integer envVMid) {
		EnvironmentVM envVM=launchMapper.getEnvVmDetailsByID(envVMid);
		return envVM;
	}

	public List<EnvironmentVMExt> getVMExtParamsByID(Integer envVMid) {
		List<EnvironmentVMExt> envVMExtDet=launchMapper.getVMExtParamsByID(envVMid);
		return envVMExtDet;
	}

	public List<EnvironmentVDC> getEnvVdcList() {
		List<EnvironmentVDC> envVDCList=launchMapper.getEnvVdcList();
		 return envVDCList;
	}

	public List<EnvironmentVDC> getEnvVdcListById(int userid){
		
		int deptId=launchMapper.getDeptbyUserId(userid);
				
		 int vdc_id=launchMapper.getVdcBydeptId(deptId);
		
		 List<EnvironmentVDC> envVdcList=null;
		
		 envVdcList = launchMapper.getVdcById(vdc_id);
			
		return envVdcList;
	}

	public String getOpenStackInstanceId(int instanceId) {
		return launchMapper.getOpenStackInstanceId(instanceId);
	}

	public void updatePublicIP(int instId, String flaotingIpResponse) {
		launchMapper.updatePublicIP(instId,flaotingIpResponse);
	}

	public void updatePublicIPToNull(int instId) {
		launchMapper.updatePublicIPToNull(instId);
	}

}

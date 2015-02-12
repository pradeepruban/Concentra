package com.syntel.isap.provisioning.dao.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syntel.isap.provisioning.bean.CustomVM;
import com.syntel.isap.provisioning.bean.CustomVMExt;
import com.syntel.isap.provisioning.bean.EnvironmentVM;
import com.syntel.isap.provisioning.bean.EnvironmentVMExt;
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

	public List<CustomVM> getCustomList() {
		return launchMapper.getCustomList();
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

	public EnvironmentVM getEnvVmDetailsByID(Integer envVMid) {
		EnvironmentVM envVM=launchMapper.getEnvVmDetailsByID(envVMid);
		return envVM;
	}

	public List<EnvironmentVMExt> getVMExtParamsByID(Integer envVMid) {
		List<EnvironmentVMExt> envVMExtDet=launchMapper.getVMExtParamsByID(envVMid);
		return envVMExtDet;
	}

}

package com.syntel.isap.provisioning.dao;

import java.util.List;

import com.syntel.isap.provisioning.bean.CustomVM;
import com.syntel.isap.provisioning.bean.CustomVMExt;
import com.syntel.isap.provisioning.bean.EnvironmentVDC;
import com.syntel.isap.provisioning.bean.EnvironmentVM;
import com.syntel.isap.provisioning.bean.EnvironmentVMExt;
import com.syntel.isap.provisioning.bean.Identity;
import com.syntel.isap.provisioning.bean.ServiceReqDts;
import com.syntel.isap.provisioning.bean.ServiceReqMst;

/**
 * @author KK5007843
 *
 */

public interface ILaunchDao {

	void addCustomVMDetails(CustomVM customVm);

	void addCustomVMExt(CustomVMExt customVmExt);

	void addServiceRequest(ServiceReqMst reqMst);

	void addServiceRequestDts(ServiceReqDts reqDts);

	List<CustomVM> getCustomList(int userId);

	List<CustomVMExt> getCustomVMExtDetailsById(int customId);

	List<EnvironmentVM> getEnvVmDetails();

	List<EnvironmentVMExt> getVMExtParams();

	List<Identity> getKeyPairList(int usrId);

	void addKeyPair(Identity keypair);

	Identity getIdentity(int keyId);

	Identity checkKeyPair(String name);

	List<String> getKeyPairs(int usrId);

	void terminateInstance(int instId);

	EnvironmentVM getEnvVmDetailsByID(Integer envVMid);

	List<EnvironmentVMExt> getVMExtParamsByID(Integer envVMid);

	List<EnvironmentVDC> getEnvVdcList();

	List<EnvironmentVDC> getEnvVdcListById(int userid);

	String getOpenStackInstanceId(int instanceId);

	void updatePublicIP(int instId, String flaotingIpResponse);

	void updatePublicIPToNull(int parseInt);

}

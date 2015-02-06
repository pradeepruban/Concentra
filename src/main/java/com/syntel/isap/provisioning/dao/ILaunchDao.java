package com.syntel.isap.provisioning.dao;

import java.util.List;

import com.syntel.isap.provisioning.bean.CustomVM;
import com.syntel.isap.provisioning.bean.CustomVMExt;
import com.syntel.isap.provisioning.bean.EnvironmentVM;
import com.syntel.isap.provisioning.bean.EnvironmentVMExt;
import com.syntel.isap.provisioning.bean.ServiceReqDts;
import com.syntel.isap.provisioning.bean.ServiceReqMst;

/**
 * @author KK5007843
 *
 */

public interface ILaunchDao {

	void addCustomVMDetails(CustomVM customVM);

	void addCustomVMExt(CustomVMExt cust);

	void addServiceRequest(ServiceReqMst reqMst);

	void addServiceRequestDts(ServiceReqDts reqDts);

	List<CustomVM> getCustomList();

	List<CustomVMExt> getCustomVMExtDetailsById(int customId);

	List<EnvironmentVM> getEnvVmDetails();

	List<EnvironmentVMExt> getVMExtParams();

}

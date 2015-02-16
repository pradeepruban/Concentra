package com.syntel.isap.provisioning.service;

import java.util.List;

import javax.jms.JMSException;

import com.syntel.isap.provisioning.bean.CustomVM;
import com.syntel.isap.provisioning.bean.EnvironmentVDC;
import com.syntel.isap.provisioning.bean.EnvironmentVM;
import com.syntel.isap.provisioning.bean.EnvironmentVMExt;
import com.syntel.isap.provisioning.bean.ServiceReqMst;

/**
 * @author KK5007843
 *
 */

public interface ILaunchService {
	
	void customLaunch(String image, String image2, String security, String flavor, CustomVM customVM, ServiceReqMst serviceReqMst) throws JMSException;

	List<CustomVM> getCustomList();

	List<EnvironmentVM> getEnvVmDetails();

	List<EnvironmentVMExt> getVMExtParams();

	EnvironmentVM getEnvVmDetailsByID(Integer envVMid);

	List<EnvironmentVMExt> getVMExtParamsByID(Integer envVMid);

	List<EnvironmentVDC> getEnvVdcList();



}

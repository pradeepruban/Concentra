package com.syntel.isap.provisioning.service;


import java.util.List;

import javax.jms.JMSException;

import com.syntel.isap.provisioning.bean.CustomVM;
import com.syntel.isap.provisioning.bean.EnvironmentVDC;
import com.syntel.isap.provisioning.bean.EnvironmentVM;
import com.syntel.isap.provisioning.bean.EnvironmentVMExt;
import com.syntel.isap.provisioning.bean.Identity;
import com.syntel.isap.provisioning.bean.ServiceReqMst;
import com.syntel.isap.provisioning.bean.User;

/**
 * @author KK5007843
 *
 */

public interface ILaunchService {
	
	void customLaunch( String keypair,String image, String network, String security, String flavor, CustomVM customVM, ServiceReqMst serviceReqMst) throws JMSException;

	List<CustomVM> getCustomList(int userId) throws Exception;

	List<EnvironmentVM> getEnvVmDetails();

	List<EnvironmentVMExt> getVMExtParams();

/*	String getKeyPairPrivate(String keyPair) throws Exception;*/

	List<Identity> getKeyPairList(int usr_id);

	void addKeyPair(String name, String keyPairPrivate, int usrId);

	Identity getIdentity(int keyId);

	int checkKeyPair(String name);

	List<String> getKeyPairs(int usrId);

	void terminateInstance(String instId);

	EnvironmentVM getEnvVmDetailsByID(Integer envVMid);

	List<EnvironmentVMExt> getVMExtParamsByID(Integer envVMid);

	List<EnvironmentVDC> getEnvVdcList();

	List<EnvironmentVDC> getEnvVdcListById(int userid);

	void addFloatingIP(String instId);

	void removeFloatingIP(String instId);



}

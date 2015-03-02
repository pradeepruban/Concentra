package com.syntel.isap.provisioning.service;

import com.syntel.isap.provisioning.bean.User;

/**
 * @author KK5007843
 *
 */

public interface ILoginService {
	
	int getUser(User user);

	User getUserDetails(User user);

	int authenticateUser(User user,String password);

}

package com.syntel.isap.provisioning.dao;

import com.syntel.isap.provisioning.bean.User;
import com.syntel.isap.provisioning.bean.UserRoleMap;

/**
 * @author KK5007843
 *
 */

public interface ILoginDao {
	
	User getUser(String userName);
	
	UserRoleMap getRole(int userId);

	String getRoleName(int roleId);

}

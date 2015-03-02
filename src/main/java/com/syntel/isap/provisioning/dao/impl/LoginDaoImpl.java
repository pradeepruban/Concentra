package com.syntel.isap.provisioning.dao.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syntel.isap.provisioning.bean.User;
import com.syntel.isap.provisioning.bean.UserRoleMap;
import com.syntel.isap.provisioning.dao.ILoginDao;
import com.syntel.isap.provisioning.mapper.LoginMapper;

/**
 * @author KK5007843
 *
 */

@Service("loginDao")
public class LoginDaoImpl implements ILoginDao {

    @Autowired
    private LoginMapper loginMapper;

    private static final Logger LOGGER = Logger.getLogger(LoginDaoImpl.class.getName());
	
	public User getUser(String userName) {		
		User userLogin = loginMapper.getUserByUserName(userName);
		LOGGER.info("Inside LoginDaoImpl getUser()");
		return userLogin;
	}

	public UserRoleMap getRole(int userId) {
		UserRoleMap userRole = loginMapper.getRoleByUserId(userId);
		return userRole;
	}

	public String getRoleName(int roleId) {
		return loginMapper.getRoleName(roleId);
	}

}

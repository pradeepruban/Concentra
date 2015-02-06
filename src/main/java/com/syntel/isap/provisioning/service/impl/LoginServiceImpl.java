package com.syntel.isap.provisioning.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.syntel.isap.provisioning.bean.User;
import com.syntel.isap.provisioning.bean.UserRoleMap;
import com.syntel.isap.provisioning.dao.ILoginDao;
import com.syntel.isap.provisioning.service.ILoginService;

/**
 * @author KK5007843
 *
 */

@Service("loginService")
public class LoginServiceImpl implements ILoginService {

	@Autowired
	private ILoginDao loginDao;

	private static final Logger LOGGER = Logger.getLogger(LoginServiceImpl.class.getName());
	
	@Transactional
	public int getUser(User user) {
		int roleId=0;
		/*String role="";*/
		String password=user.getUsr_desc();
		user=loginDao.getUser(user.getUsr_name());
		if(user !=null && user.getUsr_desc().equals(password) ){
			LOGGER.info("userId Inside ServiceImpl: "+user.getUsr_id());
			UserRoleMap userRole=loginDao.getRole(user.getUsr_id());
			 if(userRole!=null){
				 roleId=userRole.getRole_id();
				// role= loginDao.getRoleName(roleId);
				 /*if(role.equalsIgnoreCase("user")){
					 roleId=1;
				 }
				 else if(role.equalsIgnoreCase("corpAdmin")){
					 roleId=2;
				 }
				 else if(role.equalsIgnoreCase("isapAdmin")){
					 roleId=3;
				 }
				 else if(role.equalsIgnoreCase("deptAdmin")){
					 roleId=4;
				 } */
			 }
		 }
		return roleId;
	}

	
	@Transactional
	public User getUserDetails(User user) {
		user=loginDao.getUser(user.getUsr_name());
		return user;
	}

	@Transactional
	public int authenticateUser(User user) {
		int roleId=0;
		/*String role="";*/
		String password=user.getPassword();
		if(user !=null && user.getPassword().equals(password) ){
			LOGGER.info("userId Inside ServiceImpl authenticateUser: "+user.getUsr_id());
			UserRoleMap userRole=loginDao.getRole(user.getUsr_id());
			 if(userRole!=null){
				 roleId=userRole.getRole_id();
		/*
				 role= loginDao.getRoleName(roleId);
				 if(role.equalsIgnoreCase("user")){
					 roleId=1;
				 }
				 else if(role.equalsIgnoreCase("corpAdmin")){
					 roleId=2;
				 }
				 else if(role.equalsIgnoreCase("isapAdmin")){
					 roleId=3;
				 }
				 else if(role.equalsIgnoreCase("deptAdmin")){
					 roleId=4;
				 }				 */
			 }
		}
	   return roleId;
	}

}

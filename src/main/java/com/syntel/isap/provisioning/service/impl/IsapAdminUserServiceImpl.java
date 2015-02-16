package com.syntel.isap.provisioning.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.syntel.isap.provisioning.bean.CorporateGroups;
import com.syntel.isap.provisioning.bean.Department;
import com.syntel.isap.provisioning.bean.Project;
import com.syntel.isap.provisioning.bean.User;
import com.syntel.isap.provisioning.bean.UserRoleMap;
import com.syntel.isap.provisioning.dao.ICorporateGroupDAO;
import com.syntel.isap.provisioning.dao.IIsapAdminUserDAO;
import com.syntel.isap.provisioning.service.IIsapAdminUserService;

@Service("isapAdminUserService")
public class IsapAdminUserServiceImpl implements IIsapAdminUserService{

	@Autowired
	private IIsapAdminUserDAO isapAdminUserDAO;
	
	@Autowired
	private ICorporateGroupDAO corporateGroupDAO;
	
	@Transactional
	public List<CorporateGroups> getCorps() {
		// TODO Auto-generated method stub
		return isapAdminUserDAO.getCorps();
	}


	@Transactional
	public List<Department> getDepts() {
		// TODO Auto-generated method stub
		return isapAdminUserDAO.getDepts();
	}

	@Transactional
	public List<Project> getProj() {
		// TODO Auto-generated method stub
		return isapAdminUserDAO.getProj();
	}

	
	//@Override // this annotation giving same error KALYAN
	public List<Department> getDeptsJsonById(Integer depId) {
		// TODO Auto-generated method stub
		return isapAdminUserDAO.getDeptsJsonById(depId);
	}

	//@Override // this annotation giving same error KALYAN
	public List<Project> getProjsJsonById(Integer projId) {
		// TODO Auto-generated method stub
		return isapAdminUserDAO.getProjsJsonById(projId);
	}

	
	@Transactional
	public List<User> getUser() {
			
	List<User> i=isapAdminUserDAO.getUser();
			return i;
		
	}


	@Transactional
	public void deleteUser( Integer usr_id)  {
		isapAdminUserDAO.deleteUser(usr_id);
		
	}

	@Transactional
	public List<User> getUserLists(int cg_id) {
		return isapAdminUserDAO.getuserLists(cg_id);
	}
	
	@Transactional
	public void addUserInUserTable(User user){
		String userName=null;
		int usrId = 0;
		int projId = 0;
		int endUserRoleId = 5;
		int userRoleId = 6;
		isapAdminUserDAO.addUserInUserTable(user);
		userName = user.getUsr_name();
		usrId = corporateGroupDAO.getUserIdByuserNameInUsertable(userName);
		System.out.println("UserId+++++++++++++++++++++++++++++"+usrId );
		projId = user.getProj_id();
		System.out.println("ProjectId+++++++++++++++++++++++++++++"+projId );
		if(projId != 1){
			isapAdminUserDAO.insertRoleIdforUserIdInRolemap(endUserRoleId,usrId);
		}else{
			isapAdminUserDAO.insertRoleIdforUserIdInRolemap(userRoleId,usrId);
		}
	}


	public UserRoleMap getAdminDetailsJsonById(Integer id) {
		// TODO Auto-generated method stub
		return isapAdminUserDAO.getAdminDetailsJsonById(id);
	}

	
	@Transactional
	public User getUserById(Integer userId) {
		System.out.println("UserId+++++++++++++++++++++++++++++"+userId );
		return isapAdminUserDAO.getUserById(userId);
	}


	public List<User> getUsersByuser(User user) {
		// TODO Auto-generated method stub
		return isapAdminUserDAO.getUsersByuser(user);
	}


	public void getUserFromUserTable(User user) {
		
		isapAdminUserDAO.getUserFromUserTable(user);
	}


	public List<UserRoleMap> getNonAdminUsers() {
		// TODO Auto-generated method stub
		return isapAdminUserDAO.getNonAdminUsers();
	}


	public List<User> getNewDeptsUserJsonById(Integer usr_ID, Integer dptId) {
		// TODO Auto-generated method stub
		return isapAdminUserDAO.getNewDeptsUserJsonById(usr_ID, dptId);
	}


	public List<User> geNewCoprUsersInJSONId(Integer usr_ID, Integer cgId) {
		// TODO Auto-generated method stub
		return isapAdminUserDAO.geNewCoprUsersInJSONId(usr_ID, cgId);
	}


	public void updateAdminDetails(User user) {
		
		int oldAdminId = user.getUsr_id();
		isapAdminUserDAO.updateOldAdminrole(oldAdminId);
		//isapAdminUserDAO.updateOldAdminDetails(oldAdminId);
		
	String newAdmin =user.getUsr_name();
System.out.println("New admin name form Form"+newAdmin);
	
	int newAdminID = isapAdminUserDAO.getNewAdminIdByName(newAdmin);
		isapAdminUserDAO.updateAdminDetails(newAdminID);
	}

	
	
	
}

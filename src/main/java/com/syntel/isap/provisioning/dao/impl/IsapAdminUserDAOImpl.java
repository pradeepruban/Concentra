package com.syntel.isap.provisioning.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syntel.isap.provisioning.bean.CorporateGroups;
import com.syntel.isap.provisioning.bean.Department;
import com.syntel.isap.provisioning.bean.Project;
import com.syntel.isap.provisioning.bean.User;
import com.syntel.isap.provisioning.bean.UserRoleMap;
import com.syntel.isap.provisioning.dao.IIsapAdminUserDAO;
import com.syntel.isap.provisioning.mapper.IsapAdminUserMapper;

@Service("isapAdminUserDAO")
public class IsapAdminUserDAOImpl implements IIsapAdminUserDAO{

	@Autowired
	private IsapAdminUserMapper isapAdminUserMapper;
	
	//@Override
	public List<CorporateGroups> getCorps() {
		// TODO Auto-generated method stub
		return isapAdminUserMapper.getCorps();
	}

	//@Override
	public List<Department> getDepts() {
		// TODO Auto-generated method stub
		return isapAdminUserMapper.getDepts();
	}
	
	
	//@Override
	public List<Project> getProj() {
		// TODO Auto-generated method stub
		return isapAdminUserMapper.getProj();
	}

	//@Override
	public List<User> getUser() {
		
		
		
		// TODO Auto-generated method stub
		return isapAdminUserMapper.getUser();
	}

	//@Override
	public List<Department> getDeptsJsonById(Integer cgId) {
		// TODO Auto-generated method stub
		return isapAdminUserMapper.getDeptsJson(cgId);
	}
	
	
	//@Override
	public List<Project> getProjsJsonById(Integer deptId) {
		// TODO Auto-generated method stub
		return isapAdminUserMapper.getProjsJson(deptId);
	}

	

	public void deleteUser(Integer usr_id) {
		
	 isapAdminUserMapper.deleteUser(usr_id);
	}

	
	
	public void addUserInUserTable(User user) {
		isapAdminUserMapper.addUserInUserTable(user);
	}
	
	public void insertRoleIdforUserIdInRolemap(int roleId, int usrId){
		isapAdminUserMapper.insertRoleIdforUserIdInRolemap(roleId, usrId);
//insertRoleIdforUserIdInRolemap(roleId,usrId);
	}

	public UserRoleMap getAdminDetailsJsonById(Integer id) {
		// TODO Auto-generated method stub
		return isapAdminUserMapper.getAdminDetailsJsonById(id) ;
	}

	public List<User> getuserLists(int cg_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public User getUserById(Integer userId) {
		// TODO Auto-generated method stub
		return isapAdminUserMapper.getUserById(userId);
	}

	public List<User> getUsersByuser(User user) {
		// TODO Auto-generated method stub
		return isapAdminUserMapper.getUsersByuser(user) ;
	}

	public void getUserFromUserTable(User user) {
		isapAdminUserMapper.getUserFromUserTable(user);
		
	}

	public List<UserRoleMap> getNonAdminUsers() {
		// TODO Auto-generated method stub
		return isapAdminUserMapper.getNonAdminUsers();
	}

	public List<User> getNewDeptsUserJsonById(Integer usr_ID, Integer dptId) {
		// TODO Auto-generated method stub
		return isapAdminUserMapper.getNewDeptsUserJsonById(usr_ID,dptId);
	}

	public List<User> geNewCoprUsersInJSONId(Integer usr_ID, Integer cgId) {
		// TODO Auto-generated method stub
		return isapAdminUserMapper.geNewCoprUsersInJSONId(usr_ID, cgId);
	}

	/*public void updateAdminDetails(User user) {
		isapAdminUserMapper.updateAdminDetails(user);
		
	};*/

	/*public void updateOldAdminDetails(int oldAdminId) {
		isapAdminUserMapper.updateOldAdminDetails(oldAdminId);
		
	}
*/
	public void updateOldAdminrole(int oldAdminId) {
		isapAdminUserMapper.updateOldAdminrole(oldAdminId);
		
	}

	public int getNewAdminIdByName(String newAdmin) {
		
		return isapAdminUserMapper.getNewAdminIdByName(newAdmin);
	}

	public void updateAdminDetails(int newAdminID) {
		isapAdminUserMapper.updateAdminDetails(newAdminID);
		
	}

	public void updateCorpAdminDetails(int newAdminID) {
		
		isapAdminUserMapper.updateCorpAdminDetails(newAdminID);
	}

	public List<User> getNewProjUsersInJSONId(Integer usr_ID, Integer projId) {
		
		return isapAdminUserMapper.getNewProjUsersInJSONId(usr_ID, projId);
	}

	public void updateProjAdminDetails(int newAdminID) {
		
		isapAdminUserMapper.updateProjAdminDetails(newAdminID);
	}

	public List<User> getNewProjUsersJSON(Integer projId) {
		
		return isapAdminUserMapper.getNewProjUsersJSON(projId);
	}

	public List<User> getNewDeptsUseById(Integer dptId) {
	
		return isapAdminUserMapper.getNewDeptsUseById(dptId);
	}

	public List<User> getNewCoprUsersInJSONId(Integer cgId) {
		// TODO Auto-generated method stub
		return isapAdminUserMapper.getNewCoprUsersInJSONId(cgId);
	}

	public User getUsr_name(String usr_name) {
		return isapAdminUserMapper.getUsr_name(usr_name);
		
		
			 
	}


	}

	


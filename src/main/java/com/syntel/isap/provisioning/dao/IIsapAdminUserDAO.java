package com.syntel.isap.provisioning.dao;

import java.util.List;

import com.syntel.isap.provisioning.bean.CorporateGroups;
import com.syntel.isap.provisioning.bean.Department;
import com.syntel.isap.provisioning.bean.Project;
import com.syntel.isap.provisioning.bean.User;
import com.syntel.isap.provisioning.bean.UserRoleMap;

public interface IIsapAdminUserDAO {

	List<CorporateGroups> getCorps();

	List<Department> getDepts();

	List<Project> getProj();

	List<Department> getDeptsJsonById(Integer depId);

	List<Project> getProjsJsonById(Integer projId);

	List<User> getUser();

	
/*delete user */
	
	 public void deleteUser(Integer usr_id);

	List<User> getuserLists(int cg_id);

	void addUserInUserTable(User user);

	void insertRoleIdforUserIdInRolemap(int roleId, int usrId);
	
	UserRoleMap getAdminDetailsJsonById(Integer id);

	User getUserById(Integer userId);

	List<User> getUsersByuser(User user);

	void getUserFromUserTable(User user);

	List<UserRoleMap> getNonAdminUsers();

	List<User> getNewDeptsUserJsonById(Integer usr_ID,Integer dptId);

	List<User> geNewCoprUsersInJSONId(Integer usr_ID, Integer cgId);

	void updateAdminDetails(int newAdminID);

	

	void updateOldAdminrole(int oldAdminId);

	int getNewAdminIdByName(String newAdmin);

	void updateCorpAdminDetails(int newAdminID);

	List<User> getNewProjUsersInJSONId(Integer usr_ID, Integer projId);

	void updateProjAdminDetails(int newAdminID);

	List<User> getNewProjUsersJSON(Integer projId);

	List<User> getNewDeptsUseById(Integer dptId);

	List<User> getNewCoprUsersInJSONId(Integer cgId);

	User getUsr_name(String usr_name);



}

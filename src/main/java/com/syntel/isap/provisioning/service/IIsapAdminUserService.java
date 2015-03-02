package com.syntel.isap.provisioning.service;

import java.util.List;

import com.syntel.isap.provisioning.bean.CorporateGroups;
import com.syntel.isap.provisioning.bean.Department;
import com.syntel.isap.provisioning.bean.Project;
import com.syntel.isap.provisioning.bean.User;
import com.syntel.isap.provisioning.bean.UserRoleMap;

public interface IIsapAdminUserService {

	List<CorporateGroups> getCorps();

	List<Department> getDepts();

	List<Department> getDeptsJsonById(Integer cgId);

	List<Project> getProj();

	List<Project> getProjsJsonById(Integer dptId);

	List<User> getUser();

	

	/*delete user*/
     void deleteUser(Integer usr_id);

	List<User> getUserLists(int cg_id);

	void addUserInUserTable(User usr);

	UserRoleMap getAdminDetailsJsonById(Integer id);

	User getUserById(Integer userId);

	List<User> getUsersByuser(User user);

	void getUserFromUserTable(User user);

	List<UserRoleMap> getNonAdminUsers();

	List<User> getNewDeptsUserJsonById(Integer usr_ID, Integer dptId);

	List<User> geNewCoprUsersInJSONId(Integer usr_ID);

	void updateDeptadminDetails(User user);

	void updateCorpAdminDetails(User user);

	List<User> getNewProjUsersInJSONId(Integer usr_ID, Integer projId);

	void updateProjAdminDetails(User user);

	List<User> getNewProjUsersJSON(Integer projId);

	List<User> getNewDeptsUseById(Integer dptId);

	List<User> getNewCoprUsersInJSONId(Integer cgId);

	int getUsr_name(String usr_name);
	

	

}

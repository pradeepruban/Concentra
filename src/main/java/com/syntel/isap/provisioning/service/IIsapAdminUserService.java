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
	

}

package com.syntel.isap.provisioning.dao;

import java.util.List;

import com.syntel.isap.provisioning.bean.Department;
import com.syntel.isap.provisioning.bean.User;

/**
 * @author KK5007843
 *
 */

public interface IDepartmentDao {
	
	List<Department> getDepartmentList(int cgId);

	void addDepartment(Department department);

	void addDepartmentAdmin(User user);

	List<User> getUsersByCorporateId(User user);

	void mapRoleToUser(User user);

	void mapDepartmentToUser(int usr_id, int dpt_id);

	String getUserNameById(int usr_id);

	void updateDepartment(Integer deptId);

	void updateUserRole(int userId);

	int getUserIdByDeptId(Integer deptId);

	void updateUser(int userIdByDeptId);

	Department getDepartmentById(Integer deptId);

	User getOwnerByName(String userName);

	void updateDepartmentWithDepartment(Department department);

	User getOwnerUserId(User user);

	int getUserIdByName(String owner);

	List<Integer> getProjectByDeptID(Integer deptId);

	List<Integer> getUserByDeptID(Integer projId);

	void updateUserDptProjIds(Integer userID);

	void updateProjectDeleteFlag(Integer projId);


}

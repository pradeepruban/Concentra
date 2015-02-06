package com.syntel.isap.provisioning.service;

import java.util.List;

import com.syntel.isap.provisioning.bean.Department;
import com.syntel.isap.provisioning.bean.User;

/**
 * @author KK5007843
 *
 */

public interface IDepartmentService {

	List<Department> getDepartmentList(int cgId);

	void addDepartment(Department department, User user);

	List<User> getUsersByCorporate(User user);

	void deleteDepartment(Integer deptId);

	Department getDepartmentById(Integer deptId);

	List<User> getUsersByCorporateJSON(User user);

	User getOwnerByName(String userName);

	void editDepartment(Department department, User user);

}

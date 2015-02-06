package com.syntel.isap.provisioning.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syntel.isap.provisioning.bean.Department;
import com.syntel.isap.provisioning.bean.User;
import com.syntel.isap.provisioning.dao.IDepartmentDao;
import com.syntel.isap.provisioning.mapper.DepartmentMapper;

/**
 * @author KK5007843
 *
 */

@Service("departmentDao")
public class DepartmentDaoImpl implements IDepartmentDao {

    @Autowired
    private DepartmentMapper departmentMapper;
	
	public List<Department> getDepartmentList(int cgId) {
		 List<Department> departments=new ArrayList<Department>();
		 departments=departmentMapper.getDepartmentList(cgId);
		return departments;
	}

	public void addDepartment(Department department) {
		departmentMapper.addDepartment(department);
	}

	public void addDepartmentAdmin(User user) {
		departmentMapper.addDepartmentAdmin(user);
	}

	public List<User> getUsersByCorporateId(User user) {
		return departmentMapper.getUsersByCorporateId(user);
	}

	public void mapRoleToUser(User user) {
		departmentMapper.mapRoleToUser(user);
	}

	public void mapDepartmentToUser(int usr_id, int dpt_id) {
		departmentMapper.mapDepartmentToUser(usr_id,dpt_id);
	}

	public String getUserNameById(int usr_id) {
		return departmentMapper.getUserNameById(usr_id);
	}

	public void updateDepartment(Integer deptId) {
		departmentMapper.updateDepartment(deptId);
	}

	public void updateUserRole(int userId) {
		departmentMapper.updateUserRole(userId);
	}

	public int getUserIdByDeptId(Integer deptId) {
		return departmentMapper.getUserIdByDeptId(deptId);	
	}

	public void updateUser(int userId) {
		departmentMapper.updateUser(userId);		
	}

	public Department getDepartmentById(Integer deptId) {
		return departmentMapper.getDepartmentById(deptId);
	}

	public User getOwnerByName(String userName) {
		return departmentMapper.getOwnerByName(userName);
	}

	public void updateDepartmentWithDepartment(Department department) {
		departmentMapper.updateDepartmentWithDepartment(department);
	}

	public User getOwnerUserId(User user) {
		return departmentMapper.getOwnerUserId(user);
	}

	public int getUserIdByName(String owner) {
		return departmentMapper.getUserIdByName(owner);
	}

	public List<Integer> getProjectByDeptID(Integer deptId) {
		return departmentMapper.getProjectByDeptID(deptId);
	}

	public List<Integer> getUserByDeptID(Integer projId) {
		return departmentMapper.getUserByDeptID(projId);
	}

	public void updateUserDptProjIds(Integer userID) {
		departmentMapper.updateUserDptProjIds(userID);
	}

	public void updateProjectDeleteFlag(Integer projId) {
		departmentMapper.updateProjectDeleteFlag(projId);
	}


}

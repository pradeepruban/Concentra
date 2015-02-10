package com.syntel.isap.provisioning.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syntel.isap.provisioning.bean.CorporateGroups;
import com.syntel.isap.provisioning.bean.Department;
import com.syntel.isap.provisioning.bean.Project;
import com.syntel.isap.provisioning.bean.User;
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

	

	public Object deleteUser(Integer usr_id) {
		
		return isapAdminUserMapper.getuserLists(usr_id);
	}

	public List<User> getuserLists(int cg_id) {
		return isapAdminUserMapper.deleteUser(cg_id);
	}
	
	public void addUserInUserTable(User user) {
		isapAdminUserMapper.addUserInUserTable(user);
	}
	
	public void insertRoleIdforUserIdInRolemap(int roleId, int usrId){
		isapAdminUserMapper.insertRoleIdforUserIdInRolemap(roleId, usrId);
//insertRoleIdforUserIdInRolemap(roleId,usrId);
	}
}

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

	//@Override
	public int update(User usr) {
		// TODO Auto-generated method stub
		return isapAdminUserMapper.getuser(usr);
	}
	
	
}

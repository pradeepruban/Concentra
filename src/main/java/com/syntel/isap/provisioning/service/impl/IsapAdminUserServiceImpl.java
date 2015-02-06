package com.syntel.isap.provisioning.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.syntel.isap.provisioning.bean.CorporateGroups;
import com.syntel.isap.provisioning.bean.Department;
import com.syntel.isap.provisioning.bean.Project;
import com.syntel.isap.provisioning.bean.User;
import com.syntel.isap.provisioning.dao.IIsapAdminUserDAO;
import com.syntel.isap.provisioning.service.IIsapAdminUserService;

@Service("isapAdminUserService")
public class IsapAdminUserServiceImpl implements IIsapAdminUserService{

	@Autowired
	private IIsapAdminUserDAO isapAdminUserDAO;
	
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
	public int update(User usr) {
		int i=isapAdminUserDAO.update(usr);
		return i;
	}

}

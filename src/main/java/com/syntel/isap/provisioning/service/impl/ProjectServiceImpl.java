package com.syntel.isap.provisioning.service.impl;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.syntel.isap.provisioning.bean.Project;
import com.syntel.isap.provisioning.bean.User;
import com.syntel.isap.provisioning.dao.IDepartmentDao;
import com.syntel.isap.provisioning.dao.IProjectDao;
import com.syntel.isap.provisioning.service.IProjectService;



@Service("projectService")
public class ProjectServiceImpl implements IProjectService {
	
	
	@Autowired 
	private IProjectDao projectDao;
	
	@Autowired
	private IDepartmentDao departmentDao;
	

	@Transactional
	public List<Project> getprojectLists(int dptid) {
		// TODO Auto-generated method stub
		return projectDao.getprojectLists(dptid);
	}


	@Transactional
	public void insertData(Project project,int userID) {
		project.setOwner(departmentDao.getUserNameById(userID));
		project.setCreated_by(departmentDao.getUserNameById(userID));
		
		System.out.println("userId Inside service"+userID);
		project.setStatus("Active");
		projectDao.insertData(project);
		int projId = project.getProj_id();
		projectDao.updateRoleMapByUserId(userID);
		projectDao.updateProjIdInUserTable(projId,userID);
	
		
	}
	
	@Transactional
	public List<Integer> getUserinfo(User user) {
		// TODO Auto-generated method stub
		return projectDao.getUserinfo(user);
	}


	
	
	
	@Transactional
	public void deleteProject(Integer proj_id) {
		projectDao.deleteProject(proj_id);
		
	
	}

	public Project editProject(Integer proj_id) {
		
		Project project = new Project();
		project.setStatus("ACT");
		return projectDao.editProject(proj_id);
		
	
	}

	public void updateProject(Project project) 
	{
		 projectDao.updateProject(project);
	}


	public List<User> getUsersByCorporate(User user) {
		// TODO Auto-generated method stub
		return projectDao.getUsersByCorporate(user);
	}
	
	/*public Project editProject(Integer workflowId){
	
	}
*/


	


}

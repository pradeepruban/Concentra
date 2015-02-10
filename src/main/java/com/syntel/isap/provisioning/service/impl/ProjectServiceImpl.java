package com.syntel.isap.provisioning.service.impl;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.syntel.isap.provisioning.bean.Department;
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
	
	private static final Logger LOGGER = Logger.getLogger(LoginServiceImpl.class.getName());
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
		
		LOGGER.info("Inside ServiceImpl deleteDepartment"+proj_id);
		projectDao.deleteProject(proj_id);
		
			List<Integer> userIds=projectDao.getUserByProjID(proj_id);
			for(Integer userID:userIds){
				projectDao.updateUserProjIds(userID);
				projectDao.updateUserRole(userID);
			}
	
	
	}

	public Project editProject(Integer proj_id) {
		
		Project project = new Project();
		project.setStatus("Active");
		return projectDao.editProject(proj_id);
		
	
	}

	public void updateProject(Project project, User user) 
	{
	
		project.setStatus("Active");
		int pid =project.getProj_id();
		LOGGER.info("Inside ServiceImpl editProject"+project.getProj_id());
		Project owner=projectDao.getProjectById(project.getProj_id());	
		LOGGER.info("Inside ServiceImpl editProject display"+project.getProj_id()+":"+owner.getOwner());
		if(!owner.getOwner().equals(projectDao.getUserNameById(user.getUsr_id()))){
			
			LOGGER.info("Inside ServiceImpl if user equals editDepartment");
			int userId=projectDao.getUserIdByProjId(pid);
			projectDao.updateUser(userId);
			projectDao.updateUserRole(userId);
			
			LOGGER.info("Inside ServiceImpl editProject project id number"+user.getProj_id());
			user.setProj_id(pid);
			int userID = user.getUsr_id();
			projectDao.updateRoleMapByUserId(userID);
			projectDao.mapProjectToUser(user.getUsr_id(),user.getProj_id());
		}	
		
		
			project.setOwner(projectDao.getUserNameById(user.getUsr_id()));
		LOGGER.info("Inside ServiceImpl editProject"+project.getProj_id()+":"+project.getProj_desc()+":"+project.getProj_name());
		projectDao.updateProject(project);
	
	}


	public List<User> getUsersByCorporate(User user) {
		// TODO Auto-generated method stub
		return projectDao.getUsersByCorporate(user);
	}


	public User getOwnerByName(String userName) {
		
		return projectDao.getOwnerByName(userName);
	}
	
	/*public Project editProject(Integer workflowId){
	
	}
*/


	


}

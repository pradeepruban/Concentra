package com.syntel.isap.provisioning.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syntel.isap.provisioning.bean.Project;
import com.syntel.isap.provisioning.bean.User;
import com.syntel.isap.provisioning.dao.IProjectDao;

import com.syntel.isap.provisioning.mapper.ProjectMapper;



@Service("projectDao")

public class ProjectDaoImpl implements IProjectDao {



	@Autowired
	    private ProjectMapper projectMapper;
	
	
	public List<Project> getprojectLists(int dptid) {
		// TODO Auto-generated method stub
		return projectMapper.getprojectLists(dptid);
	}

	
	public void insertData(Project project) {
		
		
		projectMapper.insertData(project);
		// TODO Auto-generated method stub
		
	}


	public List<Integer> getUserinfo(User user) {
		// TODO Auto-generated method stub
		return projectMapper.getUserinfo(user);
	}
	

	  public void deleteProject(Integer proj_id) {
		
		projectMapper.deleteProject(proj_id);
	}
	
	  
	  public Project editProject(Integer proj_id) {
			
			return projectMapper.editProject(proj_id);
		}

	  
	  public void updateProject(Project project)
	  {
		   projectMapper.updateProject(project);
	  }


	public List<User> getUsersByCorporate(User user) {
		// TODO Auto-generated method stub
		return projectMapper.getUsersByCorporate(user);
	}


	public void updateRoleMapByUserId(int userID) {
		// TODO Auto-generated method stub
		projectMapper.updateRoleMapByUserId(userID);
	}


	public void updateProjIdInUserTable(int projId, int userID) {
		projectMapper.updateProjIdInUserTable(projId,userID);
		
	}


	public List<Integer> getUserByProjID(Integer proj_id) {
		// TODO Auto-generated method stub
		return  projectMapper.getUserByProjID(proj_id);
	}


	public void updateUserProjIds(Integer userID) {
		projectMapper.updateUserProjIds(userID);
		
	}


	public void updateUserRole(Integer userID) {
		projectMapper.updateUserRole(userID);
		
	}


	public Project getProjectById(int proj_id) {
		// TODO Auto-generated method stub
		return projectMapper.getProjectById(proj_id);
	}


	public String getUserNameById(int usr_id) {
		// TODO Auto-generated method stub
		return projectMapper.getUserNameById(usr_id);
	}


	public int getUserIdByProjId(int proj_id) {
		// TODO Auto-generated method stub
		return projectMapper.getUserIdByProjId(proj_id);
	}


	public void updateUser(int userId) {
	
		projectMapper.updateUser(userId);
	}


	public void mapRoleToUser(User user) {
		
		 projectMapper. mapRoleToUser(user);
	}


	public void mapProjectToUser(int usr_id, int proj_id) {
		
		projectMapper.mapProjectToUser(usr_id,proj_id);
	}


	public User getOwnerByName(String userName) {
		
		return projectMapper.getOwnerByName(userName) ;
	}
	  
	  
}

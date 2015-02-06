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
	  
	  
}

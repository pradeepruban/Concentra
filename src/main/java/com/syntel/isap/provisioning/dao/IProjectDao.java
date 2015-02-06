package com.syntel.isap.provisioning.dao;

import java.util.List;


import com.syntel.isap.provisioning.bean.Project;
import com.syntel.isap.provisioning.bean.User;

public interface IProjectDao {
	
	public void insertData(Project project);
	
	List<Project> getprojectLists(int dptid);
	List<Integer> getUserinfo(User user);
	public void deleteProject(Integer proj_id);
	public Project editProject(Integer proj_id);
	public void updateProject(Project project);
	List<User> getUsersByCorporate(User user);

	public void updateRoleMapByUserId(int userID);

	public void updateProjIdInUserTable(int projId, int userID);
	 

}

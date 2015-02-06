package com.syntel.isap.provisioning.service;

import java.util.List;

import com.syntel.isap.provisioning.bean.Project;
import com.syntel.isap.provisioning.bean.User;


/**
 * @author SK5004144
 *
 */

public interface IProjectService {
	
	public void insertData(Project project, int userId);
	List<Project> getprojectLists(int dpid);
	List<Integer> getUserinfo(User user);
	public void deleteProject(Integer proj_id);
	public Project editProject(Integer proj_id);
	public void updateProject(Project project);
	
	List<User> getUsersByCorporate( User user);
	

}

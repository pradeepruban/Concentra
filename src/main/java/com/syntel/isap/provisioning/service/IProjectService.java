package com.syntel.isap.provisioning.service;

import java.util.List;

import com.syntel.isap.provisioning.bean.Project;
import com.syntel.isap.provisioning.bean.User;
import com.syntel.isap.provisioning.bean.VdcDeptQuotaMap;
import com.syntel.isap.provisioning.bean.VdcMaster;
import com.syntel.isap.provisioning.bean.VdcProjQuotaMap;


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
	public void updateProject(Project project,User user);
	
	List<User> getUsersByCorporate( User user);
	public User getOwnerByName(String userName);
	public List<VdcMaster> getVdcListFromVdcMaster();
	public VdcDeptQuotaMap vdcCgQuotaByVdcIDanddptID(int selectedVdcId,
			int dptId);
	public int getVdcdetails(int selectedVdcId, int projId);
	public void allocateVdcToProjectGroup(VdcProjQuotaMap vdcProjQuotaMapBean, int dptID);
	

}

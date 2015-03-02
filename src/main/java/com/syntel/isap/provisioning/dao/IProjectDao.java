package com.syntel.isap.provisioning.dao;

import java.util.List;


import com.syntel.isap.provisioning.bean.Project;
import com.syntel.isap.provisioning.bean.User;
import com.syntel.isap.provisioning.bean.VdcDeptQuotaMap;
import com.syntel.isap.provisioning.bean.VdcMaster;
import com.syntel.isap.provisioning.bean.VdcProjQuotaMap;

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

	public List<Integer> getUserByProjID(Integer proj_id);

	public void updateUserProjIds(Integer userID);

	public void updateUserRole(Integer userID);

	public Project getProjectById(int proj_id);

	public String getUserNameById(int usr_id);

	public int getUserIdByProjId(int proj_id);

	public void updateUser(int userId);

	public void mapRoleToUser(User user);

	public void mapProjectToUser(int usr_id, int proj_id);

	public User getOwnerByName(String userName);

	public List<VdcMaster> getVdcListFromVdcMaster();

	public VdcDeptQuotaMap vdcCgQuotaByVdcIDanddptID(int selectedVdcId,
			int dptId);

	public VdcProjQuotaMap getVdcdetails(int selectedVdcId, int projId);

	public void allocateVdcToProjectGroup(VdcProjQuotaMap vdcProjQuotaMapBean);

	public List<VdcProjQuotaMap> getRowsFromVdcProjQuotaMapTable();

	
	public int getSumOftotalAllocatedProjVcpu(int selectedVdcId);

	public int gettotalAllocatedProjDiskStorage(int selectedVdcId);

	public int getSumOfTotalAllocatedMemoryToProj(int selectedVdcId);

	public VdcDeptQuotaMap getVDCdetailsBydptID(int dptID);

	public void updateFreeSpacesinDptquota(int cgAvailableMem,int cgAvailableVcpu, int cgAvailableDiskStorage, int selectedVdcId,int dptID);
	 

}

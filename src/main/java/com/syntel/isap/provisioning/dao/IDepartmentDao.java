package com.syntel.isap.provisioning.dao;

import java.util.List;
import com.syntel.isap.provisioning.bean.Department;
import com.syntel.isap.provisioning.bean.User;
import com.syntel.isap.provisioning.bean.VdcCgQuotaMap;
import com.syntel.isap.provisioning.bean.VdcDeptQuotaMap;

/**
 * @author KK5007843
 *
 */

public interface IDepartmentDao {
	
	List<Department> getDepartmentList(int cgId);

	void addDepartment(Department department);

	void addDepartmentAdmin(User user);

	List<User> getUsersByCorporateId(User user);

	void mapRoleToUser(User user);

	void mapDepartmentToUser(int usrId, int dptId);

	String getUserNameById(int usrId);

	void updateDepartment(Integer deptId);

	void updateUserRole(int userId);

	int getUserIdByDeptId(Integer deptId);

	void updateUser(int userIdByDeptId);

	Department getDepartmentById(Integer deptId);

	User getOwnerByName(String userName);

	void updateDepartmentWithDepartment(Department department);

	User getOwnerUserId(User user);

	int getUserIdByName(String owner);

	List<Integer> getProjectByDeptID(Integer deptId);

	List<Integer> getUserByDeptID(Integer projId);

	void updateUserDptProjIds(Integer userId);

	void updateProjectDeleteFlag(Integer projId);

	VdcCgQuotaMap vdcCgQuotaByVdcIDandcgID(int selectedVdcId, int cgId);

	List<VdcDeptQuotaMap> getRowsFromVdcDeptQuotaMapTable();

	int getSumOfTotalAllocatedMemoryToDpt(int selectedVdcId);

	int getSumOftotalAllocatedDptVcpu(int selectedVdcId);

	int gettotalAllocatedDptDiskStorage(int selectedVdcId);

	void allocateVdcToDepaertmentGroup(VdcDeptQuotaMap vdcDeptQuotaMapBean);

	int getCurrentavaliabvity(int cg_id);

	VdcCgQuotaMap getVDCdetailsBycgID(int cgID);
	
	void updateFreeSpacesinCgquota(int cgAvailableMem,int cgAvailableVcpu,int cgAvailableDiskStorage ,
			int selectedVdcId,int cgID);

	VdcDeptQuotaMap getVdcdetails(int selectedVdcId, int dptId);
	
}

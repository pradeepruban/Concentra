package com.syntel.isap.provisioning.service;

import java.util.List;

import com.syntel.isap.provisioning.bean.Department;
import com.syntel.isap.provisioning.bean.User;
import com.syntel.isap.provisioning.bean.VdcCgQuotaMap;
import com.syntel.isap.provisioning.bean.VdcDeptQuotaMap;

/**
 * @author KK5007843
 *
 */

public interface IDepartmentService {

	List<Department> getDepartmentList(int cgId);

	void addDepartment(Department department, User user, String corpAdminName);

	List<User> getUsersByCorporate(User user);

	void deleteDepartment(Integer deptId);

	Department getDepartmentById(Integer deptId);

	List<User> getUsersByCorporateJSON(User user);

	User getOwnerByName(String userName);

	void editDepartment(Department department, User user);

	VdcCgQuotaMap vdcCgQuotaByVdcIDandcgID(int selectedVdcId, int cgId);

	List<VdcDeptQuotaMap> getRowsFromVdcDeptQuotaMapTable();

	int getSumOfTotalAllocatedMemoryToDpt(int selectedVdcId);

	int getSumOftotalAllocatedDptVcpu(int selectedVdcId);

	int gettotalAllocatedDptDiskStorage(int selectedVdcId);

	void allocateVdcToDepaertmentGroup(VdcDeptQuotaMap vdcDeptQuotaMapBean, int cgID);

	int getAvaliableVcpuAllocated(String total_cg_vcpu, int cg_id);

	int getVdcdetails(int selectedVdcId, int dptId);

}

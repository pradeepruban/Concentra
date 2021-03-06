package com.syntel.isap.provisioning.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syntel.isap.provisioning.bean.Department;
import com.syntel.isap.provisioning.bean.User;
import com.syntel.isap.provisioning.bean.VdcCgQuotaMap;
import com.syntel.isap.provisioning.bean.VdcDeptQuotaMap;
import com.syntel.isap.provisioning.dao.IDepartmentDao;
import com.syntel.isap.provisioning.mapper.DepartmentMapper;

/**
 * @author KK5007843
 *
 */

@Service("departmentDao")
public class DepartmentDaoImpl implements IDepartmentDao {

    @Autowired
    private DepartmentMapper departmentMapper;
	
	public List<Department> getDepartmentList(int cgId) {
		 List<Department> departments=new ArrayList<Department>();
		 departments=departmentMapper.getDepartmentList(cgId);
		return departments;
	}

	public void addDepartment(Department department) {
		departmentMapper.addDepartment(department);
	}

	public void addDepartmentAdmin(User user) {
		departmentMapper.addDepartmentAdmin(user);
	}

	public List<User> getUsersByCorporateId(User user) {
		return departmentMapper.getUsersByCorporateId(user);
	}

	public void mapRoleToUser(User user) {
		departmentMapper.mapRoleToUser(user);
	}

	public void mapDepartmentToUser(int usr_id, int dpt_id) {
		departmentMapper.mapDepartmentToUser(usr_id,dpt_id);
	}

	public String getUserNameById(int usr_id) {
		return departmentMapper.getUserNameById(usr_id);
	}

	public void updateDepartment(Integer deptId) {
		departmentMapper.updateDepartment(deptId);
	}

	public void updateUserRole(int userId) {
		departmentMapper.updateUserRole(userId);
	}

	public int getUserIdByDeptId(Integer deptId) {
		return departmentMapper.getUserIdByDeptId(deptId);	
	}

	public void updateUser(int userId) {
		departmentMapper.updateUser(userId);		
	}

	public Department getDepartmentById(Integer deptId) {
		return departmentMapper.getDepartmentById(deptId);
	}

	public User getOwnerByName(String userName) {
		return departmentMapper.getOwnerByName(userName);
	}

	public void updateDepartmentWithDepartment(Department department) {
		departmentMapper.updateDepartmentWithDepartment(department);
	}

	public User getOwnerUserId(User user) {
		return departmentMapper.getOwnerUserId(user);
	}

	public int getUserIdByName(String owner) {
		return departmentMapper.getUserIdByName(owner);
	}

	public List<Integer> getProjectByDeptID(Integer deptId) {
		return departmentMapper.getProjectByDeptID(deptId);
	}

	public List<Integer> getUserByDeptID(Integer projId) {
		return departmentMapper.getUserByDeptID(projId);
	}

	public void updateUserDptProjIds(Integer userID) {
		departmentMapper.updateUserDptProjIds(userID);
	}

	public void updateProjectDeleteFlag(Integer projId) {
		departmentMapper.updateProjectDeleteFlag(projId);
	}

	public VdcCgQuotaMap vdcCgQuotaByVdcIDandcgID(int selectedVdcId, int cgId) {
		// TODO Auto-generated method stub
		return departmentMapper.vdcCgQuotaByVdcIDandcgID(selectedVdcId, cgId);
	}

	public List<VdcDeptQuotaMap> getRowsFromVdcDeptQuotaMapTable() {
		// TODO Auto-generated method stub
		return departmentMapper.getRowsFromVdcDeptQuotaMapTable();
	}

	public int getSumOfTotalAllocatedMemoryToDpt(int selectedVdcId) {
		int sumAllocatedMemory =0;
		 
		sumAllocatedMemory =departmentMapper.getSumOfTotalAllocatedMemoryToDpt(selectedVdcId);
		return sumAllocatedMemory;
				
	}

	public int getSumOftotalAllocatedDptVcpu(int selectedVdcId) {
		int sumtotalAllocatedDptVcpu =0;
		 
		sumtotalAllocatedDptVcpu =departmentMapper.getSumOftotalAllocatedDptVcpu(selectedVdcId);
		return sumtotalAllocatedDptVcpu;
	}

	public int gettotalAllocatedDptDiskStorage(int selectedVdcId) {
		int sumtotalAllocatedDptDiskStorage =0;
		 
		sumtotalAllocatedDptDiskStorage =departmentMapper.gettotalAllocatedDptDiskStorage(selectedVdcId);
		return sumtotalAllocatedDptDiskStorage;
	}

	public void allocateVdcToDepaertmentGroup(
			VdcDeptQuotaMap vdcDeptQuotaMapBean) {
		
		departmentMapper.allocateVdcToDepaertmentGroup(vdcDeptQuotaMapBean);
	}

	public int getCurrentavaliabvity(int cg_id) {
		// TODO Auto-generated method stub
		return departmentMapper.getCurrentavaliabvity(cg_id);
	}

	public VdcCgQuotaMap getVDCdetailsBycgID(int cgID) {
		// TODO Auto-generated method stub
		return departmentMapper.getVDCdetailsBycgID(cgID);
	}

	
	public void updateFreeSpacesinCgquota(int cgAvailableMem ,int cgAvailableVcpu,int cgAvailableDiskStorage,
			int selectedVdcId,int cgID) {
		departmentMapper.updateFreeSpacesinCgquota(cgAvailableMem,cgAvailableVcpu,cgAvailableDiskStorage,
				 selectedVdcId,cgID);
		
	}

	public VdcDeptQuotaMap getVdcdetails(int selectedVdcId, int dptId) {
		// TODO Auto-generated method stub
		return departmentMapper.getVdcdetails(selectedVdcId,dptId);
	}

}

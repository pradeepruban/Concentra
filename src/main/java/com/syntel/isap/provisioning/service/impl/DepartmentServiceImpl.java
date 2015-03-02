package com.syntel.isap.provisioning.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.syntel.isap.provisioning.bean.Department;
import com.syntel.isap.provisioning.bean.User;
import com.syntel.isap.provisioning.bean.VdcCgQuotaMap;
import com.syntel.isap.provisioning.bean.VdcDeptQuotaMap;
import com.syntel.isap.provisioning.dao.IDepartmentDao;
import com.syntel.isap.provisioning.mapper.LoginMapper;
import com.syntel.isap.provisioning.service.IDepartmentService;

/**
 * @author KK5007843
 *
 */

@Service("departmentService")
public class DepartmentServiceImpl implements IDepartmentService {
	
	@Autowired
	private IDepartmentDao departmentDao;
	
    @Autowired
    private LoginMapper loginMapper;
	

	private static final Logger LOGGER = Logger.getLogger(LoginServiceImpl.class.getName());
	
	@Transactional
	public List<Department> getDepartmentList(int cgId) {
		  List<Department> departments=new ArrayList<Department>();
		  LOGGER.info("Inside ServiceImpl getDepartmentList");
		  departments= departmentDao.getDepartmentList(cgId);
		  for(Department dept:departments)
		     LOGGER.info("deptId"+dept.getDpt_id());
		 return departments;
	}

	@Transactional
	public void addDepartment(Department department,User user,String corpAdminName) {
		
		department.setStatus("Active");
		LOGGER.info("Inside ServiceImpl addDepartment"+department.getStatus());
		department.setCg_id(user.getCg_id());
		department.setCreated_by(corpAdminName);
		department.setOwner(departmentDao.getUserNameById(user.getUsr_id()));
		departmentDao.addDepartment(department);
	    user.setDpt_id(department.getDpt_id());
		departmentDao.mapRoleToUser(user);
		departmentDao.mapDepartmentToUser(user.getUsr_id(),user.getDpt_id());
	}
	
	@Transactional
	public void editDepartment(Department department, User user) {
		//department.setStatus("Active");
		LOGGER.info("Inside ServiceImpl editDepartment"+department.getDpt_id());
		Department owner=departmentDao.getDepartmentById(department.getDpt_id());		
		LOGGER.info("Inside ServiceImpl editDepartment"+department.getDpt_id()+":"+owner.getCreated_by());
		if(!owner.getCreated_by().trim().equals("")){
			if(!owner.getCreated_by().equals(departmentDao.getUserNameById(user.getUsr_id()))){
				int userId=departmentDao.getUserIdByDeptId(department.getDpt_id());
				departmentDao.updateUser(userId);
				departmentDao.updateUserRole(userId);
				user.setDpt_id(department.getDpt_id());
				departmentDao.mapRoleToUser(user);
				departmentDao.mapDepartmentToUser(user.getUsr_id(),user.getDpt_id());
			}			
		}
		else{			
			user.setDpt_id(department.getDpt_id());
			departmentDao.mapRoleToUser(user);
			departmentDao.mapDepartmentToUser(user.getUsr_id(),user.getDpt_id());
		}
		department.setOwner(departmentDao.getUserNameById(user.getUsr_id()));
		LOGGER.info("Inside ServiceImpl editDepartment"+department.getDpt_id()+":"+department.getDpt_desc()+":"+department.getDpt_name());
		departmentDao.updateDepartmentWithDepartment(department);
	}

	@Transactional
	public List<User> getUsersByCorporate(User user) {
		LOGGER.info("Inside ServiceImpl getUsersByCorporate"+user.getCg_id());
		return departmentDao.getUsersByCorporateId(user);
	}

	@Transactional
	public void deleteDepartment(Integer deptId) {
		LOGGER.info("Inside ServiceImpl deleteDepartment"+deptId);
		int Id=departmentDao.getUserIdByDeptId(deptId);
		departmentDao.updateDepartment(deptId);
		List<Integer> projIds=departmentDao.getProjectByDeptID(deptId);

		if(!projIds.isEmpty())
		{	
		for(Integer projId:projIds){
			departmentDao.updateProjectDeleteFlag(projId);
			List<Integer> userIds=departmentDao.getUserByDeptID(projId);

			System.out.println("userIds"+userIds);
			
			if(!userIds.isEmpty())
			{
				System.out.println("not empty");
			for(Integer userID:userIds){
				departmentDao.updateUserDptProjIds(userID);
				departmentDao.updateUserRole(userID);
			}

			}
		}
		
		}
	
		departmentDao.updateUserRole(Id);
		departmentDao.updateUser(Id);
	}

	@Transactional
	public Department getDepartmentById(Integer deptId) {
		LOGGER.info("Inside ServiceImpl getDepartmentById"+deptId);
		return departmentDao.getDepartmentById(deptId);
	}

	@Transactional
	public List<User> getUsersByCorporateJSON(User user) {
		LOGGER.info("Inside ServiceImpl getUsersByCorporateJSON");
		List<User> userList=departmentDao.getUsersByCorporateId(user);
		return userList;
	}

	@Transactional
	public User getOwnerByName(String userName) {
		LOGGER.info("Inside ServiceImpl getOwnerByName"+userName);
		User user=new User();
		if(userName.equals(" ") || userName ==null){
			user.setUsr_id(0);
		}
		else{
		user=departmentDao.getOwnerByName(userName);
		}
		return user;
	}

	public VdcCgQuotaMap vdcCgQuotaByVdcIDandcgID(int selectedVdcId, int cgId) {
		// TODO Auto-generated method stub
		return departmentDao.vdcCgQuotaByVdcIDandcgID(selectedVdcId,cgId);
	}

	public List<VdcDeptQuotaMap> getRowsFromVdcDeptQuotaMapTable() {
		// TODO Auto-generated method stub
		return departmentDao.getRowsFromVdcDeptQuotaMapTable();
	}

	public int getSumOfTotalAllocatedMemoryToDpt(int selectedVdcId) {
		int sumAllocatedMemory =0;
		 
		sumAllocatedMemory =departmentDao.getSumOfTotalAllocatedMemoryToDpt(selectedVdcId);
		return sumAllocatedMemory;
	}

	public int getSumOftotalAllocatedDptVcpu(int selectedVdcId) {
		int sumAllocatedDptVcpu =0;
		 
		sumAllocatedDptVcpu =departmentDao.getSumOftotalAllocatedDptVcpu(selectedVdcId);
		return sumAllocatedDptVcpu;
	}

	public int gettotalAllocatedDptDiskStorage(int selectedVdcId) {
		int sumAllocatedDptDiskStorage =0;
		 
		sumAllocatedDptDiskStorage =departmentDao.gettotalAllocatedDptDiskStorage(selectedVdcId);
		return sumAllocatedDptDiskStorage;
	}

	public void allocateVdcToDepaertmentGroup(
			VdcDeptQuotaMap vdcDeptQuotaMapBean,int cgID) {
		
		System.out.println("The sesion id in allocateVdcToDepaertmentGroup"+cgID);
		
		  int availableMem = 0;
		  int availableVcpu = 0;
		  int availableDiskStorage = 0;
		  int totalMem = 0;
		  int  totalVcpu =0;
		  int  totalDiskStorage =0;
		  int totalAllocatedDptMem = 0;
		  int totalAllocatedDptVcpu = 0;
		  int totalAllocatedDptDiskStorage = 0;
		
		departmentDao.allocateVdcToDepaertmentGroup(vdcDeptQuotaMapBean);
		int selectedVdcId = vdcDeptQuotaMapBean.getVdc_id();
		 System.out.println(" selectedVdcId in allocateVdcToDepaertmentGroup"+selectedVdcId);
		 List<VdcDeptQuotaMap> vdcDeptQuotaMapBeanList = new ArrayList<VdcDeptQuotaMap>();
		 vdcDeptQuotaMapBeanList = departmentDao.getRowsFromVdcDeptQuotaMapTable();
	 System.out.println(" vdcDeptQuotaMapBeanList Isthis empty"+vdcDeptQuotaMapBeanList.isEmpty());
		 if(!vdcDeptQuotaMapBeanList.isEmpty()){
			 totalAllocatedDptMem = departmentDao.getSumOfTotalAllocatedMemoryToDpt(selectedVdcId);
			 totalAllocatedDptVcpu = departmentDao.getSumOftotalAllocatedDptVcpu(selectedVdcId);
			 totalAllocatedDptDiskStorage = departmentDao.gettotalAllocatedDptDiskStorage(selectedVdcId);
		 }
	
		 VdcCgQuotaMap vdcCgQuotaMap = new VdcCgQuotaMap();
		 vdcCgQuotaMap = departmentDao.getVDCdetailsBycgID(cgID);
		 totalMem = vdcCgQuotaMap.getTotal_mem();
		 totalVcpu = vdcCgQuotaMap.getTotal_vcpu();
		 totalDiskStorage = vdcCgQuotaMap.getTotal_disk_storage();
		 
		 availableMem = totalMem - totalAllocatedDptMem;
		 availableVcpu = totalVcpu - totalAllocatedDptVcpu;
		 availableDiskStorage = totalDiskStorage - totalAllocatedDptDiskStorage;
		 
		 
		 System.out.println("-----totalMem-------"+totalMem);
		 System.out.println("-----totalVcpu------"+totalVcpu);
		 System.out.println("------totalDiskStorage-------"+totalAllocatedDptMem);
		 System.out.println("------totalAllocatedCgMem----"+totalAllocatedDptVcpu);
		 System.out.println("--------totalAllocatedCgVcpu--------"+totalAllocatedDptDiskStorage);
		 System.out.println("----------totalAllocatedCgDiskStorage-------"+availableDiskStorage);
		 System.out.println("--------availableMem--------"+availableMem);
		 System.out.println("--------availableVcpu----------"+availableVcpu);
		 System.out.println("---------availableDiskStorage---------"+availableDiskStorage);
	 
		 vdcCgQuotaMap.setFree_mem(availableMem);
		 vdcCgQuotaMap.setFree_vcpu(availableVcpu);
		 
		 vdcCgQuotaMap.setFree_disk_storage(availableDiskStorage);
		 
		int cgAvailableMem = vdcCgQuotaMap.getFree_mem();
		int cgAvailableVcpu = vdcCgQuotaMap.getFree_vcpu();
		int cgAvailableDiskStorage = vdcCgQuotaMap.getFree_disk_storage();
		 System.out.println("-------AfterSet-availableMem--------"+cgAvailableMem);
		 System.out.println("-----AfterSet---availableVcpu----------"+cgAvailableVcpu);
		 System.out.println("-----AfterSet----availableDiskStorage---------"+cgAvailableDiskStorage);
		 departmentDao.updateFreeSpacesinCgquota(cgAvailableMem,cgAvailableVcpu ,cgAvailableDiskStorage, selectedVdcId,cgID);
		
		
		// TODO Auto-generated method stub
		
	}

	public int getAvaliableVcpuAllocated(String total_cg_vcpu, int cg_id) {
		int avalibaleVcpu = 0;
		avalibaleVcpu =  departmentDao.getCurrentavaliabvity(cg_id);
		
		return 0;
	}

	public int getVdcdetails(int selectedVdcId, int dptId) {
		
		
		VdcDeptQuotaMap vdcDeptQuotaMap = departmentDao.getVdcdetails(selectedVdcId,dptId);
		
		if (vdcDeptQuotaMap !=null)
		{
			return 1;
		}
				
		return 0;
	}

}

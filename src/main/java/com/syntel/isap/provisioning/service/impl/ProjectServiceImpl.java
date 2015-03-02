package com.syntel.isap.provisioning.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.syntel.isap.provisioning.bean.Department;
import com.syntel.isap.provisioning.bean.Project;
import com.syntel.isap.provisioning.bean.User;
import com.syntel.isap.provisioning.bean.VdcCgQuotaMap;
import com.syntel.isap.provisioning.bean.VdcDeptQuotaMap;
import com.syntel.isap.provisioning.bean.VdcMaster;
import com.syntel.isap.provisioning.bean.VdcProjQuotaMap;
import com.syntel.isap.provisioning.dao.IDepartmentDao;
import com.syntel.isap.provisioning.dao.IProjectDao;
import com.syntel.isap.provisioning.service.IProjectService;



@Service("projectService")
public class ProjectServiceImpl implements IProjectService {
	
	
	@Autowired 
	private IProjectDao projectDao;
	
	@Autowired
	private IDepartmentDao departmentDao;
	
	private static final Logger LOGGER = Logger.getLogger(LoginServiceImpl.class.getName());
	@Transactional
	public List<Project> getprojectLists(int dptid) {
		// TODO Auto-generated method stub
		return projectDao.getprojectLists(dptid);
	}


	@Transactional
	public void insertData(Project project,int userID) {
		project.setOwner(departmentDao.getUserNameById(userID));
		project.setCreated_by(departmentDao.getUserNameById(userID));
		
		System.out.println("userId Inside service"+userID);
		project.setStatus("Active");
		projectDao.insertData(project);
		int projId = project.getProj_id();
		projectDao.updateRoleMapByUserId(userID);
		projectDao.updateProjIdInUserTable(projId,userID);
	
		
	}
	
	@Transactional
	public List<Integer> getUserinfo(User user) {
		// TODO Auto-generated method stub
		return projectDao.getUserinfo(user);
		
		
		
		
	}


	
	
	
	@Transactional
	public void deleteProject(Integer proj_id) {
		
		LOGGER.info("Inside ServiceImpl deleteDepartment"+proj_id);
		projectDao.deleteProject(proj_id);
		
			List<Integer> userIds=projectDao.getUserByProjID(proj_id);
			for(Integer userID:userIds){
				projectDao.updateUserProjIds(userID);
				projectDao.updateUserRole(userID);
			}
	
	
	}

	public Project editProject(Integer proj_id) {
		
		Project project = new Project();
		project.setStatus("Active");
		return projectDao.editProject(proj_id);
		
	
	}

	public void updateProject(Project project, User user) 
	{
	
		project.setStatus("Active");
		int pid =project.getProj_id();
		LOGGER.info("Inside ServiceImpl editProject"+project.getProj_id());
		Project owner=projectDao.getProjectById(project.getProj_id());	
		LOGGER.info("Inside ServiceImpl editProject display"+project.getProj_id()+":"+owner.getOwner());
		if(!owner.getOwner().equals(projectDao.getUserNameById(user.getUsr_id()))){
			
			LOGGER.info("Inside ServiceImpl if user equals editDepartment");
			int userId=projectDao.getUserIdByProjId(pid);
			projectDao.updateUser(userId);
			projectDao.updateUserRole(userId);
			
			LOGGER.info("Inside ServiceImpl editProject project id number"+user.getProj_id());
			user.setProj_id(pid);
			int userID = user.getUsr_id();
			projectDao.updateRoleMapByUserId(userID);
			projectDao.mapProjectToUser(user.getUsr_id(),user.getProj_id());
		}	
		
		
			project.setOwner(projectDao.getUserNameById(user.getUsr_id()));
		LOGGER.info("Inside ServiceImpl editProject"+project.getProj_id()+":"+project.getProj_desc()+":"+project.getProj_name());
		projectDao.updateProject(project);
	
	}


	public List<User> getUsersByCorporate(User user) {
		// TODO Auto-generated method stub
		return projectDao.getUsersByCorporate(user);
	}


	public User getOwnerByName(String userName) {
		
		return projectDao.getOwnerByName(userName);
	}


	public List<VdcMaster> getVdcListFromVdcMaster() {
		
		return projectDao.getVdcListFromVdcMaster();
	}


	public VdcDeptQuotaMap vdcCgQuotaByVdcIDanddptID(int selectedVdcId,
			int dptId) {
		
		return projectDao.vdcCgQuotaByVdcIDanddptID(selectedVdcId,dptId);
	}


	public int getVdcdetails(int selectedVdcId, int projId) {
		
		VdcProjQuotaMap vdcProjQuotaMap = new VdcProjQuotaMap();
		
		vdcProjQuotaMap= projectDao.getVdcdetails(selectedVdcId,projId);
		
		if (vdcProjQuotaMap!=null){
			return 1;
		}
		
		return 0;
	}


	public void allocateVdcToProjectGroup(VdcProjQuotaMap vdcProjQuotaMapBean, int dptID) {
		
		  int availableMem = 0;
		  int availableVcpu = 0;
		  int availableDiskStorage = 0;
		  int totalMem = 0;
		  int  totalVcpu =0;
		  int  totalDiskStorage =0;
		  int totalAllocatedProMem = 0;
		  int totalAllocatedProVcpu = 0;
		  int totalAllocatedProDiskStorage = 0;
		
		  projectDao.allocateVdcToProjectGroup(vdcProjQuotaMapBean);
		 int selectedVdcId = vdcProjQuotaMapBean.getVdc_id();
     	 List<VdcProjQuotaMap> vdcProjQuotaMapBeanList = new ArrayList<VdcProjQuotaMap>();
		 vdcProjQuotaMapBeanList = projectDao.getRowsFromVdcProjQuotaMapTable();
	   
		 if(!vdcProjQuotaMapBeanList.isEmpty()){
			 totalAllocatedProMem = projectDao.getSumOfTotalAllocatedMemoryToProj(selectedVdcId);
			 totalAllocatedProVcpu = projectDao.getSumOftotalAllocatedProjVcpu(selectedVdcId);
			 totalAllocatedProDiskStorage = projectDao.gettotalAllocatedProjDiskStorage(selectedVdcId);
		 }
	
		 VdcDeptQuotaMap vdcDeptQuotaMap = new VdcDeptQuotaMap();
		 vdcDeptQuotaMap = projectDao.getVDCdetailsBydptID(dptID);
		 totalMem = vdcDeptQuotaMap.getTotal_mem();
		 totalVcpu = vdcDeptQuotaMap.getTotal_vcpu();
		 totalDiskStorage = vdcDeptQuotaMap.getTotal_disk_storage();
		 
		 availableMem = totalMem - totalAllocatedProMem;
		 availableVcpu = totalVcpu - totalAllocatedProVcpu;
		 availableDiskStorage = totalDiskStorage - totalAllocatedProDiskStorage;
		
		 vdcDeptQuotaMap.setFree_mem(availableMem);
		 vdcDeptQuotaMap.setFree_vcpu(availableVcpu);
		 
		 vdcDeptQuotaMap.setFree_disk_storage(availableDiskStorage);
		 
		int cgAvailableMem = vdcDeptQuotaMap.getFree_mem();
		int cgAvailableVcpu = vdcDeptQuotaMap.getFree_vcpu();
		int cgAvailableDiskStorage = vdcDeptQuotaMap.getFree_disk_storage();
		
		projectDao.updateFreeSpacesinDptquota(cgAvailableMem,cgAvailableVcpu ,cgAvailableDiskStorage, selectedVdcId,dptID);
	
	}
	
	/*public Project editProject(Integer workflowId){
	
	}
*/


	


}

package com.syntel.isap.provisioning.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.syntel.isap.provisioning.bean.Department;
import com.syntel.isap.provisioning.bean.User;
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
	public void addDepartment(Department department,User user) {
		
		department.setStatus("Active");
		LOGGER.info("Inside ServiceImpl addDepartment"+department.getStatus());
		department.setCg_id(user.getCg_id());
		department.setCreated_by(departmentDao.getUserNameById(user.getUsr_id()));
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
		department.setCreated_by(departmentDao.getUserNameById(user.getUsr_id()));
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

}

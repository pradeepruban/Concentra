package com.syntel.isap.provisioning.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.syntel.isap.provisioning.bean.CorporateGroups;
import com.syntel.isap.provisioning.bean.User;
import com.syntel.isap.provisioning.dao.ICorporateGroupDAO;
import com.syntel.isap.provisioning.dao.IDepartmentDao;
import com.syntel.isap.provisioning.service.ICorporateGroupService;

@Service("corporategroupDAO")
public class CorporateGroupServiceImpl implements ICorporateGroupService{

	@Autowired
	private ICorporateGroupDAO corporateGroupDAO;
	
	@Autowired
	private IDepartmentDao departmentDao;
	
	private static final Logger LOGGER = Logger.getLogger(LoginServiceImpl.class.getName());
	
	@Transactional
	public List<CorporateGroups> getcorporateGroupList() {
		return corporateGroupDAO.getcorporateGroupList();
	}

	@Transactional
	public void insertCorpGrpData(CorporateGroups corpGroup) {
		corporateGroupDAO.insertCorpGrpData(corpGroup);
		
	}

	@Transactional
	public List<String> getUsernamesByCgId() {
		List<String> usernamesList = corporateGroupDAO.getUsernamesByCgId();
		System.out.println("Userlist in Service--------------"+usernamesList);
		return usernamesList;
	}

	@Transactional
	public void updateCorpGrpData(CorporateGroups corpGroup,User user) {
		
		int usr_id= user.getUsr_id();
		int cgId = corpGroup.getCg_id();
		
		String usr_name = corporateGroupDAO.getUserNameById(user);
		
		String oldOwner = corporateGroupDAO.getOwnerByCgId(cgId);
		int oldUsrId = corporateGroupDAO.getUserIdByuserNameInUsertable(oldOwner) ;
		if(usr_name.equals(oldOwner)){
			corporateGroupDAO.updateCorpGroupWithoutOwner(corpGroup);
		}
		else{
		corpGroup.setCorporate_owner(usr_name);
		corporateGroupDAO.updateCorpGrpData(corpGroup);
		corporateGroupDAO.updateCgIdOfOwnerUserInUserTable(cgId, usr_id);
		corporateGroupDAO.mapRoleToUser(user);
		corporateGroupDAO.updateCgIdofOldOwner(oldUsrId);
		corporateGroupDAO.updateRoleOfOldOwner(oldUsrId);
		}
		/*
		 * 
		 */
		
		
		
	}

	@Transactional
	public CorporateGroups getCorpGrpByID(int cg_id) {
		CorporateGroups corpgrp= new CorporateGroups();
		corpgrp = corporateGroupDAO.getCorpGrpByID(cg_id);
		return corpgrp;
	}

	@Transactional
	public int getNewCgIdForUserByOwnerName(String corporate_owner) {
		int userCgIdChange = corporateGroupDAO.getNewCgIdForUserByOwnerName(corporate_owner);
		return userCgIdChange;
	}

	@Transactional
	public void updateCgIdOfOwnerUserInUserTable(int userCgIdChange,int userId) {
		corporateGroupDAO.updateCgIdOfOwnerUserInUserTable(userCgIdChange,userId)	;
	}

	@Transactional
	public int getUserIdByuserNameInUsertable(String ownerName) {
		int userId = corporateGroupDAO.getUserIdByuserNameInUsertable(ownerName);
		return userId;
	}

	@Transactional
	public void updateDeleteFlagInCorpGrp(int cg_id) {
		corporateGroupDAO.updateDeleteFlagInCorpGrp(cg_id);
		
	}

	@Transactional
	public User getOwnerByName(String userName) {
		User user=new User();
		user=corporateGroupDAO.getOwnerByName(userName);
		return user;
	}

	@Transactional
	public List<User> getUsersByCgId(int cgId) {
		List<User> userList = new ArrayList<User>();
		userList = corporateGroupDAO.getUsersByCgId(cgId);
		return userList;
	}

	@Transactional
	public List<User> getUsersByCgIdAndRoleID(User user) {
		return corporateGroupDAO.getUsersByCgIdAndRoleID(user);
	}

	@Transactional
	public void insertAddCorporateGroupData(CorporateGroups corpGroup, User user) {
		corpGroup.setStatus("Active");
		LOGGER.info("Inside ServiceImpl addCorporateGroup"+corpGroup.getStatus());
		corpGroup.setCorporate_owner(corporateGroupDAO.getUserNameById(user));
		corporateGroupDAO.insertAddCorporateGroupData(corpGroup);// query 1
		int corpId =corpGroup.getCg_id();
		user.setCg_id(corpId);
		corporateGroupDAO.mapRoleToUser(user);// query 2
		corporateGroupDAO.mapCorporateGroupToUser(user.getUsr_id(),corpId);// query 3
	}

	
	@Transactional
	public void deleteCorporateGroups(int cg_id) {
		
		LOGGER.info("Inside ServiceImpl deleteCorporate"+cg_id);
		
		List<Integer> dptIdList = new ArrayList<Integer>();
		List<Integer> projIdList = new ArrayList<Integer>();
		List<Integer> userIdList = new ArrayList<Integer>();
		
		dptIdList = corporateGroupDAO.getDptIdListByCgId(cg_id);
		projIdList = corporateGroupDAO.getProjIdListByCgId(cg_id);
		userIdList = corporateGroupDAO.getUserIdListByCgId(cg_id);
		
		corporateGroupDAO.updateDeleteFlagInCorpGrp(cg_id);
		
		if(!dptIdList.isEmpty()){
			for(Integer deptId:dptIdList){
				corporateGroupDAO.updateDeptDeleteFlag(deptId);
			}
		}
		
		if(!projIdList.isEmpty()){
			for(Integer projId:projIdList){
				corporateGroupDAO.updateProjDeleteFlag(projId);
			}
		}
		
		if(!userIdList.isEmpty()){
			for(Integer userId:userIdList){
				corporateGroupDAO.updateCgDeptProjId(userId);
				departmentDao.updateUserRole(userId);
			}
		}
			
		
	}

}

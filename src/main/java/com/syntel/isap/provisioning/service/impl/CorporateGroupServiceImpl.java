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
import com.syntel.isap.provisioning.service.ICorporateGroupService;

@Service("corporategroupDAO")
public class CorporateGroupServiceImpl implements ICorporateGroupService{

	@Autowired
	private ICorporateGroupDAO corporateGroupDAO;
	
	private static final Logger LOGGER = Logger.getLogger(LoginServiceImpl.class.getName());
	
	public List<CorporateGroups> getcorporateGroupList() {
		return corporateGroupDAO.getcorporateGroupList();
	}

	public void insertCorpGrpData(CorporateGroups corpGroup) {
		corporateGroupDAO.insertCorpGrpData(corpGroup);
		
	}

	public List<String> getUsernamesByCgId(int cgId) {
		List<String> usernamesList = corporateGroupDAO.getUsernamesByCgId(cgId);
		System.out.println("Userlist in Service--------------"+usernamesList);
		return usernamesList;
	}

	public void updateCorpGrpData(CorporateGroups corpGroup) {
		corporateGroupDAO.updateCorpGrpData(corpGroup);
		
	}

	public CorporateGroups getCorpGrpByID(int cg_id) {
		CorporateGroups corpgrp= new CorporateGroups();
		corpgrp = corporateGroupDAO.getCorpGrpByID(cg_id);
		return corpgrp;
	}

	public int getNewCgIdForUserByOwnerName(String corporate_owner) {
		int userCgIdChange = corporateGroupDAO.getNewCgIdForUserByOwnerName(corporate_owner);
		return userCgIdChange;
	}

	public void updateCgIdOfOwnerUserInUserTable(int userCgIdChange,int userId) {
		corporateGroupDAO.updateCgIdOfOwnerUserInUserTable(userCgIdChange,userId)	;
	}

	public int getUserIdByuserNameInUsertable(String ownerName) {
		int userId = corporateGroupDAO.getUserIdByuserNameInUsertable(ownerName);
		return userId;
	}

	public void changeDeleteFlagInCorpGrp(int cg_id) {
		corporateGroupDAO.changeDeleteFlagInCorpGrp(cg_id);
		
	}

	public User getOwnerByName(String userName) {
		User user=new User();
		user=corporateGroupDAO.getOwnerByName(userName);
		return user;
	}

	public List<User> getUsersByCgId(int cgId) {
		List<User> userList = new ArrayList<User>();
		userList = corporateGroupDAO.getUsersByCgId(cgId);
		return userList;
	}

	public List<User> getUsersByCgIdAndRoleID(User user) {
		return corporateGroupDAO.getUsersByCgIdAndRoleID(user);
	}

	@Transactional
	public void insertAddCorporateGroupData(CorporateGroups corpGroup, User user) {
		corpGroup.setStatus("Active");
		LOGGER.info("Inside ServiceImpl addCorporateGroup"+corpGroup.getStatus());
/*		corpGroup.setCg_id(user.getCg_id());*/
/*		corpGroup.setDelete_flag(0);*/
		corpGroup.setCorporate_owner(corporateGroupDAO.getUserNameById(user.getUsr_id()));
		corporateGroupDAO.insertAddCorporateGroupData(corpGroup);// query 1
		int corpId =corpGroup.getCg_id();
		user.setCg_id(corpId);
		corporateGroupDAO.mapRoleToUser(user);// query 2
		corporateGroupDAO.mapCorporateGroupToUser(user.getUsr_id(),corpId);// query 3
	}

}

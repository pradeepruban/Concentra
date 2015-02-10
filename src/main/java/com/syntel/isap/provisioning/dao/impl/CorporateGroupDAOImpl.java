package com.syntel.isap.provisioning.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




















import com.syntel.isap.provisioning.bean.CorporateGroups;
import com.syntel.isap.provisioning.bean.User;
import com.syntel.isap.provisioning.dao.ICorporateGroupDAO;
import com.syntel.isap.provisioning.mapper.CorporateGroupMapper;


@Service("CorporategrupDAO")
public class CorporateGroupDAOImpl implements ICorporateGroupDAO {

	@Autowired
	private CorporateGroupMapper corporategroupMapper;

	public List<CorporateGroups> getcorporateGroupList() {
		
		return corporategroupMapper.getcorporateGroupList();
	}

	
     
	public void insertCorpGrpData(CorporateGroups corpGroup) {
		corporategroupMapper.insertCorpGrpData(corpGroup);
		
	}

	public List<String> getUsernamesByCgId(int cgId) {
		List<String> usernamesList = null;//corporategroupMapper.getUsernamesByCgId();
		System.out.println("Userlist in DAO--------------"+usernamesList);
		return usernamesList;
	}

	public void updateCorpGrpData(CorporateGroups corpGroup) {
		corporategroupMapper.updateCorpGrpData(corpGroup);
		
	}

	public CorporateGroups getCorpGrpByID(int cg_id) {
		CorporateGroups corpgrp= new CorporateGroups();
		corpgrp = corporategroupMapper.getCorpGrpByID(cg_id);
		return corpgrp;
	}

	public int getNewCgIdForUserByOwnerName(String corporate_owner) {
		int userCgIdChange = corporategroupMapper.getNewCgIdForUserByOwnerName(corporate_owner);
		return userCgIdChange;
	}

	public void updateCgIdOfOwnerUserInUserTable(int userCgIdChange,int userId) {
		corporategroupMapper.updateCgIdOfOwnerUserInUserTable(userCgIdChange,userId);
		
	}

	public int getUserIdByuserNameInUsertable(String ownerName) {
		int userId = corporategroupMapper.getUserIdByuserNameInUsertable(ownerName);
		return userId;
	}

	public void updateDeleteFlagInCorpGrp(int cg_id) {
		corporategroupMapper.updateDeleteFlagInCorpGrp(cg_id);
		
	}

	public User getOwnerByName(String userName) {
		User user= new User();
		user = corporategroupMapper.getOwnerByName(userName);
		return user;
	}

	public List<User> getUsersByCgId(int cgId) {
		List<User> userList = new ArrayList<User>();
		userList = corporategroupMapper.getUsersByCgId(cgId);
		return userList;
	}

	public List<User> getUsersByCgIdAndRoleID(User user) {
		return corporategroupMapper.getUsersByCgIdAndRoleID(user);
	}

	
	public String getUserNameById(User user) {
		return corporategroupMapper.getUserNameById(user);
	}

	public void insertAddCorporateGroupData(CorporateGroups corpGroup) {
		corporategroupMapper.insertAddCorporateGroupData(corpGroup);
		
	}

	public void mapRoleToUser(User user) {
		corporategroupMapper.mapRoleToUser(user);
		
	}

	public void mapCorporateGroupToUser(int usr_id, int cg_id) {
		corporategroupMapper.mapCorporateGroupToUser(usr_id,cg_id);
		
	}

	public List<String> getUsernamesByCgId() {
		// TODO Auto-generated method stub
		return null;
	}


	public List<Integer> getDptIdListByCgId(int cg_id) {
		List<Integer> dptIdList = corporategroupMapper.getDptIdListByCgId(cg_id);
		return dptIdList;
	}



	public List<Integer> getProjIdListByCgId(int cg_id) {
		List<Integer> projIdList = corporategroupMapper.getProjIdListByCgId(cg_id);
		return projIdList;
	}



	public List<Integer> getUserIdListByCgId(int cg_id) {
		List<Integer> userIdList = corporategroupMapper.getUserIdListByCgId(cg_id);
		return userIdList;
	}



	public void updateDeptDeleteFlag(Integer deptId) {
		corporategroupMapper.updateDeptDeleteFlag(deptId);
		
	}



	public void updateProjDeleteFlag(Integer projId) {
		corporategroupMapper.updateProjDeleteFlag(projId);
		
	}



	public void updateCgDeptProjId(Integer userId) {
		corporategroupMapper.updateCgDeptProjId(userId);
		
	}



	public String getOwnerByCgId(int cg_id) {
		String currentOwner = corporategroupMapper.getOwnerByCgId(cg_id);
		return currentOwner;
	}



	public void updateCorpGroupWithoutOwner(CorporateGroups corpGroup) {
		corporategroupMapper.updateCorpGroupWithoutOwner(corpGroup);
	}



	public void updateRoleOfOldOwner(int oldUsrId) {
		corporategroupMapper.updateRoleOfOldOwner(oldUsrId);
		
	}



	public void updateCgIdofOldOwner(int oldUsrId) {
		corporategroupMapper.updateCgIdofOldOwner(oldUsrId);
		
	}




	

}


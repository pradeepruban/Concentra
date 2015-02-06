package com.syntel.isap.provisioning.dao;

import java.util.List;

import com.syntel.isap.provisioning.bean.CorporateGroups;
import com.syntel.isap.provisioning.bean.User;

public interface ICorporateGroupDAO {

	List<CorporateGroups> getcorporateGroupList();

	void insertCorpGrpData(CorporateGroups corpGroup);

	List<String> getUsernamesByCgId(int cgId);

	void updateCorpGrpData(CorporateGroups corpGroup);

	CorporateGroups getCorpGrpByID(int cg_id);

	int getNewCgIdForUserByOwnerName(String corporate_owner);

	void updateCgIdOfOwnerUserInUserTable(int userCgIdChange,int userId);

	int getUserIdByuserNameInUsertable(String ownerName);

	void changeDeleteFlagInCorpGrp(int cg_id);

	User getOwnerByName(String userName);

	List<User> getUsersByCgId(int cgId);

	List<User> getUsersByCgIdAndRoleID(User user);

	String getUserNameById(int usr_id);

	void insertAddCorporateGroupData(CorporateGroups corpGroup);

	void mapRoleToUser(User user);

	void mapCorporateGroupToUser(int usr_id, int cg_id);
}

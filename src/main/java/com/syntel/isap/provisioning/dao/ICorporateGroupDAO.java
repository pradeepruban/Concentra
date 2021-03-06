package com.syntel.isap.provisioning.dao;

import java.util.List;

import com.syntel.isap.provisioning.bean.CorporateGroups;
import com.syntel.isap.provisioning.bean.User;
import com.syntel.isap.provisioning.bean.VdcCgQuotaMap;
import com.syntel.isap.provisioning.bean.VdcMaster;
import com.syntel.isap.provisioning.bean.VmProvCredential;

public interface ICorporateGroupDAO {

	List<CorporateGroups> getcorporateGroupList();

	void insertCorpGrpData(CorporateGroups corpGroup);

	List<String> getUsernamesByCgId();

	void updateCorpGrpData(CorporateGroups corpGroup);

	CorporateGroups getCorpGrpByID(int cg_id);

	int getNewCgIdForUserByOwnerName(String corporate_owner);

	void updateCgIdOfOwnerUserInUserTable(int userCgIdChange,int userId);

	int getUserIdByuserNameInUsertable(String ownerName);

	void updateDeleteFlagInCorpGrp(int cg_id);

	User getOwnerByName(String userName);

	List<User> getUsersByCgId(int cgId);

	List<User> getUsersByCgIdAndRoleID(User user);

	String getUserNameById(User user);

	void insertAddCorporateGroupData(CorporateGroups corpGroup);

	void mapRoleToUser(User user);

	void mapCorporateGroupToUser(int usr_id, int cg_id);

	List<Integer> getDptIdListByCgId(int cg_id);

	List<Integer> getProjIdListByCgId(int cg_id);

	List<Integer> getUserIdListByCgId(int cg_id);

	void updateDeptDeleteFlag(Integer deptId);

	void updateProjDeleteFlag(Integer projId);

	void updateCgDeptProjId(Integer userId);

	String getOwnerByCgId(int cg_id);

	void updateCorpGroupWithoutOwner(CorporateGroups corpGroup);

	void updateRoleOfOldOwner(int oldUsrId);

	void updateCgIdofOldOwner(int oldUsrId);

	List<VdcMaster> getVdcListFromVdcMaster();

	VmProvCredential getVdcCredentialByVdcId(int selectedVdcId);

	String getIpAddressControllerEndpointByVdcIdFromVdcExtension(int selectedVdcId);

	String getTenantNameAdminTenantByVdcIdFromVdcExtension(int selectedVdcId);

	int getSumOfTotalAllocatedMemoryToCg(int selectedVdcId);

	int getSumOfTotalAllocatedVcpuToCg(int selectedVdcId);

	int getSumOfTotalAllocatedDiskStorageToCg(int selectedVdcId);

	List<VdcCgQuotaMap> getRowsFromCgQuotaMapTable();

	void allocateVdcToCorporateGroup(VdcCgQuotaMap vdcCgQuotaMapBean);

	VdcCgQuotaMap getCgIdVdcIdFromCgQuotaMap(int cgId, int vdcId);

	void updateVdcDetailInVdcMaster(VdcMaster vdcMasterBean);

	
}

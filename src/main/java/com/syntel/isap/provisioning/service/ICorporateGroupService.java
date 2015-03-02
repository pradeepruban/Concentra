package com.syntel.isap.provisioning.service;

import java.util.List;

import com.syntel.isap.provisioning.bean.CorporateGroups;
import com.syntel.isap.provisioning.bean.User;
import com.syntel.isap.provisioning.bean.VdcCgQuotaMap;
import com.syntel.isap.provisioning.bean.VdcMaster;
import com.syntel.isap.provisioning.bean.VmProvCredential;

public interface ICorporateGroupService {

	List<CorporateGroups> getcorporateGroupList();

	void insertCorpGrpData(CorporateGroups corpGroup);

	List<String> getUsernamesByCgId();

	void updateCorpGrpData(CorporateGroups corpGroup, User user);

	CorporateGroups getCorpGrpByID(int cg_id);

	int getNewCgIdForUserByOwnerName(String corporate_owner);

	void updateCgIdOfOwnerUserInUserTable(int userCgIdChange,int userId);

	int getUserIdByuserNameInUsertable(String ownerName);

	void updateDeleteFlagInCorpGrp(int cg_id);

	User getOwnerByName(String userName);

	List<User> getUsersByCgId(int cgId);

	List<User> getUsersByCgIdAndRoleID(User user);//bean for dropdown values for role id 1 and cg id 11(cpool)

	void insertAddCorporateGroupData(CorporateGroups corpGroup, User user);

	void deleteCorporateGroups(int cg_id);

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

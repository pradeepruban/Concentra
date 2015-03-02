package com.syntel.isap.provisioning.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.syntel.isap.provisioning.bean.CorporateGroups;
import com.syntel.isap.provisioning.bean.User;
import com.syntel.isap.provisioning.bean.VdcCgQuotaMap;
import com.syntel.isap.provisioning.bean.VdcMaster;
import com.syntel.isap.provisioning.bean.VmProvCredential;



public interface CorporateGroupMapper {
	
	@Select("SELECT * FROM isap_cmn_corporategroups WHERE delete_flag = 0 AND cg_id!=1")
	public List<CorporateGroups> getcorporateGroupList();
	/*
	@Select("SELECT user.usr_name FROM isap_cmn_users user,isap_cmn_user_role_map maps WHERE user.cg_Id = 1")
	public List<String> getUsernamesByCgId();*/
	
	@Select("Select * FROM isap_cmn_corporategroups WHERE cg_Id = #{cgId}")
	public CorporateGroups getCorpGrpByID(int cg_id);
	
	@Select("SELECT * FROM isap_cmn_users WHERE usr_name = #{userName}")
	User getOwnerByName(String userName);
	
	/*@Select(GET_USER_BY_CORP_ID)
	List<User> getUsersByCorporateId(User user);*/
	
	@Insert("INSERT INTO isap_cmn_corporategroups(corporate_name,corporate_description,corporate_owner,status)"
					+"VALUES(#{corporate_name},#{corporate_description},#{corporate_owner},#{status})")
	public void insertCorpGrpData(CorporateGroups corpGroup);
	
	/*@Update("UPDATE isap_cmn_users SET cg_id = #{cg_id} WHERE usr_name = #{corporate_owner}; ")
	public void updateCgidInUserTableByOwnername();*/
	
	@Update("UPDATE isap_cmn_corporategroups SET corporate_name = #{corporate_name}, corporate_description = #{corporate_description},"
			+ " corporate_owner = #{corporate_owner} , status = #{status} WHERE cg_id= #{cg_id}; ")
	public void updateCorpGrpData(CorporateGroups corpGroup);
	
	@Update("UPDATE isap_cmn_corporategroups SET corporate_name = #{corporate_name}, corporate_description = #{corporate_description},"
			+ " status = #{status} WHERE cg_id= #{cg_id}; ")
	public void updateCorpGroupWithoutOwner(CorporateGroups corpGroup);

	
	// I have to write a JOIN QUERY FOR BELOW Three QUERIES
	@Select("SELECT cg_id FROM isap_cmn_corporategroups WHERE corporate_owner = #{corporate_owner}")
	public int getNewCgIdForUserByOwnerName(String corporate_owner);
	
	@Select("SELECT usr_id FROM isap_cmn_users WHERE usr_name = #{ownerName}")
	public int getUserIdByuserNameInUsertable(String ownerName);
	
	@Update("UPDATE isap_cmn_users SET cg_id = #{userCgIdChange} WHERE usr_id = #{userId}")
	public void updateCgIdOfOwnerUserInUserTable(@Param("userCgIdChange")int userCgIdChange,@Param("userId")int userId);

	@Select("SELECT usr_id, usr_name FROM isap_cmn_users WHERE cg_id = #{cgId}")
	public List<User> getUsersByCgId(int cgId);

	@Select("SELECT users.usr_id,users.usr_name FROM isap_cmn_users users,isap_cmn_user_role_map maps WHERE users.cg_id=1 AND maps.role_id=6 AND users.usr_id=maps.usr_id")
	public List<User> getUsersByCgIdAndRoleID(User user);

	@Select("SELECT usr_name FROM isap_cmn_users WHERE usr_id = #{usr_id}")
	public String getUserNameById(User user);

	@Insert("INSERT INTO isap_cmn_corporategroups(corporate_name,corporate_description,corporate_owner,status)"
			+"VALUES(#{corporate_name},#{corporate_description},#{corporate_owner},#{status})")
	@Options(useGeneratedKeys = true, keyProperty = "cg_id")
	public void insertAddCorporateGroupData(CorporateGroups corpGroup);

	@Update("UPDATE isap_cmn_user_role_map SET role_id = 2 where usr_id = #{usr_id}")
	public void mapRoleToUser(User user);
	
	@Update("UPDATE isap_cmn_users SET proj_id = 1, dpt_id = 1, cg_id =1 WHERE usr_id = #{oldUsrId}")
	public void updateCgIdofOldOwner(@Param("oldUsrId")int oldUsrId);
	
	@Update("UPDATE isap_cmn_user_role_map SET role_id = 6 where usr_id = #{oldUsrId}")
	public void updateRoleOfOldOwner(@Param("oldUsrId")int oldUsrId);

	@Update("UPDATE isap_cmn_users SET cg_id = #{cg_id} where usr_id = #{usr_id}")
	public void mapCorporateGroupToUser(@Param("usr_id") int usr_id,@Param("cg_id") int cg_id);

	@Select("Select dpt_id FROM isap_cmn_users WHERE cg_id = #{cg_id}")
	public List<Integer> getDptIdListByCgId(int cg_id);

	@Select("Select proj_id FROM isap_cmn_users WHERE cg_id = #{cg_id}")
	public List<Integer> getProjIdListByCgId(int cg_id);

	@Select("Select usr_id FROM isap_cmn_users WHERE cg_id = #{cg_id}")
	public List<Integer> getUserIdListByCgId(int cg_id);

	@Update("UPDATE isap_cmn_corporategroups SET delete_flag = 1 WHERE cg_id = #{cg_id}")
	public void updateDeleteFlagInCorpGrp(int cg_id);

	@Update("UPDATE isap_cmn_depts SET delete_flag = 1 WHERE dpt_id = #{deptId}")
	public void updateDeptDeleteFlag(@Param("deptId")Integer deptId);

	@Update("UPDATE isap_cmn_projects SET delete_flag = 1 WHERE proj_id = #{projId}")
	public void updateProjDeleteFlag(@Param("projId")Integer projId);

	@Update("UPDATE isap_cmn_users SET proj_id = 1, dpt_id = 1, cg_id =1 WHERE usr_id = #{userId}")
	public void updateCgDeptProjId(Integer userId);
	
	@Select("SELECT corporate_owner FROM isap_cmn_corporategroups where cg_id = #{cg_id}")
	public String getOwnerByCgId(int cg_id);
	
	@Select("SELECT * FROM isap_env_vdc_master")
	public List<VdcMaster> getVdcListFromVdcMaster();

	@Select("SELECT * FROM isap_vm_prov_cred WHERE vdc_id=#{selectedVdcId}")
	public VmProvCredential getVdcCredentialByVdcId(@Param("selectedVdcId")int selectedVdcId);

	@Select("SELECT param_val FROM isap_env_vdc_ext WHERE param_name='controllerEndpoint' AND vdc_id=#{selectedVdcId}")
	public String getIpAddressControllerEndpointByVdcIdFromVdcExtension(@Param("selectedVdcId")int selectedVdcId);

	@Select("SELECT param_val FROM isap_env_vdc_ext WHERE param_name='adminTenant' AND vdc_id=#{selectedVdcId}")
	public String getTenantNameAdminTenantByVdcIdFromVdcExtension(@Param("selectedVdcId")int selectedVdcId);

	@Select("SELECT sum(total_mem) FROM isap_env_vdc_cg_quota_map WHERE vdc_id = #{selectedVdcId}")
	public int getSumOfTotalAllocatedMemoryToCg(@Param("selectedVdcId")int selectedVdcId);

	@Select("SELECT sum(total_vcpu) FROM isap_env_vdc_cg_quota_map WHERE vdc_id = #{selectedVdcId}")
	public int getSumOfTotalAllocatedVcpuToCg(@Param("selectedVdcId")int selectedVdcId);

	@Select("SELECT sum(total_disk_storage) FROM isap_env_vdc_cg_quota_map WHERE vdc_id = #{selectedVdcId}")
	public int getSumOfTotalAllocatedDiskStorageToCg(int selectedVdcId);

	@Select("SELECT * FROM isap_env_vdc_cg_quota_map")
	public List<VdcCgQuotaMap> getRowsFromCgQuotaMapTable();

	@Insert("INSERT INTO isap_env_vdc_cg_quota_map(cg_id,vdc_id,total_mem,total_vcpu,total_disk_storage,free_mem,free_vcpu,free_disk_storage,created_by)"
			+"VALUES(#{cg_id},#{vdc_id},#{total_mem},#{total_vcpu},#{total_disk_storage},#{free_mem},#{free_vcpu},#{free_disk_storage},#{created_by})")
	public void allocateVdcToCorporateGroup(VdcCgQuotaMap vdcCgQuotaMapBean);

	@Select("Select * FROM isap_env_vdc_cg_quota_map WHERE cg_id=#{cgId} AND vdc_id = #{vdcId} ")
	public VdcCgQuotaMap getCgIdVdcIdFromCgQuotaMap(@Param("cgId") int cgId, @Param("vdcId") int vdcId);

	@Update("UPDATE isap_env_vdc_master SET total_mem =#{total_mem}, total_vcpu = #{total_vcpu},total_disk_storage = #{total_disk_storage},"
			+ "free_mem = #{free_mem},free_vcpu = #{free_vcpu},free_disk_storage = #{free_disk_storage}  WHERE vdc_id = #{vdc_id}")
	public void updateVdcDetailInVdcMaster(VdcMaster vdcMasterBean);

	
	
}

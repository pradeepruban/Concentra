package com.syntel.isap.provisioning.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.syntel.isap.provisioning.bean.CorporateGroups;
import com.syntel.isap.provisioning.bean.User;



public interface CorporateGroupMapper {
	
	@Select("SELECT * FROM isap_cmn_corporategroups WHERE delete_flag = 0 AND cg_id!=1")
	public List<CorporateGroups> getcorporateGroupList();
	
	@Select("SELECT usr_name FROM isap_cmn_users WHERE cg_Id = #{cgId}")
	public List<String> getUsernamesByCgId(int cgId);
	
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
	
	// I have to write a JOIN QUERY FOR BELOW Three QUERIES
	@Select("SELECT cg_id FROM isap_cmn_corporategroups WHERE corporate_owner = #{corporate_owner}")
	public int getNewCgIdForUserByOwnerName(String corporate_owner);
	
	@Select("SELECT usr_id FROM isap_cmn_users WHERE usr_name = #{ownerName}")
	public int getUserIdByuserNameInUsertable(String ownerName);
	
	@Update("UPDATE isap_cmn_users SET cg_id = #{userCgIdChange} WHERE usr_id = #{userId}")
	public void updateCgIdOfOwnerUserInUserTable(int userCgIdChange,int userId);

	@Update("UPDATE isap_cmn_corporategroups SET delete_flag = 1 WHERE cg_id = #{cg_id}")
	public void changeDeleteFlagInCorpGrp(int cg_id);

	@Select("SELECT usr_id, usr_name FROM isap_cmn_users WHERE cg_id = #{cgId}")
	public List<User> getUsersByCgId(int cgId);

	@Select("SELECT users.usr_id,users.usr_name FROM isap_cmn_users users,isap_cmn_user_role_map maps WHERE users.cg_id=1 AND maps.role_id=6 AND users.usr_id=maps.usr_id")
	public List<User> getUsersByCgIdAndRoleID(User user);

	@Select("SELECT usr_name FROM isap_cmn_users WHERE usr_id = #{usr_id}")
	public String getUserNameById(int usr_id);

	@Insert("INSERT INTO isap_cmn_corporategroups(corporate_name,corporate_description,corporate_owner,status)"
			+"VALUES(#{corporate_name},#{corporate_description},#{corporate_owner},#{status})")
	@Options(useGeneratedKeys = true, keyProperty = "cg_id")
	public void insertAddCorporateGroupData(CorporateGroups corpGroup);

	@Update("UPDATE isap_cmn_user_role_map SET role_id = 2 where usr_id = #{usr_id}")
	public void mapRoleToUser(User user);

	@Update("UPDATE isap_cmn_users SET cg_id = #{cg_id} where usr_id = #{usr_id}")
	public void mapCorporateGroupToUser(@Param("usr_id") int usr_id,@Param("cg_id") int cg_id);

	
}
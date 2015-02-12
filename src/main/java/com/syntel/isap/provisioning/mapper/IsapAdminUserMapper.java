package com.syntel.isap.provisioning.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.syntel.isap.provisioning.bean.CorporateGroups;
import com.syntel.isap.provisioning.bean.Department;
import com.syntel.isap.provisioning.bean.Project;
import com.syntel.isap.provisioning.bean.User;
import com.syntel.isap.provisioning.bean.UserRoleMap;

public interface IsapAdminUserMapper {

	@Select("SELECT * FROM isap_cmn_corporategroups")
	List<CorporateGroups> getCorps();
	
	@Select("SELECT * FROM isap_cmn_depts")
	List<Department> getDepts();

	
	@Select("SELECT * FROM isap_cmn_projects")
	List<Project> getProj();
	
	@Select("SELECT usr_name,proj_name, dpt_name, corporate_name, e.status, e.usr_id  FROM isap_cmn_users e JOIN isap_cmn_depts r ON e.dpt_id=r.dpt_id JOIN isap_cmn_projects d ON e.proj_id=d.proj_id JOIN isap_cmn_corporategroups c on e.cg_id=c.cg_id where e.delete_flag!=1;")
    public  List<User> getUser();

	@Select("SELECT * FROM isap_cmn_depts where cg_id=#{cgId} OR cg_id=1")
	List<Department> getDeptsJson(Integer cgId);

	@Select("SELECT * FROM isap_cmn_projects where dpt_id=#{dptId} OR dpt_id =1")
	List<Project> getProjsJson(Integer deptId);

	
	@Insert("INSERT INTO isap_cmn_users "
			+ "(usr_name,password,proj_id,dpt_id,cg_id) VALUES "
			+ "(#{usr_name},#{password},#{proj_id},#{dpt_id},#{cg_id})")
	public void addUserInUserTable(User usr);

	
	@Delete("UPDATE isap_cmn_users SET proj_id= 1,dpt_id =1,cg_id =1,delete_flag =1 where usr_id = #{usr_id}")
	void deleteUser(int usr_id);
	

	@Select("SELECT * FROM isap_cmn_users where cg_id = #{cg_id}  order by usr_id desc")
	void getuserLists(Integer cg_id);

	@Insert("INSERT INTO isap_cmn_user_role_map(usr_id,role_id) VALUES (#{usrId},#{roleId})")
	void insertRoleIdforUserIdInRolemap(@Param("roleId")int roleId,@Param("usrId") int usrId);

	
	@Select("SELECT role_id FROM isap_cmn_user_role_map where usr_id = #{id}")
	
	UserRoleMap getAdminDetailsJsonById(Integer id);

	@Select("SELECT * FROM isap_cmn_users WHERE usr_id = #{usrId}")
	User getUserById(Integer userId);


	 final String GET_USER_BY_USR_ID = "SELECT users.usr_id,users.usr_name FROM isap_cmn_users users,isap_cmn_user_role_map maps,isap_cmn_corporategroups corp "
				+ "WHERE users.usr_id=maps.usr_id "
				+ "AND users.dpt_id=#{DeptId} ";
				/*+ "AND users.cg_id = 2 AND corps.cg_id=2";*/
	
	
	 @Select(GET_USER_BY_USR_ID)
	List<User> getUsersByuser(User user);

	 @Update("UPDATE isap_cmn_users SET usr_name=#{usr_name},proj_id=#{proj_id},dpt_id=#{dpt_id},cg_id=#{cg_id} where usr_id=#{usr_id}")
	void getUserFromUserTable(User user);

	
	


}

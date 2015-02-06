package com.syntel.isap.provisioning.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.syntel.isap.provisioning.bean.Department;
import com.syntel.isap.provisioning.bean.User;

/**
 * @author KK5007843
 *
 */

public interface DepartmentMapper {

	final String GET_USER_BY_CORP_ID = "SELECT users.usr_id,users.usr_name FROM isap_cmn_users users,isap_cmn_user_role_map maps "
			+ "WHERE users.usr_id=maps.usr_id AND users.cg_id=#{cg_id} "
			+ "AND users.dpt_id=1 AND maps.role_id=6";
	
	final String GET_USER_BY_DEPT_OWNER_ID = "SELECT users.usr_id,users.usr_name FROM isap_cmn_users users,isap_cmn_user_role_map maps "
			+ "WHERE users.usr_id=maps.usr_id "
			+ "AND users.dpt_id=#{dpt_id} "
			+ "AND maps.role_id=2";
	
	
	final String GET_USERID_BY_DEPT_ID_ROLE = "SELECT users.usr_id FROM isap_cmn_users users,isap_cmn_user_role_map maps "
			+ "WHERE users.usr_id=maps.usr_id AND users.dpt_id=#{deptId} "
			+ "AND maps.role_id=3";
	
	final String UPDATE_ROLE_MAP_TO_USER="UPDATE isap_cmn_user_role_map SET role_id =3 where usr_id = #{usr_id}";
	
	final String UPDATE_DEPARTMENT_MAP_TO_USER="UPDATE isap_cmn_users SET dpt_id = #{dpt_id} where usr_id = #{usr_id}";
	
	@Select("SELECT * FROM isap_cmn_depts where cg_id=#{cgId} AND delete_flag=0 AND dpt_id!=1  order by dpt_id desc")
	List<Department> getDepartmentList(int cgId);

	@Insert("INSERT INTO isap_cmn_depts "
			+ "(dpt_name,dpt_desc,status,cg_id,created_by) VALUES "
			+ "(#{dpt_name},#{dpt_desc},#{status},#{cg_id},#{created_by})")
	@Options(useGeneratedKeys = true, keyProperty = "dpt_id")
	void addDepartment(Department department);

	@Insert("INSERT INTO isap_cmn_users "
			+ "(usr_name,usr_desc,cg_id,dpt_id) VALUES "
			+ "(#{usr_name},#{usr_desc},#{cg_id},#{dpt_id})")
	@Options(useGeneratedKeys = true, keyProperty = "usr_id")
	void addDepartmentAdmin(User user);

	@Select(GET_USER_BY_CORP_ID)
	List<User> getUsersByCorporateId(User user);

	@Update(UPDATE_ROLE_MAP_TO_USER)
	void mapRoleToUser(User user);

	@Update(UPDATE_DEPARTMENT_MAP_TO_USER)
	void mapDepartmentToUser(@Param("usr_id")int usr_id,@Param("dpt_id") int dpt_id);

	@Select("SELECT usr_name FROM isap_cmn_users WHERE usr_id = #{usr_id}")
	String getUserNameById(int usr_id);
	
    @Update("UPDATE isap_cmn_depts SET delete_flag=1  where dpt_id = #{deptId}")
	void updateDepartment(@Param("deptId")Integer deptId);

    @Update("UPDATE isap_cmn_user_role_map SET role_id=6  where usr_id = #{userId}")
	void updateUserRole(@Param("userId")int userId);

    @Select(GET_USERID_BY_DEPT_ID_ROLE)
	int getUserIdByDeptId(Integer deptId);

    @Update("UPDATE isap_cmn_users SET dpt_id=1 where usr_id = #{userId}")
	void updateUser(@Param("userId")int userId);

	@Select("SELECT * FROM isap_cmn_depts WHERE dpt_id = #{deptId}")
	Department getDepartmentById(Integer deptId);

	@Select("SELECT * FROM isap_cmn_users WHERE usr_name = #{userName}")
	User getOwnerByName(String userName);
	

	@Update("UPDATE isap_cmn_depts SET dpt_name=#{dpt_name},dpt_desc=#{dpt_desc},status=#{status},created_by=#{created_by} where dpt_id=#{dpt_id}")
	void updateDepartmentWithDepartment(Department department);

	@Select(GET_USER_BY_DEPT_OWNER_ID)
	User getOwnerUserId(User user);
	
	@Select("SELECT usr_id FROM isap_cmn_users WHERE usr_name = #{owner}")
	int getUserIdByName(String owner);

	@Select("SELECT proj_id FROM isap_cmn_projects WHERE dpt_id = #{deptId} AND delete_flag=0")
	List<Integer> getProjectByDeptID(Integer deptId);

	@Select("SELECT usr_id FROM isap_cmn_users WHERE proj_id = #{projId} ")
	List<Integer> getUserByDeptID(Integer projId);

	 @Update("UPDATE isap_cmn_users SET dpt_id=1,proj_id=1 where usr_id = #{userID}")
	void updateUserDptProjIds(@Param("userID")Integer userID);

		
	 @Update("UPDATE isap_cmn_projects SET delete_flag=1  where proj_id = #{projId}")
	void updateProjectDeleteFlag(@Param("projId")Integer projId);


}

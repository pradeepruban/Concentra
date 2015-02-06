package com.syntel.isap.provisioning.mapper;


import java.util.List;




import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Select;

import com.syntel.isap.provisioning.bean.Project;
import com.syntel.isap.provisioning.bean.User;


public interface ProjectMapper {

	

	final String GET_USER_BY_CORPT_OWNER_ID = "SELECT users.usr_id,users.usr_name FROM isap_cmn_users users,isap_cmn_user_role_map maps "
			+ "WHERE users.usr_id=maps.usr_id "
			+ "AND users.dpt_id=#{dpt_id} "
			+ "AND users.proj_id = 1 AND maps.role_id=6";
	
	
	@Select("SELECT * FROM isap_cmn_projects where dpt_id = #{dpt_id}")
	List<Project> getprojectLists(int dptid);

	
	@Insert("INSERT INTO isap_cmn_projects "
			+ "(proj_name,proj_desc,status, created_by,dpt_id,cg_id,owner) VALUES "
			+ "(#{proj_name},#{proj_desc},#{status},#{created_by},#{dpt_id},#{cg_id},#{owner})")
	@Options(useGeneratedKeys = true, keyProperty = "proj_id")
	public void insertData(Project project);
	
	
	@Select("select dpt_id,cg_id from isap_cmn_users where usr_name=#{usr_name}")
	
	
	List<Integer> getUserinfo(User user);
	
	
	
	@Delete("UPDATE isap_cmn_projects SET status='IAC',owner=' ' where proj_id = #{proj_id}")
	public void deleteProject(Integer proj_id) ;
	
	@Update("update isap_cmn_projects set proj_name =#{proj_name},proj_desc=#{proj_desc},status ='ACT' ,owner =#{owner} where proj_id= #{proj_id}")
	public void updateProject(Project project) ;
	
	
	
	
	@Select("SELECT * FROM isap_cmn_projects where proj_id =#{proj_id}")
	public Project editProject(Integer proj_id) ;
	
	  @Select(GET_USER_BY_CORPT_OWNER_ID)
	List<User> getUsersByCorporate(User user);

	  @Update("UPDATE isap_cmn_user_role_map SET role_id = 3 where usr_id = #{userID}")
	void updateRoleMapByUserId(@Param("userID")int userID);

	  @Update("UPDATE isap_cmn_users SET proj_id = #{proj_id} where usr_id = #{usr_id}")
	  void updateProjIdInUserTable(@Param("proj_id") int proj_id,@Param("usr_id") int usr_id);
	
	
	

}

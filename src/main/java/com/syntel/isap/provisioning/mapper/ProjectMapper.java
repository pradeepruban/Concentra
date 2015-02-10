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
	
	

	final String GET_USERID_BY_PROJ_ID_ROLE = "SELECT users.usr_id FROM isap_cmn_users users,isap_cmn_user_role_map maps "
			+ "WHERE users.usr_id=maps.usr_id AND users.proj_id=#{proj_id} AND maps.role_id=4";
	
	
	@Select("SELECT * FROM isap_cmn_projects where dpt_id = #{dpt_id} AND delete_flag=0 AND proj_id!=1")
	List<Project> getprojectLists(int dptid);

	
	@Insert("INSERT INTO isap_cmn_projects "
			+ "(proj_name,proj_desc,status, created_by,dpt_id,cg_id,owner) VALUES "
			+ "(#{proj_name},#{proj_desc},#{status},#{created_by},#{dpt_id},#{cg_id},#{owner})")
	@Options(useGeneratedKeys = true, keyProperty = "proj_id")
	public void insertData(Project project);
	
	
	@Select("select dpt_id,cg_id from isap_cmn_users where usr_name=#{usr_name}")
	List<Integer> getUserinfo(User user);
	
	
	
	@Update("UPDATE isap_cmn_projects SET delete_flag=1 where proj_id = #{proj_id}")
	public void deleteProject(Integer proj_id) ;
	
	@Update("update isap_cmn_projects set proj_name =#{proj_name},proj_desc=#{proj_desc},status =#{status} ,owner =#{owner} where proj_id= #{proj_id}")
	public void updateProject(Project project) ;
	
	

	@Select("SELECT * FROM isap_cmn_projects where proj_id =#{proj_id}")
	public Project editProject(Integer proj_id) ;
	
	 @Select(GET_USER_BY_CORPT_OWNER_ID)
	List<User> getUsersByCorporate(User user);

	  @Update("UPDATE isap_cmn_user_role_map SET role_id =4 where usr_id=#{userID}")
	void updateRoleMapByUserId(@Param("userID")int userID);

	  @Update("UPDATE isap_cmn_users SET proj_id = #{proj_id} where usr_id = #{usr_id}")
	  void updateProjIdInUserTable(@Param("proj_id") int proj_id,@Param("usr_id") int usr_id);



	  @Update("UPDATE isap_cmn_users SET proj_id=1 where usr_id = #{userID}")

	void updateUserProjIds(@Param("userID")Integer userID);

	   @Update("UPDATE isap_cmn_user_role_map SET role_id=6  where usr_id = #{userID}")
	void updateUserRole(@Param("userID") Integer userID);

	   @Select("SELECT usr_id FROM isap_cmn_users WHERE proj_id = #{projId} ")
	List<Integer> getUserByProjID(Integer proj_id);


		@Select("SELECT * FROM isap_cmn_projects where proj_id =#{proj_id}")
        Project  getProjectById(int proj_id);

		@Select("SELECT usr_name FROM isap_cmn_users WHERE usr_id = #{usr_id}")
		String getUserNameById(int usr_id);

		@Select(GET_USERID_BY_PROJ_ID_ROLE)
		int getUserIdByProjId(int proj_id);

       @Update("UPDATE isap_cmn_user_role_map SET role_id=4 where usr_id = #{usr_id}")
		void mapRoleToUser(User user);
       
       @Update("UPDATE isap_cmn_users SET proj_id = #{proj_id} where usr_id = #{usr_id}")

	   void mapProjectToUser(@Param("usr_id")int usr_id, @Param("proj_id")int proj_id);
       
   	@Select("SELECT * FROM isap_cmn_users WHERE usr_name = #{userName}")

	User getOwnerByName(String userName);

    @Update("UPDATE isap_cmn_users SET proj_id =1 where usr_id = #{userId}")
	void updateUser(int userId);
	
	
	

}

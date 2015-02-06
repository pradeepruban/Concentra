package com.syntel.isap.provisioning.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import com.syntel.isap.provisioning.bean.CorporateGroups;
import com.syntel.isap.provisioning.bean.Department;
import com.syntel.isap.provisioning.bean.Project;
import com.syntel.isap.provisioning.bean.User;

public interface IsapAdminUserMapper {

	@Select("SELECT * FROM isap_cmn_corporategroups")
	List<CorporateGroups> getCorps();
	
	@Select("SELECT * FROM isap_cmn_depts")
	List<Department> getDepts();

	
	@Select("SELECT * FROM isap_cmn_projects")
	List<Project> getProj();
	
	@Select("SELECT usr_name,proj_name, dpt_name, corporate_name, e.status  FROM isap_cmn_users e JOIN isap_cmn_depts r ON e.dpt_id=r.dpt_id JOIN isap_cmn_projects d ON e.proj_id=d.proj_id JOIN isap_cmn_corporategroups c on e.cg_id=c.cg_id ;")
    public  List<User> getUser();

	@Select("SELECT * FROM isap_cmn_depts where cg_id=#{cgId}")
	List<Department> getDeptsJson(Integer cgId);

	@Select("SELECT * FROM isap_cmn_projects where dpt_id=#{dptId}")
	List<Project> getProjsJson(Integer deptId);

	
	@Insert("INSERT INTO isap_cmn_users "
			+ "(usr_name,usr_desc,status,proj_id,dpt_id,cg_id) VALUES "
			+ "(#{usr_name},#{usr_desc},#{status},#{proj_id},#{dpt_id},#{cg_id})")
	@Options(useGeneratedKeys = true, keyProperty = "proj_id")
	int getuser(User usr);


}

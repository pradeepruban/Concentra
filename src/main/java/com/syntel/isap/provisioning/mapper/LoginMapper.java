package com.syntel.isap.provisioning.mapper;

import org.apache.ibatis.annotations.Select;

import com.syntel.isap.provisioning.bean.User;
import com.syntel.isap.provisioning.bean.UserRoleMap;

/**
 * @author KK5007843
 *
 */

public interface LoginMapper {
	
	@Select("SELECT * FROM isap_cmn_users WHERE usr_Name = #{userName}")
	public User getUserByUserName(String userName);

	@Select("SELECT * FROM isap_cmn_user_role_map WHERE usr_id = #{userId}")
	public UserRoleMap getRoleByUserId(int userId);

	@Select("SELECT role_name FROM isap_cmn_roles WHERE role_id = #{roleId}")
	public String getRoleName(int roleId);

}

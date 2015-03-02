package com.syntel.isap.provisioning.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.syntel.isap.provisioning.bean.CustomVM;
import com.syntel.isap.provisioning.bean.CustomVMExt;
import com.syntel.isap.provisioning.bean.EnvironmentVDC;
import com.syntel.isap.provisioning.bean.EnvironmentVM;
import com.syntel.isap.provisioning.bean.EnvironmentVMExt;
import com.syntel.isap.provisioning.bean.Identity;
import com.syntel.isap.provisioning.bean.ServiceReqDts;
import com.syntel.isap.provisioning.bean.ServiceReqMst;


/**
 * @author KK5007843
 *
 */

public interface LaunchMapper {

	@Insert("INSERT INTO isap_env_vm_custom_prov "
			+ "(vm_name,startDate,endDate,service_req_dts_id,service_req_id,isap_env_vdc_master_vdc_id,status,usr_id) VALUES "
			+ "(#{vm_name},#{startDate},#{endDate},#{service_req_dts_id},#{service_req_id}"
			+ ",#{isap_env_vdc_master_vdc_id},#{status},#{usr_id})")
	@Options(useGeneratedKeys = true, keyProperty = "vm_custom_id")
	void addCustomVM(CustomVM customVM);

	@Insert("INSERT INTO isap_env_vm_custom_prov_ext "
			+ "(param_name,param_val,isap_env_vm_custom_prov_vm_custom_id) VALUES "
			+ "(#{param_name},#{param_val},#{isap_env_vm_custom_prov_vm_custom_id})")
	@Options(useGeneratedKeys = true, keyProperty = "isap_env_vm_custom_prov_ext_id")
	void addCustomVMExt(CustomVMExt cust);

	@Insert("INSERT INTO isap_cmn_service_req_mst "
			+ "(service_req_name,service_desc,status,service_req_flow_id) VALUES "
			+ "(#{service_req_name},#{service_desc},#{status},#{service_req_flow_id})")
	@Options(useGeneratedKeys = true, keyProperty = "service_req_id")
	void addServiceRequest(ServiceReqMst reqMst);

	@Insert("INSERT INTO isap_cmn_service_req_dts "
			+ "(req_user_id,service_req_id) VALUES "
			+ "(#{req_user_id},#{service_req_id})")
	@Options(useGeneratedKeys = true, keyProperty = "service_req_dts_id")
	void addServiceRequestDts(ServiceReqDts reqDts);

	@Select("SELECT * FROM isap_env_vm_custom_prov where usr_id=#{userId} AND delete_flag=0 order by vm_custom_id  desc")
	List<CustomVM> getCustomList(int userId);

	@Select("SELECT * FROM isap_env_vm_custom_prov_ext where isap_env_vm_custom_prov_vm_custom_id= #{customId}")
	List<CustomVMExt> getCustomVMExtDetailsById(int customId);
	
	@Select("SELECT * FROM isap_env_vm_mst")
	List<EnvironmentVM> getEnvVmDetails();

	@Select("SELECT * FROM isap_env_vm_mst_ext")
	List<EnvironmentVMExt> getVMExtParams();

	@Select("SELECT * FROM isap_env_identity where usr_id=#{usr_id}")
	List<Identity> getKeyPairList(int usr_id);

	@Insert("INSERT INTO isap_env_identity"
			+ "(name,content,usr_id) VALUES "
			+ "(#{name},#{content},#{usr_id})")
	@Options(useGeneratedKeys = true, keyProperty = "identity_id")
	void addKeyPair(Identity keypair);

	@Select("SELECT * FROM isap_env_identity where identity_id=#{keyId}")
	Identity getIdentity(int keyId);
	
	@Select("SELECT * FROM isap_env_identity where name=#{name}")
	Identity checkKeyPair(String name);

	@Select("SELECT name FROM isap_env_identity where usr_id=#{usrId}")
	List<String> getKeyPairs(int usrId);

	@Update("UPDATE  isap_env_vm_custom_prov SET  delete_flag=1 where vm_custom_id=#{instId}")
	void terminateInstance(@Param("instId")int instId);

	@Select("SELECT * FROM isap_env_vm_mst where vm_master_id= #{envVMid}")
	EnvironmentVM getEnvVmDetailsByID(Integer envVMid);

	@Select("SELECT * FROM isap_env_vm_mst_ext where vm_master_id= #{envVMid}")
	List<EnvironmentVMExt> getVMExtParamsByID(Integer envVMid);

	@Select("SELECT * FROM isap_env_vdc_master")
	List<EnvironmentVDC> getEnvVdcList();

	@Select("Select dpt_id FROM isap_cmn_users WHERE usr_id = #{userid}")
	int getDeptbyUserId(int userid);

	@Select("Select vdc_id FROM isap_env_vdc_dpt_quota_map WHERE dpt_id = #{deptId}")
	int getVdcBydeptId(int deptId);

	@Select("Select * FROM isap_env_vdc_master WHERE vdc_id = #{vdcid}")
	List<EnvironmentVDC> getVdcById(int vdcid);

	@Select("SELECT instance_id from  isap_env_vm_custom_prov WHERE  vm_custom_id=#{instanceId}")
	String getOpenStackInstanceId(int instanceId);

	@Update("UPDATE isap_env_vm_custom_prov SET public_ip_addr=#{floatingIpResponse} where vm_custom_id=#{instId}")
	void updatePublicIP(@Param("instId") int instId,@Param("floatingIpResponse") String floatingIpResponse);

	@Update("UPDATE isap_env_vm_custom_prov SET public_ip_addr='-' where vm_custom_id=#{instId}")
	void updatePublicIPToNull(int instId);

}

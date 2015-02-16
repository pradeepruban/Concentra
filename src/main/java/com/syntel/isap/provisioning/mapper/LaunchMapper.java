package com.syntel.isap.provisioning.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import com.syntel.isap.provisioning.bean.CustomVM;
import com.syntel.isap.provisioning.bean.CustomVMExt;
import com.syntel.isap.provisioning.bean.EnvironmentVDC;
import com.syntel.isap.provisioning.bean.EnvironmentVM;
import com.syntel.isap.provisioning.bean.EnvironmentVMExt;
import com.syntel.isap.provisioning.bean.ServiceReqDts;
import com.syntel.isap.provisioning.bean.ServiceReqMst;


/**
 * @author KK5007843
 *
 */

public interface LaunchMapper {

	@Insert("INSERT INTO isap_env_vm_custom_prov "
			+ "(vm_name,startDate,endDate,service_req_dts_id,service_req_id,isap_env_vdc_master_vdc_id,status) VALUES "
			+ "(#{vm_name},#{startDate},#{endDate},#{service_req_dts_id},#{service_req_id},#{isap_env_vdc_master_vdc_id},#{status})")
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

	
	@Select("SELECT * FROM isap_env_vm_custom_prov order by vm_custom_id  desc")
	List<CustomVM> getCustomList();

	@Select("SELECT * FROM isap_env_vm_custom_prov_ext where isap_env_vm_custom_prov_vm_custom_id= #{customId}")
	List<CustomVMExt> getCustomVMExtDetailsById(int customId);
	
	@Select("SELECT * FROM isap_env_vm_mst")
	List<EnvironmentVM> getEnvVmDetails();

	@Select("SELECT * FROM isap_env_vm_mst_ext")
	List<EnvironmentVMExt> getVMExtParams();
	
	@Select("SELECT * FROM isap_env_vm_mst where vm_master_id= #{envVMid}")
	EnvironmentVM getEnvVmDetailsByID(Integer envVMid);

	@Select("SELECT * FROM isap_env_vm_mst_ext where vm_master_id= #{envVMid}")
	List<EnvironmentVMExt> getVMExtParamsByID(Integer envVMid);

	@Select("SELECT * FROM isap_env_vdc_master")
	List<EnvironmentVDC> getEnvVdcList();


}

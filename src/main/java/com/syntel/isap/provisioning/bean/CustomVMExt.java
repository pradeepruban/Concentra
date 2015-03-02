package com.syntel.isap.provisioning.bean;

import java.io.Serializable;

/**
 * @author KK5007843
 *
 */

public class CustomVMExt implements Serializable {

	/**
	 * isap_env_vm_custom_prov_ext table
	 */
	private static final long serialVersionUID = 1L;
	
	private int isap_env_vm_custom_prov_ext_id;
	
	
	private String param_name;
	
	private String param_val;
	
	private int isap_env_vm_custom_prov_vm_custom_id;

	public CustomVMExt(String param_name, String param_val,
			int isap_env_vm_custom_prov_vm_custom_id) {
		super();
		this.param_name = param_name;
		this.param_val = param_val;
		this.isap_env_vm_custom_prov_vm_custom_id = isap_env_vm_custom_prov_vm_custom_id;
	}
	
	public CustomVMExt() {
		super();
	}


	public String getParam_name() {
		return param_name;
	}

	public void setParam_name(String param_name) {
		this.param_name = param_name;
	}

	public String getParam_val() {
		return param_val;
	}

	public void setParam_val(String param_val) {
		this.param_val = param_val;
	}

	public int getIsap_env_vm_custom_prov_vm_custom_id() {
		return isap_env_vm_custom_prov_vm_custom_id;
	}

	public void setIsap_env_vm_custom_prov_vm_custom_id(
			int isap_env_vm_custom_prov_vm_custom_id) {
		this.isap_env_vm_custom_prov_vm_custom_id = isap_env_vm_custom_prov_vm_custom_id;
	}
	
	public int getIsap_env_vm_custom_prov_ext_id() {
		return isap_env_vm_custom_prov_ext_id;
	}

	public void setIsap_env_vm_custom_prov_ext_id(int isap_env_vm_custom_prov_ext_id) {
		this.isap_env_vm_custom_prov_ext_id = isap_env_vm_custom_prov_ext_id;
	}



}

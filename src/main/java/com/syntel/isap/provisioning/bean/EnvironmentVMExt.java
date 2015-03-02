package com.syntel.isap.provisioning.bean;

public class EnvironmentVMExt {


	private int vm_master_id;
	
	public int getVm_master_id() {
		return vm_master_id;
	}

	public void setVm_master_id(int vm_master_id) {
		this.vm_master_id = vm_master_id;
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

	private String param_name;
	
	private String param_val;
}

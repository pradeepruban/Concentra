package com.syntel.isap.provisioning.bean;

public class VdcExt {
	
	
	private int vdc_id;
	private String param_name;
	private String param_val;
	public int getVdc_id() {
		return vdc_id;
	}
	public void setVdc_id(int vdc_id) {
		this.vdc_id = vdc_id;
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
	
	public VdcExt(String param_name, String param_val,int vdc_id) {
		super();
		this.param_name = param_name;
		this.param_val = param_val;
		this.vdc_id = vdc_id;
	}
	
	public VdcExt() {
		super();
	}


}

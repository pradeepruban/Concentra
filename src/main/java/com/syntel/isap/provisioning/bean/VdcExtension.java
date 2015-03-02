package com.syntel.isap.provisioning.bean;

import java.io.Serializable;

public class VdcExtension  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int vdc_id;
	private String param_name;
	private String param_value;
	
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
	public String getParam_value() {
		return param_value;
	}
	public void setParam_value(String param_value) {
		this.param_value = param_value;
	}
}

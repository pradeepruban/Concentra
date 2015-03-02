package com.syntel.isap.provisioning.bean;

import java.io.Serializable;

public class VmProvCredential implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int cred_id; 
	private int vm_id;
	private String type;
	private String username;
	private String password;
	private int isap_anv_identity_identity_id;
	private int vdc_id;
	
	public int getCred_id() {
		return cred_id;
	}
	public void setCred_id(int cred_id) {
		this.cred_id = cred_id;
	}
	public int getVm_id() {
		return vm_id;
	}
	public void setVm_id(int vm_id) {
		this.vm_id = vm_id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getIsap_anv_identity_identity_id() {
		return isap_anv_identity_identity_id;
	}
	public void setIsap_anv_identity_identity_id(int isap_anv_identity_identity_id) {
		this.isap_anv_identity_identity_id = isap_anv_identity_identity_id;
	}
	public int getVdc_id() {
		return vdc_id;
	}
	public void setVdc_id(int vdc_id) {
		this.vdc_id = vdc_id;
	}
}

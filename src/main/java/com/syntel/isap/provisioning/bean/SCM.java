package com.syntel.isap.provisioning.bean;

import java.util.List;

public class SCM {
    
	private String status = null;
    private String result = null;
	private int scm_id;
	private String scm_name;
	private String scm_type;
	private String scm_endpoint;
	private String host_name;
	private String admin_user;
	private String admin_pass;
	private List<Vdc> vdc;
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getHost_name() {
		return host_name;
	}

	public void setHost_name(String host_name) {
		this.host_name = host_name;
	}
	public List<Vdc> getVdc() {
		return vdc;
	}

	public void setVdc(List<Vdc> vdc) {
		this.vdc = vdc;
	}

	public String getScm_endpoint() {
		return scm_endpoint;
	}
	
	public void setScm_endpoint(String scm_endpoint) {
		this.scm_endpoint = scm_endpoint;
	}
	public String getAdmin_user() {
		return admin_user;
	}
	public void setAdmin_user(String admin_user) {
		this.admin_user = admin_user;
	}
	public String getAdmin_pass() {
		return admin_pass;
	}
	public void setAdmin_pass(String admin_pass) {
		this.admin_pass = admin_pass;
	}
	public int getScm_id() {
		return scm_id;
	}
	public void setScm_id(int scm_id) {
		this.scm_id = scm_id;
	}
	public String getScm_name() {
		return scm_name;
	}
	public void setScm_name(String scm_name) {
		this.scm_name = scm_name;
	}
	public String getScm_type() {
		return scm_type;
	}
	public void setScm_type(String scm_type) {
		this.scm_type = scm_type;
	}
	
}

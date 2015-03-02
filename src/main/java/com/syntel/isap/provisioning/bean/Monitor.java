package com.syntel.isap.provisioning.bean;

import java.util.List;

public class Monitor {

	private String status = null;
    private String result = null;
	private int mon_id;
	private String mon_name;
	private String mon_type;
	private String host_name;
	private String mon_endpoint;
	private String admin_user;
	private String admin_pass;
	private List<Vdc> vdc;
	
	public String getHost_name() {
		return host_name;
	}
	public void setHost_name(String host_name) {
		this.host_name = host_name;
	}
	public int getMon_id() {
		return mon_id;
	}
	public void setMon_id(int mon_id) {
		this.mon_id = mon_id;
	}
	public String getMon_name() {
		return mon_name;
	}
	public void setMon_name(String mon_name) {
		this.mon_name = mon_name;
	}
	public String getMon_type() {
		return mon_type;
	}
	public void setMon_type(String mon_type) {
		this.mon_type = mon_type;
	}
	public String getMon_endpoint() {
		return mon_endpoint;
	}
	public void setMon_endpoint(String mon_endpoint) {
		this.mon_endpoint = mon_endpoint;
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
	public List<Vdc> getVdc() {
		return vdc;
	}
	public void setVdc(List<Vdc> vdc) {
		this.vdc = vdc;
	}
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
	
	
	
}

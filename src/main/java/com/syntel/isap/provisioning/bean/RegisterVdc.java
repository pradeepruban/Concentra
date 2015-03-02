package com.syntel.isap.provisioning.bean;

public class RegisterVdc {
	private String vdc_name;
	private String vdc_location;
	private String vdc_status;
	private String tenant;
	private String description;
	private String created_at;
	private String vdc_provider;
	private String vdc_id;
	
	public String getVdc_id() {
		return vdc_id;
	}
	public void setVdc_id(String vdc_id) {
		this.vdc_id = vdc_id;
	}
	public String getVdc_provider() {
		return vdc_provider;
	}
	public void setVdc_provider(String vdc_provider) {
		this.vdc_provider = vdc_provider;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getVdc_name() {
		return vdc_name;
	}
	public void setVdc_name(String vdc_name) {
		this.vdc_name = vdc_name;
	}
	public String getVdc_location() {
		return vdc_location;
	}
	public void setVdc_location(String vdc_location) {
		this.vdc_location = vdc_location;
	}
	public String getVdc_status() {
		return vdc_status;
	}
	public void setVdc_status(String vdc_status) {
		this.vdc_status = vdc_status;
	}
	
	public String getTenant() {
		return tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}

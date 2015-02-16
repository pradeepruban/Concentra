package com.syntel.isap.provisioning.bean;

import java.util.Date;

public class EnvironmentVDC {

	public int getVdc_id() {
		return vdc_id;
	}

	public void setVdc_id(int vdc_id) {
		this.vdc_id = vdc_id;
	}

	public String getVdc_name() {
		return vdc_name;
	}

	public void setVdc_name(String vdc_name) {
		this.vdc_name = vdc_name;
	}

	public String getVdc_provider() {
		return vdc_provider;
	}

	public void setVdc_provider(String vdc_provider) {
		this.vdc_provider = vdc_provider;
	}

	public String getVdc_location() {
		return vdc_location;
	}

	public void setVdc_location(String vdc_location) {
		this.vdc_location = vdc_location;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	public Date getDeleted_at() {
		return deleted_at;
	}

	public void setDeleted_at(Date deleted_at) {
		this.deleted_at = deleted_at;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public String getModified_by() {
		return modified_by;
	}

	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}

	public String getDeleted_by() {
		return deleted_by;
	}

	public void setDeleted_by(String deleted_by) {
		this.deleted_by = deleted_by;
	}

	private int vdc_id;
	
	
	private String vdc_name;
	
	private String vdc_provider;
	
	
	private String vdc_location;
	
	
	private Date created_at;
	
	private Date updated_at;
	
	private Date deleted_at;
	
	
	private String created_by;
	
	
	private String modified_by;
	
	private String deleted_by;
}

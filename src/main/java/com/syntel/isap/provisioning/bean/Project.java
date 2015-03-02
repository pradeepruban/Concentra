package com.syntel.isap.provisioning.bean;

public class Project {

	private int proj_id;
	private String proj_name;
	private String proj_desc;
	private String status;
	private String created_by;
	private String created_at;
	private String modified_by;
	private String modified_at;
	private int dpt_id;
	private int cg_id;
	private String owner;
	public int getDelete_flag() {
		return delete_flag;
	}
	public void setDelete_flag(int delete_flag) {
		this.delete_flag = delete_flag;
	}
	private int delete_flag;
	
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getProj_desc() {
		return proj_desc;
	}
	public void setProj_desc(String proj_desc) {
		this.proj_desc = proj_desc;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getModified_by() {
		return modified_by;
	}
	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}
	public String getModified_at() {
		return modified_at;
	}
	public void setModified_at(String modified_at) {
		this.modified_at = modified_at;
	}
	public int getDpt_id() {
		return dpt_id;
	}
	public void setDpt_id(int dpt_id) {
		this.dpt_id = dpt_id;
	}
	public int getCg_id() {
		return cg_id;
	}
	public void setCg_id(int cg_id) {
		this.cg_id = cg_id;
	}
	public int getProj_id() {
		return proj_id;
	}
	public void setProj_id(int proj_id) {
		this.proj_id = proj_id;
	}
	public String getProj_name() {
		return proj_name;
	}
	public void setProj_name(String proj_name) {
		this.proj_name = proj_name;
	}
	public String getProj_dec() {
		return proj_desc;
	}
	public void setProj_dec(String proj_desc) {
		this.proj_desc = proj_desc;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String Status) {
		status = Status;
	}

}

package com.syntel.isap.provisioning.bean;

import java.io.Serializable;

/**
 * @author KK5007843
 *
 */

public class Department implements Serializable  {

	/**
	 *  isap_cmn_depts table
	 */
	private static final long serialVersionUID = 1L;
	
	private int dpt_id;
	
	private String dpt_name;
	
	private String dpt_desc;

	private String status;
	
	private String created_by;
	
	private int cg_id;
	
	private int delete_flag;
	
	private String owner;

	
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getDelete_flag() {
		return delete_flag;
	}

	public void setDelete_flag(int delete_flag) {
		this.delete_flag = delete_flag;
	}

	public int getDpt_id() {
		return dpt_id;
	}

	public void setDpt_id(int dpt_id) {
		this.dpt_id = dpt_id;
	}

	public String getDpt_name() {
		return dpt_name;
	}

	public void setDpt_name(String dpt_name) {
		this.dpt_name = dpt_name;
	}

	public String getDpt_desc() {
		return dpt_desc;
	}

	public void setDpt_desc(String dpt_desc) {
		this.dpt_desc = dpt_desc;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public int getCg_id() {
		return cg_id;
	}

	public void setCg_id(int cg_id) {
		this.cg_id = cg_id;
	}
	
}

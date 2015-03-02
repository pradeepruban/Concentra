package com.syntel.isap.provisioning.bean;

import java.io.Serializable;

/**
 * @author KK5007843
 *
 */

public class Identity implements Serializable {

	/**
	 * isap_env_identity table
	 */
	private static final long serialVersionUID = 1L;
	
	private int identity_id;
	
	private String name;
	
	private String content;
	
	private int usr_id;
	
	private String created_at;
	
	private String created_by;
	
	private String provider_type;
	
	private String deleted_by;
	
	private String deleted_at;
	
	private String modified_at;
	
	private String modified_by;

	public int getIdentity_id() {
		return identity_id;
	}

	public void setIdentity_id(int identity_id) {
		this.identity_id = identity_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getUsr_id() {
		return usr_id;
	}

	public void setUsr_id(int usr_id) {
		this.usr_id = usr_id;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public String getProvider_type() {
		return provider_type;
	}

	public void setProvider_type(String provider_type) {
		this.provider_type = provider_type;
	}

	public String getDeleted_by() {
		return deleted_by;
	}

	public void setDeleted_by(String deleted_by) {
		this.deleted_by = deleted_by;
	}

	public String getDeleted_at() {
		return deleted_at;
	}

	public void setDeleted_at(String deleted_at) {
		this.deleted_at = deleted_at;
	}

	public String getModified_at() {
		return modified_at;
	}

	public void setModified_at(String modified_at) {
		this.modified_at = modified_at;
	}

	public String getModified_by() {
		return modified_by;
	}

	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}
	
	

}

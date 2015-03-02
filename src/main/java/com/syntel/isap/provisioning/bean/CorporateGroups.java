package com.syntel.isap.provisioning.bean;

import java.io.Serializable;

public class CorporateGroups implements Serializable{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private int cg_id;
		private String corporate_name;
		private String corporate_description;
		private String corporate_owner;
		private String corporate_off_id;
		private String base_location;
		private String role;
		private String status;
		private String created_at;
		private String modified_at;
		private String deleted_at;
		private String created_by;
		private String modified_by;
		private String deleted_by;
		private int delete_flag;
		
		public int getCg_id() {
			return cg_id;
		}
		public void setCg_id(int cg_id) {
			this.cg_id = cg_id;
		}
		public String getCreated_at() {
			return created_at;
		}
		public void setCreated_at(String created_at) {
			this.created_at = created_at;
		}
		public String getModified_at() {
			return modified_at;
		}
		public void setModified_at(String modified_at) {
			this.modified_at = modified_at;
		}
		public String getDeleted_at() {
			return deleted_at;
		}
		public void setDeleted_at(String deleted_at) {
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
		public String getCorporate_owner() {
			return corporate_owner;
		}
		public void setCorporate_owner(String corporate_owner) {
			this.corporate_owner = corporate_owner;
		}
		public String getCorporate_off_id() {
			return corporate_off_id;
		}
		public void setCorporate_off_id(String corporate_off_id) {
			this.corporate_off_id = corporate_off_id;
		}
		public String getBase_location() {
			return base_location;
		}
		public void setBase_location(String base_location) {
			this.base_location = base_location;
		}
		public String getCorporate_name() {
			return corporate_name;
		}
		public void setCorporate_name(String corporate_name) {
			this.corporate_name = corporate_name;
		}
		public String getCorporate_description() {
			return corporate_description;
		}
		public void setCorporate_description(String corporate_description) {
			this.corporate_description = corporate_description;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}

		public int getDelete_flag() {
			return delete_flag;
		}
		public void setDelete_flag(int delete_flag) {
			this.delete_flag = delete_flag;
		}



}
	
	
	
	


package com.syntel.isap.provisioning.bean;

import java.io.Serializable;

public class Roles implements Serializable{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private int role_id;
		private String role_name;
		private String role_desc;
		private String status;
		private String created_by;
		private String modified_by;
		
		public int getRole_id() {
			return role_id;
		}
		public void setRole_id(int role_id) {
			this.role_id = role_id;
		}
		public String getRole_name() {
			return role_name;
		}
		public void setRole_name(String role_name) {
			this.role_name = role_name;
		}
		public String getRole_desc() {
			return role_desc;
		}
		public void setRole_desc(String role_desc) {
			this.role_desc = role_desc;
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
		public String getModified_by() {
			return modified_by;
		}
		public void setModified_by(String modified_by) {
			this.modified_by = modified_by;
		}
		
		

}

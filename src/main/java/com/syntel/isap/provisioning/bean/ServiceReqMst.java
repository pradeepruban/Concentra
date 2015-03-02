package com.syntel.isap.provisioning.bean;

import java.io.Serializable;

/**
 * @author KK5007843
 *
 */

public class ServiceReqMst implements Serializable {

	/**
	 * isap_cmn_service_req_mst table
	 */
	private static final long serialVersionUID = 1L;
	
	private String service_req_name;
	
	private String service_desc;
	
	private String status;
	
	private int service_req_id;
	
	private int service_req_flow_id;

	public String getService_desc() {
		return service_desc;
	}

	public void setService_desc(String service_desc) {
		this.service_desc = service_desc;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getService_req_name() {
		return service_req_name;
	}

	public void setService_req_name(String service_req_name) {
		this.service_req_name = service_req_name;
	}

	public int getService_req_id() {
		return service_req_id;
	}

	public void setService_req_id(int service_req_id) {
		this.service_req_id = service_req_id;
	}

	public int getService_req_flow_id() {
		return service_req_flow_id;
	}

	public void setService_req_flow_id(int service_req_flow_id) {
		this.service_req_flow_id = service_req_flow_id;
	}

}

package com.syntel.isap.provisioning.bean;

import java.io.Serializable;

/**
 * @author KK5007843
 *
 */

public class ServiceReqDts implements Serializable {

	/**
	 * isap_cmn_service_req_dts table
	 */
	private static final long serialVersionUID = 1L;

	
	private int service_req_dts_id;
	
	private int req_user_id;
	
	private int service_req_id;

	public int getService_req_dts_id() {
		return service_req_dts_id;
	}

	public void setService_req_dts_id(int service_req_dts_id) {
		this.service_req_dts_id = service_req_dts_id;
	}

	public int getReq_user_id() {
		return req_user_id;
	}

	public void setReq_user_id(int req_user_id) {
		this.req_user_id = req_user_id;
	}

	public int getService_req_id() {
		return service_req_id;
	}

	public void setService_req_id(int service_req_id) {
		this.service_req_id = service_req_id;
	}
	
}

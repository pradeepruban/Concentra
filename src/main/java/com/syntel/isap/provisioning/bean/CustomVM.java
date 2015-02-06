package com.syntel.isap.provisioning.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @author KK5007843
 *
 */

public class CustomVM implements Serializable {
	
	/**
	 * isap_env_vm_custom_prov table
	 */
	private static final long serialVersionUID = 1L;
	
	private int vm_custom_id;
	
	private String vm_name;
	
	private String hostname;
	
	private String ip_addr;
	
	private int service_req_dts_id;
	
	private int service_req_id;
	
	private int isap_env_vdc_master_vdc_id;
	
	private String status;
	
	private List<CustomVMExt> customVMExts;
	
	private StackList stackList;
	
	private String startDate;
	
	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	private String endDate;
	

	public StackList getStackList() {
		return stackList;
	}

	public void setStackList(StackList stackList) {
		this.stackList = stackList;
	}

	public List<CustomVMExt> getCustomVMExts() {
		return customVMExts;
	}

	public void setCustomVMExts(List<CustomVMExt> customVMExts) {
		this.customVMExts = customVMExts;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getService_req_dts_id() {
		return service_req_dts_id;
	}

	public void setService_req_dts_id(int service_req_dts_id) {
		this.service_req_dts_id = service_req_dts_id;
	}

	public int getService_req_id() {
		return service_req_id;
	}

	public void setService_req_id(int service_req_id) {
		this.service_req_id = service_req_id;
	}

	public int getIsap_env_vdc_master_vdc_id() {
		return isap_env_vdc_master_vdc_id;
	}

	public void setIsap_env_vdc_master_vdc_id(int isap_env_vdc_master_vdc_id) {
		this.isap_env_vdc_master_vdc_id = isap_env_vdc_master_vdc_id;
	}

	public int getVm_custom_id() {
		return vm_custom_id;
	}

	public void setVm_custom_id(int vm_custom_id) {
		this.vm_custom_id = vm_custom_id;
	}

	public String getVm_name() {
		return vm_name;
	}

	public void setVm_name(String vm_name) {
		this.vm_name = vm_name;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public String getIp_addr() {
		return ip_addr;
	}

	public void setIp_addr(String ip_addr) {
		this.ip_addr = ip_addr;
	}
	

}

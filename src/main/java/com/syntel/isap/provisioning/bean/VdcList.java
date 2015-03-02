package com.syntel.isap.provisioning.bean;

public class VdcList {
	
private String description;
	
	private String adminTenant;
	
	private String controllerEndpoint;
	
	private String keystoneEndpoint;
	
	private String subnetAddress;
	
	private String version;

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAdminTenant() {
		return adminTenant;
	}

	public void setAdminTenant(String adminTenant) {
		this.adminTenant = adminTenant;
	}

	public String getControllerEndpoint() {
		return controllerEndpoint;
	}

	public void setControllerEndpoint(String controllerEndpoint) {
		this.controllerEndpoint = controllerEndpoint;
	}

	public String getKeystoneEndpoint() {
		return keystoneEndpoint;
	}

	public void setKeystoneEndpoint(String keystoneEndpoint) {
		this.keystoneEndpoint = keystoneEndpoint;
	}

	public String getSubnetAddress() {
		return subnetAddress;
	}

	public void setSubnetAddress(String subnetAddress) {
		this.subnetAddress = subnetAddress;
	}
	
	


}

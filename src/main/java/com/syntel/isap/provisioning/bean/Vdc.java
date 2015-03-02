package com.syntel.isap.provisioning.bean;

import java.io.Serializable;
import java.util.List;

public class Vdc implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String status = null;
    private String result = null;
	private String user;
	private String password;
	private int vdc_id;
	private String vdc_name;
	private String description;
	private String vdc_location;
	private String version;
	private String subnet_address;
	private String controller_endpoint;
	private String keystone_endpoint;
	private String tenant;
	private String scm_name;
	private int scm_id;
	private int mon_id;
	private String mon_name;
	private String created_at;
	private String vdc_status;
	private String vdc_provider;
    private List<VdcExt> VdcExt;
    private VdcList vdclist; 
    
    List<Vdc> vdc;
	
    public Vdc(List<Vdc> vdc) {
		super();
		this.vdc = vdc;
	
	}
	
	public Vdc() {
		super();
	}
	
	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	public VdcList getVdclist() {
		return vdclist;
	}
	public void setVdclist(VdcList vdclist) {
		this.vdclist = vdclist;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getVdc_status() {
		return vdc_status;
	}
	public void setVdc_status(String vdc_status) {
		this.vdc_status = vdc_status;
	}
	public String getVdc_provider() {
		return vdc_provider;
	}
	public void setVdc_provider(String vdc_provider) {
		this.vdc_provider = vdc_provider;
	}
	public List<VdcExt> getVdcExt() {
		return VdcExt;
	}
	public void setVdcExt(List<VdcExt> VdcExt) {
		this.VdcExt = VdcExt;
	}
	public String getTenant() {
		return tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}
	
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getVdc_location() {
		return vdc_location;
	}
	public void setVdc_location(String vdc_location) {
		this.vdc_location = vdc_location;
	}
	public String getSubnet_address() {
		return subnet_address;
	}
	public void setSubnet_address(String subnet_address) {
		this.subnet_address = subnet_address;
	}
	public String getController_endpoint() {
		return controller_endpoint;
	}
	public void setController_endpoint(String controller_endpoint) {
		this.controller_endpoint = controller_endpoint;
	}
	public String getKeystone_endpoint() {
		return keystone_endpoint;
	}
	public void setKeystone_endpoint(String keystone_endpoint) {
		this.keystone_endpoint = keystone_endpoint;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getScm_name() {
		return scm_name;
	}
	public void setScm_name(String scm_name) {
		this.scm_name = scm_name;
	}
	public int getScm_id() {
		return scm_id;
	}
	public void setScm_id(int scm_id) {
		this.scm_id = scm_id;
	}
	public int getMon_id() {
		return mon_id;
	}
	public void setMon_id(int mon_id) {
		this.mon_id = mon_id;
	}
	public String getMon_name() {
		return mon_name;
	}
	public void setMon_name(String mon_name) {
		this.mon_name = mon_name;
	}
	
	

}

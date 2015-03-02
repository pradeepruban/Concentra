package com.syntel.isap.provisioning.bean;

import java.io.Serializable;
import java.util.Date;

public class VdcDeptQuotaMap implements Serializable {

	private static final long serialVersionUID = 1L;
	private int dpt_id;
	private int vdc_id;
	private int total_mem;
	private int total_vcpu;
	private int total_disk_storage;
	private int free_mem;
	private int free_vcpu;
	private int free_disk_storage;
	private String created_by;
	private String modified_by;
	private String deleted_by;
	private Date created_at;
	private Date modified_at;
	private Date deleted_at;
	
	
	public int getDpt_id() {
		return dpt_id;
	}
	public void setDpt_id(int dpt_id) {
		this.dpt_id = dpt_id;
	}
	public int getVdc_id() {
		return vdc_id;
	}
	public void setVdc_id(int vdc_id) {
		this.vdc_id = vdc_id;
	}
	public int getTotal_mem() {
		return total_mem;
	}
	public void setTotal_mem(int total_mem) {
		this.total_mem = total_mem;
	}
	public int getTotal_vcpu() {
		return total_vcpu;
	}
	public void setTotal_vcpu(int total_vcpu) {
		this.total_vcpu = total_vcpu;
	}
	public int getTotal_disk_storage() {
		return total_disk_storage;
	}
	public void setTotal_disk_storage(int total_disk_storage) {
		this.total_disk_storage = total_disk_storage;
	}
	public int getFree_mem() {
		return free_mem;
	}
	public void setFree_mem(int free_mem) {
		this.free_mem = free_mem;
	}
	public int getFree_vcpu() {
		return free_vcpu;
	}
	public void setFree_vcpu(int free_vcpu) {
		this.free_vcpu = free_vcpu;
	}
	public int getFree_disk_storage() {
		return free_disk_storage;
	}
	public void setFree_disk_storage(int free_disk_storage) {
		this.free_disk_storage = free_disk_storage;
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
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getModified_at() {
		return modified_at;
	}
	public void setModified_at(Date modified_at) {
		this.modified_at = modified_at;
	}
	public Date getDeleted_at() {
		return deleted_at;
	}
	public void setDeleted_at(Date deleted_at) {
		this.deleted_at = deleted_at;
	}
}

package com.syntel.isap.provisioning.bean;

import java.io.Serializable;

public class AvailableVdcQuota implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 int availableMem;
	 int availableVcpu;
	 int availableDiskStorage;
	public int getAvailableMem() {
		return availableMem;
	}
	public void setAvailableMem(int availableMem) {
		this.availableMem = availableMem;
	}
	public int getAvailableVcpu() {
		return availableVcpu;
	}
	public void setAvailableVcpu(int availableVcpu) {
		this.availableVcpu = availableVcpu;
	}
	public int getAvailableDiskStorage() {
		return availableDiskStorage;
	}
	public void setAvailableDiskStorage(int availableDiskStorage) {
		this.availableDiskStorage = availableDiskStorage;
	}
	

}

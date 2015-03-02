package com.syntel.isap.provisioning.soap;

import java.io.Serializable;

/**
 * @author KK5007843
 *
 */

public class SecurityRules implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer fromPort;
	
	private Integer toPort;
	
	private String ipProtocol;
	
	public Integer getFromPort() {
		return fromPort;
	}

	public void setFromPort(Integer integer) {
		this.fromPort = integer;
	}

	public Integer getToPort() {
		return toPort;
	}

	public void setToPort(Integer toPort) {
		this.toPort = toPort;
	}

	public String getIpProtocol() {
		return ipProtocol;
	}

	public void setIpProtocol(String ipProtocol) {
		this.ipProtocol = ipProtocol;
	}

}

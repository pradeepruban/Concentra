package com.syntel.isap.provisioning.soap;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author KK5007843
 *
 */

@XmlRootElement(name = "keypair")
@XmlAccessorType (XmlAccessType.FIELD)
public class KeyPairObj implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String fingerprint;
	
	private String name;
	
	private String public_key;
	
	private String user_id;
	
	private String private_key;

	public String getPrivate_key() {
		return private_key;
	}

	public void setPrivate_key(String private_key) {
		this.private_key = private_key;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getFingerprint() {
		return fingerprint;
	}

	public void setFingerprint(String fingerprint) {
		this.fingerprint = fingerprint;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublic_key() {
		return public_key;
	}

	public void setPublic_key(String public_key) {
		this.public_key = public_key;
	}
	
	

}

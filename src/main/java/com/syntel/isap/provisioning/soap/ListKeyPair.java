package com.syntel.isap.provisioning.soap;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author KK5007843
 *
 */

@XmlRootElement(name = "keypairs")
@XmlAccessorType (XmlAccessType.FIELD)
public class ListKeyPair implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@XmlElement(name = "keypair")
	private List<KeyPairObj> keypair=null;

	public List<KeyPairObj> getKeypair() {
		return keypair;
	}

	public void setKeypair(List<KeyPairObj> keypair) {
		this.keypair = keypair;
	}

}

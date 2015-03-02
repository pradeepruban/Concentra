
package com.isap.core;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.isap.cloudmanager.requests.xsd.FreeFloatingIPsReq;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ffip" type="{http://requests.cloudmanager.isap.com/xsd}FreeFloatingIPsReq" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ffip"
})
@XmlRootElement(name = "freeFloatingIPs")
public class FreeFloatingIPs {

    @XmlElementRef(name = "ffip", namespace = "http://core.isap.com", type = JAXBElement.class, required = false)
    protected JAXBElement<FreeFloatingIPsReq> ffip;

    /**
     * Gets the value of the ffip property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FreeFloatingIPsReq }{@code >}
     *     
     */
    public JAXBElement<FreeFloatingIPsReq> getFfip() {
        return ffip;
    }

    /**
     * Sets the value of the ffip property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FreeFloatingIPsReq }{@code >}
     *     
     */
    public void setFfip(JAXBElement<FreeFloatingIPsReq> value) {
        this.ffip = value;
    }

}

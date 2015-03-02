
package com.isap.core;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.isap.cloudmanager.requests.xsd.AllocateOpenstackFloatingIpReq;


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
 *         &lt;element name="req" type="{http://requests.cloudmanager.isap.com/xsd}AllocateOpenstackFloatingIpReq" minOccurs="0"/>
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
    "req"
})
@XmlRootElement(name = "allocateOpenstackFloatingIp")
public class AllocateOpenstackFloatingIp {

    @XmlElementRef(name = "req", namespace = "http://core.isap.com", type = JAXBElement.class, required = false)
    protected JAXBElement<AllocateOpenstackFloatingIpReq> req;

    /**
     * Gets the value of the req property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AllocateOpenstackFloatingIpReq }{@code >}
     *     
     */
    public JAXBElement<AllocateOpenstackFloatingIpReq> getReq() {
        return req;
    }

    /**
     * Sets the value of the req property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AllocateOpenstackFloatingIpReq }{@code >}
     *     
     */
    public void setReq(JAXBElement<AllocateOpenstackFloatingIpReq> value) {
        this.req = value;
    }

}

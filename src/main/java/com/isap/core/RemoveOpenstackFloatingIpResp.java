
package com.isap.core;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.isap.cloudmanager.requests.xsd.RemoveOpenstackFloatingIpReq;


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
 *         &lt;element name="rfip" type="{http://requests.cloudmanager.isap.com/xsd}RemoveOpenstackFloatingIpReq" minOccurs="0"/>
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
    "rfip"
})
@XmlRootElement(name = "RemoveOpenstackFloatingIpResp")
public class RemoveOpenstackFloatingIpResp {

    @XmlElementRef(name = "rfip", namespace = "http://core.isap.com", type = JAXBElement.class, required = false)
    protected JAXBElement<RemoveOpenstackFloatingIpReq> rfip;

    /**
     * Gets the value of the rfip property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RemoveOpenstackFloatingIpReq }{@code >}
     *     
     */
    public JAXBElement<RemoveOpenstackFloatingIpReq> getRfip() {
        return rfip;
    }

    /**
     * Sets the value of the rfip property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RemoveOpenstackFloatingIpReq }{@code >}
     *     
     */
    public void setRfip(JAXBElement<RemoveOpenstackFloatingIpReq> value) {
        this.rfip = value;
    }

}

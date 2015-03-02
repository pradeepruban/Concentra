
package com.isap.core;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.isap.cloudmanager.responses.xsd.AddOpenstackFloatingIpResp;


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
 *         &lt;element name="return" type="{http://responses.cloudmanager.isap.com/xsd}AddOpenstackFloatingIpResp" minOccurs="0"/>
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
    "_return"
})
@XmlRootElement(name = "addOpenstackFloatingIpResponse")
public class AddOpenstackFloatingIpResponse {

    @XmlElementRef(name = "return", namespace = "http://core.isap.com", type = JAXBElement.class, required = false)
    protected JAXBElement<AddOpenstackFloatingIpResp> _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AddOpenstackFloatingIpResp }{@code >}
     *     
     */
    public JAXBElement<AddOpenstackFloatingIpResp> getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AddOpenstackFloatingIpResp }{@code >}
     *     
     */
    public void setReturn(JAXBElement<AddOpenstackFloatingIpResp> value) {
        this._return = value;
    }

}

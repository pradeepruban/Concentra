
package com.isap.core;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="return" type="{http://responses.core.isap.com/xsd}GetIsapCloudAuthenticationResponse" minOccurs="0"/>
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
@XmlRootElement(name = "GetIsapCloudAuthenticationResponse")
public class GetIsapCloudAuthenticationResponse {

    @XmlElementRef(name = "return", namespace = "http://core.isap.com", type = JAXBElement.class, required = false)
    protected JAXBElement<com.isap.core.responses.xsd.GetIsapCloudAuthenticationResponse> _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.isap.core.responses.xsd.GetIsapCloudAuthenticationResponse }{@code >}
     *     
     */
    public JAXBElement<com.isap.core.responses.xsd.GetIsapCloudAuthenticationResponse> getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.isap.core.responses.xsd.GetIsapCloudAuthenticationResponse }{@code >}
     *     
     */
    public void setReturn(JAXBElement<com.isap.core.responses.xsd.GetIsapCloudAuthenticationResponse> value) {
        this._return = value;
    }

}

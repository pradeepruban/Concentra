
package com.isap.core;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.isap.core.requests.xsd.GetIsapCloudAuthenticationRequest;


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
 *         &lt;element name="gicar" type="{http://requests.core.isap.com/xsd}GetIsapCloudAuthenticationRequest" minOccurs="0"/>
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
    "gicar"
})
@XmlRootElement(name = "GetIsapCloudAuthentication")
public class GetIsapCloudAuthentication {

    @XmlElementRef(name = "gicar", namespace = "http://core.isap.com", type = JAXBElement.class, required = false)
    protected JAXBElement<GetIsapCloudAuthenticationRequest> gicar;

    /**
     * Gets the value of the gicar property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetIsapCloudAuthenticationRequest }{@code >}
     *     
     */
    public JAXBElement<GetIsapCloudAuthenticationRequest> getGicar() {
        return gicar;
    }

    /**
     * Sets the value of the gicar property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetIsapCloudAuthenticationRequest }{@code >}
     *     
     */
    public void setGicar(JAXBElement<GetIsapCloudAuthenticationRequest> value) {
        this.gicar = value;
    }

}

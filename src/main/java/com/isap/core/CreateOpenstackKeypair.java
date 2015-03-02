
package com.isap.core;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.isap.core.requests.xsd.CreateOpenstackKeypairReq;


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
 *         &lt;element name="cokreq" type="{http://requests.core.isap.com/xsd}CreateOpenstackKeypairReq" minOccurs="0"/>
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
    "cokreq"
})
@XmlRootElement(name = "CreateOpenstackKeypair")
public class CreateOpenstackKeypair {

    @XmlElementRef(name = "cokreq", namespace = "http://core.isap.com", type = JAXBElement.class, required = false)
    protected JAXBElement<CreateOpenstackKeypairReq> cokreq;

    /**
     * Gets the value of the cokreq property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreateOpenstackKeypairReq }{@code >}
     *     
     */
    public JAXBElement<CreateOpenstackKeypairReq> getCokreq() {
        return cokreq;
    }

    /**
     * Sets the value of the cokreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreateOpenstackKeypairReq }{@code >}
     *     
     */
    public void setCokreq(JAXBElement<CreateOpenstackKeypairReq> value) {
        this.cokreq = value;
    }

}

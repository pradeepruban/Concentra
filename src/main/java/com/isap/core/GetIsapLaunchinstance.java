
package com.isap.core;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.isap.core.requests.xsd.GetIsapLaunchInstanceReq;


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
 *         &lt;element name="gilir" type="{http://requests.core.isap.com/xsd}GetIsapLaunchInstanceReq" minOccurs="0"/>
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
    "gilir"
})
@XmlRootElement(name = "GetIsapLaunchinstance")
public class GetIsapLaunchinstance {

    @XmlElementRef(name = "gilir", namespace = "http://core.isap.com", type = JAXBElement.class, required = false)
    protected JAXBElement<GetIsapLaunchInstanceReq> gilir;

    /**
     * Gets the value of the gilir property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetIsapLaunchInstanceReq }{@code >}
     *     
     */
    public JAXBElement<GetIsapLaunchInstanceReq> getGilir() {
        return gilir;
    }

    /**
     * Sets the value of the gilir property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetIsapLaunchInstanceReq }{@code >}
     *     
     */
    public void setGilir(JAXBElement<GetIsapLaunchInstanceReq> value) {
        this.gilir = value;
    }

}

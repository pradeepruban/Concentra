
package com.isap.core;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.isap.core.requests.xsd.CreateOpenstacktenantReq;


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
 *         &lt;element name="cotr" type="{http://requests.core.isap.com/xsd}CreateOpenstacktenantReq" minOccurs="0"/>
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
    "cotr"
})
@XmlRootElement(name = "CreateOpenstackTenant")
public class CreateOpenstackTenant {

    @XmlElementRef(name = "cotr", namespace = "http://core.isap.com", type = JAXBElement.class, required = false)
    protected JAXBElement<CreateOpenstacktenantReq> cotr;

    /**
     * Gets the value of the cotr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreateOpenstacktenantReq }{@code >}
     *     
     */
    public JAXBElement<CreateOpenstacktenantReq> getCotr() {
        return cotr;
    }

    /**
     * Sets the value of the cotr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreateOpenstacktenantReq }{@code >}
     *     
     */
    public void setCotr(JAXBElement<CreateOpenstacktenantReq> value) {
        this.cotr = value;
    }

}

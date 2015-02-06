
package com.isap.core;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.isap.cloudmanager.requests.xsd.ListOpenstackFlavorsReq;


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
 *         &lt;element name="lof" type="{http://requests.cloudmanager.isap.com/xsd}ListOpenstackFlavorsReq" minOccurs="0"/>
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
    "lof"
})
@XmlRootElement(name = "ListOpenstackFlavors")
public class ListOpenstackFlavors {

    @XmlElementRef(name = "lof", namespace = "http://core.isap.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOpenstackFlavorsReq> lof;

    /**
     * Gets the value of the lof property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOpenstackFlavorsReq }{@code >}
     *     
     */
    public JAXBElement<ListOpenstackFlavorsReq> getLof() {
        return lof;
    }

    /**
     * Sets the value of the lof property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOpenstackFlavorsReq }{@code >}
     *     
     */
    public void setLof(JAXBElement<ListOpenstackFlavorsReq> value) {
        this.lof = value;
    }

}

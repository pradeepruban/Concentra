
package com.isap.core;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.isap.cloudmanager.requests.xsd.ListOpenstackImagesReq;


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
 *         &lt;element name="loir" type="{http://requests.cloudmanager.isap.com/xsd}ListOpenstackImagesReq" minOccurs="0"/>
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
    "loir"
})
@XmlRootElement(name = "ListOpenstackImages")
public class ListOpenstackImages {

    @XmlElementRef(name = "loir", namespace = "http://core.isap.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOpenstackImagesReq> loir;

    /**
     * Gets the value of the loir property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOpenstackImagesReq }{@code >}
     *     
     */
    public JAXBElement<ListOpenstackImagesReq> getLoir() {
        return loir;
    }

    /**
     * Sets the value of the loir property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOpenstackImagesReq }{@code >}
     *     
     */
    public void setLoir(JAXBElement<ListOpenstackImagesReq> value) {
        this.loir = value;
    }

}


package com.isap.core;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.isap.cloudmanager.requests.xsd.ListOpenstackNetworksReq;


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
 *         &lt;element name="lonr" type="{http://requests.cloudmanager.isap.com/xsd}ListOpenstackNetworksReq" minOccurs="0"/>
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
    "lonr"
})
@XmlRootElement(name = "ListOpenstackNetworks")
public class ListOpenstackNetworks {

    @XmlElementRef(name = "lonr", namespace = "http://core.isap.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOpenstackNetworksReq> lonr;

    /**
     * Gets the value of the lonr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOpenstackNetworksReq }{@code >}
     *     
     */
    public JAXBElement<ListOpenstackNetworksReq> getLonr() {
        return lonr;
    }

    /**
     * Sets the value of the lonr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOpenstackNetworksReq }{@code >}
     *     
     */
    public void setLonr(JAXBElement<ListOpenstackNetworksReq> value) {
        this.lonr = value;
    }

}

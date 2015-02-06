
package com.isap.core;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.isap.cloudmanager.requests.xsd.ListOpenstackSecurityGroupsReq;


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
 *         &lt;element name="losgr" type="{http://requests.cloudmanager.isap.com/xsd}ListOpenstackSecurityGroupsReq" minOccurs="0"/>
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
    "losgr"
})
@XmlRootElement(name = "ListOpenstackSecurityGroups")
public class ListOpenstackSecurityGroups {

    @XmlElementRef(name = "losgr", namespace = "http://core.isap.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOpenstackSecurityGroupsReq> losgr;

    /**
     * Gets the value of the losgr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOpenstackSecurityGroupsReq }{@code >}
     *     
     */
    public JAXBElement<ListOpenstackSecurityGroupsReq> getLosgr() {
        return losgr;
    }

    /**
     * Sets the value of the losgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOpenstackSecurityGroupsReq }{@code >}
     *     
     */
    public void setLosgr(JAXBElement<ListOpenstackSecurityGroupsReq> value) {
        this.losgr = value;
    }

}

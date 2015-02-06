
package com.isap.core;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.isap.cloudmanager.requests.xsd.GetOpenstackSecurityGroupDetailsReq;


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
 *         &lt;element name="gosgr" type="{http://requests.cloudmanager.isap.com/xsd}GetOpenstackSecurityGroupDetailsReq" minOccurs="0"/>
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
    "gosgr"
})
@XmlRootElement(name = "GetOpenstackSecurityGroupDetails")
public class GetOpenstackSecurityGroupDetails {

    @XmlElementRef(name = "gosgr", namespace = "http://core.isap.com", type = JAXBElement.class, required = false)
    protected JAXBElement<GetOpenstackSecurityGroupDetailsReq> gosgr;

    /**
     * Gets the value of the gosgr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetOpenstackSecurityGroupDetailsReq }{@code >}
     *     
     */
    public JAXBElement<GetOpenstackSecurityGroupDetailsReq> getGosgr() {
        return gosgr;
    }

    /**
     * Sets the value of the gosgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetOpenstackSecurityGroupDetailsReq }{@code >}
     *     
     */
    public void setGosgr(JAXBElement<GetOpenstackSecurityGroupDetailsReq> value) {
        this.gosgr = value;
    }

}

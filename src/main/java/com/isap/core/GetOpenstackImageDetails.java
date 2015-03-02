
package com.isap.core;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.isap.cloudmanager.requests.xsd.GetOpenstackImageDetailsReq;


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
 *         &lt;element name="goidr" type="{http://requests.cloudmanager.isap.com/xsd}GetOpenstackImageDetailsReq" minOccurs="0"/>
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
    "goidr"
})
@XmlRootElement(name = "GetOpenstackImageDetails")
public class GetOpenstackImageDetails {

    @XmlElementRef(name = "goidr", namespace = "http://core.isap.com", type = JAXBElement.class, required = false)
    protected JAXBElement<GetOpenstackImageDetailsReq> goidr;

    /**
     * Gets the value of the goidr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetOpenstackImageDetailsReq }{@code >}
     *     
     */
    public JAXBElement<GetOpenstackImageDetailsReq> getGoidr() {
        return goidr;
    }

    /**
     * Sets the value of the goidr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetOpenstackImageDetailsReq }{@code >}
     *     
     */
    public void setGoidr(JAXBElement<GetOpenstackImageDetailsReq> value) {
        this.goidr = value;
    }

}

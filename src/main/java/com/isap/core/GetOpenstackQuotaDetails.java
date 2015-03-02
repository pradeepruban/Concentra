
package com.isap.core;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.isap.core.requests.xsd.GetOpenstackQuotaReq;


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
 *         &lt;element name="goqr" type="{http://requests.core.isap.com/xsd}GetOpenstackQuotaReq" minOccurs="0"/>
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
    "goqr"
})
@XmlRootElement(name = "GetOpenstackQuotaDetails")
public class GetOpenstackQuotaDetails {

    @XmlElementRef(name = "goqr", namespace = "http://core.isap.com", type = JAXBElement.class, required = false)
    protected JAXBElement<GetOpenstackQuotaReq> goqr;

    /**
     * Gets the value of the goqr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetOpenstackQuotaReq }{@code >}
     *     
     */
    public JAXBElement<GetOpenstackQuotaReq> getGoqr() {
        return goqr;
    }

    /**
     * Sets the value of the goqr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetOpenstackQuotaReq }{@code >}
     *     
     */
    public void setGoqr(JAXBElement<GetOpenstackQuotaReq> value) {
        this.goqr = value;
    }

}

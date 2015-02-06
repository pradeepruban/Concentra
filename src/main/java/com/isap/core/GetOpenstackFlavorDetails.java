
package com.isap.core;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.isap.cloudmanager.requests.xsd.GetOpenstackFlavorDetailsReq;


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
 *         &lt;element name="gofr" type="{http://requests.cloudmanager.isap.com/xsd}GetOpenstackFlavorDetailsReq" minOccurs="0"/>
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
    "gofr"
})
@XmlRootElement(name = "GetOpenstackFlavorDetails")
public class GetOpenstackFlavorDetails {

    @XmlElementRef(name = "gofr", namespace = "http://core.isap.com", type = JAXBElement.class, required = false)
    protected JAXBElement<GetOpenstackFlavorDetailsReq> gofr;

    /**
     * Gets the value of the gofr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetOpenstackFlavorDetailsReq }{@code >}
     *     
     */
    public JAXBElement<GetOpenstackFlavorDetailsReq> getGofr() {
        return gofr;
    }

    /**
     * Sets the value of the gofr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetOpenstackFlavorDetailsReq }{@code >}
     *     
     */
    public void setGofr(JAXBElement<GetOpenstackFlavorDetailsReq> value) {
        this.gofr = value;
    }

}

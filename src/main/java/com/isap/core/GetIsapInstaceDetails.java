
package com.isap.core;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.isap.core.requests.xsd.GetIsapinstanceDetailsReq;


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
 *         &lt;element name="giids" type="{http://requests.core.isap.com/xsd}GetIsapinstanceDetailsReq" minOccurs="0"/>
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
    "giids"
})
@XmlRootElement(name = "GetIsapInstaceDetails")
public class GetIsapInstaceDetails {

    @XmlElementRef(name = "giids", namespace = "http://core.isap.com", type = JAXBElement.class, required = false)
    protected JAXBElement<GetIsapinstanceDetailsReq> giids;

    /**
     * Gets the value of the giids property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetIsapinstanceDetailsReq }{@code >}
     *     
     */
    public JAXBElement<GetIsapinstanceDetailsReq> getGiids() {
        return giids;
    }

    /**
     * Sets the value of the giids property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetIsapinstanceDetailsReq }{@code >}
     *     
     */
    public void setGiids(JAXBElement<GetIsapinstanceDetailsReq> value) {
        this.giids = value;
    }

}

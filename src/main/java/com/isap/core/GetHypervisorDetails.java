
package com.isap.core;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.isap.core.requests.xsd.GetOpenstackHypervisorDetailsReq;


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
 *         &lt;element name="ghdr" type="{http://requests.core.isap.com/xsd}GetOpenstackHypervisorDetailsReq" minOccurs="0"/>
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
    "ghdr"
})
@XmlRootElement(name = "GetHypervisorDetails")
public class GetHypervisorDetails {

    @XmlElementRef(name = "ghdr", namespace = "http://core.isap.com", type = JAXBElement.class, required = false)
    protected JAXBElement<GetOpenstackHypervisorDetailsReq> ghdr;

    /**
     * Gets the value of the ghdr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetOpenstackHypervisorDetailsReq }{@code >}
     *     
     */
    public JAXBElement<GetOpenstackHypervisorDetailsReq> getGhdr() {
        return ghdr;
    }

    /**
     * Sets the value of the ghdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetOpenstackHypervisorDetailsReq }{@code >}
     *     
     */
    public void setGhdr(JAXBElement<GetOpenstackHypervisorDetailsReq> value) {
        this.ghdr = value;
    }

}

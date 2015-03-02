
package com.isap.core;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.isap.cloudmanager.requests.xsd.ListOpenstackKeypairsReq;


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
 *         &lt;element name="lokr" type="{http://requests.cloudmanager.isap.com/xsd}ListOpenstackKeypairsReq" minOccurs="0"/>
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
    "lokr"
})
@XmlRootElement(name = "ListOpenstackKeypairs")
public class ListOpenstackKeypairs {

    @XmlElementRef(name = "lokr", namespace = "http://core.isap.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOpenstackKeypairsReq> lokr;

    /**
     * Gets the value of the lokr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOpenstackKeypairsReq }{@code >}
     *     
     */
    public JAXBElement<ListOpenstackKeypairsReq> getLokr() {
        return lokr;
    }

    /**
     * Sets the value of the lokr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOpenstackKeypairsReq }{@code >}
     *     
     */
    public void setLokr(JAXBElement<ListOpenstackKeypairsReq> value) {
        this.lokr = value;
    }

}

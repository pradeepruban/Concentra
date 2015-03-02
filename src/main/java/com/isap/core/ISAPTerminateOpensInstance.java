
package com.isap.core;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.isap.core.requests.xsd.TerminateOpensInstanceReq;


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
 *         &lt;element name="tpir" type="{http://requests.core.isap.com/xsd}TerminateOpensInstanceReq" minOccurs="0"/>
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
    "tpir"
})
@XmlRootElement(name = "ISAPTerminateOpensInstance")
public class ISAPTerminateOpensInstance {

    @XmlElementRef(name = "tpir", namespace = "http://core.isap.com", type = JAXBElement.class, required = false)
    protected JAXBElement<TerminateOpensInstanceReq> tpir;

    /**
     * Gets the value of the tpir property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TerminateOpensInstanceReq }{@code >}
     *     
     */
    public JAXBElement<TerminateOpensInstanceReq> getTpir() {
        return tpir;
    }

    /**
     * Sets the value of the tpir property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TerminateOpensInstanceReq }{@code >}
     *     
     */
    public void setTpir(JAXBElement<TerminateOpensInstanceReq> value) {
        this.tpir = value;
    }

}

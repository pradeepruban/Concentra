
package com.isap.core.responses.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetIsapCloudAuthenticationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetIsapCloudAuthenticationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isapLongMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isapMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isapRetunCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="opsTenantId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opsTokenId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetIsapCloudAuthenticationResponse", propOrder = {
    "isapLongMessage",
    "isapMessage",
    "isapRetunCode",
    "opsTenantId",
    "opsTokenId"
})
public class GetIsapCloudAuthenticationResponse {

    @XmlElementRef(name = "isapLongMessage", namespace = "http://responses.core.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> isapLongMessage;
    @XmlElementRef(name = "isapMessage", namespace = "http://responses.core.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> isapMessage;
    protected Integer isapRetunCode;
    @XmlElementRef(name = "opsTenantId", namespace = "http://responses.core.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opsTenantId;
    @XmlElementRef(name = "opsTokenId", namespace = "http://responses.core.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opsTokenId;

    /**
     * Gets the value of the isapLongMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIsapLongMessage() {
        return isapLongMessage;
    }

    /**
     * Sets the value of the isapLongMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIsapLongMessage(JAXBElement<String> value) {
        this.isapLongMessage = value;
    }

    /**
     * Gets the value of the isapMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIsapMessage() {
        return isapMessage;
    }

    /**
     * Sets the value of the isapMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIsapMessage(JAXBElement<String> value) {
        this.isapMessage = value;
    }

    /**
     * Gets the value of the isapRetunCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsapRetunCode() {
        return isapRetunCode;
    }

    /**
     * Sets the value of the isapRetunCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsapRetunCode(Integer value) {
        this.isapRetunCode = value;
    }

    /**
     * Gets the value of the opsTenantId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpsTenantId() {
        return opsTenantId;
    }

    /**
     * Sets the value of the opsTenantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpsTenantId(JAXBElement<String> value) {
        this.opsTenantId = value;
    }

    /**
     * Gets the value of the opsTokenId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpsTokenId() {
        return opsTokenId;
    }

    /**
     * Sets the value of the opsTokenId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpsTokenId(JAXBElement<String> value) {
        this.opsTokenId = value;
    }

}

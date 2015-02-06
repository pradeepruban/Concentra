
package com.isap.core.responses.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetIsapInstanceDetailsResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetIsapInstanceDetailsResp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isapLongMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isapMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isapRetunCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="opens_inst_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opens_inst_ipv4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opens_inst_status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetIsapInstanceDetailsResp", propOrder = {
    "isapLongMessage",
    "isapMessage",
    "isapRetunCode",
    "opensInstId",
    "opensInstIpv4",
    "opensInstStatus"
})
public class GetIsapInstanceDetailsResp {

    @XmlElementRef(name = "isapLongMessage", namespace = "http://responses.core.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> isapLongMessage;
    @XmlElementRef(name = "isapMessage", namespace = "http://responses.core.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> isapMessage;
    protected Integer isapRetunCode;
    @XmlElementRef(name = "opens_inst_id", namespace = "http://responses.core.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opensInstId;
    @XmlElementRef(name = "opens_inst_ipv4", namespace = "http://responses.core.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opensInstIpv4;
    @XmlElementRef(name = "opens_inst_status", namespace = "http://responses.core.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opensInstStatus;

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
     * Gets the value of the opensInstId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpensInstId() {
        return opensInstId;
    }

    /**
     * Sets the value of the opensInstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpensInstId(JAXBElement<String> value) {
        this.opensInstId = value;
    }

    /**
     * Gets the value of the opensInstIpv4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpensInstIpv4() {
        return opensInstIpv4;
    }

    /**
     * Sets the value of the opensInstIpv4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpensInstIpv4(JAXBElement<String> value) {
        this.opensInstIpv4 = value;
    }

    /**
     * Gets the value of the opensInstStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpensInstStatus() {
        return opensInstStatus;
    }

    /**
     * Sets the value of the opensInstStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpensInstStatus(JAXBElement<String> value) {
        this.opensInstStatus = value;
    }

}

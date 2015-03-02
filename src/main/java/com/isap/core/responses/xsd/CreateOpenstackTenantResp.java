
package com.isap.core.responses.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateOpenstackTenantResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateOpenstackTenantResp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isapLongMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isapMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="retunCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tenant_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateOpenstackTenantResp", propOrder = {
    "isapLongMessage",
    "isapMessage",
    "retunCode",
    "tenantId"
})
public class CreateOpenstackTenantResp {

    @XmlElementRef(name = "isapLongMessage", namespace = "http://responses.core.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> isapLongMessage;
    @XmlElementRef(name = "isapMessage", namespace = "http://responses.core.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> isapMessage;
    protected Integer retunCode;
    @XmlElementRef(name = "tenant_id", namespace = "http://responses.core.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tenantId;

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
     * Gets the value of the retunCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRetunCode() {
        return retunCode;
    }

    /**
     * Sets the value of the retunCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRetunCode(Integer value) {
        this.retunCode = value;
    }

    /**
     * Gets the value of the tenantId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTenantId() {
        return tenantId;
    }

    /**
     * Sets the value of the tenantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTenantId(JAXBElement<String> value) {
        this.tenantId = value;
    }

}

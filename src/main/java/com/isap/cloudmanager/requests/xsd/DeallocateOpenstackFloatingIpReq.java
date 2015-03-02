
package com.isap.cloudmanager.requests.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeallocateOpenstackFloatingIpReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeallocateOpenstackFloatingIpReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opspassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opstenantname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opsusername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tenant_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="token_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeallocateOpenstackFloatingIpReq", propOrder = {
    "id",
    "ip",
    "opspassword",
    "opstenantname",
    "opsusername",
    "tenantId",
    "tokenId"
})
public class DeallocateOpenstackFloatingIpReq {

    @XmlElementRef(name = "id", namespace = "http://requests.cloudmanager.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> id;
    @XmlElementRef(name = "ip", namespace = "http://requests.cloudmanager.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ip;
    @XmlElementRef(name = "opspassword", namespace = "http://requests.cloudmanager.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opspassword;
    @XmlElementRef(name = "opstenantname", namespace = "http://requests.cloudmanager.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opstenantname;
    @XmlElementRef(name = "opsusername", namespace = "http://requests.cloudmanager.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opsusername;
    @XmlElementRef(name = "tenant_id", namespace = "http://requests.cloudmanager.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tenantId;
    @XmlElementRef(name = "token_id", namespace = "http://requests.cloudmanager.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tokenId;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setId(JAXBElement<String> value) {
        this.id = value;
    }

    /**
     * Gets the value of the ip property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIp() {
        return ip;
    }

    /**
     * Sets the value of the ip property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIp(JAXBElement<String> value) {
        this.ip = value;
    }

    /**
     * Gets the value of the opspassword property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpspassword() {
        return opspassword;
    }

    /**
     * Sets the value of the opspassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpspassword(JAXBElement<String> value) {
        this.opspassword = value;
    }

    /**
     * Gets the value of the opstenantname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpstenantname() {
        return opstenantname;
    }

    /**
     * Sets the value of the opstenantname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpstenantname(JAXBElement<String> value) {
        this.opstenantname = value;
    }

    /**
     * Gets the value of the opsusername property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpsusername() {
        return opsusername;
    }

    /**
     * Sets the value of the opsusername property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpsusername(JAXBElement<String> value) {
        this.opsusername = value;
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

    /**
     * Gets the value of the tokenId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTokenId() {
        return tokenId;
    }

    /**
     * Sets the value of the tokenId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTokenId(JAXBElement<String> value) {
        this.tokenId = value;
    }

}

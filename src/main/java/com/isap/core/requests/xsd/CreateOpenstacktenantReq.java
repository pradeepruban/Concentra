
package com.isap.core.requests.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateOpenstacktenantReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateOpenstacktenantReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opspassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opstenantname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opsusername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tenant_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateOpenstacktenantReq", propOrder = {
    "ip",
    "opspassword",
    "opstenantname",
    "opsusername",
    "tenantName"
})
public class CreateOpenstacktenantReq {

    @XmlElementRef(name = "ip", namespace = "http://requests.core.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ip;
    @XmlElementRef(name = "opspassword", namespace = "http://requests.core.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opspassword;
    @XmlElementRef(name = "opstenantname", namespace = "http://requests.core.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opstenantname;
    @XmlElementRef(name = "opsusername", namespace = "http://requests.core.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opsusername;
    @XmlElementRef(name = "tenant_name", namespace = "http://requests.core.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tenantName;

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
     * Gets the value of the tenantName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTenantName() {
        return tenantName;
    }

    /**
     * Sets the value of the tenantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTenantName(JAXBElement<String> value) {
        this.tenantName = value;
    }

}

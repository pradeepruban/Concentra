
package com.isap.cloudmanager.requests.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemoveOpenstackFloatingIpReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemoveOpenstackFloatingIpReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inst_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ops_ip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ops_password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ops_tenant_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ops_username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveOpenstackFloatingIpReq", propOrder = {
    "instId",
    "opsIp",
    "opsPassword",
    "opsTenantName",
    "opsUsername"
})
public class RemoveOpenstackFloatingIpReq {

    @XmlElementRef(name = "inst_id", namespace = "http://requests.cloudmanager.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> instId;
    @XmlElementRef(name = "ops_ip", namespace = "http://requests.cloudmanager.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opsIp;
    @XmlElementRef(name = "ops_password", namespace = "http://requests.cloudmanager.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opsPassword;
    @XmlElementRef(name = "ops_tenant_name", namespace = "http://requests.cloudmanager.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opsTenantName;
    @XmlElementRef(name = "ops_username", namespace = "http://requests.cloudmanager.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opsUsername;

    /**
     * Gets the value of the instId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInstId() {
        return instId;
    }

    /**
     * Sets the value of the instId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInstId(JAXBElement<String> value) {
        this.instId = value;
    }

    /**
     * Gets the value of the opsIp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpsIp() {
        return opsIp;
    }

    /**
     * Sets the value of the opsIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpsIp(JAXBElement<String> value) {
        this.opsIp = value;
    }

    /**
     * Gets the value of the opsPassword property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpsPassword() {
        return opsPassword;
    }

    /**
     * Sets the value of the opsPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpsPassword(JAXBElement<String> value) {
        this.opsPassword = value;
    }

    /**
     * Gets the value of the opsTenantName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpsTenantName() {
        return opsTenantName;
    }

    /**
     * Sets the value of the opsTenantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpsTenantName(JAXBElement<String> value) {
        this.opsTenantName = value;
    }

    /**
     * Gets the value of the opsUsername property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpsUsername() {
        return opsUsername;
    }

    /**
     * Sets the value of the opsUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpsUsername(JAXBElement<String> value) {
        this.opsUsername = value;
    }

}

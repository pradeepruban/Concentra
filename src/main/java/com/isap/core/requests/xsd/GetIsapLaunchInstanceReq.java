
package com.isap.core.requests.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetIsapLaunchInstanceReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetIsapLaunchInstanceReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cloudType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opsPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opsTenantName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opsUserid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opsUsername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opsaz_zone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opsflavor_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="opshostIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opsimage_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opsinst_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opskey_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opsnetwork_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opssec_group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="puppet_Master_Hostname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="puppet_Master_IP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scm" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="vm_custom_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetIsapLaunchInstanceReq", propOrder = {
    "cloudType",
    "opsPassword",
    "opsTenantName",
    "opsUserid",
    "opsUsername",
    "opsazZone",
    "opsflavorId",
    "opshostIp",
    "opsimageId",
    "opsinstName",
    "opskeyName",
    "opsnetworkId",
    "opssecGroup",
    "puppetMasterHostname",
    "puppetMasterIP",
    "scm",
    "vmCustomId"
})
public class GetIsapLaunchInstanceReq {

    @XmlElementRef(name = "cloudType", namespace = "http://requests.core.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cloudType;
    @XmlElementRef(name = "opsPassword", namespace = "http://requests.core.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opsPassword;
    @XmlElementRef(name = "opsTenantName", namespace = "http://requests.core.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opsTenantName;
    @XmlElementRef(name = "opsUserid", namespace = "http://requests.core.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opsUserid;
    @XmlElementRef(name = "opsUsername", namespace = "http://requests.core.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opsUsername;
    @XmlElementRef(name = "opsaz_zone", namespace = "http://requests.core.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opsazZone;
    @XmlElement(name = "opsflavor_id")
    protected Integer opsflavorId;
    @XmlElementRef(name = "opshostIp", namespace = "http://requests.core.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opshostIp;
    @XmlElementRef(name = "opsimage_id", namespace = "http://requests.core.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opsimageId;
    @XmlElementRef(name = "opsinst_name", namespace = "http://requests.core.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opsinstName;
    @XmlElementRef(name = "opskey_name", namespace = "http://requests.core.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opskeyName;
    @XmlElementRef(name = "opsnetwork_id", namespace = "http://requests.core.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opsnetworkId;
    @XmlElementRef(name = "opssec_group", namespace = "http://requests.core.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opssecGroup;
    @XmlElementRef(name = "puppet_Master_Hostname", namespace = "http://requests.core.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> puppetMasterHostname;
    @XmlElementRef(name = "puppet_Master_IP", namespace = "http://requests.core.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> puppetMasterIP;
    protected Integer scm;
    @XmlElement(name = "vm_custom_id")
    protected Integer vmCustomId;

    /**
     * Gets the value of the cloudType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCloudType() {
        return cloudType;
    }

    /**
     * Sets the value of the cloudType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCloudType(JAXBElement<String> value) {
        this.cloudType = value;
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
     * Gets the value of the opsUserid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpsUserid() {
        return opsUserid;
    }

    /**
     * Sets the value of the opsUserid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpsUserid(JAXBElement<String> value) {
        this.opsUserid = value;
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

    /**
     * Gets the value of the opsazZone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpsazZone() {
        return opsazZone;
    }

    /**
     * Sets the value of the opsazZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpsazZone(JAXBElement<String> value) {
        this.opsazZone = value;
    }

    /**
     * Gets the value of the opsflavorId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOpsflavorId() {
        return opsflavorId;
    }

    /**
     * Sets the value of the opsflavorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOpsflavorId(Integer value) {
        this.opsflavorId = value;
    }

    /**
     * Gets the value of the opshostIp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpshostIp() {
        return opshostIp;
    }

    /**
     * Sets the value of the opshostIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpshostIp(JAXBElement<String> value) {
        this.opshostIp = value;
    }

    /**
     * Gets the value of the opsimageId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpsimageId() {
        return opsimageId;
    }

    /**
     * Sets the value of the opsimageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpsimageId(JAXBElement<String> value) {
        this.opsimageId = value;
    }

    /**
     * Gets the value of the opsinstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpsinstName() {
        return opsinstName;
    }

    /**
     * Sets the value of the opsinstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpsinstName(JAXBElement<String> value) {
        this.opsinstName = value;
    }

    /**
     * Gets the value of the opskeyName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpskeyName() {
        return opskeyName;
    }

    /**
     * Sets the value of the opskeyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpskeyName(JAXBElement<String> value) {
        this.opskeyName = value;
    }

    /**
     * Gets the value of the opsnetworkId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpsnetworkId() {
        return opsnetworkId;
    }

    /**
     * Sets the value of the opsnetworkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpsnetworkId(JAXBElement<String> value) {
        this.opsnetworkId = value;
    }

    /**
     * Gets the value of the opssecGroup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpssecGroup() {
        return opssecGroup;
    }

    /**
     * Sets the value of the opssecGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpssecGroup(JAXBElement<String> value) {
        this.opssecGroup = value;
    }

    /**
     * Gets the value of the puppetMasterHostname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPuppetMasterHostname() {
        return puppetMasterHostname;
    }

    /**
     * Sets the value of the puppetMasterHostname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPuppetMasterHostname(JAXBElement<String> value) {
        this.puppetMasterHostname = value;
    }

    /**
     * Gets the value of the puppetMasterIP property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPuppetMasterIP() {
        return puppetMasterIP;
    }

    /**
     * Sets the value of the puppetMasterIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPuppetMasterIP(JAXBElement<String> value) {
        this.puppetMasterIP = value;
    }

    /**
     * Gets the value of the scm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScm() {
        return scm;
    }

    /**
     * Sets the value of the scm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScm(Integer value) {
        this.scm = value;
    }

    /**
     * Gets the value of the vmCustomId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVmCustomId() {
        return vmCustomId;
    }

    /**
     * Sets the value of the vmCustomId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVmCustomId(Integer value) {
        this.vmCustomId = value;
    }

}

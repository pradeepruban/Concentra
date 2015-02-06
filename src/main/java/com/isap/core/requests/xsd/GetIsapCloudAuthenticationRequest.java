
package com.isap.core.requests.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetIsapCloudAuthenticationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetIsapCloudAuthenticationRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="awsUsername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cloudType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opsIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opsPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opsTenantName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opsUserid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opsUsername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetIsapCloudAuthenticationRequest", propOrder = {
    "awsUsername",
    "cloudType",
    "opsIp",
    "opsPassword",
    "opsTenantName",
    "opsUserid",
    "opsUsername"
})
public class GetIsapCloudAuthenticationRequest {

    @XmlElementRef(name = "awsUsername", namespace = "http://requests.core.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> awsUsername;
    @XmlElementRef(name = "cloudType", namespace = "http://requests.core.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cloudType;
    @XmlElementRef(name = "opsIp", namespace = "http://requests.core.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opsIp;
    @XmlElementRef(name = "opsPassword", namespace = "http://requests.core.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opsPassword;
    @XmlElementRef(name = "opsTenantName", namespace = "http://requests.core.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opsTenantName;
    @XmlElementRef(name = "opsUserid", namespace = "http://requests.core.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opsUserid;
    @XmlElementRef(name = "opsUsername", namespace = "http://requests.core.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opsUsername;

    /**
     * Gets the value of the awsUsername property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAwsUsername() {
        return awsUsername;
    }

    /**
     * Sets the value of the awsUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAwsUsername(JAXBElement<String> value) {
        this.awsUsername = value;
    }

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

}

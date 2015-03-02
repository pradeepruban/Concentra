
package com.isap.core.requests.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetIsapinstanceDetailsReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetIsapinstanceDetailsReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cloudType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opens_inst_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="openstenant_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opensthost_ip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opensttoken_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetIsapinstanceDetailsReq", propOrder = {
    "cloudType",
    "opensInstId",
    "openstenantId",
    "opensthostIp",
    "opensttokenId"
})
public class GetIsapinstanceDetailsReq {

    @XmlElementRef(name = "cloudType", namespace = "http://requests.core.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cloudType;
    @XmlElementRef(name = "opens_inst_id", namespace = "http://requests.core.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opensInstId;
    @XmlElementRef(name = "openstenant_id", namespace = "http://requests.core.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> openstenantId;
    @XmlElementRef(name = "opensthost_ip", namespace = "http://requests.core.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opensthostIp;
    @XmlElementRef(name = "opensttoken_id", namespace = "http://requests.core.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opensttokenId;

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
     * Gets the value of the openstenantId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpenstenantId() {
        return openstenantId;
    }

    /**
     * Sets the value of the openstenantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpenstenantId(JAXBElement<String> value) {
        this.openstenantId = value;
    }

    /**
     * Gets the value of the opensthostIp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpensthostIp() {
        return opensthostIp;
    }

    /**
     * Sets the value of the opensthostIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpensthostIp(JAXBElement<String> value) {
        this.opensthostIp = value;
    }

    /**
     * Gets the value of the opensttokenId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpensttokenId() {
        return opensttokenId;
    }

    /**
     * Sets the value of the opensttokenId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpensttokenId(JAXBElement<String> value) {
        this.opensttokenId = value;
    }

}


package com.isap.core.responses.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetOpenstackQuotaResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetOpenstackQuotaResp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isapLongMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isapMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxSecurityGroups" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="maxTotalCores" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="maxTotalFloatingIps" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="maxTotalInstances" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="maxTotalRAMSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalCoresUsed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalFloatingIpsUsed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalInstancesUsed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalRAMUsed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalSecurityGroupsUsed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetOpenstackQuotaResp", propOrder = {
    "isapLongMessage",
    "isapMessage",
    "maxSecurityGroups",
    "maxTotalCores",
    "maxTotalFloatingIps",
    "maxTotalInstances",
    "maxTotalRAMSize",
    "returnCode",
    "totalCoresUsed",
    "totalFloatingIpsUsed",
    "totalInstancesUsed",
    "totalRAMUsed",
    "totalSecurityGroupsUsed"
})
public class GetOpenstackQuotaResp {

    @XmlElementRef(name = "isapLongMessage", namespace = "http://responses.core.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> isapLongMessage;
    @XmlElementRef(name = "isapMessage", namespace = "http://responses.core.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> isapMessage;
    protected Integer maxSecurityGroups;
    protected Integer maxTotalCores;
    protected Integer maxTotalFloatingIps;
    protected Integer maxTotalInstances;
    protected Integer maxTotalRAMSize;
    protected Integer returnCode;
    protected Integer totalCoresUsed;
    protected Integer totalFloatingIpsUsed;
    protected Integer totalInstancesUsed;
    protected Integer totalRAMUsed;
    protected Integer totalSecurityGroupsUsed;

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
     * Gets the value of the maxSecurityGroups property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxSecurityGroups() {
        return maxSecurityGroups;
    }

    /**
     * Sets the value of the maxSecurityGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxSecurityGroups(Integer value) {
        this.maxSecurityGroups = value;
    }

    /**
     * Gets the value of the maxTotalCores property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxTotalCores() {
        return maxTotalCores;
    }

    /**
     * Sets the value of the maxTotalCores property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxTotalCores(Integer value) {
        this.maxTotalCores = value;
    }

    /**
     * Gets the value of the maxTotalFloatingIps property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxTotalFloatingIps() {
        return maxTotalFloatingIps;
    }

    /**
     * Sets the value of the maxTotalFloatingIps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxTotalFloatingIps(Integer value) {
        this.maxTotalFloatingIps = value;
    }

    /**
     * Gets the value of the maxTotalInstances property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxTotalInstances() {
        return maxTotalInstances;
    }

    /**
     * Sets the value of the maxTotalInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxTotalInstances(Integer value) {
        this.maxTotalInstances = value;
    }

    /**
     * Gets the value of the maxTotalRAMSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxTotalRAMSize() {
        return maxTotalRAMSize;
    }

    /**
     * Sets the value of the maxTotalRAMSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxTotalRAMSize(Integer value) {
        this.maxTotalRAMSize = value;
    }

    /**
     * Gets the value of the returnCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the value of the returnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReturnCode(Integer value) {
        this.returnCode = value;
    }

    /**
     * Gets the value of the totalCoresUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalCoresUsed() {
        return totalCoresUsed;
    }

    /**
     * Sets the value of the totalCoresUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalCoresUsed(Integer value) {
        this.totalCoresUsed = value;
    }

    /**
     * Gets the value of the totalFloatingIpsUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalFloatingIpsUsed() {
        return totalFloatingIpsUsed;
    }

    /**
     * Sets the value of the totalFloatingIpsUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalFloatingIpsUsed(Integer value) {
        this.totalFloatingIpsUsed = value;
    }

    /**
     * Gets the value of the totalInstancesUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalInstancesUsed() {
        return totalInstancesUsed;
    }

    /**
     * Sets the value of the totalInstancesUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalInstancesUsed(Integer value) {
        this.totalInstancesUsed = value;
    }

    /**
     * Gets the value of the totalRAMUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalRAMUsed() {
        return totalRAMUsed;
    }

    /**
     * Sets the value of the totalRAMUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalRAMUsed(Integer value) {
        this.totalRAMUsed = value;
    }

    /**
     * Gets the value of the totalSecurityGroupsUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalSecurityGroupsUsed() {
        return totalSecurityGroupsUsed;
    }

    /**
     * Sets the value of the totalSecurityGroupsUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalSecurityGroupsUsed(Integer value) {
        this.totalSecurityGroupsUsed = value;
    }

}

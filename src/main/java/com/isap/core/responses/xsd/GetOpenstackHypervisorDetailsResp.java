
package com.isap.core.responses.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetOpenstackHypervisorDetailsResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetOpenstackHypervisorDetailsResp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="disk_available_least" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="free_disk_gb" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="free_ram_mb" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="isapLongMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isapMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="local_gb" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="local_gb_used" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="memory_mb" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="memory_mb_used" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="vcpus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="vcpus_used" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetOpenstackHypervisorDetailsResp", propOrder = {
    "diskAvailableLeast",
    "freeDiskGb",
    "freeRamMb",
    "isapLongMessage",
    "isapMessage",
    "localGb",
    "localGbUsed",
    "memoryMb",
    "memoryMbUsed",
    "returnCode",
    "vcpus",
    "vcpusUsed"
})
public class GetOpenstackHypervisorDetailsResp {

    @XmlElement(name = "disk_available_least")
    protected Integer diskAvailableLeast;
    @XmlElement(name = "free_disk_gb")
    protected Integer freeDiskGb;
    @XmlElement(name = "free_ram_mb")
    protected Integer freeRamMb;
    @XmlElementRef(name = "isapLongMessage", namespace = "http://responses.core.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> isapLongMessage;
    @XmlElementRef(name = "isapMessage", namespace = "http://responses.core.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> isapMessage;
    @XmlElement(name = "local_gb")
    protected Integer localGb;
    @XmlElement(name = "local_gb_used")
    protected Integer localGbUsed;
    @XmlElement(name = "memory_mb")
    protected Integer memoryMb;
    @XmlElement(name = "memory_mb_used")
    protected Integer memoryMbUsed;
    protected Integer returnCode;
    protected Integer vcpus;
    @XmlElement(name = "vcpus_used")
    protected Integer vcpusUsed;

    /**
     * Gets the value of the diskAvailableLeast property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDiskAvailableLeast() {
        return diskAvailableLeast;
    }

    /**
     * Sets the value of the diskAvailableLeast property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDiskAvailableLeast(Integer value) {
        this.diskAvailableLeast = value;
    }

    /**
     * Gets the value of the freeDiskGb property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFreeDiskGb() {
        return freeDiskGb;
    }

    /**
     * Sets the value of the freeDiskGb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFreeDiskGb(Integer value) {
        this.freeDiskGb = value;
    }

    /**
     * Gets the value of the freeRamMb property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFreeRamMb() {
        return freeRamMb;
    }

    /**
     * Sets the value of the freeRamMb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFreeRamMb(Integer value) {
        this.freeRamMb = value;
    }

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
     * Gets the value of the localGb property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLocalGb() {
        return localGb;
    }

    /**
     * Sets the value of the localGb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLocalGb(Integer value) {
        this.localGb = value;
    }

    /**
     * Gets the value of the localGbUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLocalGbUsed() {
        return localGbUsed;
    }

    /**
     * Sets the value of the localGbUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLocalGbUsed(Integer value) {
        this.localGbUsed = value;
    }

    /**
     * Gets the value of the memoryMb property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMemoryMb() {
        return memoryMb;
    }

    /**
     * Sets the value of the memoryMb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMemoryMb(Integer value) {
        this.memoryMb = value;
    }

    /**
     * Gets the value of the memoryMbUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMemoryMbUsed() {
        return memoryMbUsed;
    }

    /**
     * Sets the value of the memoryMbUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMemoryMbUsed(Integer value) {
        this.memoryMbUsed = value;
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
     * Gets the value of the vcpus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVcpus() {
        return vcpus;
    }

    /**
     * Sets the value of the vcpus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVcpus(Integer value) {
        this.vcpus = value;
    }

    /**
     * Gets the value of the vcpusUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVcpusUsed() {
        return vcpusUsed;
    }

    /**
     * Sets the value of the vcpusUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVcpusUsed(Integer value) {
        this.vcpusUsed = value;
    }

}

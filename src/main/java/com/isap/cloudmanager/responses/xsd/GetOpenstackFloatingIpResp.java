
package com.isap.cloudmanager.responses.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetOpenstackFloatingIpResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetOpenstackFloatingIpResp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="floatIP" type="{http://responses.cloudmanager.isap.com/xsd}ArrayOfString" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="longMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetOpenstackFloatingIpResp", propOrder = {
    "floatIP",
    "longMessage",
    "message",
    "returnCode"
})
public class GetOpenstackFloatingIpResp {

    @XmlElement(nillable = true)
    protected List<ArrayOfString> floatIP;
    @XmlElementRef(name = "longMessage", namespace = "http://responses.cloudmanager.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> longMessage;
    @XmlElementRef(name = "message", namespace = "http://responses.cloudmanager.isap.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> message;
    protected Integer returnCode;

    /**
     * Gets the value of the floatIP property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the floatIP property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFloatIP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfString }
     * 
     * 
     */
    public List<ArrayOfString> getFloatIP() {
        if (floatIP == null) {
            floatIP = new ArrayList<ArrayOfString>();
        }
        return this.floatIP;
    }

    /**
     * Gets the value of the longMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLongMessage() {
        return longMessage;
    }

    /**
     * Sets the value of the longMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLongMessage(JAXBElement<String> value) {
        this.longMessage = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMessage(JAXBElement<String> value) {
        this.message = value;
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

}

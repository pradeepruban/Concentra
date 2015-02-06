
package com.isap.core;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.amazonaws.util.json.xsd.JSONException;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="JSONException" type="{http://json.util.amazonaws.com/xsd}JSONException" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "jsonException"
})
@XmlRootElement(name = "IsapCoreWebservicesJSONException")
public class IsapCoreWebservicesJSONException {

    @XmlElementRef(name = "JSONException", namespace = "http://core.isap.com", type = JAXBElement.class, required = false)
    protected JAXBElement<JSONException> jsonException;

    /**
     * Gets the value of the jsonException property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link JSONException }{@code >}
     *     
     */
    public JAXBElement<JSONException> getJSONException() {
        return jsonException;
    }

    /**
     * Sets the value of the jsonException property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link JSONException }{@code >}
     *     
     */
    public void setJSONException(JAXBElement<JSONException> value) {
        this.jsonException = value;
    }

}


package com.isap.core.responses.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOpenstackFlavors complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOpenstackFlavors">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flavors" type="{http://responses.core.isap.com/xsd}ArrayOfString" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOpenstackFlavors", propOrder = {
    "flavors"
})
public class ListOpenstackFlavors {

    @XmlElement(nillable = true)
    protected List<ArrayOfString> flavors;

    /**
     * Gets the value of the flavors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flavors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlavors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfString }
     * 
     * 
     */
    public List<ArrayOfString> getFlavors() {
        if (flavors == null) {
            flavors = new ArrayList<ArrayOfString>();
        }
        return this.flavors;
    }

}

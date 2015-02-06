
package com.isap.core.responses.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.isap.cloudmanager.responses.xsd.Rules;


/**
 * <p>Java class for GetOpenstackSecurityGroupDetailsResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetOpenstackSecurityGroupDetailsResp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="secGrpDetails" type="{http://responses.cloudmanager.isap.com/xsd}rules" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetOpenstackSecurityGroupDetailsResp", propOrder = {
    "secGrpDetails"
})
public class GetOpenstackSecurityGroupDetailsResp {

    @XmlElement(nillable = true)
    protected List<Rules> secGrpDetails;

    /**
     * Gets the value of the secGrpDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secGrpDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecGrpDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rules }
     * 
     * 
     */
    public List<Rules> getSecGrpDetails() {
        if (secGrpDetails == null) {
            secGrpDetails = new ArrayList<Rules>();
        }
        return this.secGrpDetails;
    }

}


package com.isap.cloudmanager.responses.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.isap.cloudmanager.responses.xsd package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RulesIpProtocol_QNAME = new QName("http://responses.cloudmanager.isap.com/xsd", "ip_protocol");
    private final static QName _GetOpenstackFlavorRespLongMessage_QNAME = new QName("http://responses.cloudmanager.isap.com/xsd", "longMessage");
    private final static QName _GetOpenstackFlavorRespMessage_QNAME = new QName("http://responses.cloudmanager.isap.com/xsd", "message");
    private final static QName _GetOpenstackFlavorRespId_QNAME = new QName("http://responses.cloudmanager.isap.com/xsd", "id");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.isap.cloudmanager.responses.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetOpenstackFlavorResp }
     * 
     */
    public GetOpenstackFlavorResp createGetOpenstackFlavorResp() {
        return new GetOpenstackFlavorResp();
    }

    /**
     * Create an instance of {@link Rules }
     * 
     */
    public Rules createRules() {
        return new Rules();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://responses.cloudmanager.isap.com/xsd", name = "ip_protocol", scope = Rules.class)
    public JAXBElement<String> createRulesIpProtocol(String value) {
        return new JAXBElement<String>(_RulesIpProtocol_QNAME, String.class, Rules.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://responses.cloudmanager.isap.com/xsd", name = "longMessage", scope = GetOpenstackFlavorResp.class)
    public JAXBElement<String> createGetOpenstackFlavorRespLongMessage(String value) {
        return new JAXBElement<String>(_GetOpenstackFlavorRespLongMessage_QNAME, String.class, GetOpenstackFlavorResp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://responses.cloudmanager.isap.com/xsd", name = "message", scope = GetOpenstackFlavorResp.class)
    public JAXBElement<String> createGetOpenstackFlavorRespMessage(String value) {
        return new JAXBElement<String>(_GetOpenstackFlavorRespMessage_QNAME, String.class, GetOpenstackFlavorResp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://responses.cloudmanager.isap.com/xsd", name = "id", scope = GetOpenstackFlavorResp.class)
    public JAXBElement<String> createGetOpenstackFlavorRespId(String value) {
        return new JAXBElement<String>(_GetOpenstackFlavorRespId_QNAME, String.class, GetOpenstackFlavorResp.class, value);
    }

}

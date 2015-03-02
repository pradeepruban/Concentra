
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

    private final static QName _GetOpenstackFloatingIpRespLongMessage_QNAME = new QName("http://responses.cloudmanager.isap.com/xsd", "longMessage");
    private final static QName _GetOpenstackFloatingIpRespMessage_QNAME = new QName("http://responses.cloudmanager.isap.com/xsd", "message");
    private final static QName _AddOpenstackFloatingIpRespFloatingIp_QNAME = new QName("http://responses.cloudmanager.isap.com/xsd", "floating_ip");
    private final static QName _RulesIpProtocol_QNAME = new QName("http://responses.cloudmanager.isap.com/xsd", "ip_protocol");
    private final static QName _GetOpenstackFlavorRespId_QNAME = new QName("http://responses.cloudmanager.isap.com/xsd", "id");
    private final static QName _AllocateOpenstackFloatingIpRespFloatingIP_QNAME = new QName("http://responses.cloudmanager.isap.com/xsd", "floatingIP");
    private final static QName _GetOpenstackImageDetailsRespImagename_QNAME = new QName("http://responses.cloudmanager.isap.com/xsd", "imagename");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.isap.cloudmanager.responses.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetOpenstackImageDetailsResp }
     * 
     */
    public GetOpenstackImageDetailsResp createGetOpenstackImageDetailsResp() {
        return new GetOpenstackImageDetailsResp();
    }

    /**
     * Create an instance of {@link GetOpenstackFlavorResp }
     * 
     */
    public GetOpenstackFlavorResp createGetOpenstackFlavorResp() {
        return new GetOpenstackFlavorResp();
    }

    /**
     * Create an instance of {@link RemoveOpenstackFloatingIpResp }
     * 
     */
    public RemoveOpenstackFloatingIpResp createRemoveOpenstackFloatingIpResp() {
        return new RemoveOpenstackFloatingIpResp();
    }

    /**
     * Create an instance of {@link GetOpenstackFloatingIpResp }
     * 
     */
    public GetOpenstackFloatingIpResp createGetOpenstackFloatingIpResp() {
        return new GetOpenstackFloatingIpResp();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link AllocateOpenstackFloatingIpResp }
     * 
     */
    public AllocateOpenstackFloatingIpResp createAllocateOpenstackFloatingIpResp() {
        return new AllocateOpenstackFloatingIpResp();
    }

    /**
     * Create an instance of {@link OpenstackBasicResp }
     * 
     */
    public OpenstackBasicResp createOpenstackBasicResp() {
        return new OpenstackBasicResp();
    }

    /**
     * Create an instance of {@link AddOpenstackFloatingIpResp }
     * 
     */
    public AddOpenstackFloatingIpResp createAddOpenstackFloatingIpResp() {
        return new AddOpenstackFloatingIpResp();
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
    @XmlElementDecl(namespace = "http://responses.cloudmanager.isap.com/xsd", name = "longMessage", scope = GetOpenstackFloatingIpResp.class)
    public JAXBElement<String> createGetOpenstackFloatingIpRespLongMessage(String value) {
        return new JAXBElement<String>(_GetOpenstackFloatingIpRespLongMessage_QNAME, String.class, GetOpenstackFloatingIpResp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://responses.cloudmanager.isap.com/xsd", name = "message", scope = GetOpenstackFloatingIpResp.class)
    public JAXBElement<String> createGetOpenstackFloatingIpRespMessage(String value) {
        return new JAXBElement<String>(_GetOpenstackFloatingIpRespMessage_QNAME, String.class, GetOpenstackFloatingIpResp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://responses.cloudmanager.isap.com/xsd", name = "longMessage", scope = AddOpenstackFloatingIpResp.class)
    public JAXBElement<String> createAddOpenstackFloatingIpRespLongMessage(String value) {
        return new JAXBElement<String>(_GetOpenstackFloatingIpRespLongMessage_QNAME, String.class, AddOpenstackFloatingIpResp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://responses.cloudmanager.isap.com/xsd", name = "floating_ip", scope = AddOpenstackFloatingIpResp.class)
    public JAXBElement<String> createAddOpenstackFloatingIpRespFloatingIp(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpRespFloatingIp_QNAME, String.class, AddOpenstackFloatingIpResp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://responses.cloudmanager.isap.com/xsd", name = "message", scope = AddOpenstackFloatingIpResp.class)
    public JAXBElement<String> createAddOpenstackFloatingIpRespMessage(String value) {
        return new JAXBElement<String>(_GetOpenstackFloatingIpRespMessage_QNAME, String.class, AddOpenstackFloatingIpResp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://responses.cloudmanager.isap.com/xsd", name = "longMessage", scope = RemoveOpenstackFloatingIpResp.class)
    public JAXBElement<String> createRemoveOpenstackFloatingIpRespLongMessage(String value) {
        return new JAXBElement<String>(_GetOpenstackFloatingIpRespLongMessage_QNAME, String.class, RemoveOpenstackFloatingIpResp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://responses.cloudmanager.isap.com/xsd", name = "message", scope = RemoveOpenstackFloatingIpResp.class)
    public JAXBElement<String> createRemoveOpenstackFloatingIpRespMessage(String value) {
        return new JAXBElement<String>(_GetOpenstackFloatingIpRespMessage_QNAME, String.class, RemoveOpenstackFloatingIpResp.class, value);
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
        return new JAXBElement<String>(_GetOpenstackFloatingIpRespLongMessage_QNAME, String.class, GetOpenstackFlavorResp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://responses.cloudmanager.isap.com/xsd", name = "message", scope = GetOpenstackFlavorResp.class)
    public JAXBElement<String> createGetOpenstackFlavorRespMessage(String value) {
        return new JAXBElement<String>(_GetOpenstackFloatingIpRespMessage_QNAME, String.class, GetOpenstackFlavorResp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://responses.cloudmanager.isap.com/xsd", name = "id", scope = GetOpenstackFlavorResp.class)
    public JAXBElement<String> createGetOpenstackFlavorRespId(String value) {
        return new JAXBElement<String>(_GetOpenstackFlavorRespId_QNAME, String.class, GetOpenstackFlavorResp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://responses.cloudmanager.isap.com/xsd", name = "longMessage", scope = AllocateOpenstackFloatingIpResp.class)
    public JAXBElement<String> createAllocateOpenstackFloatingIpRespLongMessage(String value) {
        return new JAXBElement<String>(_GetOpenstackFloatingIpRespLongMessage_QNAME, String.class, AllocateOpenstackFloatingIpResp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://responses.cloudmanager.isap.com/xsd", name = "floatingIP", scope = AllocateOpenstackFloatingIpResp.class)
    public JAXBElement<String> createAllocateOpenstackFloatingIpRespFloatingIP(String value) {
        return new JAXBElement<String>(_AllocateOpenstackFloatingIpRespFloatingIP_QNAME, String.class, AllocateOpenstackFloatingIpResp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://responses.cloudmanager.isap.com/xsd", name = "message", scope = AllocateOpenstackFloatingIpResp.class)
    public JAXBElement<String> createAllocateOpenstackFloatingIpRespMessage(String value) {
        return new JAXBElement<String>(_GetOpenstackFloatingIpRespMessage_QNAME, String.class, AllocateOpenstackFloatingIpResp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://responses.cloudmanager.isap.com/xsd", name = "longMessage", scope = OpenstackBasicResp.class)
    public JAXBElement<String> createOpenstackBasicRespLongMessage(String value) {
        return new JAXBElement<String>(_GetOpenstackFloatingIpRespLongMessage_QNAME, String.class, OpenstackBasicResp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://responses.cloudmanager.isap.com/xsd", name = "message", scope = OpenstackBasicResp.class)
    public JAXBElement<String> createOpenstackBasicRespMessage(String value) {
        return new JAXBElement<String>(_GetOpenstackFloatingIpRespMessage_QNAME, String.class, OpenstackBasicResp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://responses.cloudmanager.isap.com/xsd", name = "imagename", scope = GetOpenstackImageDetailsResp.class)
    public JAXBElement<String> createGetOpenstackImageDetailsRespImagename(String value) {
        return new JAXBElement<String>(_GetOpenstackImageDetailsRespImagename_QNAME, String.class, GetOpenstackImageDetailsResp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://responses.cloudmanager.isap.com/xsd", name = "longMessage", scope = GetOpenstackImageDetailsResp.class)
    public JAXBElement<String> createGetOpenstackImageDetailsRespLongMessage(String value) {
        return new JAXBElement<String>(_GetOpenstackFloatingIpRespLongMessage_QNAME, String.class, GetOpenstackImageDetailsResp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://responses.cloudmanager.isap.com/xsd", name = "message", scope = GetOpenstackImageDetailsResp.class)
    public JAXBElement<String> createGetOpenstackImageDetailsRespMessage(String value) {
        return new JAXBElement<String>(_GetOpenstackFloatingIpRespMessage_QNAME, String.class, GetOpenstackImageDetailsResp.class, value);
    }

}

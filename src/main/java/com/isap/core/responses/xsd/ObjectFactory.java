
package com.isap.core.responses.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.isap.core.responses.xsd package. 
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

    private final static QName _GetIsapLaunchInstanceRespIsapLongMessage_QNAME = new QName("http://responses.core.isap.com/xsd", "isapLongMessage");
    private final static QName _GetIsapLaunchInstanceRespIsapMessage_QNAME = new QName("http://responses.core.isap.com/xsd", "isapMessage");
    private final static QName _GetIsapLaunchInstanceRespOpsINstanceId_QNAME = new QName("http://responses.core.isap.com/xsd", "opsINstanceId");
    private final static QName _GetIsapCloudAuthenticationResponseOpsTokenId_QNAME = new QName("http://responses.core.isap.com/xsd", "opsTokenId");
    private final static QName _GetIsapCloudAuthenticationResponseOpsTenantId_QNAME = new QName("http://responses.core.isap.com/xsd", "opsTenantId");
    private final static QName _GetIsapInstanceDetailsRespOpensInstStatus_QNAME = new QName("http://responses.core.isap.com/xsd", "opens_inst_status");
    private final static QName _GetIsapInstanceDetailsRespOpensInstId_QNAME = new QName("http://responses.core.isap.com/xsd", "opens_inst_id");
    private final static QName _GetIsapInstanceDetailsRespOpensInstIpv4_QNAME = new QName("http://responses.core.isap.com/xsd", "opens_inst_ipv4");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.isap.core.responses.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListOpenstackFlavors }
     * 
     */
    public ListOpenstackFlavors createListOpenstackFlavors() {
        return new ListOpenstackFlavors();
    }

    /**
     * Create an instance of {@link GetIsapLaunchInstanceResp }
     * 
     */
    public GetIsapLaunchInstanceResp createGetIsapLaunchInstanceResp() {
        return new GetIsapLaunchInstanceResp();
    }

    /**
     * Create an instance of {@link ListOpenstackNetworksResp }
     * 
     */
    public ListOpenstackNetworksResp createListOpenstackNetworksResp() {
        return new ListOpenstackNetworksResp();
    }

    /**
     * Create an instance of {@link ListOpenstackKeypairsResp }
     * 
     */
    public ListOpenstackKeypairsResp createListOpenstackKeypairsResp() {
        return new ListOpenstackKeypairsResp();
    }

    /**
     * Create an instance of {@link GetOpenstackSecurityGroupDetailsResp }
     * 
     */
    public GetOpenstackSecurityGroupDetailsResp createGetOpenstackSecurityGroupDetailsResp() {
        return new GetOpenstackSecurityGroupDetailsResp();
    }

    /**
     * Create an instance of {@link GetIsapCloudAuthenticationResponse }
     * 
     */
    public GetIsapCloudAuthenticationResponse createGetIsapCloudAuthenticationResponse() {
        return new GetIsapCloudAuthenticationResponse();
    }

    /**
     * Create an instance of {@link GetIsapInstanceDetailsResp }
     * 
     */
    public GetIsapInstanceDetailsResp createGetIsapInstanceDetailsResp() {
        return new GetIsapInstanceDetailsResp();
    }

    /**
     * Create an instance of {@link ListOpenstackSecurityGroupsResp }
     * 
     */
    public ListOpenstackSecurityGroupsResp createListOpenstackSecurityGroupsResp() {
        return new ListOpenstackSecurityGroupsResp();
    }

    /**
     * Create an instance of {@link ListOpenstackImagesResp }
     * 
     */
    public ListOpenstackImagesResp createListOpenstackImagesResp() {
        return new ListOpenstackImagesResp();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://responses.core.isap.com/xsd", name = "isapLongMessage", scope = GetIsapLaunchInstanceResp.class)
    public JAXBElement<String> createGetIsapLaunchInstanceRespIsapLongMessage(String value) {
        return new JAXBElement<String>(_GetIsapLaunchInstanceRespIsapLongMessage_QNAME, String.class, GetIsapLaunchInstanceResp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://responses.core.isap.com/xsd", name = "isapMessage", scope = GetIsapLaunchInstanceResp.class)
    public JAXBElement<String> createGetIsapLaunchInstanceRespIsapMessage(String value) {
        return new JAXBElement<String>(_GetIsapLaunchInstanceRespIsapMessage_QNAME, String.class, GetIsapLaunchInstanceResp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://responses.core.isap.com/xsd", name = "opsINstanceId", scope = GetIsapLaunchInstanceResp.class)
    public JAXBElement<String> createGetIsapLaunchInstanceRespOpsINstanceId(String value) {
        return new JAXBElement<String>(_GetIsapLaunchInstanceRespOpsINstanceId_QNAME, String.class, GetIsapLaunchInstanceResp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://responses.core.isap.com/xsd", name = "isapLongMessage", scope = GetIsapCloudAuthenticationResponse.class)
    public JAXBElement<String> createGetIsapCloudAuthenticationResponseIsapLongMessage(String value) {
        return new JAXBElement<String>(_GetIsapLaunchInstanceRespIsapLongMessage_QNAME, String.class, GetIsapCloudAuthenticationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://responses.core.isap.com/xsd", name = "isapMessage", scope = GetIsapCloudAuthenticationResponse.class)
    public JAXBElement<String> createGetIsapCloudAuthenticationResponseIsapMessage(String value) {
        return new JAXBElement<String>(_GetIsapLaunchInstanceRespIsapMessage_QNAME, String.class, GetIsapCloudAuthenticationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://responses.core.isap.com/xsd", name = "opsTokenId", scope = GetIsapCloudAuthenticationResponse.class)
    public JAXBElement<String> createGetIsapCloudAuthenticationResponseOpsTokenId(String value) {
        return new JAXBElement<String>(_GetIsapCloudAuthenticationResponseOpsTokenId_QNAME, String.class, GetIsapCloudAuthenticationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://responses.core.isap.com/xsd", name = "opsTenantId", scope = GetIsapCloudAuthenticationResponse.class)
    public JAXBElement<String> createGetIsapCloudAuthenticationResponseOpsTenantId(String value) {
        return new JAXBElement<String>(_GetIsapCloudAuthenticationResponseOpsTenantId_QNAME, String.class, GetIsapCloudAuthenticationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://responses.core.isap.com/xsd", name = "isapLongMessage", scope = GetIsapInstanceDetailsResp.class)
    public JAXBElement<String> createGetIsapInstanceDetailsRespIsapLongMessage(String value) {
        return new JAXBElement<String>(_GetIsapLaunchInstanceRespIsapLongMessage_QNAME, String.class, GetIsapInstanceDetailsResp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://responses.core.isap.com/xsd", name = "isapMessage", scope = GetIsapInstanceDetailsResp.class)
    public JAXBElement<String> createGetIsapInstanceDetailsRespIsapMessage(String value) {
        return new JAXBElement<String>(_GetIsapLaunchInstanceRespIsapMessage_QNAME, String.class, GetIsapInstanceDetailsResp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://responses.core.isap.com/xsd", name = "opens_inst_status", scope = GetIsapInstanceDetailsResp.class)
    public JAXBElement<String> createGetIsapInstanceDetailsRespOpensInstStatus(String value) {
        return new JAXBElement<String>(_GetIsapInstanceDetailsRespOpensInstStatus_QNAME, String.class, GetIsapInstanceDetailsResp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://responses.core.isap.com/xsd", name = "opens_inst_id", scope = GetIsapInstanceDetailsResp.class)
    public JAXBElement<String> createGetIsapInstanceDetailsRespOpensInstId(String value) {
        return new JAXBElement<String>(_GetIsapInstanceDetailsRespOpensInstId_QNAME, String.class, GetIsapInstanceDetailsResp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://responses.core.isap.com/xsd", name = "opens_inst_ipv4", scope = GetIsapInstanceDetailsResp.class)
    public JAXBElement<String> createGetIsapInstanceDetailsRespOpensInstIpv4(String value) {
        return new JAXBElement<String>(_GetIsapInstanceDetailsRespOpensInstIpv4_QNAME, String.class, GetIsapInstanceDetailsResp.class, value);
    }

}

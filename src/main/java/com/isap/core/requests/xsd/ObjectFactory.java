
package com.isap.core.requests.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.isap.core.requests.xsd package. 
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

    private final static QName _GetIsapLaunchInstanceReqOpsimageId_QNAME = new QName("http://requests.core.isap.com/xsd", "opsimage_id");
    private final static QName _GetIsapLaunchInstanceReqOpssecGroup_QNAME = new QName("http://requests.core.isap.com/xsd", "opssec_group");
    private final static QName _GetIsapLaunchInstanceReqOpsazZone_QNAME = new QName("http://requests.core.isap.com/xsd", "opsaz_zone");
    private final static QName _GetIsapLaunchInstanceReqCloudType_QNAME = new QName("http://requests.core.isap.com/xsd", "cloudType");
    private final static QName _GetIsapLaunchInstanceReqOpsUsername_QNAME = new QName("http://requests.core.isap.com/xsd", "opsUsername");
    private final static QName _GetIsapLaunchInstanceReqOpsnetworkId_QNAME = new QName("http://requests.core.isap.com/xsd", "opsnetwork_id");
    private final static QName _GetIsapLaunchInstanceReqOpshostIp_QNAME = new QName("http://requests.core.isap.com/xsd", "opshostIp");
    private final static QName _GetIsapLaunchInstanceReqOpskeyName_QNAME = new QName("http://requests.core.isap.com/xsd", "opskey_name");
    private final static QName _GetIsapLaunchInstanceReqOpsTenantName_QNAME = new QName("http://requests.core.isap.com/xsd", "opsTenantName");
    private final static QName _GetIsapLaunchInstanceReqOpsinstName_QNAME = new QName("http://requests.core.isap.com/xsd", "opsinst_name");
    private final static QName _GetIsapLaunchInstanceReqOpsPassword_QNAME = new QName("http://requests.core.isap.com/xsd", "opsPassword");
    private final static QName _GetIsapLaunchInstanceReqOpsUserid_QNAME = new QName("http://requests.core.isap.com/xsd", "opsUserid");
    private final static QName _GetIsapCloudAuthenticationRequestOpsIp_QNAME = new QName("http://requests.core.isap.com/xsd", "opsIp");
    private final static QName _GetIsapCloudAuthenticationRequestAwsUsername_QNAME = new QName("http://requests.core.isap.com/xsd", "awsUsername");
    private final static QName _GetIsapinstanceDetailsReqOpensttokenId_QNAME = new QName("http://requests.core.isap.com/xsd", "opensttoken_id");
    private final static QName _GetIsapinstanceDetailsReqOpensthostIp_QNAME = new QName("http://requests.core.isap.com/xsd", "opensthost_ip");
    private final static QName _GetIsapinstanceDetailsReqOpenstenantId_QNAME = new QName("http://requests.core.isap.com/xsd", "openstenant_id");
    private final static QName _GetIsapinstanceDetailsReqOpensInstId_QNAME = new QName("http://requests.core.isap.com/xsd", "opens_inst_id");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.isap.core.requests.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetIsapinstanceDetailsReq }
     * 
     */
    public GetIsapinstanceDetailsReq createGetIsapinstanceDetailsReq() {
        return new GetIsapinstanceDetailsReq();
    }

    /**
     * Create an instance of {@link GetIsapCloudAuthenticationRequest }
     * 
     */
    public GetIsapCloudAuthenticationRequest createGetIsapCloudAuthenticationRequest() {
        return new GetIsapCloudAuthenticationRequest();
    }

    /**
     * Create an instance of {@link GetIsapLaunchInstanceReq }
     * 
     */
    public GetIsapLaunchInstanceReq createGetIsapLaunchInstanceReq() {
        return new GetIsapLaunchInstanceReq();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "opsimage_id", scope = GetIsapLaunchInstanceReq.class)
    public JAXBElement<String> createGetIsapLaunchInstanceReqOpsimageId(String value) {
        return new JAXBElement<String>(_GetIsapLaunchInstanceReqOpsimageId_QNAME, String.class, GetIsapLaunchInstanceReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "opssec_group", scope = GetIsapLaunchInstanceReq.class)
    public JAXBElement<String> createGetIsapLaunchInstanceReqOpssecGroup(String value) {
        return new JAXBElement<String>(_GetIsapLaunchInstanceReqOpssecGroup_QNAME, String.class, GetIsapLaunchInstanceReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "opsaz_zone", scope = GetIsapLaunchInstanceReq.class)
    public JAXBElement<String> createGetIsapLaunchInstanceReqOpsazZone(String value) {
        return new JAXBElement<String>(_GetIsapLaunchInstanceReqOpsazZone_QNAME, String.class, GetIsapLaunchInstanceReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "cloudType", scope = GetIsapLaunchInstanceReq.class)
    public JAXBElement<String> createGetIsapLaunchInstanceReqCloudType(String value) {
        return new JAXBElement<String>(_GetIsapLaunchInstanceReqCloudType_QNAME, String.class, GetIsapLaunchInstanceReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "opsUsername", scope = GetIsapLaunchInstanceReq.class)
    public JAXBElement<String> createGetIsapLaunchInstanceReqOpsUsername(String value) {
        return new JAXBElement<String>(_GetIsapLaunchInstanceReqOpsUsername_QNAME, String.class, GetIsapLaunchInstanceReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "opsnetwork_id", scope = GetIsapLaunchInstanceReq.class)
    public JAXBElement<String> createGetIsapLaunchInstanceReqOpsnetworkId(String value) {
        return new JAXBElement<String>(_GetIsapLaunchInstanceReqOpsnetworkId_QNAME, String.class, GetIsapLaunchInstanceReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "opshostIp", scope = GetIsapLaunchInstanceReq.class)
    public JAXBElement<String> createGetIsapLaunchInstanceReqOpshostIp(String value) {
        return new JAXBElement<String>(_GetIsapLaunchInstanceReqOpshostIp_QNAME, String.class, GetIsapLaunchInstanceReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "opskey_name", scope = GetIsapLaunchInstanceReq.class)
    public JAXBElement<String> createGetIsapLaunchInstanceReqOpskeyName(String value) {
        return new JAXBElement<String>(_GetIsapLaunchInstanceReqOpskeyName_QNAME, String.class, GetIsapLaunchInstanceReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "opsTenantName", scope = GetIsapLaunchInstanceReq.class)
    public JAXBElement<String> createGetIsapLaunchInstanceReqOpsTenantName(String value) {
        return new JAXBElement<String>(_GetIsapLaunchInstanceReqOpsTenantName_QNAME, String.class, GetIsapLaunchInstanceReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "opsinst_name", scope = GetIsapLaunchInstanceReq.class)
    public JAXBElement<String> createGetIsapLaunchInstanceReqOpsinstName(String value) {
        return new JAXBElement<String>(_GetIsapLaunchInstanceReqOpsinstName_QNAME, String.class, GetIsapLaunchInstanceReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "opsPassword", scope = GetIsapLaunchInstanceReq.class)
    public JAXBElement<String> createGetIsapLaunchInstanceReqOpsPassword(String value) {
        return new JAXBElement<String>(_GetIsapLaunchInstanceReqOpsPassword_QNAME, String.class, GetIsapLaunchInstanceReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "opsUserid", scope = GetIsapLaunchInstanceReq.class)
    public JAXBElement<String> createGetIsapLaunchInstanceReqOpsUserid(String value) {
        return new JAXBElement<String>(_GetIsapLaunchInstanceReqOpsUserid_QNAME, String.class, GetIsapLaunchInstanceReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "cloudType", scope = GetIsapCloudAuthenticationRequest.class)
    public JAXBElement<String> createGetIsapCloudAuthenticationRequestCloudType(String value) {
        return new JAXBElement<String>(_GetIsapLaunchInstanceReqCloudType_QNAME, String.class, GetIsapCloudAuthenticationRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "opsUsername", scope = GetIsapCloudAuthenticationRequest.class)
    public JAXBElement<String> createGetIsapCloudAuthenticationRequestOpsUsername(String value) {
        return new JAXBElement<String>(_GetIsapLaunchInstanceReqOpsUsername_QNAME, String.class, GetIsapCloudAuthenticationRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "opsIp", scope = GetIsapCloudAuthenticationRequest.class)
    public JAXBElement<String> createGetIsapCloudAuthenticationRequestOpsIp(String value) {
        return new JAXBElement<String>(_GetIsapCloudAuthenticationRequestOpsIp_QNAME, String.class, GetIsapCloudAuthenticationRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "awsUsername", scope = GetIsapCloudAuthenticationRequest.class)
    public JAXBElement<String> createGetIsapCloudAuthenticationRequestAwsUsername(String value) {
        return new JAXBElement<String>(_GetIsapCloudAuthenticationRequestAwsUsername_QNAME, String.class, GetIsapCloudAuthenticationRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "opsTenantName", scope = GetIsapCloudAuthenticationRequest.class)
    public JAXBElement<String> createGetIsapCloudAuthenticationRequestOpsTenantName(String value) {
        return new JAXBElement<String>(_GetIsapLaunchInstanceReqOpsTenantName_QNAME, String.class, GetIsapCloudAuthenticationRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "opsPassword", scope = GetIsapCloudAuthenticationRequest.class)
    public JAXBElement<String> createGetIsapCloudAuthenticationRequestOpsPassword(String value) {
        return new JAXBElement<String>(_GetIsapLaunchInstanceReqOpsPassword_QNAME, String.class, GetIsapCloudAuthenticationRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "opsUserid", scope = GetIsapCloudAuthenticationRequest.class)
    public JAXBElement<String> createGetIsapCloudAuthenticationRequestOpsUserid(String value) {
        return new JAXBElement<String>(_GetIsapLaunchInstanceReqOpsUserid_QNAME, String.class, GetIsapCloudAuthenticationRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "opensttoken_id", scope = GetIsapinstanceDetailsReq.class)
    public JAXBElement<String> createGetIsapinstanceDetailsReqOpensttokenId(String value) {
        return new JAXBElement<String>(_GetIsapinstanceDetailsReqOpensttokenId_QNAME, String.class, GetIsapinstanceDetailsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "cloudType", scope = GetIsapinstanceDetailsReq.class)
    public JAXBElement<String> createGetIsapinstanceDetailsReqCloudType(String value) {
        return new JAXBElement<String>(_GetIsapLaunchInstanceReqCloudType_QNAME, String.class, GetIsapinstanceDetailsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "opensthost_ip", scope = GetIsapinstanceDetailsReq.class)
    public JAXBElement<String> createGetIsapinstanceDetailsReqOpensthostIp(String value) {
        return new JAXBElement<String>(_GetIsapinstanceDetailsReqOpensthostIp_QNAME, String.class, GetIsapinstanceDetailsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "openstenant_id", scope = GetIsapinstanceDetailsReq.class)
    public JAXBElement<String> createGetIsapinstanceDetailsReqOpenstenantId(String value) {
        return new JAXBElement<String>(_GetIsapinstanceDetailsReqOpenstenantId_QNAME, String.class, GetIsapinstanceDetailsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "opens_inst_id", scope = GetIsapinstanceDetailsReq.class)
    public JAXBElement<String> createGetIsapinstanceDetailsReqOpensInstId(String value) {
        return new JAXBElement<String>(_GetIsapinstanceDetailsReqOpensInstId_QNAME, String.class, GetIsapinstanceDetailsReq.class, value);
    }

}

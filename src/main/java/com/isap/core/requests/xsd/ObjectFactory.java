
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

    private final static QName _GetOpenstackQuotaReqOpesusername_QNAME = new QName("http://requests.core.isap.com/xsd", "opesusername");
    private final static QName _GetOpenstackQuotaReqOpspassword_QNAME = new QName("http://requests.core.isap.com/xsd", "opspassword");
    private final static QName _GetOpenstackQuotaReqIp_QNAME = new QName("http://requests.core.isap.com/xsd", "ip");
    private final static QName _GetOpenstackQuotaReqTokenId_QNAME = new QName("http://requests.core.isap.com/xsd", "token_id");
    private final static QName _GetOpenstackQuotaReqOpstenantname_QNAME = new QName("http://requests.core.isap.com/xsd", "opstenantname");
    private final static QName _GetOpenstackQuotaReqTenantId_QNAME = new QName("http://requests.core.isap.com/xsd", "tenant_id");
    private final static QName _CreateOpenstacktenantReqOpsusername_QNAME = new QName("http://requests.core.isap.com/xsd", "opsusername");
    private final static QName _CreateOpenstacktenantReqTenantName_QNAME = new QName("http://requests.core.isap.com/xsd", "tenant_name");
    private final static QName _GetIsapCloudAuthenticationRequestCloudType_QNAME = new QName("http://requests.core.isap.com/xsd", "cloudType");
    private final static QName _GetIsapCloudAuthenticationRequestOpsUsername_QNAME = new QName("http://requests.core.isap.com/xsd", "opsUsername");
    private final static QName _GetIsapCloudAuthenticationRequestOpsIp_QNAME = new QName("http://requests.core.isap.com/xsd", "opsIp");
    private final static QName _GetIsapCloudAuthenticationRequestAwsUsername_QNAME = new QName("http://requests.core.isap.com/xsd", "awsUsername");
    private final static QName _GetIsapCloudAuthenticationRequestOpsTenantName_QNAME = new QName("http://requests.core.isap.com/xsd", "opsTenantName");
    private final static QName _GetIsapCloudAuthenticationRequestOpsPassword_QNAME = new QName("http://requests.core.isap.com/xsd", "opsPassword");
    private final static QName _GetIsapCloudAuthenticationRequestOpsUserid_QNAME = new QName("http://requests.core.isap.com/xsd", "opsUserid");
    private final static QName _TerminateOpensInstanceReqInstanceId_QNAME = new QName("http://requests.core.isap.com/xsd", "instance_id");
    private final static QName _GetIsapinstanceDetailsReqOpensttokenId_QNAME = new QName("http://requests.core.isap.com/xsd", "opensttoken_id");
    private final static QName _GetIsapinstanceDetailsReqOpensthostIp_QNAME = new QName("http://requests.core.isap.com/xsd", "opensthost_ip");
    private final static QName _GetIsapinstanceDetailsReqOpenstenantId_QNAME = new QName("http://requests.core.isap.com/xsd", "openstenant_id");
    private final static QName _GetIsapinstanceDetailsReqOpensInstId_QNAME = new QName("http://requests.core.isap.com/xsd", "opens_inst_id");
    private final static QName _GetIsapLaunchInstanceReqOpsimageId_QNAME = new QName("http://requests.core.isap.com/xsd", "opsimage_id");
    private final static QName _GetIsapLaunchInstanceReqOpssecGroup_QNAME = new QName("http://requests.core.isap.com/xsd", "opssec_group");
    private final static QName _GetIsapLaunchInstanceReqOpsnetworkId_QNAME = new QName("http://requests.core.isap.com/xsd", "opsnetwork_id");
    private final static QName _GetIsapLaunchInstanceReqOpsazZone_QNAME = new QName("http://requests.core.isap.com/xsd", "opsaz_zone");
    private final static QName _GetIsapLaunchInstanceReqPuppetMasterHostname_QNAME = new QName("http://requests.core.isap.com/xsd", "puppet_Master_Hostname");
    private final static QName _GetIsapLaunchInstanceReqPuppetMasterIP_QNAME = new QName("http://requests.core.isap.com/xsd", "puppet_Master_IP");
    private final static QName _GetIsapLaunchInstanceReqOpshostIp_QNAME = new QName("http://requests.core.isap.com/xsd", "opshostIp");
    private final static QName _GetIsapLaunchInstanceReqOpskeyName_QNAME = new QName("http://requests.core.isap.com/xsd", "opskey_name");
    private final static QName _GetIsapLaunchInstanceReqOpsinstName_QNAME = new QName("http://requests.core.isap.com/xsd", "opsinst_name");
    private final static QName _CreateOpenstackKeypairReqKeypairName_QNAME = new QName("http://requests.core.isap.com/xsd", "keypair_name");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.isap.core.requests.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetOpenstackHypervisorDetailsReq }
     * 
     */
    public GetOpenstackHypervisorDetailsReq createGetOpenstackHypervisorDetailsReq() {
        return new GetOpenstackHypervisorDetailsReq();
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
     * Create an instance of {@link CreateOpenstacktenantReq }
     * 
     */
    public CreateOpenstacktenantReq createCreateOpenstacktenantReq() {
        return new CreateOpenstacktenantReq();
    }

    /**
     * Create an instance of {@link CreateOpenstackKeypairReq }
     * 
     */
    public CreateOpenstackKeypairReq createCreateOpenstackKeypairReq() {
        return new CreateOpenstackKeypairReq();
    }

    /**
     * Create an instance of {@link TerminateOpensInstanceReq }
     * 
     */
    public TerminateOpensInstanceReq createTerminateOpensInstanceReq() {
        return new TerminateOpensInstanceReq();
    }

    /**
     * Create an instance of {@link GetOpenstackQuotaReq }
     * 
     */
    public GetOpenstackQuotaReq createGetOpenstackQuotaReq() {
        return new GetOpenstackQuotaReq();
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
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "opesusername", scope = GetOpenstackQuotaReq.class)
    public JAXBElement<String> createGetOpenstackQuotaReqOpesusername(String value) {
        return new JAXBElement<String>(_GetOpenstackQuotaReqOpesusername_QNAME, String.class, GetOpenstackQuotaReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "opspassword", scope = GetOpenstackQuotaReq.class)
    public JAXBElement<String> createGetOpenstackQuotaReqOpspassword(String value) {
        return new JAXBElement<String>(_GetOpenstackQuotaReqOpspassword_QNAME, String.class, GetOpenstackQuotaReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "ip", scope = GetOpenstackQuotaReq.class)
    public JAXBElement<String> createGetOpenstackQuotaReqIp(String value) {
        return new JAXBElement<String>(_GetOpenstackQuotaReqIp_QNAME, String.class, GetOpenstackQuotaReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "token_id", scope = GetOpenstackQuotaReq.class)
    public JAXBElement<String> createGetOpenstackQuotaReqTokenId(String value) {
        return new JAXBElement<String>(_GetOpenstackQuotaReqTokenId_QNAME, String.class, GetOpenstackQuotaReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "opstenantname", scope = GetOpenstackQuotaReq.class)
    public JAXBElement<String> createGetOpenstackQuotaReqOpstenantname(String value) {
        return new JAXBElement<String>(_GetOpenstackQuotaReqOpstenantname_QNAME, String.class, GetOpenstackQuotaReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "tenant_id", scope = GetOpenstackQuotaReq.class)
    public JAXBElement<String> createGetOpenstackQuotaReqTenantId(String value) {
        return new JAXBElement<String>(_GetOpenstackQuotaReqTenantId_QNAME, String.class, GetOpenstackQuotaReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "opesusername", scope = GetOpenstackHypervisorDetailsReq.class)
    public JAXBElement<String> createGetOpenstackHypervisorDetailsReqOpesusername(String value) {
        return new JAXBElement<String>(_GetOpenstackQuotaReqOpesusername_QNAME, String.class, GetOpenstackHypervisorDetailsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "opspassword", scope = GetOpenstackHypervisorDetailsReq.class)
    public JAXBElement<String> createGetOpenstackHypervisorDetailsReqOpspassword(String value) {
        return new JAXBElement<String>(_GetOpenstackQuotaReqOpspassword_QNAME, String.class, GetOpenstackHypervisorDetailsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "ip", scope = GetOpenstackHypervisorDetailsReq.class)
    public JAXBElement<String> createGetOpenstackHypervisorDetailsReqIp(String value) {
        return new JAXBElement<String>(_GetOpenstackQuotaReqIp_QNAME, String.class, GetOpenstackHypervisorDetailsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "token_id", scope = GetOpenstackHypervisorDetailsReq.class)
    public JAXBElement<String> createGetOpenstackHypervisorDetailsReqTokenId(String value) {
        return new JAXBElement<String>(_GetOpenstackQuotaReqTokenId_QNAME, String.class, GetOpenstackHypervisorDetailsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "opstenantname", scope = GetOpenstackHypervisorDetailsReq.class)
    public JAXBElement<String> createGetOpenstackHypervisorDetailsReqOpstenantname(String value) {
        return new JAXBElement<String>(_GetOpenstackQuotaReqOpstenantname_QNAME, String.class, GetOpenstackHypervisorDetailsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "tenant_id", scope = GetOpenstackHypervisorDetailsReq.class)
    public JAXBElement<String> createGetOpenstackHypervisorDetailsReqTenantId(String value) {
        return new JAXBElement<String>(_GetOpenstackQuotaReqTenantId_QNAME, String.class, GetOpenstackHypervisorDetailsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "opsusername", scope = CreateOpenstacktenantReq.class)
    public JAXBElement<String> createCreateOpenstacktenantReqOpsusername(String value) {
        return new JAXBElement<String>(_CreateOpenstacktenantReqOpsusername_QNAME, String.class, CreateOpenstacktenantReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "opspassword", scope = CreateOpenstacktenantReq.class)
    public JAXBElement<String> createCreateOpenstacktenantReqOpspassword(String value) {
        return new JAXBElement<String>(_GetOpenstackQuotaReqOpspassword_QNAME, String.class, CreateOpenstacktenantReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "ip", scope = CreateOpenstacktenantReq.class)
    public JAXBElement<String> createCreateOpenstacktenantReqIp(String value) {
        return new JAXBElement<String>(_GetOpenstackQuotaReqIp_QNAME, String.class, CreateOpenstacktenantReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "opstenantname", scope = CreateOpenstacktenantReq.class)
    public JAXBElement<String> createCreateOpenstacktenantReqOpstenantname(String value) {
        return new JAXBElement<String>(_GetOpenstackQuotaReqOpstenantname_QNAME, String.class, CreateOpenstacktenantReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "tenant_name", scope = CreateOpenstacktenantReq.class)
    public JAXBElement<String> createCreateOpenstacktenantReqTenantName(String value) {
        return new JAXBElement<String>(_CreateOpenstacktenantReqTenantName_QNAME, String.class, CreateOpenstacktenantReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "cloudType", scope = GetIsapCloudAuthenticationRequest.class)
    public JAXBElement<String> createGetIsapCloudAuthenticationRequestCloudType(String value) {
        return new JAXBElement<String>(_GetIsapCloudAuthenticationRequestCloudType_QNAME, String.class, GetIsapCloudAuthenticationRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "opsUsername", scope = GetIsapCloudAuthenticationRequest.class)
    public JAXBElement<String> createGetIsapCloudAuthenticationRequestOpsUsername(String value) {
        return new JAXBElement<String>(_GetIsapCloudAuthenticationRequestOpsUsername_QNAME, String.class, GetIsapCloudAuthenticationRequest.class, value);
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
        return new JAXBElement<String>(_GetIsapCloudAuthenticationRequestOpsTenantName_QNAME, String.class, GetIsapCloudAuthenticationRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "opsPassword", scope = GetIsapCloudAuthenticationRequest.class)
    public JAXBElement<String> createGetIsapCloudAuthenticationRequestOpsPassword(String value) {
        return new JAXBElement<String>(_GetIsapCloudAuthenticationRequestOpsPassword_QNAME, String.class, GetIsapCloudAuthenticationRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "opsUserid", scope = GetIsapCloudAuthenticationRequest.class)
    public JAXBElement<String> createGetIsapCloudAuthenticationRequestOpsUserid(String value) {
        return new JAXBElement<String>(_GetIsapCloudAuthenticationRequestOpsUserid_QNAME, String.class, GetIsapCloudAuthenticationRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "opesusername", scope = TerminateOpensInstanceReq.class)
    public JAXBElement<String> createTerminateOpensInstanceReqOpesusername(String value) {
        return new JAXBElement<String>(_GetOpenstackQuotaReqOpesusername_QNAME, String.class, TerminateOpensInstanceReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "opspassword", scope = TerminateOpensInstanceReq.class)
    public JAXBElement<String> createTerminateOpensInstanceReqOpspassword(String value) {
        return new JAXBElement<String>(_GetOpenstackQuotaReqOpspassword_QNAME, String.class, TerminateOpensInstanceReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "ip", scope = TerminateOpensInstanceReq.class)
    public JAXBElement<String> createTerminateOpensInstanceReqIp(String value) {
        return new JAXBElement<String>(_GetOpenstackQuotaReqIp_QNAME, String.class, TerminateOpensInstanceReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "instance_id", scope = TerminateOpensInstanceReq.class)
    public JAXBElement<String> createTerminateOpensInstanceReqInstanceId(String value) {
        return new JAXBElement<String>(_TerminateOpensInstanceReqInstanceId_QNAME, String.class, TerminateOpensInstanceReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "token_id", scope = TerminateOpensInstanceReq.class)
    public JAXBElement<String> createTerminateOpensInstanceReqTokenId(String value) {
        return new JAXBElement<String>(_GetOpenstackQuotaReqTokenId_QNAME, String.class, TerminateOpensInstanceReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "opstenantname", scope = TerminateOpensInstanceReq.class)
    public JAXBElement<String> createTerminateOpensInstanceReqOpstenantname(String value) {
        return new JAXBElement<String>(_GetOpenstackQuotaReqOpstenantname_QNAME, String.class, TerminateOpensInstanceReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "tenant_id", scope = TerminateOpensInstanceReq.class)
    public JAXBElement<String> createTerminateOpensInstanceReqTenantId(String value) {
        return new JAXBElement<String>(_GetOpenstackQuotaReqTenantId_QNAME, String.class, TerminateOpensInstanceReq.class, value);
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
        return new JAXBElement<String>(_GetIsapCloudAuthenticationRequestCloudType_QNAME, String.class, GetIsapinstanceDetailsReq.class, value);
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
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "opsnetwork_id", scope = GetIsapLaunchInstanceReq.class)
    public JAXBElement<String> createGetIsapLaunchInstanceReqOpsnetworkId(String value) {
        return new JAXBElement<String>(_GetIsapLaunchInstanceReqOpsnetworkId_QNAME, String.class, GetIsapLaunchInstanceReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "opsPassword", scope = GetIsapLaunchInstanceReq.class)
    public JAXBElement<String> createGetIsapLaunchInstanceReqOpsPassword(String value) {
        return new JAXBElement<String>(_GetIsapCloudAuthenticationRequestOpsPassword_QNAME, String.class, GetIsapLaunchInstanceReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "opsUserid", scope = GetIsapLaunchInstanceReq.class)
    public JAXBElement<String> createGetIsapLaunchInstanceReqOpsUserid(String value) {
        return new JAXBElement<String>(_GetIsapCloudAuthenticationRequestOpsUserid_QNAME, String.class, GetIsapLaunchInstanceReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "cloudType", scope = GetIsapLaunchInstanceReq.class)
    public JAXBElement<String> createGetIsapLaunchInstanceReqCloudType(String value) {
        return new JAXBElement<String>(_GetIsapCloudAuthenticationRequestCloudType_QNAME, String.class, GetIsapLaunchInstanceReq.class, value);
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
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "puppet_Master_Hostname", scope = GetIsapLaunchInstanceReq.class)
    public JAXBElement<String> createGetIsapLaunchInstanceReqPuppetMasterHostname(String value) {
        return new JAXBElement<String>(_GetIsapLaunchInstanceReqPuppetMasterHostname_QNAME, String.class, GetIsapLaunchInstanceReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "opsUsername", scope = GetIsapLaunchInstanceReq.class)
    public JAXBElement<String> createGetIsapLaunchInstanceReqOpsUsername(String value) {
        return new JAXBElement<String>(_GetIsapCloudAuthenticationRequestOpsUsername_QNAME, String.class, GetIsapLaunchInstanceReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "puppet_Master_IP", scope = GetIsapLaunchInstanceReq.class)
    public JAXBElement<String> createGetIsapLaunchInstanceReqPuppetMasterIP(String value) {
        return new JAXBElement<String>(_GetIsapLaunchInstanceReqPuppetMasterIP_QNAME, String.class, GetIsapLaunchInstanceReq.class, value);
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
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "opsTenantName", scope = GetIsapLaunchInstanceReq.class)
    public JAXBElement<String> createGetIsapLaunchInstanceReqOpsTenantName(String value) {
        return new JAXBElement<String>(_GetIsapCloudAuthenticationRequestOpsTenantName_QNAME, String.class, GetIsapLaunchInstanceReq.class, value);
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
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "opsinst_name", scope = GetIsapLaunchInstanceReq.class)
    public JAXBElement<String> createGetIsapLaunchInstanceReqOpsinstName(String value) {
        return new JAXBElement<String>(_GetIsapLaunchInstanceReqOpsinstName_QNAME, String.class, GetIsapLaunchInstanceReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "opesusername", scope = CreateOpenstackKeypairReq.class)
    public JAXBElement<String> createCreateOpenstackKeypairReqOpesusername(String value) {
        return new JAXBElement<String>(_GetOpenstackQuotaReqOpesusername_QNAME, String.class, CreateOpenstackKeypairReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "opspassword", scope = CreateOpenstackKeypairReq.class)
    public JAXBElement<String> createCreateOpenstackKeypairReqOpspassword(String value) {
        return new JAXBElement<String>(_GetOpenstackQuotaReqOpspassword_QNAME, String.class, CreateOpenstackKeypairReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "ip", scope = CreateOpenstackKeypairReq.class)
    public JAXBElement<String> createCreateOpenstackKeypairReqIp(String value) {
        return new JAXBElement<String>(_GetOpenstackQuotaReqIp_QNAME, String.class, CreateOpenstackKeypairReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "keypair_name", scope = CreateOpenstackKeypairReq.class)
    public JAXBElement<String> createCreateOpenstackKeypairReqKeypairName(String value) {
        return new JAXBElement<String>(_CreateOpenstackKeypairReqKeypairName_QNAME, String.class, CreateOpenstackKeypairReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "token_id", scope = CreateOpenstackKeypairReq.class)
    public JAXBElement<String> createCreateOpenstackKeypairReqTokenId(String value) {
        return new JAXBElement<String>(_GetOpenstackQuotaReqTokenId_QNAME, String.class, CreateOpenstackKeypairReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "opstenantname", scope = CreateOpenstackKeypairReq.class)
    public JAXBElement<String> createCreateOpenstackKeypairReqOpstenantname(String value) {
        return new JAXBElement<String>(_GetOpenstackQuotaReqOpstenantname_QNAME, String.class, CreateOpenstackKeypairReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.core.isap.com/xsd", name = "tenant_id", scope = CreateOpenstackKeypairReq.class)
    public JAXBElement<String> createCreateOpenstackKeypairReqTenantId(String value) {
        return new JAXBElement<String>(_GetOpenstackQuotaReqTenantId_QNAME, String.class, CreateOpenstackKeypairReq.class, value);
    }

}

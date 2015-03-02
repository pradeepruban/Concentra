
package com.isap.cloudmanager.requests.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.isap.cloudmanager.requests.xsd package. 
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

    private final static QName _AddOpenstackFloatingIpReqTokenId_QNAME = new QName("http://requests.cloudmanager.isap.com/xsd", "token_id");
    private final static QName _AddOpenstackFloatingIpReqOpsusername_QNAME = new QName("http://requests.cloudmanager.isap.com/xsd", "opsusername");
    private final static QName _AddOpenstackFloatingIpReqOpspassword_QNAME = new QName("http://requests.cloudmanager.isap.com/xsd", "opspassword");
    private final static QName _AddOpenstackFloatingIpReqIp_QNAME = new QName("http://requests.cloudmanager.isap.com/xsd", "ip");
    private final static QName _AddOpenstackFloatingIpReqTenantId_QNAME = new QName("http://requests.cloudmanager.isap.com/xsd", "tenant_id");
    private final static QName _AddOpenstackFloatingIpReqFloatingIpAdd_QNAME = new QName("http://requests.cloudmanager.isap.com/xsd", "floatingIpAdd");
    private final static QName _AddOpenstackFloatingIpReqServerId_QNAME = new QName("http://requests.cloudmanager.isap.com/xsd", "serverId");
    private final static QName _AddOpenstackFloatingIpReqOpstenantname_QNAME = new QName("http://requests.cloudmanager.isap.com/xsd", "opstenantname");
    private final static QName _AddOpenstackFloatingIpReqPool_QNAME = new QName("http://requests.cloudmanager.isap.com/xsd", "pool");
    private final static QName _ListOpenstackImagesReqOpesusername_QNAME = new QName("http://requests.cloudmanager.isap.com/xsd", "opesusername");
    private final static QName _GetOpenstackImageDetailsReqImageid_QNAME = new QName("http://requests.cloudmanager.isap.com/xsd", "imageid");
    private final static QName _GetOpenstackSecurityGroupDetailsReqSecGpId_QNAME = new QName("http://requests.cloudmanager.isap.com/xsd", "sec_gp_id");
    private final static QName _GetOpenstackFlavorDetailsReqFlavorId_QNAME = new QName("http://requests.cloudmanager.isap.com/xsd", "flavor_id");
    private final static QName _RemoveOpenstackFloatingIpReqInstId_QNAME = new QName("http://requests.cloudmanager.isap.com/xsd", "inst_id");
    private final static QName _RemoveOpenstackFloatingIpReqOpsUsername_QNAME = new QName("http://requests.cloudmanager.isap.com/xsd", "ops_username");
    private final static QName _RemoveOpenstackFloatingIpReqOpsIp_QNAME = new QName("http://requests.cloudmanager.isap.com/xsd", "ops_ip");
    private final static QName _RemoveOpenstackFloatingIpReqOpsTenantName_QNAME = new QName("http://requests.cloudmanager.isap.com/xsd", "ops_tenant_name");
    private final static QName _RemoveOpenstackFloatingIpReqOpsPassword_QNAME = new QName("http://requests.cloudmanager.isap.com/xsd", "ops_password");
    private final static QName _DeallocateOpenstackFloatingIpReqId_QNAME = new QName("http://requests.cloudmanager.isap.com/xsd", "id");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.isap.cloudmanager.requests.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddOpenstackFloatingIpReq }
     * 
     */
    public AddOpenstackFloatingIpReq createAddOpenstackFloatingIpReq() {
        return new AddOpenstackFloatingIpReq();
    }

    /**
     * Create an instance of {@link ListOpenstackKeypairsReq }
     * 
     */
    public ListOpenstackKeypairsReq createListOpenstackKeypairsReq() {
        return new ListOpenstackKeypairsReq();
    }

    /**
     * Create an instance of {@link OpenstackBasicReq }
     * 
     */
    public OpenstackBasicReq createOpenstackBasicReq() {
        return new OpenstackBasicReq();
    }

    /**
     * Create an instance of {@link ListOpenstackImagesReq }
     * 
     */
    public ListOpenstackImagesReq createListOpenstackImagesReq() {
        return new ListOpenstackImagesReq();
    }

    /**
     * Create an instance of {@link RemoveOpenstackFloatingIpReq }
     * 
     */
    public RemoveOpenstackFloatingIpReq createRemoveOpenstackFloatingIpReq() {
        return new RemoveOpenstackFloatingIpReq();
    }

    /**
     * Create an instance of {@link ListOpenstackFlavorsReq }
     * 
     */
    public ListOpenstackFlavorsReq createListOpenstackFlavorsReq() {
        return new ListOpenstackFlavorsReq();
    }

    /**
     * Create an instance of {@link ListOpenstackSecurityGroupsReq }
     * 
     */
    public ListOpenstackSecurityGroupsReq createListOpenstackSecurityGroupsReq() {
        return new ListOpenstackSecurityGroupsReq();
    }

    /**
     * Create an instance of {@link GetOpenstackFlavorDetailsReq }
     * 
     */
    public GetOpenstackFlavorDetailsReq createGetOpenstackFlavorDetailsReq() {
        return new GetOpenstackFlavorDetailsReq();
    }

    /**
     * Create an instance of {@link ListOpenstackNetworksReq }
     * 
     */
    public ListOpenstackNetworksReq createListOpenstackNetworksReq() {
        return new ListOpenstackNetworksReq();
    }

    /**
     * Create an instance of {@link FreeFloatingIPsReq }
     * 
     */
    public FreeFloatingIPsReq createFreeFloatingIPsReq() {
        return new FreeFloatingIPsReq();
    }

    /**
     * Create an instance of {@link DeallocateOpenstackFloatingIpReq }
     * 
     */
    public DeallocateOpenstackFloatingIpReq createDeallocateOpenstackFloatingIpReq() {
        return new DeallocateOpenstackFloatingIpReq();
    }

    /**
     * Create an instance of {@link GetOpenstackImageDetailsReq }
     * 
     */
    public GetOpenstackImageDetailsReq createGetOpenstackImageDetailsReq() {
        return new GetOpenstackImageDetailsReq();
    }

    /**
     * Create an instance of {@link GetOpenstackSecurityGroupDetailsReq }
     * 
     */
    public GetOpenstackSecurityGroupDetailsReq createGetOpenstackSecurityGroupDetailsReq() {
        return new GetOpenstackSecurityGroupDetailsReq();
    }

    /**
     * Create an instance of {@link AllocateOpenstackFloatingIpReq }
     * 
     */
    public AllocateOpenstackFloatingIpReq createAllocateOpenstackFloatingIpReq() {
        return new AllocateOpenstackFloatingIpReq();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "token_id", scope = AddOpenstackFloatingIpReq.class)
    public JAXBElement<String> createAddOpenstackFloatingIpReqTokenId(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqTokenId_QNAME, String.class, AddOpenstackFloatingIpReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opsusername", scope = AddOpenstackFloatingIpReq.class)
    public JAXBElement<String> createAddOpenstackFloatingIpReqOpsusername(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqOpsusername_QNAME, String.class, AddOpenstackFloatingIpReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opspassword", scope = AddOpenstackFloatingIpReq.class)
    public JAXBElement<String> createAddOpenstackFloatingIpReqOpspassword(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqOpspassword_QNAME, String.class, AddOpenstackFloatingIpReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "ip", scope = AddOpenstackFloatingIpReq.class)
    public JAXBElement<String> createAddOpenstackFloatingIpReqIp(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqIp_QNAME, String.class, AddOpenstackFloatingIpReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "tenant_id", scope = AddOpenstackFloatingIpReq.class)
    public JAXBElement<String> createAddOpenstackFloatingIpReqTenantId(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqTenantId_QNAME, String.class, AddOpenstackFloatingIpReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "floatingIpAdd", scope = AddOpenstackFloatingIpReq.class)
    public JAXBElement<String> createAddOpenstackFloatingIpReqFloatingIpAdd(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqFloatingIpAdd_QNAME, String.class, AddOpenstackFloatingIpReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "serverId", scope = AddOpenstackFloatingIpReq.class)
    public JAXBElement<String> createAddOpenstackFloatingIpReqServerId(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqServerId_QNAME, String.class, AddOpenstackFloatingIpReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opstenantname", scope = AddOpenstackFloatingIpReq.class)
    public JAXBElement<String> createAddOpenstackFloatingIpReqOpstenantname(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqOpstenantname_QNAME, String.class, AddOpenstackFloatingIpReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "pool", scope = AddOpenstackFloatingIpReq.class)
    public JAXBElement<String> createAddOpenstackFloatingIpReqPool(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqPool_QNAME, String.class, AddOpenstackFloatingIpReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "token_id", scope = ListOpenstackImagesReq.class)
    public JAXBElement<String> createListOpenstackImagesReqTokenId(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqTokenId_QNAME, String.class, ListOpenstackImagesReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opspassword", scope = ListOpenstackImagesReq.class)
    public JAXBElement<String> createListOpenstackImagesReqOpspassword(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqOpspassword_QNAME, String.class, ListOpenstackImagesReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "ip", scope = ListOpenstackImagesReq.class)
    public JAXBElement<String> createListOpenstackImagesReqIp(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqIp_QNAME, String.class, ListOpenstackImagesReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "tenant_id", scope = ListOpenstackImagesReq.class)
    public JAXBElement<String> createListOpenstackImagesReqTenantId(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqTenantId_QNAME, String.class, ListOpenstackImagesReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opstenantname", scope = ListOpenstackImagesReq.class)
    public JAXBElement<String> createListOpenstackImagesReqOpstenantname(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqOpstenantname_QNAME, String.class, ListOpenstackImagesReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opesusername", scope = ListOpenstackImagesReq.class)
    public JAXBElement<String> createListOpenstackImagesReqOpesusername(String value) {
        return new JAXBElement<String>(_ListOpenstackImagesReqOpesusername_QNAME, String.class, ListOpenstackImagesReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "token_id", scope = ListOpenstackNetworksReq.class)
    public JAXBElement<String> createListOpenstackNetworksReqTokenId(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqTokenId_QNAME, String.class, ListOpenstackNetworksReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opspassword", scope = ListOpenstackNetworksReq.class)
    public JAXBElement<String> createListOpenstackNetworksReqOpspassword(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqOpspassword_QNAME, String.class, ListOpenstackNetworksReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "ip", scope = ListOpenstackNetworksReq.class)
    public JAXBElement<String> createListOpenstackNetworksReqIp(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqIp_QNAME, String.class, ListOpenstackNetworksReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "tenant_id", scope = ListOpenstackNetworksReq.class)
    public JAXBElement<String> createListOpenstackNetworksReqTenantId(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqTenantId_QNAME, String.class, ListOpenstackNetworksReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opstenantname", scope = ListOpenstackNetworksReq.class)
    public JAXBElement<String> createListOpenstackNetworksReqOpstenantname(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqOpstenantname_QNAME, String.class, ListOpenstackNetworksReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opesusername", scope = ListOpenstackNetworksReq.class)
    public JAXBElement<String> createListOpenstackNetworksReqOpesusername(String value) {
        return new JAXBElement<String>(_ListOpenstackImagesReqOpesusername_QNAME, String.class, ListOpenstackNetworksReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "token_id", scope = AllocateOpenstackFloatingIpReq.class)
    public JAXBElement<String> createAllocateOpenstackFloatingIpReqTokenId(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqTokenId_QNAME, String.class, AllocateOpenstackFloatingIpReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opsusername", scope = AllocateOpenstackFloatingIpReq.class)
    public JAXBElement<String> createAllocateOpenstackFloatingIpReqOpsusername(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqOpsusername_QNAME, String.class, AllocateOpenstackFloatingIpReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opspassword", scope = AllocateOpenstackFloatingIpReq.class)
    public JAXBElement<String> createAllocateOpenstackFloatingIpReqOpspassword(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqOpspassword_QNAME, String.class, AllocateOpenstackFloatingIpReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "ip", scope = AllocateOpenstackFloatingIpReq.class)
    public JAXBElement<String> createAllocateOpenstackFloatingIpReqIp(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqIp_QNAME, String.class, AllocateOpenstackFloatingIpReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "tenant_id", scope = AllocateOpenstackFloatingIpReq.class)
    public JAXBElement<String> createAllocateOpenstackFloatingIpReqTenantId(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqTenantId_QNAME, String.class, AllocateOpenstackFloatingIpReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opstenantname", scope = AllocateOpenstackFloatingIpReq.class)
    public JAXBElement<String> createAllocateOpenstackFloatingIpReqOpstenantname(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqOpstenantname_QNAME, String.class, AllocateOpenstackFloatingIpReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "pool", scope = AllocateOpenstackFloatingIpReq.class)
    public JAXBElement<String> createAllocateOpenstackFloatingIpReqPool(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqPool_QNAME, String.class, AllocateOpenstackFloatingIpReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "token_id", scope = GetOpenstackImageDetailsReq.class)
    public JAXBElement<String> createGetOpenstackImageDetailsReqTokenId(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqTokenId_QNAME, String.class, GetOpenstackImageDetailsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "imageid", scope = GetOpenstackImageDetailsReq.class)
    public JAXBElement<String> createGetOpenstackImageDetailsReqImageid(String value) {
        return new JAXBElement<String>(_GetOpenstackImageDetailsReqImageid_QNAME, String.class, GetOpenstackImageDetailsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opspassword", scope = GetOpenstackImageDetailsReq.class)
    public JAXBElement<String> createGetOpenstackImageDetailsReqOpspassword(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqOpspassword_QNAME, String.class, GetOpenstackImageDetailsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "ip", scope = GetOpenstackImageDetailsReq.class)
    public JAXBElement<String> createGetOpenstackImageDetailsReqIp(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqIp_QNAME, String.class, GetOpenstackImageDetailsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "tenant_id", scope = GetOpenstackImageDetailsReq.class)
    public JAXBElement<String> createGetOpenstackImageDetailsReqTenantId(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqTenantId_QNAME, String.class, GetOpenstackImageDetailsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opstenantname", scope = GetOpenstackImageDetailsReq.class)
    public JAXBElement<String> createGetOpenstackImageDetailsReqOpstenantname(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqOpstenantname_QNAME, String.class, GetOpenstackImageDetailsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opesusername", scope = GetOpenstackImageDetailsReq.class)
    public JAXBElement<String> createGetOpenstackImageDetailsReqOpesusername(String value) {
        return new JAXBElement<String>(_ListOpenstackImagesReqOpesusername_QNAME, String.class, GetOpenstackImageDetailsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "token_id", scope = ListOpenstackSecurityGroupsReq.class)
    public JAXBElement<String> createListOpenstackSecurityGroupsReqTokenId(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqTokenId_QNAME, String.class, ListOpenstackSecurityGroupsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opspassword", scope = ListOpenstackSecurityGroupsReq.class)
    public JAXBElement<String> createListOpenstackSecurityGroupsReqOpspassword(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqOpspassword_QNAME, String.class, ListOpenstackSecurityGroupsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "ip", scope = ListOpenstackSecurityGroupsReq.class)
    public JAXBElement<String> createListOpenstackSecurityGroupsReqIp(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqIp_QNAME, String.class, ListOpenstackSecurityGroupsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "tenant_id", scope = ListOpenstackSecurityGroupsReq.class)
    public JAXBElement<String> createListOpenstackSecurityGroupsReqTenantId(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqTenantId_QNAME, String.class, ListOpenstackSecurityGroupsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opstenantname", scope = ListOpenstackSecurityGroupsReq.class)
    public JAXBElement<String> createListOpenstackSecurityGroupsReqOpstenantname(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqOpstenantname_QNAME, String.class, ListOpenstackSecurityGroupsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opesusername", scope = ListOpenstackSecurityGroupsReq.class)
    public JAXBElement<String> createListOpenstackSecurityGroupsReqOpesusername(String value) {
        return new JAXBElement<String>(_ListOpenstackImagesReqOpesusername_QNAME, String.class, ListOpenstackSecurityGroupsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "token_id", scope = GetOpenstackSecurityGroupDetailsReq.class)
    public JAXBElement<String> createGetOpenstackSecurityGroupDetailsReqTokenId(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqTokenId_QNAME, String.class, GetOpenstackSecurityGroupDetailsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "sec_gp_id", scope = GetOpenstackSecurityGroupDetailsReq.class)
    public JAXBElement<String> createGetOpenstackSecurityGroupDetailsReqSecGpId(String value) {
        return new JAXBElement<String>(_GetOpenstackSecurityGroupDetailsReqSecGpId_QNAME, String.class, GetOpenstackSecurityGroupDetailsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opspassword", scope = GetOpenstackSecurityGroupDetailsReq.class)
    public JAXBElement<String> createGetOpenstackSecurityGroupDetailsReqOpspassword(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqOpspassword_QNAME, String.class, GetOpenstackSecurityGroupDetailsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "ip", scope = GetOpenstackSecurityGroupDetailsReq.class)
    public JAXBElement<String> createGetOpenstackSecurityGroupDetailsReqIp(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqIp_QNAME, String.class, GetOpenstackSecurityGroupDetailsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "tenant_id", scope = GetOpenstackSecurityGroupDetailsReq.class)
    public JAXBElement<String> createGetOpenstackSecurityGroupDetailsReqTenantId(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqTenantId_QNAME, String.class, GetOpenstackSecurityGroupDetailsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opstenantname", scope = GetOpenstackSecurityGroupDetailsReq.class)
    public JAXBElement<String> createGetOpenstackSecurityGroupDetailsReqOpstenantname(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqOpstenantname_QNAME, String.class, GetOpenstackSecurityGroupDetailsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opesusername", scope = GetOpenstackSecurityGroupDetailsReq.class)
    public JAXBElement<String> createGetOpenstackSecurityGroupDetailsReqOpesusername(String value) {
        return new JAXBElement<String>(_ListOpenstackImagesReqOpesusername_QNAME, String.class, GetOpenstackSecurityGroupDetailsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "token_id", scope = ListOpenstackFlavorsReq.class)
    public JAXBElement<String> createListOpenstackFlavorsReqTokenId(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqTokenId_QNAME, String.class, ListOpenstackFlavorsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opspassword", scope = ListOpenstackFlavorsReq.class)
    public JAXBElement<String> createListOpenstackFlavorsReqOpspassword(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqOpspassword_QNAME, String.class, ListOpenstackFlavorsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "ip", scope = ListOpenstackFlavorsReq.class)
    public JAXBElement<String> createListOpenstackFlavorsReqIp(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqIp_QNAME, String.class, ListOpenstackFlavorsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "tenant_id", scope = ListOpenstackFlavorsReq.class)
    public JAXBElement<String> createListOpenstackFlavorsReqTenantId(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqTenantId_QNAME, String.class, ListOpenstackFlavorsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opstenantname", scope = ListOpenstackFlavorsReq.class)
    public JAXBElement<String> createListOpenstackFlavorsReqOpstenantname(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqOpstenantname_QNAME, String.class, ListOpenstackFlavorsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opesusername", scope = ListOpenstackFlavorsReq.class)
    public JAXBElement<String> createListOpenstackFlavorsReqOpesusername(String value) {
        return new JAXBElement<String>(_ListOpenstackImagesReqOpesusername_QNAME, String.class, ListOpenstackFlavorsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "token_id", scope = FreeFloatingIPsReq.class)
    public JAXBElement<String> createFreeFloatingIPsReqTokenId(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqTokenId_QNAME, String.class, FreeFloatingIPsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "ip", scope = FreeFloatingIPsReq.class)
    public JAXBElement<String> createFreeFloatingIPsReqIp(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqIp_QNAME, String.class, FreeFloatingIPsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "tenant_id", scope = FreeFloatingIPsReq.class)
    public JAXBElement<String> createFreeFloatingIPsReqTenantId(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqTenantId_QNAME, String.class, FreeFloatingIPsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "token_id", scope = GetOpenstackFlavorDetailsReq.class)
    public JAXBElement<String> createGetOpenstackFlavorDetailsReqTokenId(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqTokenId_QNAME, String.class, GetOpenstackFlavorDetailsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opspassword", scope = GetOpenstackFlavorDetailsReq.class)
    public JAXBElement<String> createGetOpenstackFlavorDetailsReqOpspassword(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqOpspassword_QNAME, String.class, GetOpenstackFlavorDetailsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "ip", scope = GetOpenstackFlavorDetailsReq.class)
    public JAXBElement<String> createGetOpenstackFlavorDetailsReqIp(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqIp_QNAME, String.class, GetOpenstackFlavorDetailsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "tenant_id", scope = GetOpenstackFlavorDetailsReq.class)
    public JAXBElement<String> createGetOpenstackFlavorDetailsReqTenantId(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqTenantId_QNAME, String.class, GetOpenstackFlavorDetailsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opstenantname", scope = GetOpenstackFlavorDetailsReq.class)
    public JAXBElement<String> createGetOpenstackFlavorDetailsReqOpstenantname(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqOpstenantname_QNAME, String.class, GetOpenstackFlavorDetailsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opesusername", scope = GetOpenstackFlavorDetailsReq.class)
    public JAXBElement<String> createGetOpenstackFlavorDetailsReqOpesusername(String value) {
        return new JAXBElement<String>(_ListOpenstackImagesReqOpesusername_QNAME, String.class, GetOpenstackFlavorDetailsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "flavor_id", scope = GetOpenstackFlavorDetailsReq.class)
    public JAXBElement<String> createGetOpenstackFlavorDetailsReqFlavorId(String value) {
        return new JAXBElement<String>(_GetOpenstackFlavorDetailsReqFlavorId_QNAME, String.class, GetOpenstackFlavorDetailsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "token_id", scope = ListOpenstackKeypairsReq.class)
    public JAXBElement<String> createListOpenstackKeypairsReqTokenId(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqTokenId_QNAME, String.class, ListOpenstackKeypairsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opspassword", scope = ListOpenstackKeypairsReq.class)
    public JAXBElement<String> createListOpenstackKeypairsReqOpspassword(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqOpspassword_QNAME, String.class, ListOpenstackKeypairsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "ip", scope = ListOpenstackKeypairsReq.class)
    public JAXBElement<String> createListOpenstackKeypairsReqIp(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqIp_QNAME, String.class, ListOpenstackKeypairsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "tenant_id", scope = ListOpenstackKeypairsReq.class)
    public JAXBElement<String> createListOpenstackKeypairsReqTenantId(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqTenantId_QNAME, String.class, ListOpenstackKeypairsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opstenantname", scope = ListOpenstackKeypairsReq.class)
    public JAXBElement<String> createListOpenstackKeypairsReqOpstenantname(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqOpstenantname_QNAME, String.class, ListOpenstackKeypairsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opesusername", scope = ListOpenstackKeypairsReq.class)
    public JAXBElement<String> createListOpenstackKeypairsReqOpesusername(String value) {
        return new JAXBElement<String>(_ListOpenstackImagesReqOpesusername_QNAME, String.class, ListOpenstackKeypairsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "inst_id", scope = RemoveOpenstackFloatingIpReq.class)
    public JAXBElement<String> createRemoveOpenstackFloatingIpReqInstId(String value) {
        return new JAXBElement<String>(_RemoveOpenstackFloatingIpReqInstId_QNAME, String.class, RemoveOpenstackFloatingIpReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "ops_username", scope = RemoveOpenstackFloatingIpReq.class)
    public JAXBElement<String> createRemoveOpenstackFloatingIpReqOpsUsername(String value) {
        return new JAXBElement<String>(_RemoveOpenstackFloatingIpReqOpsUsername_QNAME, String.class, RemoveOpenstackFloatingIpReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "ops_ip", scope = RemoveOpenstackFloatingIpReq.class)
    public JAXBElement<String> createRemoveOpenstackFloatingIpReqOpsIp(String value) {
        return new JAXBElement<String>(_RemoveOpenstackFloatingIpReqOpsIp_QNAME, String.class, RemoveOpenstackFloatingIpReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "ops_tenant_name", scope = RemoveOpenstackFloatingIpReq.class)
    public JAXBElement<String> createRemoveOpenstackFloatingIpReqOpsTenantName(String value) {
        return new JAXBElement<String>(_RemoveOpenstackFloatingIpReqOpsTenantName_QNAME, String.class, RemoveOpenstackFloatingIpReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "ops_password", scope = RemoveOpenstackFloatingIpReq.class)
    public JAXBElement<String> createRemoveOpenstackFloatingIpReqOpsPassword(String value) {
        return new JAXBElement<String>(_RemoveOpenstackFloatingIpReqOpsPassword_QNAME, String.class, RemoveOpenstackFloatingIpReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "token_id", scope = DeallocateOpenstackFloatingIpReq.class)
    public JAXBElement<String> createDeallocateOpenstackFloatingIpReqTokenId(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqTokenId_QNAME, String.class, DeallocateOpenstackFloatingIpReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opsusername", scope = DeallocateOpenstackFloatingIpReq.class)
    public JAXBElement<String> createDeallocateOpenstackFloatingIpReqOpsusername(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqOpsusername_QNAME, String.class, DeallocateOpenstackFloatingIpReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opspassword", scope = DeallocateOpenstackFloatingIpReq.class)
    public JAXBElement<String> createDeallocateOpenstackFloatingIpReqOpspassword(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqOpspassword_QNAME, String.class, DeallocateOpenstackFloatingIpReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "ip", scope = DeallocateOpenstackFloatingIpReq.class)
    public JAXBElement<String> createDeallocateOpenstackFloatingIpReqIp(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqIp_QNAME, String.class, DeallocateOpenstackFloatingIpReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "tenant_id", scope = DeallocateOpenstackFloatingIpReq.class)
    public JAXBElement<String> createDeallocateOpenstackFloatingIpReqTenantId(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqTenantId_QNAME, String.class, DeallocateOpenstackFloatingIpReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opstenantname", scope = DeallocateOpenstackFloatingIpReq.class)
    public JAXBElement<String> createDeallocateOpenstackFloatingIpReqOpstenantname(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqOpstenantname_QNAME, String.class, DeallocateOpenstackFloatingIpReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "id", scope = DeallocateOpenstackFloatingIpReq.class)
    public JAXBElement<String> createDeallocateOpenstackFloatingIpReqId(String value) {
        return new JAXBElement<String>(_DeallocateOpenstackFloatingIpReqId_QNAME, String.class, DeallocateOpenstackFloatingIpReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "token_id", scope = OpenstackBasicReq.class)
    public JAXBElement<String> createOpenstackBasicReqTokenId(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqTokenId_QNAME, String.class, OpenstackBasicReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opsusername", scope = OpenstackBasicReq.class)
    public JAXBElement<String> createOpenstackBasicReqOpsusername(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqOpsusername_QNAME, String.class, OpenstackBasicReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opspassword", scope = OpenstackBasicReq.class)
    public JAXBElement<String> createOpenstackBasicReqOpspassword(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqOpspassword_QNAME, String.class, OpenstackBasicReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "ip", scope = OpenstackBasicReq.class)
    public JAXBElement<String> createOpenstackBasicReqIp(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqIp_QNAME, String.class, OpenstackBasicReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "tenant_id", scope = OpenstackBasicReq.class)
    public JAXBElement<String> createOpenstackBasicReqTenantId(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqTenantId_QNAME, String.class, OpenstackBasicReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opstenantname", scope = OpenstackBasicReq.class)
    public JAXBElement<String> createOpenstackBasicReqOpstenantname(String value) {
        return new JAXBElement<String>(_AddOpenstackFloatingIpReqOpstenantname_QNAME, String.class, OpenstackBasicReq.class, value);
    }

}

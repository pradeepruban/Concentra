
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

    private final static QName _ListOpenstackNetworksReqTokenId_QNAME = new QName("http://requests.cloudmanager.isap.com/xsd", "token_id");
    private final static QName _ListOpenstackNetworksReqOpspassword_QNAME = new QName("http://requests.cloudmanager.isap.com/xsd", "opspassword");
    private final static QName _ListOpenstackNetworksReqIp_QNAME = new QName("http://requests.cloudmanager.isap.com/xsd", "ip");
    private final static QName _ListOpenstackNetworksReqTenantId_QNAME = new QName("http://requests.cloudmanager.isap.com/xsd", "tenant_id");
    private final static QName _ListOpenstackNetworksReqOpstenantname_QNAME = new QName("http://requests.cloudmanager.isap.com/xsd", "opstenantname");
    private final static QName _ListOpenstackNetworksReqOpesusername_QNAME = new QName("http://requests.cloudmanager.isap.com/xsd", "opesusername");
    private final static QName _GetOpenstackSecurityGroupDetailsReqSecGpId_QNAME = new QName("http://requests.cloudmanager.isap.com/xsd", "sec_gp_id");
    private final static QName _GetOpenstackFlavorDetailsReqFlavorId_QNAME = new QName("http://requests.cloudmanager.isap.com/xsd", "flavor_id");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.isap.cloudmanager.requests.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListOpenstackImagesReq }
     * 
     */
    public ListOpenstackImagesReq createListOpenstackImagesReq() {
        return new ListOpenstackImagesReq();
    }

    /**
     * Create an instance of {@link ListOpenstackKeypairsReq }
     * 
     */
    public ListOpenstackKeypairsReq createListOpenstackKeypairsReq() {
        return new ListOpenstackKeypairsReq();
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
     * Create an instance of {@link GetOpenstackSecurityGroupDetailsReq }
     * 
     */
    public GetOpenstackSecurityGroupDetailsReq createGetOpenstackSecurityGroupDetailsReq() {
        return new GetOpenstackSecurityGroupDetailsReq();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "token_id", scope = ListOpenstackNetworksReq.class)
    public JAXBElement<String> createListOpenstackNetworksReqTokenId(String value) {
        return new JAXBElement<String>(_ListOpenstackNetworksReqTokenId_QNAME, String.class, ListOpenstackNetworksReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opspassword", scope = ListOpenstackNetworksReq.class)
    public JAXBElement<String> createListOpenstackNetworksReqOpspassword(String value) {
        return new JAXBElement<String>(_ListOpenstackNetworksReqOpspassword_QNAME, String.class, ListOpenstackNetworksReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "ip", scope = ListOpenstackNetworksReq.class)
    public JAXBElement<String> createListOpenstackNetworksReqIp(String value) {
        return new JAXBElement<String>(_ListOpenstackNetworksReqIp_QNAME, String.class, ListOpenstackNetworksReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "tenant_id", scope = ListOpenstackNetworksReq.class)
    public JAXBElement<String> createListOpenstackNetworksReqTenantId(String value) {
        return new JAXBElement<String>(_ListOpenstackNetworksReqTenantId_QNAME, String.class, ListOpenstackNetworksReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opstenantname", scope = ListOpenstackNetworksReq.class)
    public JAXBElement<String> createListOpenstackNetworksReqOpstenantname(String value) {
        return new JAXBElement<String>(_ListOpenstackNetworksReqOpstenantname_QNAME, String.class, ListOpenstackNetworksReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opesusername", scope = ListOpenstackNetworksReq.class)
    public JAXBElement<String> createListOpenstackNetworksReqOpesusername(String value) {
        return new JAXBElement<String>(_ListOpenstackNetworksReqOpesusername_QNAME, String.class, ListOpenstackNetworksReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "token_id", scope = ListOpenstackFlavorsReq.class)
    public JAXBElement<String> createListOpenstackFlavorsReqTokenId(String value) {
        return new JAXBElement<String>(_ListOpenstackNetworksReqTokenId_QNAME, String.class, ListOpenstackFlavorsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opspassword", scope = ListOpenstackFlavorsReq.class)
    public JAXBElement<String> createListOpenstackFlavorsReqOpspassword(String value) {
        return new JAXBElement<String>(_ListOpenstackNetworksReqOpspassword_QNAME, String.class, ListOpenstackFlavorsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "ip", scope = ListOpenstackFlavorsReq.class)
    public JAXBElement<String> createListOpenstackFlavorsReqIp(String value) {
        return new JAXBElement<String>(_ListOpenstackNetworksReqIp_QNAME, String.class, ListOpenstackFlavorsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "tenant_id", scope = ListOpenstackFlavorsReq.class)
    public JAXBElement<String> createListOpenstackFlavorsReqTenantId(String value) {
        return new JAXBElement<String>(_ListOpenstackNetworksReqTenantId_QNAME, String.class, ListOpenstackFlavorsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opstenantname", scope = ListOpenstackFlavorsReq.class)
    public JAXBElement<String> createListOpenstackFlavorsReqOpstenantname(String value) {
        return new JAXBElement<String>(_ListOpenstackNetworksReqOpstenantname_QNAME, String.class, ListOpenstackFlavorsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opesusername", scope = ListOpenstackFlavorsReq.class)
    public JAXBElement<String> createListOpenstackFlavorsReqOpesusername(String value) {
        return new JAXBElement<String>(_ListOpenstackNetworksReqOpesusername_QNAME, String.class, ListOpenstackFlavorsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "token_id", scope = ListOpenstackImagesReq.class)
    public JAXBElement<String> createListOpenstackImagesReqTokenId(String value) {
        return new JAXBElement<String>(_ListOpenstackNetworksReqTokenId_QNAME, String.class, ListOpenstackImagesReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opspassword", scope = ListOpenstackImagesReq.class)
    public JAXBElement<String> createListOpenstackImagesReqOpspassword(String value) {
        return new JAXBElement<String>(_ListOpenstackNetworksReqOpspassword_QNAME, String.class, ListOpenstackImagesReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "ip", scope = ListOpenstackImagesReq.class)
    public JAXBElement<String> createListOpenstackImagesReqIp(String value) {
        return new JAXBElement<String>(_ListOpenstackNetworksReqIp_QNAME, String.class, ListOpenstackImagesReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "tenant_id", scope = ListOpenstackImagesReq.class)
    public JAXBElement<String> createListOpenstackImagesReqTenantId(String value) {
        return new JAXBElement<String>(_ListOpenstackNetworksReqTenantId_QNAME, String.class, ListOpenstackImagesReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opstenantname", scope = ListOpenstackImagesReq.class)
    public JAXBElement<String> createListOpenstackImagesReqOpstenantname(String value) {
        return new JAXBElement<String>(_ListOpenstackNetworksReqOpstenantname_QNAME, String.class, ListOpenstackImagesReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opesusername", scope = ListOpenstackImagesReq.class)
    public JAXBElement<String> createListOpenstackImagesReqOpesusername(String value) {
        return new JAXBElement<String>(_ListOpenstackNetworksReqOpesusername_QNAME, String.class, ListOpenstackImagesReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "token_id", scope = GetOpenstackSecurityGroupDetailsReq.class)
    public JAXBElement<String> createGetOpenstackSecurityGroupDetailsReqTokenId(String value) {
        return new JAXBElement<String>(_ListOpenstackNetworksReqTokenId_QNAME, String.class, GetOpenstackSecurityGroupDetailsReq.class, value);
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
        return new JAXBElement<String>(_ListOpenstackNetworksReqOpspassword_QNAME, String.class, GetOpenstackSecurityGroupDetailsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "ip", scope = GetOpenstackSecurityGroupDetailsReq.class)
    public JAXBElement<String> createGetOpenstackSecurityGroupDetailsReqIp(String value) {
        return new JAXBElement<String>(_ListOpenstackNetworksReqIp_QNAME, String.class, GetOpenstackSecurityGroupDetailsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "tenant_id", scope = GetOpenstackSecurityGroupDetailsReq.class)
    public JAXBElement<String> createGetOpenstackSecurityGroupDetailsReqTenantId(String value) {
        return new JAXBElement<String>(_ListOpenstackNetworksReqTenantId_QNAME, String.class, GetOpenstackSecurityGroupDetailsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opstenantname", scope = GetOpenstackSecurityGroupDetailsReq.class)
    public JAXBElement<String> createGetOpenstackSecurityGroupDetailsReqOpstenantname(String value) {
        return new JAXBElement<String>(_ListOpenstackNetworksReqOpstenantname_QNAME, String.class, GetOpenstackSecurityGroupDetailsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opesusername", scope = GetOpenstackSecurityGroupDetailsReq.class)
    public JAXBElement<String> createGetOpenstackSecurityGroupDetailsReqOpesusername(String value) {
        return new JAXBElement<String>(_ListOpenstackNetworksReqOpesusername_QNAME, String.class, GetOpenstackSecurityGroupDetailsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "token_id", scope = ListOpenstackSecurityGroupsReq.class)
    public JAXBElement<String> createListOpenstackSecurityGroupsReqTokenId(String value) {
        return new JAXBElement<String>(_ListOpenstackNetworksReqTokenId_QNAME, String.class, ListOpenstackSecurityGroupsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opspassword", scope = ListOpenstackSecurityGroupsReq.class)
    public JAXBElement<String> createListOpenstackSecurityGroupsReqOpspassword(String value) {
        return new JAXBElement<String>(_ListOpenstackNetworksReqOpspassword_QNAME, String.class, ListOpenstackSecurityGroupsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "ip", scope = ListOpenstackSecurityGroupsReq.class)
    public JAXBElement<String> createListOpenstackSecurityGroupsReqIp(String value) {
        return new JAXBElement<String>(_ListOpenstackNetworksReqIp_QNAME, String.class, ListOpenstackSecurityGroupsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "tenant_id", scope = ListOpenstackSecurityGroupsReq.class)
    public JAXBElement<String> createListOpenstackSecurityGroupsReqTenantId(String value) {
        return new JAXBElement<String>(_ListOpenstackNetworksReqTenantId_QNAME, String.class, ListOpenstackSecurityGroupsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opstenantname", scope = ListOpenstackSecurityGroupsReq.class)
    public JAXBElement<String> createListOpenstackSecurityGroupsReqOpstenantname(String value) {
        return new JAXBElement<String>(_ListOpenstackNetworksReqOpstenantname_QNAME, String.class, ListOpenstackSecurityGroupsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opesusername", scope = ListOpenstackSecurityGroupsReq.class)
    public JAXBElement<String> createListOpenstackSecurityGroupsReqOpesusername(String value) {
        return new JAXBElement<String>(_ListOpenstackNetworksReqOpesusername_QNAME, String.class, ListOpenstackSecurityGroupsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "token_id", scope = GetOpenstackFlavorDetailsReq.class)
    public JAXBElement<String> createGetOpenstackFlavorDetailsReqTokenId(String value) {
        return new JAXBElement<String>(_ListOpenstackNetworksReqTokenId_QNAME, String.class, GetOpenstackFlavorDetailsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opspassword", scope = GetOpenstackFlavorDetailsReq.class)
    public JAXBElement<String> createGetOpenstackFlavorDetailsReqOpspassword(String value) {
        return new JAXBElement<String>(_ListOpenstackNetworksReqOpspassword_QNAME, String.class, GetOpenstackFlavorDetailsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "ip", scope = GetOpenstackFlavorDetailsReq.class)
    public JAXBElement<String> createGetOpenstackFlavorDetailsReqIp(String value) {
        return new JAXBElement<String>(_ListOpenstackNetworksReqIp_QNAME, String.class, GetOpenstackFlavorDetailsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "tenant_id", scope = GetOpenstackFlavorDetailsReq.class)
    public JAXBElement<String> createGetOpenstackFlavorDetailsReqTenantId(String value) {
        return new JAXBElement<String>(_ListOpenstackNetworksReqTenantId_QNAME, String.class, GetOpenstackFlavorDetailsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opstenantname", scope = GetOpenstackFlavorDetailsReq.class)
    public JAXBElement<String> createGetOpenstackFlavorDetailsReqOpstenantname(String value) {
        return new JAXBElement<String>(_ListOpenstackNetworksReqOpstenantname_QNAME, String.class, GetOpenstackFlavorDetailsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opesusername", scope = GetOpenstackFlavorDetailsReq.class)
    public JAXBElement<String> createGetOpenstackFlavorDetailsReqOpesusername(String value) {
        return new JAXBElement<String>(_ListOpenstackNetworksReqOpesusername_QNAME, String.class, GetOpenstackFlavorDetailsReq.class, value);
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
        return new JAXBElement<String>(_ListOpenstackNetworksReqTokenId_QNAME, String.class, ListOpenstackKeypairsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opspassword", scope = ListOpenstackKeypairsReq.class)
    public JAXBElement<String> createListOpenstackKeypairsReqOpspassword(String value) {
        return new JAXBElement<String>(_ListOpenstackNetworksReqOpspassword_QNAME, String.class, ListOpenstackKeypairsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "ip", scope = ListOpenstackKeypairsReq.class)
    public JAXBElement<String> createListOpenstackKeypairsReqIp(String value) {
        return new JAXBElement<String>(_ListOpenstackNetworksReqIp_QNAME, String.class, ListOpenstackKeypairsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "tenant_id", scope = ListOpenstackKeypairsReq.class)
    public JAXBElement<String> createListOpenstackKeypairsReqTenantId(String value) {
        return new JAXBElement<String>(_ListOpenstackNetworksReqTenantId_QNAME, String.class, ListOpenstackKeypairsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opstenantname", scope = ListOpenstackKeypairsReq.class)
    public JAXBElement<String> createListOpenstackKeypairsReqOpstenantname(String value) {
        return new JAXBElement<String>(_ListOpenstackNetworksReqOpstenantname_QNAME, String.class, ListOpenstackKeypairsReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://requests.cloudmanager.isap.com/xsd", name = "opesusername", scope = ListOpenstackKeypairsReq.class)
    public JAXBElement<String> createListOpenstackKeypairsReqOpesusername(String value) {
        return new JAXBElement<String>(_ListOpenstackNetworksReqOpesusername_QNAME, String.class, ListOpenstackKeypairsReq.class, value);
    }

}

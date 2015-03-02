
package com.isap.core;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.isap.cloudmanager.requests.xsd.AddOpenstackFloatingIpReq;
import com.isap.cloudmanager.requests.xsd.AllocateOpenstackFloatingIpReq;
import com.isap.cloudmanager.requests.xsd.DeallocateOpenstackFloatingIpReq;
import com.isap.cloudmanager.requests.xsd.FreeFloatingIPsReq;
import com.isap.cloudmanager.requests.xsd.GetOpenstackFlavorDetailsReq;
import com.isap.cloudmanager.requests.xsd.GetOpenstackImageDetailsReq;
import com.isap.cloudmanager.requests.xsd.GetOpenstackSecurityGroupDetailsReq;
import com.isap.cloudmanager.requests.xsd.ListOpenstackFlavorsReq;
import com.isap.cloudmanager.requests.xsd.ListOpenstackImagesReq;
import com.isap.cloudmanager.requests.xsd.ListOpenstackKeypairsReq;
import com.isap.cloudmanager.requests.xsd.ListOpenstackNetworksReq;
import com.isap.cloudmanager.requests.xsd.ListOpenstackSecurityGroupsReq;
import com.isap.cloudmanager.requests.xsd.OpenstackBasicReq;
import com.isap.cloudmanager.requests.xsd.RemoveOpenstackFloatingIpReq;
import com.isap.cloudmanager.responses.xsd.AddOpenstackFloatingIpResp;
import com.isap.cloudmanager.responses.xsd.AllocateOpenstackFloatingIpResp;
import com.isap.cloudmanager.responses.xsd.GetOpenstackFlavorResp;
import com.isap.cloudmanager.responses.xsd.GetOpenstackFloatingIpResp;
import com.isap.cloudmanager.responses.xsd.GetOpenstackImageDetailsResp;
import com.isap.cloudmanager.responses.xsd.OpenstackBasicResp;
import com.isap.core.requests.xsd.CreateOpenstackKeypairReq;
import com.isap.core.requests.xsd.CreateOpenstacktenantReq;
import com.isap.core.requests.xsd.GetIsapCloudAuthenticationRequest;
import com.isap.core.requests.xsd.GetIsapLaunchInstanceReq;
import com.isap.core.requests.xsd.GetIsapinstanceDetailsReq;
import com.isap.core.requests.xsd.GetOpenstackHypervisorDetailsReq;
import com.isap.core.requests.xsd.GetOpenstackQuotaReq;
import com.isap.core.requests.xsd.TerminateOpensInstanceReq;
import com.isap.core.responses.xsd.CreateOpenstackTenantResp;
import com.isap.core.responses.xsd.CreateOpenstackkeypairResp;
import com.isap.core.responses.xsd.GetIsapInstanceDetailsResp;
import com.isap.core.responses.xsd.GetIsapLaunchInstanceResp;
import com.isap.core.responses.xsd.GetOpenstackHypervisorDetailsResp;
import com.isap.core.responses.xsd.GetOpenstackQuotaResp;
import com.isap.core.responses.xsd.GetOpenstackSecurityGroupDetailsResp;
import com.isap.core.responses.xsd.ListOpenstackFlavorsResp;
import com.isap.core.responses.xsd.ListOpenstackImagesResp;
import com.isap.core.responses.xsd.ListOpenstackKeypairsResp;
import com.isap.core.responses.xsd.ListOpenstackNetworksResp;
import com.isap.core.responses.xsd.ListOpenstackSecurityGroupsResp;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.isap.core package. 
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

    private final static QName _FreeFloatingIPsResponseReturn_QNAME = new QName("http://core.isap.com", "return");
    private final static QName _AddOpenstackFloatingIpAfip_QNAME = new QName("http://core.isap.com", "afip");
    private final static QName _FreeFloatingIPsFfip_QNAME = new QName("http://core.isap.com", "ffip");
    private final static QName _GetHypervisorDetailsGhdr_QNAME = new QName("http://core.isap.com", "ghdr");
    private final static QName _ListOpenstackImagesLoir_QNAME = new QName("http://core.isap.com", "loir");
    private final static QName _GetOpenstackQuotaDetailsGoqr_QNAME = new QName("http://core.isap.com", "goqr");
    private final static QName _ListOpenstackNetworksLonr_QNAME = new QName("http://core.isap.com", "lonr");
    private final static QName _ISAPUpdateDatabaseStatus_QNAME = new QName("http://core.isap.com", "status");
    private final static QName _ISAPUpdateDatabaseIpAddress_QNAME = new QName("http://core.isap.com", "ip_address");
    private final static QName _ISAPUpdateDatabaseVmOpensId_QNAME = new QName("http://core.isap.com", "vm_opens_id");
    private final static QName _ListOpenstackFloatingIpsReq_QNAME = new QName("http://core.isap.com", "req");
    private final static QName _CreateOpenstackTenantCotr_QNAME = new QName("http://core.isap.com", "cotr");
    private final static QName _GetOpenstackImageDetailsGoidr_QNAME = new QName("http://core.isap.com", "goidr");
    private final static QName _ListOpenstackFlavorsLof_QNAME = new QName("http://core.isap.com", "lof");
    private final static QName _GetOpenstackFlavorDetailsGofr_QNAME = new QName("http://core.isap.com", "gofr");
    private final static QName _GetIsapCloudAuthenticationGicar_QNAME = new QName("http://core.isap.com", "gicar");
    private final static QName _CreateOpenstackKeypairCokreq_QNAME = new QName("http://core.isap.com", "cokreq");
    private final static QName _ISAPTerminateOpensInstanceTpir_QNAME = new QName("http://core.isap.com", "tpir");
    private final static QName _RemoveOpenstackFloatingIpRespRfip_QNAME = new QName("http://core.isap.com", "rfip");
    private final static QName _GetIsapInstaceDetailsGiids_QNAME = new QName("http://core.isap.com", "giids");
    private final static QName _GetIsapLaunchinstanceGilir_QNAME = new QName("http://core.isap.com", "gilir");
    private final static QName _ListOpenstackSecurityGroupsLosgr_QNAME = new QName("http://core.isap.com", "losgr");
    private final static QName _DeallocateOpenstackFloatingIpRequest_QNAME = new QName("http://core.isap.com", "request");
    private final static QName _ListOpenstackKeypairsLokr_QNAME = new QName("http://core.isap.com", "lokr");
    private final static QName _GetOpenstackSecurityGroupDetailsGosgr_QNAME = new QName("http://core.isap.com", "gosgr");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.isap.core
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetOpenstackFlavorDetailsResponse }
     * 
     */
    public GetOpenstackFlavorDetailsResponse createGetOpenstackFlavorDetailsResponse() {
        return new GetOpenstackFlavorDetailsResponse();
    }

    /**
     * Create an instance of {@link AddOpenstackFloatingIp }
     * 
     */
    public AddOpenstackFloatingIp createAddOpenstackFloatingIp() {
        return new AddOpenstackFloatingIp();
    }

    /**
     * Create an instance of {@link ListOpenstackKeypairs }
     * 
     */
    public ListOpenstackKeypairs createListOpenstackKeypairs() {
        return new ListOpenstackKeypairs();
    }

    /**
     * Create an instance of {@link AddOpenstackFloatingIpResponse }
     * 
     */
    public AddOpenstackFloatingIpResponse createAddOpenstackFloatingIpResponse() {
        return new AddOpenstackFloatingIpResponse();
    }

    /**
     * Create an instance of {@link GetHypervisorDetails }
     * 
     */
    public GetHypervisorDetails createGetHypervisorDetails() {
        return new GetHypervisorDetails();
    }

    /**
     * Create an instance of {@link GetIsapInstaceDetails }
     * 
     */
    public GetIsapInstaceDetails createGetIsapInstaceDetails() {
        return new GetIsapInstaceDetails();
    }

    /**
     * Create an instance of {@link GetOpenstackImageDetailsResponse }
     * 
     */
    public GetOpenstackImageDetailsResponse createGetOpenstackImageDetailsResponse() {
        return new GetOpenstackImageDetailsResponse();
    }

    /**
     * Create an instance of {@link GetOpenstackProjectUsageResponse }
     * 
     */
    public GetOpenstackProjectUsageResponse createGetOpenstackProjectUsageResponse() {
        return new GetOpenstackProjectUsageResponse();
    }

    /**
     * Create an instance of {@link ListOpenstackNetworksResponse }
     * 
     */
    public ListOpenstackNetworksResponse createListOpenstackNetworksResponse() {
        return new ListOpenstackNetworksResponse();
    }

    /**
     * Create an instance of {@link GetOpenstackSecurityGroupDetailsResponse }
     * 
     */
    public GetOpenstackSecurityGroupDetailsResponse createGetOpenstackSecurityGroupDetailsResponse() {
        return new GetOpenstackSecurityGroupDetailsResponse();
    }

    /**
     * Create an instance of {@link GetIsapLaunchinstance }
     * 
     */
    public GetIsapLaunchinstance createGetIsapLaunchinstance() {
        return new GetIsapLaunchinstance();
    }

    /**
     * Create an instance of {@link GetOpenstackQuotaDetailsResponse }
     * 
     */
    public GetOpenstackQuotaDetailsResponse createGetOpenstackQuotaDetailsResponse() {
        return new GetOpenstackQuotaDetailsResponse();
    }

    /**
     * Create an instance of {@link GetHypervisorDetailsResponse }
     * 
     */
    public GetHypervisorDetailsResponse createGetHypervisorDetailsResponse() {
        return new GetHypervisorDetailsResponse();
    }

    /**
     * Create an instance of {@link GetOpenstackQuotaDetails }
     * 
     */
    public GetOpenstackQuotaDetails createGetOpenstackQuotaDetails() {
        return new GetOpenstackQuotaDetails();
    }

    /**
     * Create an instance of {@link ListOpenstackFloatingIps }
     * 
     */
    public ListOpenstackFloatingIps createListOpenstackFloatingIps() {
        return new ListOpenstackFloatingIps();
    }

    /**
     * Create an instance of {@link ListOpenstackImages }
     * 
     */
    public ListOpenstackImages createListOpenstackImages() {
        return new ListOpenstackImages();
    }

    /**
     * Create an instance of {@link ListOpenstackFloatingIpPoolsResponse }
     * 
     */
    public ListOpenstackFloatingIpPoolsResponse createListOpenstackFloatingIpPoolsResponse() {
        return new ListOpenstackFloatingIpPoolsResponse();
    }

    /**
     * Create an instance of {@link GetOpenstackProjectUsage }
     * 
     */
    public GetOpenstackProjectUsage createGetOpenstackProjectUsage() {
        return new GetOpenstackProjectUsage();
    }

    /**
     * Create an instance of {@link ListOpenstackFloatingIpPools }
     * 
     */
    public ListOpenstackFloatingIpPools createListOpenstackFloatingIpPools() {
        return new ListOpenstackFloatingIpPools();
    }

    /**
     * Create an instance of {@link RemoveOpenstackFloatingIpRespResponse }
     * 
     */
    public RemoveOpenstackFloatingIpRespResponse createRemoveOpenstackFloatingIpRespResponse() {
        return new RemoveOpenstackFloatingIpRespResponse();
    }

    /**
     * Create an instance of {@link com.isap.core.GetIsapCloudAuthenticationResponse }
     * 
     */
    public com.isap.core.GetIsapCloudAuthenticationResponse createGetIsapCloudAuthenticationResponse() {
        return new com.isap.core.GetIsapCloudAuthenticationResponse();
    }

    /**
     * Create an instance of {@link com.isap.core.RemoveOpenstackFloatingIpResp }
     * 
     */
    public com.isap.core.RemoveOpenstackFloatingIpResp createRemoveOpenstackFloatingIpResp() {
        return new com.isap.core.RemoveOpenstackFloatingIpResp();
    }

    /**
     * Create an instance of {@link ListOpenstackFlavors }
     * 
     */
    public ListOpenstackFlavors createListOpenstackFlavors() {
        return new ListOpenstackFlavors();
    }

    /**
     * Create an instance of {@link GetIsapInstaceDetailsResponse }
     * 
     */
    public GetIsapInstaceDetailsResponse createGetIsapInstaceDetailsResponse() {
        return new GetIsapInstaceDetailsResponse();
    }

    /**
     * Create an instance of {@link ListOpenstackSecurityGroups }
     * 
     */
    public ListOpenstackSecurityGroups createListOpenstackSecurityGroups() {
        return new ListOpenstackSecurityGroups();
    }

    /**
     * Create an instance of {@link GetOpenstackFlavorDetails }
     * 
     */
    public GetOpenstackFlavorDetails createGetOpenstackFlavorDetails() {
        return new GetOpenstackFlavorDetails();
    }

    /**
     * Create an instance of {@link ListOpenstackNetworks }
     * 
     */
    public ListOpenstackNetworks createListOpenstackNetworks() {
        return new ListOpenstackNetworks();
    }

    /**
     * Create an instance of {@link FreeFloatingIPs }
     * 
     */
    public FreeFloatingIPs createFreeFloatingIPs() {
        return new FreeFloatingIPs();
    }

    /**
     * Create an instance of {@link ListOpenstackImagesResponse }
     * 
     */
    public ListOpenstackImagesResponse createListOpenstackImagesResponse() {
        return new ListOpenstackImagesResponse();
    }

    /**
     * Create an instance of {@link DeallocateOpenstackFloatingIp }
     * 
     */
    public DeallocateOpenstackFloatingIp createDeallocateOpenstackFloatingIp() {
        return new DeallocateOpenstackFloatingIp();
    }

    /**
     * Create an instance of {@link ListOpenstackFloatingIpsResponse }
     * 
     */
    public ListOpenstackFloatingIpsResponse createListOpenstackFloatingIpsResponse() {
        return new ListOpenstackFloatingIpsResponse();
    }

    /**
     * Create an instance of {@link AllocateOpenstackFloatingIpResponse }
     * 
     */
    public AllocateOpenstackFloatingIpResponse createAllocateOpenstackFloatingIpResponse() {
        return new AllocateOpenstackFloatingIpResponse();
    }

    /**
     * Create an instance of {@link CreateOpenstackTenant }
     * 
     */
    public CreateOpenstackTenant createCreateOpenstackTenant() {
        return new CreateOpenstackTenant();
    }

    /**
     * Create an instance of {@link ISAPTerminateOpensInstanceResponse }
     * 
     */
    public ISAPTerminateOpensInstanceResponse createISAPTerminateOpensInstanceResponse() {
        return new ISAPTerminateOpensInstanceResponse();
    }

    /**
     * Create an instance of {@link ISAPUpdateDatabase }
     * 
     */
    public ISAPUpdateDatabase createISAPUpdateDatabase() {
        return new ISAPUpdateDatabase();
    }

    /**
     * Create an instance of {@link ListOpenstackKeypairsResponse }
     * 
     */
    public ListOpenstackKeypairsResponse createListOpenstackKeypairsResponse() {
        return new ListOpenstackKeypairsResponse();
    }

    /**
     * Create an instance of {@link GetOpenstackImageDetails }
     * 
     */
    public GetOpenstackImageDetails createGetOpenstackImageDetails() {
        return new GetOpenstackImageDetails();
    }

    /**
     * Create an instance of {@link ListOpenstackSecurityGroupsResponse }
     * 
     */
    public ListOpenstackSecurityGroupsResponse createListOpenstackSecurityGroupsResponse() {
        return new ListOpenstackSecurityGroupsResponse();
    }

    /**
     * Create an instance of {@link CreateOpenstackKeypairResponse }
     * 
     */
    public CreateOpenstackKeypairResponse createCreateOpenstackKeypairResponse() {
        return new CreateOpenstackKeypairResponse();
    }

    /**
     * Create an instance of {@link GetIsapCloudAuthentication }
     * 
     */
    public GetIsapCloudAuthentication createGetIsapCloudAuthentication() {
        return new GetIsapCloudAuthentication();
    }

    /**
     * Create an instance of {@link ListOpenstackFlavorsResponse }
     * 
     */
    public ListOpenstackFlavorsResponse createListOpenstackFlavorsResponse() {
        return new ListOpenstackFlavorsResponse();
    }

    /**
     * Create an instance of {@link ISAPUpdateDatabaseResponse }
     * 
     */
    public ISAPUpdateDatabaseResponse createISAPUpdateDatabaseResponse() {
        return new ISAPUpdateDatabaseResponse();
    }

    /**
     * Create an instance of {@link GetIsapLaunchinstanceResponse }
     * 
     */
    public GetIsapLaunchinstanceResponse createGetIsapLaunchinstanceResponse() {
        return new GetIsapLaunchinstanceResponse();
    }

    /**
     * Create an instance of {@link DeallocateOpenstackFloatingIpResponse }
     * 
     */
    public DeallocateOpenstackFloatingIpResponse createDeallocateOpenstackFloatingIpResponse() {
        return new DeallocateOpenstackFloatingIpResponse();
    }

    /**
     * Create an instance of {@link CreateOpenstackTenantResponse }
     * 
     */
    public CreateOpenstackTenantResponse createCreateOpenstackTenantResponse() {
        return new CreateOpenstackTenantResponse();
    }

    /**
     * Create an instance of {@link Main }
     * 
     */
    public Main createMain() {
        return new Main();
    }

    /**
     * Create an instance of {@link ISAPTerminateOpensInstance }
     * 
     */
    public ISAPTerminateOpensInstance createISAPTerminateOpensInstance() {
        return new ISAPTerminateOpensInstance();
    }

    /**
     * Create an instance of {@link CreateOpenstackKeypair }
     * 
     */
    public CreateOpenstackKeypair createCreateOpenstackKeypair() {
        return new CreateOpenstackKeypair();
    }

    /**
     * Create an instance of {@link FreeFloatingIPsResponse }
     * 
     */
    public FreeFloatingIPsResponse createFreeFloatingIPsResponse() {
        return new FreeFloatingIPsResponse();
    }

    /**
     * Create an instance of {@link GetOpenstackSecurityGroupDetails }
     * 
     */
    public GetOpenstackSecurityGroupDetails createGetOpenstackSecurityGroupDetails() {
        return new GetOpenstackSecurityGroupDetails();
    }

    /**
     * Create an instance of {@link AllocateOpenstackFloatingIp }
     * 
     */
    public AllocateOpenstackFloatingIp createAllocateOpenstackFloatingIp() {
        return new AllocateOpenstackFloatingIp();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOpenstackFloatingIpResp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "return", scope = FreeFloatingIPsResponse.class)
    public JAXBElement<GetOpenstackFloatingIpResp> createFreeFloatingIPsResponseReturn(GetOpenstackFloatingIpResp value) {
        return new JAXBElement<GetOpenstackFloatingIpResp>(_FreeFloatingIPsResponseReturn_QNAME, GetOpenstackFloatingIpResp.class, FreeFloatingIPsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOpenstackFloatingIpReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "afip", scope = AddOpenstackFloatingIp.class)
    public JAXBElement<AddOpenstackFloatingIpReq> createAddOpenstackFloatingIpAfip(AddOpenstackFloatingIpReq value) {
        return new JAXBElement<AddOpenstackFloatingIpReq>(_AddOpenstackFloatingIpAfip_QNAME, AddOpenstackFloatingIpReq.class, AddOpenstackFloatingIp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FreeFloatingIPsReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "ffip", scope = FreeFloatingIPs.class)
    public JAXBElement<FreeFloatingIPsReq> createFreeFloatingIPsFfip(FreeFloatingIPsReq value) {
        return new JAXBElement<FreeFloatingIPsReq>(_FreeFloatingIPsFfip_QNAME, FreeFloatingIPsReq.class, FreeFloatingIPs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOpenstackFlavorsResp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "return", scope = ListOpenstackFlavorsResponse.class)
    public JAXBElement<ListOpenstackFlavorsResp> createListOpenstackFlavorsResponseReturn(ListOpenstackFlavorsResp value) {
        return new JAXBElement<ListOpenstackFlavorsResp>(_FreeFloatingIPsResponseReturn_QNAME, ListOpenstackFlavorsResp.class, ListOpenstackFlavorsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOpenstackFloatingIpResp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "return", scope = ListOpenstackFloatingIpPoolsResponse.class)
    public JAXBElement<GetOpenstackFloatingIpResp> createListOpenstackFloatingIpPoolsResponseReturn(GetOpenstackFloatingIpResp value) {
        return new JAXBElement<GetOpenstackFloatingIpResp>(_FreeFloatingIPsResponseReturn_QNAME, GetOpenstackFloatingIpResp.class, ListOpenstackFloatingIpPoolsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOpenstackHypervisorDetailsReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "ghdr", scope = GetHypervisorDetails.class)
    public JAXBElement<GetOpenstackHypervisorDetailsReq> createGetHypervisorDetailsGhdr(GetOpenstackHypervisorDetailsReq value) {
        return new JAXBElement<GetOpenstackHypervisorDetailsReq>(_GetHypervisorDetailsGhdr_QNAME, GetOpenstackHypervisorDetailsReq.class, GetHypervisorDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOpenstackImagesReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "loir", scope = ListOpenstackImages.class)
    public JAXBElement<ListOpenstackImagesReq> createListOpenstackImagesLoir(ListOpenstackImagesReq value) {
        return new JAXBElement<ListOpenstackImagesReq>(_ListOpenstackImagesLoir_QNAME, ListOpenstackImagesReq.class, ListOpenstackImages.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOpenstackFloatingIpResp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "return", scope = ListOpenstackFloatingIpsResponse.class)
    public JAXBElement<GetOpenstackFloatingIpResp> createListOpenstackFloatingIpsResponseReturn(GetOpenstackFloatingIpResp value) {
        return new JAXBElement<GetOpenstackFloatingIpResp>(_FreeFloatingIPsResponseReturn_QNAME, GetOpenstackFloatingIpResp.class, ListOpenstackFloatingIpsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOpenstackQuotaReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "goqr", scope = GetOpenstackQuotaDetails.class)
    public JAXBElement<GetOpenstackQuotaReq> createGetOpenstackQuotaDetailsGoqr(GetOpenstackQuotaReq value) {
        return new JAXBElement<GetOpenstackQuotaReq>(_GetOpenstackQuotaDetailsGoqr_QNAME, GetOpenstackQuotaReq.class, GetOpenstackQuotaDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllocateOpenstackFloatingIpResp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "return", scope = AllocateOpenstackFloatingIpResponse.class)
    public JAXBElement<AllocateOpenstackFloatingIpResp> createAllocateOpenstackFloatingIpResponseReturn(AllocateOpenstackFloatingIpResp value) {
        return new JAXBElement<AllocateOpenstackFloatingIpResp>(_FreeFloatingIPsResponseReturn_QNAME, AllocateOpenstackFloatingIpResp.class, AllocateOpenstackFloatingIpResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIsapLaunchInstanceResp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "return", scope = GetIsapLaunchinstanceResponse.class)
    public JAXBElement<GetIsapLaunchInstanceResp> createGetIsapLaunchinstanceResponseReturn(GetIsapLaunchInstanceResp value) {
        return new JAXBElement<GetIsapLaunchInstanceResp>(_FreeFloatingIPsResponseReturn_QNAME, GetIsapLaunchInstanceResp.class, GetIsapLaunchinstanceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOpenstackNetworksReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "lonr", scope = ListOpenstackNetworks.class)
    public JAXBElement<ListOpenstackNetworksReq> createListOpenstackNetworksLonr(ListOpenstackNetworksReq value) {
        return new JAXBElement<ListOpenstackNetworksReq>(_ListOpenstackNetworksLonr_QNAME, ListOpenstackNetworksReq.class, ListOpenstackNetworks.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "status", scope = ISAPUpdateDatabase.class)
    public JAXBElement<String> createISAPUpdateDatabaseStatus(String value) {
        return new JAXBElement<String>(_ISAPUpdateDatabaseStatus_QNAME, String.class, ISAPUpdateDatabase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "ip_address", scope = ISAPUpdateDatabase.class)
    public JAXBElement<String> createISAPUpdateDatabaseIpAddress(String value) {
        return new JAXBElement<String>(_ISAPUpdateDatabaseIpAddress_QNAME, String.class, ISAPUpdateDatabase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "vm_opens_id", scope = ISAPUpdateDatabase.class)
    public JAXBElement<String> createISAPUpdateDatabaseVmOpensId(String value) {
        return new JAXBElement<String>(_ISAPUpdateDatabaseVmOpensId_QNAME, String.class, ISAPUpdateDatabase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenstackBasicReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "req", scope = ListOpenstackFloatingIps.class)
    public JAXBElement<OpenstackBasicReq> createListOpenstackFloatingIpsReq(OpenstackBasicReq value) {
        return new JAXBElement<OpenstackBasicReq>(_ListOpenstackFloatingIpsReq_QNAME, OpenstackBasicReq.class, ListOpenstackFloatingIps.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOpenstackQuotaReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "goqr", scope = GetOpenstackProjectUsage.class)
    public JAXBElement<GetOpenstackQuotaReq> createGetOpenstackProjectUsageGoqr(GetOpenstackQuotaReq value) {
        return new JAXBElement<GetOpenstackQuotaReq>(_GetOpenstackQuotaDetailsGoqr_QNAME, GetOpenstackQuotaReq.class, GetOpenstackProjectUsage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOpenstacktenantReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "cotr", scope = CreateOpenstackTenant.class)
    public JAXBElement<CreateOpenstacktenantReq> createCreateOpenstackTenantCotr(CreateOpenstacktenantReq value) {
        return new JAXBElement<CreateOpenstacktenantReq>(_CreateOpenstackTenantCotr_QNAME, CreateOpenstacktenantReq.class, CreateOpenstackTenant.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOpenstackImageDetailsReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "goidr", scope = GetOpenstackImageDetails.class)
    public JAXBElement<GetOpenstackImageDetailsReq> createGetOpenstackImageDetailsGoidr(GetOpenstackImageDetailsReq value) {
        return new JAXBElement<GetOpenstackImageDetailsReq>(_GetOpenstackImageDetailsGoidr_QNAME, GetOpenstackImageDetailsReq.class, GetOpenstackImageDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOpenstackSecurityGroupsResp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "return", scope = ListOpenstackSecurityGroupsResponse.class)
    public JAXBElement<ListOpenstackSecurityGroupsResp> createListOpenstackSecurityGroupsResponseReturn(ListOpenstackSecurityGroupsResp value) {
        return new JAXBElement<ListOpenstackSecurityGroupsResp>(_FreeFloatingIPsResponseReturn_QNAME, ListOpenstackSecurityGroupsResp.class, ListOpenstackSecurityGroupsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOpenstackNetworksResp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "return", scope = ListOpenstackNetworksResponse.class)
    public JAXBElement<ListOpenstackNetworksResp> createListOpenstackNetworksResponseReturn(ListOpenstackNetworksResp value) {
        return new JAXBElement<ListOpenstackNetworksResp>(_FreeFloatingIPsResponseReturn_QNAME, ListOpenstackNetworksResp.class, ListOpenstackNetworksResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOpenstackFloatingIpResp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "return", scope = AddOpenstackFloatingIpResponse.class)
    public JAXBElement<AddOpenstackFloatingIpResp> createAddOpenstackFloatingIpResponseReturn(AddOpenstackFloatingIpResp value) {
        return new JAXBElement<AddOpenstackFloatingIpResp>(_FreeFloatingIPsResponseReturn_QNAME, AddOpenstackFloatingIpResp.class, AddOpenstackFloatingIpResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOpenstackFlavorsReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "lof", scope = ListOpenstackFlavors.class)
    public JAXBElement<ListOpenstackFlavorsReq> createListOpenstackFlavorsLof(ListOpenstackFlavorsReq value) {
        return new JAXBElement<ListOpenstackFlavorsReq>(_ListOpenstackFlavorsLof_QNAME, ListOpenstackFlavorsReq.class, ListOpenstackFlavors.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOpenstackFlavorResp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "return", scope = GetOpenstackFlavorDetailsResponse.class)
    public JAXBElement<GetOpenstackFlavorResp> createGetOpenstackFlavorDetailsResponseReturn(GetOpenstackFlavorResp value) {
        return new JAXBElement<GetOpenstackFlavorResp>(_FreeFloatingIPsResponseReturn_QNAME, GetOpenstackFlavorResp.class, GetOpenstackFlavorDetailsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOpenstackFlavorDetailsReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "gofr", scope = GetOpenstackFlavorDetails.class)
    public JAXBElement<GetOpenstackFlavorDetailsReq> createGetOpenstackFlavorDetailsGofr(GetOpenstackFlavorDetailsReq value) {
        return new JAXBElement<GetOpenstackFlavorDetailsReq>(_GetOpenstackFlavorDetailsGofr_QNAME, GetOpenstackFlavorDetailsReq.class, GetOpenstackFlavorDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIsapCloudAuthenticationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "gicar", scope = GetIsapCloudAuthentication.class)
    public JAXBElement<GetIsapCloudAuthenticationRequest> createGetIsapCloudAuthenticationGicar(GetIsapCloudAuthenticationRequest value) {
        return new JAXBElement<GetIsapCloudAuthenticationRequest>(_GetIsapCloudAuthenticationGicar_QNAME, GetIsapCloudAuthenticationRequest.class, GetIsapCloudAuthentication.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOpenstackQuotaResp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "return", scope = GetOpenstackProjectUsageResponse.class)
    public JAXBElement<GetOpenstackQuotaResp> createGetOpenstackProjectUsageResponseReturn(GetOpenstackQuotaResp value) {
        return new JAXBElement<GetOpenstackQuotaResp>(_FreeFloatingIPsResponseReturn_QNAME, GetOpenstackQuotaResp.class, GetOpenstackProjectUsageResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIsapInstanceDetailsResp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "return", scope = GetIsapInstaceDetailsResponse.class)
    public JAXBElement<GetIsapInstanceDetailsResp> createGetIsapInstaceDetailsResponseReturn(GetIsapInstanceDetailsResp value) {
        return new JAXBElement<GetIsapInstanceDetailsResp>(_FreeFloatingIPsResponseReturn_QNAME, GetIsapInstanceDetailsResp.class, GetIsapInstaceDetailsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.isap.core.responses.xsd.GetIsapCloudAuthenticationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "return", scope = com.isap.core.GetIsapCloudAuthenticationResponse.class)
    public JAXBElement<com.isap.core.responses.xsd.GetIsapCloudAuthenticationResponse> createGetIsapCloudAuthenticationResponseReturn(com.isap.core.responses.xsd.GetIsapCloudAuthenticationResponse value) {
        return new JAXBElement<com.isap.core.responses.xsd.GetIsapCloudAuthenticationResponse>(_FreeFloatingIPsResponseReturn_QNAME, com.isap.core.responses.xsd.GetIsapCloudAuthenticationResponse.class, com.isap.core.GetIsapCloudAuthenticationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllocateOpenstackFloatingIpReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "req", scope = AllocateOpenstackFloatingIp.class)
    public JAXBElement<AllocateOpenstackFloatingIpReq> createAllocateOpenstackFloatingIpReq(AllocateOpenstackFloatingIpReq value) {
        return new JAXBElement<AllocateOpenstackFloatingIpReq>(_ListOpenstackFloatingIpsReq_QNAME, AllocateOpenstackFloatingIpReq.class, AllocateOpenstackFloatingIp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOpenstackImagesResp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "return", scope = ListOpenstackImagesResponse.class)
    public JAXBElement<ListOpenstackImagesResp> createListOpenstackImagesResponseReturn(ListOpenstackImagesResp value) {
        return new JAXBElement<ListOpenstackImagesResp>(_FreeFloatingIPsResponseReturn_QNAME, ListOpenstackImagesResp.class, ListOpenstackImagesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOpenstackTenantResp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "return", scope = CreateOpenstackTenantResponse.class)
    public JAXBElement<CreateOpenstackTenantResp> createCreateOpenstackTenantResponseReturn(CreateOpenstackTenantResp value) {
        return new JAXBElement<CreateOpenstackTenantResp>(_FreeFloatingIPsResponseReturn_QNAME, CreateOpenstackTenantResp.class, CreateOpenstackTenantResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOpenstackKeypairReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "cokreq", scope = CreateOpenstackKeypair.class)
    public JAXBElement<CreateOpenstackKeypairReq> createCreateOpenstackKeypairCokreq(CreateOpenstackKeypairReq value) {
        return new JAXBElement<CreateOpenstackKeypairReq>(_CreateOpenstackKeypairCokreq_QNAME, CreateOpenstackKeypairReq.class, CreateOpenstackKeypair.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenstackBasicResp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "return", scope = DeallocateOpenstackFloatingIpResponse.class)
    public JAXBElement<OpenstackBasicResp> createDeallocateOpenstackFloatingIpResponseReturn(OpenstackBasicResp value) {
        return new JAXBElement<OpenstackBasicResp>(_FreeFloatingIPsResponseReturn_QNAME, OpenstackBasicResp.class, DeallocateOpenstackFloatingIpResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOpenstackkeypairResp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "return", scope = CreateOpenstackKeypairResponse.class)
    public JAXBElement<CreateOpenstackkeypairResp> createCreateOpenstackKeypairResponseReturn(CreateOpenstackkeypairResp value) {
        return new JAXBElement<CreateOpenstackkeypairResp>(_FreeFloatingIPsResponseReturn_QNAME, CreateOpenstackkeypairResp.class, CreateOpenstackKeypairResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOpenstackKeypairsResp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "return", scope = ListOpenstackKeypairsResponse.class)
    public JAXBElement<ListOpenstackKeypairsResp> createListOpenstackKeypairsResponseReturn(ListOpenstackKeypairsResp value) {
        return new JAXBElement<ListOpenstackKeypairsResp>(_FreeFloatingIPsResponseReturn_QNAME, ListOpenstackKeypairsResp.class, ListOpenstackKeypairsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminateOpensInstanceReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "tpir", scope = ISAPTerminateOpensInstance.class)
    public JAXBElement<TerminateOpensInstanceReq> createISAPTerminateOpensInstanceTpir(TerminateOpensInstanceReq value) {
        return new JAXBElement<TerminateOpensInstanceReq>(_ISAPTerminateOpensInstanceTpir_QNAME, TerminateOpensInstanceReq.class, ISAPTerminateOpensInstance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveOpenstackFloatingIpReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "rfip", scope = com.isap.core.RemoveOpenstackFloatingIpResp.class)
    public JAXBElement<RemoveOpenstackFloatingIpReq> createRemoveOpenstackFloatingIpRespRfip(RemoveOpenstackFloatingIpReq value) {
        return new JAXBElement<RemoveOpenstackFloatingIpReq>(_RemoveOpenstackFloatingIpRespRfip_QNAME, RemoveOpenstackFloatingIpReq.class, com.isap.core.RemoveOpenstackFloatingIpResp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOpenstackHypervisorDetailsResp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "return", scope = GetHypervisorDetailsResponse.class)
    public JAXBElement<GetOpenstackHypervisorDetailsResp> createGetHypervisorDetailsResponseReturn(GetOpenstackHypervisorDetailsResp value) {
        return new JAXBElement<GetOpenstackHypervisorDetailsResp>(_FreeFloatingIPsResponseReturn_QNAME, GetOpenstackHypervisorDetailsResp.class, GetHypervisorDetailsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenstackBasicReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "req", scope = ListOpenstackFloatingIpPools.class)
    public JAXBElement<OpenstackBasicReq> createListOpenstackFloatingIpPoolsReq(OpenstackBasicReq value) {
        return new JAXBElement<OpenstackBasicReq>(_ListOpenstackFloatingIpsReq_QNAME, OpenstackBasicReq.class, ListOpenstackFloatingIpPools.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOpenstackImageDetailsResp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "return", scope = GetOpenstackImageDetailsResponse.class)
    public JAXBElement<GetOpenstackImageDetailsResp> createGetOpenstackImageDetailsResponseReturn(GetOpenstackImageDetailsResp value) {
        return new JAXBElement<GetOpenstackImageDetailsResp>(_FreeFloatingIPsResponseReturn_QNAME, GetOpenstackImageDetailsResp.class, GetOpenstackImageDetailsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIsapinstanceDetailsReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "giids", scope = GetIsapInstaceDetails.class)
    public JAXBElement<GetIsapinstanceDetailsReq> createGetIsapInstaceDetailsGiids(GetIsapinstanceDetailsReq value) {
        return new JAXBElement<GetIsapinstanceDetailsReq>(_GetIsapInstaceDetailsGiids_QNAME, GetIsapinstanceDetailsReq.class, GetIsapInstaceDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOpenstackSecurityGroupDetailsResp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "return", scope = GetOpenstackSecurityGroupDetailsResponse.class)
    public JAXBElement<GetOpenstackSecurityGroupDetailsResp> createGetOpenstackSecurityGroupDetailsResponseReturn(GetOpenstackSecurityGroupDetailsResp value) {
        return new JAXBElement<GetOpenstackSecurityGroupDetailsResp>(_FreeFloatingIPsResponseReturn_QNAME, GetOpenstackSecurityGroupDetailsResp.class, GetOpenstackSecurityGroupDetailsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIsapLaunchInstanceReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "gilir", scope = GetIsapLaunchinstance.class)
    public JAXBElement<GetIsapLaunchInstanceReq> createGetIsapLaunchinstanceGilir(GetIsapLaunchInstanceReq value) {
        return new JAXBElement<GetIsapLaunchInstanceReq>(_GetIsapLaunchinstanceGilir_QNAME, GetIsapLaunchInstanceReq.class, GetIsapLaunchinstance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOpenstackQuotaResp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "return", scope = GetOpenstackQuotaDetailsResponse.class)
    public JAXBElement<GetOpenstackQuotaResp> createGetOpenstackQuotaDetailsResponseReturn(GetOpenstackQuotaResp value) {
        return new JAXBElement<GetOpenstackQuotaResp>(_FreeFloatingIPsResponseReturn_QNAME, GetOpenstackQuotaResp.class, GetOpenstackQuotaDetailsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOpenstackSecurityGroupsReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "losgr", scope = ListOpenstackSecurityGroups.class)
    public JAXBElement<ListOpenstackSecurityGroupsReq> createListOpenstackSecurityGroupsLosgr(ListOpenstackSecurityGroupsReq value) {
        return new JAXBElement<ListOpenstackSecurityGroupsReq>(_ListOpenstackSecurityGroupsLosgr_QNAME, ListOpenstackSecurityGroupsReq.class, ListOpenstackSecurityGroups.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.isap.cloudmanager.responses.xsd.RemoveOpenstackFloatingIpResp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "return", scope = RemoveOpenstackFloatingIpRespResponse.class)
    public JAXBElement<com.isap.cloudmanager.responses.xsd.RemoveOpenstackFloatingIpResp> createRemoveOpenstackFloatingIpRespResponseReturn(com.isap.cloudmanager.responses.xsd.RemoveOpenstackFloatingIpResp value) {
        return new JAXBElement<com.isap.cloudmanager.responses.xsd.RemoveOpenstackFloatingIpResp>(_FreeFloatingIPsResponseReturn_QNAME, com.isap.cloudmanager.responses.xsd.RemoveOpenstackFloatingIpResp.class, RemoveOpenstackFloatingIpRespResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeallocateOpenstackFloatingIpReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "request", scope = DeallocateOpenstackFloatingIp.class)
    public JAXBElement<DeallocateOpenstackFloatingIpReq> createDeallocateOpenstackFloatingIpRequest(DeallocateOpenstackFloatingIpReq value) {
        return new JAXBElement<DeallocateOpenstackFloatingIpReq>(_DeallocateOpenstackFloatingIpRequest_QNAME, DeallocateOpenstackFloatingIpReq.class, DeallocateOpenstackFloatingIp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOpenstackKeypairsReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "lokr", scope = ListOpenstackKeypairs.class)
    public JAXBElement<ListOpenstackKeypairsReq> createListOpenstackKeypairsLokr(ListOpenstackKeypairsReq value) {
        return new JAXBElement<ListOpenstackKeypairsReq>(_ListOpenstackKeypairsLokr_QNAME, ListOpenstackKeypairsReq.class, ListOpenstackKeypairs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOpenstackSecurityGroupDetailsReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "gosgr", scope = GetOpenstackSecurityGroupDetails.class)
    public JAXBElement<GetOpenstackSecurityGroupDetailsReq> createGetOpenstackSecurityGroupDetailsGosgr(GetOpenstackSecurityGroupDetailsReq value) {
        return new JAXBElement<GetOpenstackSecurityGroupDetailsReq>(_GetOpenstackSecurityGroupDetailsGosgr_QNAME, GetOpenstackSecurityGroupDetailsReq.class, GetOpenstackSecurityGroupDetails.class, value);
    }

}

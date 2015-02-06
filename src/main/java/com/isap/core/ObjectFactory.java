
package com.isap.core;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.isap.cloudmanager.requests.xsd.GetOpenstackFlavorDetailsReq;
import com.isap.cloudmanager.requests.xsd.GetOpenstackSecurityGroupDetailsReq;
import com.isap.cloudmanager.requests.xsd.ListOpenstackFlavorsReq;
import com.isap.cloudmanager.requests.xsd.ListOpenstackImagesReq;
import com.isap.cloudmanager.requests.xsd.ListOpenstackKeypairsReq;
import com.isap.cloudmanager.requests.xsd.ListOpenstackNetworksReq;
import com.isap.cloudmanager.requests.xsd.ListOpenstackSecurityGroupsReq;
import com.isap.cloudmanager.responses.xsd.GetOpenstackFlavorResp;
import com.isap.core.requests.xsd.GetIsapCloudAuthenticationRequest;
import com.isap.core.requests.xsd.GetIsapLaunchInstanceReq;
import com.isap.core.requests.xsd.GetIsapinstanceDetailsReq;
import com.isap.core.responses.xsd.GetIsapInstanceDetailsResp;
import com.isap.core.responses.xsd.GetIsapLaunchInstanceResp;
import com.isap.core.responses.xsd.GetOpenstackSecurityGroupDetailsResp;
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

    private final static QName _ListOpenstackImagesResponseReturn_QNAME = new QName("http://core.isap.com", "return");
    private final static QName _ListOpenstackNetworksLonr_QNAME = new QName("http://core.isap.com", "lonr");
    private final static QName _ListOpenstackFlavorsLof_QNAME = new QName("http://core.isap.com", "lof");
    private final static QName _GetIsapCloudAuthenticationGicar_QNAME = new QName("http://core.isap.com", "gicar");
    private final static QName _ListOpenstackKeypairsLokr_QNAME = new QName("http://core.isap.com", "lokr");
    private final static QName _ISAPUpdateDatabaseStatus_QNAME = new QName("http://core.isap.com", "status");
    private final static QName _ISAPUpdateDatabaseIpAddress_QNAME = new QName("http://core.isap.com", "ip_address");
    private final static QName _GetIsapLaunchinstanceGilir_QNAME = new QName("http://core.isap.com", "gilir");
    private final static QName _GetIsapInstaceDetailsGiids_QNAME = new QName("http://core.isap.com", "giids");
    private final static QName _GetOpenstackFlavorDetailsGofr_QNAME = new QName("http://core.isap.com", "gofr");
    private final static QName _ListOpenstackImagesLoir_QNAME = new QName("http://core.isap.com", "loir");
    private final static QName _GetOpenstackSecurityGroupDetailsGosgr_QNAME = new QName("http://core.isap.com", "gosgr");
    private final static QName _ListOpenstackSecurityGroupsLosgr_QNAME = new QName("http://core.isap.com", "losgr");

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
     * Create an instance of {@link ListOpenstackImages }
     * 
     */
    public ListOpenstackImages createListOpenstackImages() {
        return new ListOpenstackImages();
    }

    /**
     * Create an instance of {@link GetIsapCloudAuthentication }
     * 
     */
    public GetIsapCloudAuthentication createGetIsapCloudAuthentication() {
        return new GetIsapCloudAuthentication();
    }

    /**
     * Create an instance of {@link ListOpenstackKeypairs }
     * 
     */
    public ListOpenstackKeypairs createListOpenstackKeypairs() {
        return new ListOpenstackKeypairs();
    }

    /**
     * Create an instance of {@link ListOpenstackFlavorsResponse }
     * 
     */
    public ListOpenstackFlavorsResponse createListOpenstackFlavorsResponse() {
        return new ListOpenstackFlavorsResponse();
    }

    /**
     * Create an instance of {@link GetIsapInstaceDetails }
     * 
     */
    public GetIsapInstaceDetails createGetIsapInstaceDetails() {
        return new GetIsapInstaceDetails();
    }

    /**
     * Create an instance of {@link ISAPUpdateDatabaseResponse }
     * 
     */
    public ISAPUpdateDatabaseResponse createISAPUpdateDatabaseResponse() {
        return new ISAPUpdateDatabaseResponse();
    }

    /**
     * Create an instance of {@link ISAPUpdateDatabase }
     * 
     */
    public ISAPUpdateDatabase createISAPUpdateDatabase() {
        return new ISAPUpdateDatabase();
    }

    /**
     * Create an instance of {@link GetIsapLaunchinstanceResponse }
     * 
     */
    public GetIsapLaunchinstanceResponse createGetIsapLaunchinstanceResponse() {
        return new GetIsapLaunchinstanceResponse();
    }

    /**
     * Create an instance of {@link ListOpenstackNetworksResponse }
     * 
     */
    public ListOpenstackNetworksResponse createListOpenstackNetworksResponse() {
        return new ListOpenstackNetworksResponse();
    }

    /**
     * Create an instance of {@link ListOpenstackKeypairsResponse }
     * 
     */
    public ListOpenstackKeypairsResponse createListOpenstackKeypairsResponse() {
        return new ListOpenstackKeypairsResponse();
    }

    /**
     * Create an instance of {@link GetOpenstackSecurityGroupDetailsResponse }
     * 
     */
    public GetOpenstackSecurityGroupDetailsResponse createGetOpenstackSecurityGroupDetailsResponse() {
        return new GetOpenstackSecurityGroupDetailsResponse();
    }

    /**
     * Create an instance of {@link com.isap.core.GetIsapCloudAuthenticationResponse }
     * 
     */
    public com.isap.core.GetIsapCloudAuthenticationResponse createGetIsapCloudAuthenticationResponse() {
        return new com.isap.core.GetIsapCloudAuthenticationResponse();
    }

    /**
     * Create an instance of {@link GetIsapLaunchinstance }
     * 
     */
    public GetIsapLaunchinstance createGetIsapLaunchinstance() {
        return new GetIsapLaunchinstance();
    }

    /**
     * Create an instance of {@link com.isap.core.ListOpenstackFlavors }
     * 
     */
    public com.isap.core.ListOpenstackFlavors createListOpenstackFlavors() {
        return new com.isap.core.ListOpenstackFlavors();
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
     * Create an instance of {@link ListOpenstackSecurityGroupsResponse }
     * 
     */
    public ListOpenstackSecurityGroupsResponse createListOpenstackSecurityGroupsResponse() {
        return new ListOpenstackSecurityGroupsResponse();
    }

    /**
     * Create an instance of {@link ListOpenstackImagesResponse }
     * 
     */
    public ListOpenstackImagesResponse createListOpenstackImagesResponse() {
        return new ListOpenstackImagesResponse();
    }

    /**
     * Create an instance of {@link GetOpenstackSecurityGroupDetails }
     * 
     */
    public GetOpenstackSecurityGroupDetails createGetOpenstackSecurityGroupDetails() {
        return new GetOpenstackSecurityGroupDetails();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOpenstackImagesResp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "return", scope = ListOpenstackImagesResponse.class)
    public JAXBElement<ListOpenstackImagesResp> createListOpenstackImagesResponseReturn(ListOpenstackImagesResp value) {
        return new JAXBElement<ListOpenstackImagesResp>(_ListOpenstackImagesResponseReturn_QNAME, ListOpenstackImagesResp.class, ListOpenstackImagesResponse.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIsapLaunchInstanceResp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "return", scope = GetIsapLaunchinstanceResponse.class)
    public JAXBElement<GetIsapLaunchInstanceResp> createGetIsapLaunchinstanceResponseReturn(GetIsapLaunchInstanceResp value) {
        return new JAXBElement<GetIsapLaunchInstanceResp>(_ListOpenstackImagesResponseReturn_QNAME, GetIsapLaunchInstanceResp.class, GetIsapLaunchinstanceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOpenstackFlavorsReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "lof", scope = com.isap.core.ListOpenstackFlavors.class)
    public JAXBElement<ListOpenstackFlavorsReq> createListOpenstackFlavorsLof(ListOpenstackFlavorsReq value) {
        return new JAXBElement<ListOpenstackFlavorsReq>(_ListOpenstackFlavorsLof_QNAME, ListOpenstackFlavorsReq.class, com.isap.core.ListOpenstackFlavors.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link com.isap.core.responses.xsd.GetIsapCloudAuthenticationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "return", scope = com.isap.core.GetIsapCloudAuthenticationResponse.class)
    public JAXBElement<com.isap.core.responses.xsd.GetIsapCloudAuthenticationResponse> createGetIsapCloudAuthenticationResponseReturn(com.isap.core.responses.xsd.GetIsapCloudAuthenticationResponse value) {
        return new JAXBElement<com.isap.core.responses.xsd.GetIsapCloudAuthenticationResponse>(_ListOpenstackImagesResponseReturn_QNAME, com.isap.core.responses.xsd.GetIsapCloudAuthenticationResponse.class, com.isap.core.GetIsapCloudAuthenticationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOpenstackSecurityGroupDetailsResp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "return", scope = GetOpenstackSecurityGroupDetailsResponse.class)
    public JAXBElement<GetOpenstackSecurityGroupDetailsResp> createGetOpenstackSecurityGroupDetailsResponseReturn(GetOpenstackSecurityGroupDetailsResp value) {
        return new JAXBElement<GetOpenstackSecurityGroupDetailsResp>(_ListOpenstackImagesResponseReturn_QNAME, GetOpenstackSecurityGroupDetailsResp.class, GetOpenstackSecurityGroupDetailsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOpenstackNetworksResp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "return", scope = ListOpenstackNetworksResponse.class)
    public JAXBElement<ListOpenstackNetworksResp> createListOpenstackNetworksResponseReturn(ListOpenstackNetworksResp value) {
        return new JAXBElement<ListOpenstackNetworksResp>(_ListOpenstackImagesResponseReturn_QNAME, ListOpenstackNetworksResp.class, ListOpenstackNetworksResponse.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOpenstackKeypairsResp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "return", scope = ListOpenstackKeypairsResponse.class)
    public JAXBElement<ListOpenstackKeypairsResp> createListOpenstackKeypairsResponseReturn(ListOpenstackKeypairsResp value) {
        return new JAXBElement<ListOpenstackKeypairsResp>(_ListOpenstackImagesResponseReturn_QNAME, ListOpenstackKeypairsResp.class, ListOpenstackKeypairsResponse.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIsapInstanceDetailsResp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "return", scope = GetIsapInstaceDetailsResponse.class)
    public JAXBElement<GetIsapInstanceDetailsResp> createGetIsapInstaceDetailsResponseReturn(GetIsapInstanceDetailsResp value) {
        return new JAXBElement<GetIsapInstanceDetailsResp>(_ListOpenstackImagesResponseReturn_QNAME, GetIsapInstanceDetailsResp.class, GetIsapInstaceDetailsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.isap.core.responses.xsd.ListOpenstackFlavors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "return", scope = ListOpenstackFlavorsResponse.class)
    public JAXBElement<com.isap.core.responses.xsd.ListOpenstackFlavors> createListOpenstackFlavorsResponseReturn(com.isap.core.responses.xsd.ListOpenstackFlavors value) {
        return new JAXBElement<com.isap.core.responses.xsd.ListOpenstackFlavors>(_ListOpenstackImagesResponseReturn_QNAME, com.isap.core.responses.xsd.ListOpenstackFlavors.class, ListOpenstackFlavorsResponse.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOpenstackFlavorDetailsReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "gofr", scope = GetOpenstackFlavorDetails.class)
    public JAXBElement<GetOpenstackFlavorDetailsReq> createGetOpenstackFlavorDetailsGofr(GetOpenstackFlavorDetailsReq value) {
        return new JAXBElement<GetOpenstackFlavorDetailsReq>(_GetOpenstackFlavorDetailsGofr_QNAME, GetOpenstackFlavorDetailsReq.class, GetOpenstackFlavorDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOpenstackFlavorResp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "return", scope = GetOpenstackFlavorDetailsResponse.class)
    public JAXBElement<GetOpenstackFlavorResp> createGetOpenstackFlavorDetailsResponseReturn(GetOpenstackFlavorResp value) {
        return new JAXBElement<GetOpenstackFlavorResp>(_ListOpenstackImagesResponseReturn_QNAME, GetOpenstackFlavorResp.class, GetOpenstackFlavorDetailsResponse.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOpenstackSecurityGroupsResp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "return", scope = ListOpenstackSecurityGroupsResponse.class)
    public JAXBElement<ListOpenstackSecurityGroupsResp> createListOpenstackSecurityGroupsResponseReturn(ListOpenstackSecurityGroupsResp value) {
        return new JAXBElement<ListOpenstackSecurityGroupsResp>(_ListOpenstackImagesResponseReturn_QNAME, ListOpenstackSecurityGroupsResp.class, ListOpenstackSecurityGroupsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOpenstackSecurityGroupDetailsReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "gosgr", scope = GetOpenstackSecurityGroupDetails.class)
    public JAXBElement<GetOpenstackSecurityGroupDetailsReq> createGetOpenstackSecurityGroupDetailsGosgr(GetOpenstackSecurityGroupDetailsReq value) {
        return new JAXBElement<GetOpenstackSecurityGroupDetailsReq>(_GetOpenstackSecurityGroupDetailsGosgr_QNAME, GetOpenstackSecurityGroupDetailsReq.class, GetOpenstackSecurityGroupDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOpenstackSecurityGroupsReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.isap.com", name = "losgr", scope = ListOpenstackSecurityGroups.class)
    public JAXBElement<ListOpenstackSecurityGroupsReq> createListOpenstackSecurityGroupsLosgr(ListOpenstackSecurityGroupsReq value) {
        return new JAXBElement<ListOpenstackSecurityGroupsReq>(_ListOpenstackSecurityGroupsLosgr_QNAME, ListOpenstackSecurityGroupsReq.class, ListOpenstackSecurityGroups.class, value);
    }

}

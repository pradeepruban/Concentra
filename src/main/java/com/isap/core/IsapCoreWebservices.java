
package com.isap.core;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "IsapCoreWebservices", targetNamespace = "http://core.isap.com", wsdlLocation = "http://192.168.175.15:9763/services/IsapCoreWebservices?wsdl")
public class IsapCoreWebservices
    extends Service
{

    private final static URL ISAPCOREWEBSERVICES_WSDL_LOCATION;
    private final static WebServiceException ISAPCOREWEBSERVICES_EXCEPTION;
    private final static QName ISAPCOREWEBSERVICES_QNAME = new QName("http://core.isap.com", "IsapCoreWebservices");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.175.15:9763/services/IsapCoreWebservices?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ISAPCOREWEBSERVICES_WSDL_LOCATION = url;
        ISAPCOREWEBSERVICES_EXCEPTION = e;
    }

    public IsapCoreWebservices() {
        super(__getWsdlLocation(), ISAPCOREWEBSERVICES_QNAME);
    }

    public IsapCoreWebservices(WebServiceFeature... features) {
        super(__getWsdlLocation(), ISAPCOREWEBSERVICES_QNAME, features);
    }

    public IsapCoreWebservices(URL wsdlLocation) {
        super(wsdlLocation, ISAPCOREWEBSERVICES_QNAME);
    }

    public IsapCoreWebservices(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ISAPCOREWEBSERVICES_QNAME, features);
    }

    public IsapCoreWebservices(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IsapCoreWebservices(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IsapCoreWebservicesPortType
     */
    @WebEndpoint(name = "IsapCoreWebservicesHttpSoap11Endpoint")
    public IsapCoreWebservicesPortType getIsapCoreWebservicesHttpSoap11Endpoint() {
        return super.getPort(new QName("http://core.isap.com", "IsapCoreWebservicesHttpSoap11Endpoint"), IsapCoreWebservicesPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IsapCoreWebservicesPortType
     */
    @WebEndpoint(name = "IsapCoreWebservicesHttpSoap11Endpoint")
    public IsapCoreWebservicesPortType getIsapCoreWebservicesHttpSoap11Endpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://core.isap.com", "IsapCoreWebservicesHttpSoap11Endpoint"), IsapCoreWebservicesPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ISAPCOREWEBSERVICES_EXCEPTION!= null) {
            throw ISAPCOREWEBSERVICES_EXCEPTION;
        }
        return ISAPCOREWEBSERVICES_WSDL_LOCATION;
    }

}

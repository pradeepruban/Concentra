
package com.amazonaws.util.json.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.amazonaws.util.json.xsd package. 
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

    private final static QName _JSONExceptionCause_QNAME = new QName("http://json.util.amazonaws.com/xsd", "cause");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.amazonaws.util.json.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JSONException }
     * 
     */
    public JSONException createJSONException() {
        return new JSONException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://json.util.amazonaws.com/xsd", name = "cause", scope = JSONException.class)
    public JAXBElement<Object> createJSONExceptionCause(Object value) {
        return new JAXBElement<Object>(_JSONExceptionCause_QNAME, Object.class, JSONException.class, value);
    }

}

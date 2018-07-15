
package hung.webservicetest;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the hung.webservicetest package. 
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

    private final static QName _GetServiceInfo_QNAME = new QName("http://webserviceTest.hung/", "getServiceInfo");
    private final static QName _GetServiceInfoResponse_QNAME = new QName("http://webserviceTest.hung/", "getServiceInfoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: hung.webservicetest
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetServiceInfoResponse }
     * 
     */
    public GetServiceInfoResponse createGetServiceInfoResponse() {
        return new GetServiceInfoResponse();
    }

    /**
     * Create an instance of {@link GetServiceInfo }
     * 
     */
    public GetServiceInfo createGetServiceInfo() {
        return new GetServiceInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webserviceTest.hung/", name = "getServiceInfo")
    public JAXBElement<GetServiceInfo> createGetServiceInfo(GetServiceInfo value) {
        return new JAXBElement<GetServiceInfo>(_GetServiceInfo_QNAME, GetServiceInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webserviceTest.hung/", name = "getServiceInfoResponse")
    public JAXBElement<GetServiceInfoResponse> createGetServiceInfoResponse(GetServiceInfoResponse value) {
        return new JAXBElement<GetServiceInfoResponse>(_GetServiceInfoResponse_QNAME, GetServiceInfoResponse.class, null, value);
    }

}

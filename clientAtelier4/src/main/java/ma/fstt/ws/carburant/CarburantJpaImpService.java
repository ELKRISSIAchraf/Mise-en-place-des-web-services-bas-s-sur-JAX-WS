
package ma.fstt.ws.carburant;

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
 * JAX-WS RI 3.0.2
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "CarburantJpaImpService", targetNamespace = "http://Ws.fstt.ma/", wsdlLocation = "http://localhost:7777/ws/Carburant?wsdl")
public class CarburantJpaImpService
    extends Service
{

    private final static URL CARBURANTJPAIMPSERVICE_WSDL_LOCATION;
    private final static WebServiceException CARBURANTJPAIMPSERVICE_EXCEPTION;
    private final static QName CARBURANTJPAIMPSERVICE_QNAME = new QName("http://Ws.fstt.ma/", "CarburantJpaImpService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:7777/ws/Carburant?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CARBURANTJPAIMPSERVICE_WSDL_LOCATION = url;
        CARBURANTJPAIMPSERVICE_EXCEPTION = e;
    }

    public CarburantJpaImpService() {
        super(__getWsdlLocation(), CARBURANTJPAIMPSERVICE_QNAME);
    }

    public CarburantJpaImpService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CARBURANTJPAIMPSERVICE_QNAME, features);
    }

    public CarburantJpaImpService(URL wsdlLocation) {
        super(wsdlLocation, CARBURANTJPAIMPSERVICE_QNAME);
    }

    public CarburantJpaImpService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CARBURANTJPAIMPSERVICE_QNAME, features);
    }

    public CarburantJpaImpService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CarburantJpaImpService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CarburantJpa
     */
    @WebEndpoint(name = "CarburantJpaImpPort")
    public CarburantJpa getCarburantJpaImpPort() {
        return super.getPort(new QName("http://Ws.fstt.ma/", "CarburantJpaImpPort"), CarburantJpa.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CarburantJpa
     */
    @WebEndpoint(name = "CarburantJpaImpPort")
    public CarburantJpa getCarburantJpaImpPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Ws.fstt.ma/", "CarburantJpaImpPort"), CarburantJpa.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CARBURANTJPAIMPSERVICE_EXCEPTION!= null) {
            throw CARBURANTJPAIMPSERVICE_EXCEPTION;
        }
        return CARBURANTJPAIMPSERVICE_WSDL_LOCATION;
    }

}
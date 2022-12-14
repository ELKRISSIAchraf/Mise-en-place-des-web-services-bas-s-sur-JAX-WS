
package ma.fstt.ws.carburant;

import javax.xml.namespace.QName;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ma.fstt.ws.carburant package. 
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

    private final static QName _AddCarburant_QNAME = new QName("http://Ws.fstt.ma/", "addCarburant");
    private final static QName _AddCarburantResponse_QNAME = new QName("http://Ws.fstt.ma/", "addCarburantResponse");
    private final static QName _DeleteCarburant_QNAME = new QName("http://Ws.fstt.ma/", "deleteCarburant");
    private final static QName _DeleteCarburantResponse_QNAME = new QName("http://Ws.fstt.ma/", "deleteCarburantResponse");
    private final static QName _GetCarburants_QNAME = new QName("http://Ws.fstt.ma/", "getCarburants");
    private final static QName _GetCarburantsResponse_QNAME = new QName("http://Ws.fstt.ma/", "getCarburantsResponse");
    private final static QName _TrouverById_QNAME = new QName("http://Ws.fstt.ma/", "trouverById");
    private final static QName _TrouverByIdResponse_QNAME = new QName("http://Ws.fstt.ma/", "trouverByIdResponse");
    private final static QName _UpdateCarburant_QNAME = new QName("http://Ws.fstt.ma/", "updateCarburant");
    private final static QName _UpdateCarburantResponse_QNAME = new QName("http://Ws.fstt.ma/", "updateCarburantResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ma.fstt.ws.carburant
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddCarburant }
     * 
     */
    public AddCarburant createAddCarburant() {
        return new AddCarburant();
    }

    /**
     * Create an instance of {@link AddCarburantResponse }
     * 
     */
    public AddCarburantResponse createAddCarburantResponse() {
        return new AddCarburantResponse();
    }

    /**
     * Create an instance of {@link DeleteCarburant }
     * 
     */
    public DeleteCarburant createDeleteCarburant() {
        return new DeleteCarburant();
    }

    /**
     * Create an instance of {@link DeleteCarburantResponse }
     * 
     */
    public DeleteCarburantResponse createDeleteCarburantResponse() {
        return new DeleteCarburantResponse();
    }

    /**
     * Create an instance of {@link GetCarburants }
     * 
     */
    public GetCarburants createGetCarburants() {
        return new GetCarburants();
    }

    /**
     * Create an instance of {@link GetCarburantsResponse }
     * 
     */
    public GetCarburantsResponse createGetCarburantsResponse() {
        return new GetCarburantsResponse();
    }

    /**
     * Create an instance of {@link TrouverById }
     * 
     */
    public TrouverById createTrouverById() {
        return new TrouverById();
    }

    /**
     * Create an instance of {@link TrouverByIdResponse }
     * 
     */
    public TrouverByIdResponse createTrouverByIdResponse() {
        return new TrouverByIdResponse();
    }

    /**
     * Create an instance of {@link UpdateCarburant }
     * 
     */
    public UpdateCarburant createUpdateCarburant() {
        return new UpdateCarburant();
    }

    /**
     * Create an instance of {@link UpdateCarburantResponse }
     * 
     */
    public UpdateCarburantResponse createUpdateCarburantResponse() {
        return new UpdateCarburantResponse();
    }

    /**
     * Create an instance of {@link Carburant }
     * 
     */
    public Carburant createCarburant() {
        return new Carburant();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCarburant }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddCarburant }{@code >}
     */
    @XmlElementDecl(namespace = "http://Ws.fstt.ma/", name = "addCarburant")
    public JAXBElement<AddCarburant> createAddCarburant(AddCarburant value) {
        return new JAXBElement<AddCarburant>(_AddCarburant_QNAME, AddCarburant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCarburantResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddCarburantResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Ws.fstt.ma/", name = "addCarburantResponse")
    public JAXBElement<AddCarburantResponse> createAddCarburantResponse(AddCarburantResponse value) {
        return new JAXBElement<AddCarburantResponse>(_AddCarburantResponse_QNAME, AddCarburantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCarburant }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteCarburant }{@code >}
     */
    @XmlElementDecl(namespace = "http://Ws.fstt.ma/", name = "deleteCarburant")
    public JAXBElement<DeleteCarburant> createDeleteCarburant(DeleteCarburant value) {
        return new JAXBElement<DeleteCarburant>(_DeleteCarburant_QNAME, DeleteCarburant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCarburantResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteCarburantResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Ws.fstt.ma/", name = "deleteCarburantResponse")
    public JAXBElement<DeleteCarburantResponse> createDeleteCarburantResponse(DeleteCarburantResponse value) {
        return new JAXBElement<DeleteCarburantResponse>(_DeleteCarburantResponse_QNAME, DeleteCarburantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCarburants }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCarburants }{@code >}
     */
    @XmlElementDecl(namespace = "http://Ws.fstt.ma/", name = "getCarburants")
    public JAXBElement<GetCarburants> createGetCarburants(GetCarburants value) {
        return new JAXBElement<GetCarburants>(_GetCarburants_QNAME, GetCarburants.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCarburantsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCarburantsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Ws.fstt.ma/", name = "getCarburantsResponse")
    public JAXBElement<GetCarburantsResponse> createGetCarburantsResponse(GetCarburantsResponse value) {
        return new JAXBElement<GetCarburantsResponse>(_GetCarburantsResponse_QNAME, GetCarburantsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrouverById }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrouverById }{@code >}
     */
    @XmlElementDecl(namespace = "http://Ws.fstt.ma/", name = "trouverById")
    public JAXBElement<TrouverById> createTrouverById(TrouverById value) {
        return new JAXBElement<TrouverById>(_TrouverById_QNAME, TrouverById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrouverByIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrouverByIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Ws.fstt.ma/", name = "trouverByIdResponse")
    public JAXBElement<TrouverByIdResponse> createTrouverByIdResponse(TrouverByIdResponse value) {
        return new JAXBElement<TrouverByIdResponse>(_TrouverByIdResponse_QNAME, TrouverByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCarburant }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateCarburant }{@code >}
     */
    @XmlElementDecl(namespace = "http://Ws.fstt.ma/", name = "updateCarburant")
    public JAXBElement<UpdateCarburant> createUpdateCarburant(UpdateCarburant value) {
        return new JAXBElement<UpdateCarburant>(_UpdateCarburant_QNAME, UpdateCarburant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCarburantResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateCarburantResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Ws.fstt.ma/", name = "updateCarburantResponse")
    public JAXBElement<UpdateCarburantResponse> createUpdateCarburantResponse(UpdateCarburantResponse value) {
        return new JAXBElement<UpdateCarburantResponse>(_UpdateCarburantResponse_QNAME, UpdateCarburantResponse.class, null, value);
    }

}

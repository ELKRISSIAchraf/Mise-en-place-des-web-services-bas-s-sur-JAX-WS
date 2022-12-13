
package ma.fstt.ws.histcarburant;

import javax.xml.namespace.QName;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ma.fstt.ws.histcarburant package. 
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

    private final static QName _AddHistCarburant_QNAME = new QName("http://Ws.fstt.ma/", "addHistCarburant");
    private final static QName _AddHistCarburantResponse_QNAME = new QName("http://Ws.fstt.ma/", "addHistCarburantResponse");
    private final static QName _DeleteHistCarburant_QNAME = new QName("http://Ws.fstt.ma/", "deleteHistCarburant");
    private final static QName _DeleteHistCarburantResponse_QNAME = new QName("http://Ws.fstt.ma/", "deleteHistCarburantResponse");
    private final static QName _GetHistCarburants_QNAME = new QName("http://Ws.fstt.ma/", "getHistCarburants");
    private final static QName _GetHistCarburantsResponse_QNAME = new QName("http://Ws.fstt.ma/", "getHistCarburantsResponse");
    private final static QName _GetPrices_QNAME = new QName("http://Ws.fstt.ma/", "getPrices");
    private final static QName _GetPricesResponse_QNAME = new QName("http://Ws.fstt.ma/", "getPricesResponse");
    private final static QName _TrouverById_QNAME = new QName("http://Ws.fstt.ma/", "trouverById");
    private final static QName _TrouverByIdResponse_QNAME = new QName("http://Ws.fstt.ma/", "trouverByIdResponse");
    private final static QName _UpdateHistCarburant_QNAME = new QName("http://Ws.fstt.ma/", "updateHistCarburant");
    private final static QName _UpdateHistCarburantResponse_QNAME = new QName("http://Ws.fstt.ma/", "updateHistCarburantResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ma.fstt.ws.histcarburant
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddHistCarburant }
     * 
     */
    public AddHistCarburant createAddHistCarburant() {
        return new AddHistCarburant();
    }

    /**
     * Create an instance of {@link AddHistCarburantResponse }
     * 
     */
    public AddHistCarburantResponse createAddHistCarburantResponse() {
        return new AddHistCarburantResponse();
    }

    /**
     * Create an instance of {@link DeleteHistCarburant }
     * 
     */
    public DeleteHistCarburant createDeleteHistCarburant() {
        return new DeleteHistCarburant();
    }

    /**
     * Create an instance of {@link DeleteHistCarburantResponse }
     * 
     */
    public DeleteHistCarburantResponse createDeleteHistCarburantResponse() {
        return new DeleteHistCarburantResponse();
    }

    /**
     * Create an instance of {@link GetHistCarburants }
     * 
     */
    public GetHistCarburants createGetHistCarburants() {
        return new GetHistCarburants();
    }

    /**
     * Create an instance of {@link GetHistCarburantsResponse }
     * 
     */
    public GetHistCarburantsResponse createGetHistCarburantsResponse() {
        return new GetHistCarburantsResponse();
    }

    /**
     * Create an instance of {@link GetPrices }
     * 
     */
    public GetPrices createGetPrices() {
        return new GetPrices();
    }

    /**
     * Create an instance of {@link GetPricesResponse }
     * 
     */
    public GetPricesResponse createGetPricesResponse() {
        return new GetPricesResponse();
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
     * Create an instance of {@link UpdateHistCarburant }
     * 
     */
    public UpdateHistCarburant createUpdateHistCarburant() {
        return new UpdateHistCarburant();
    }

    /**
     * Create an instance of {@link UpdateHistCarburantResponse }
     * 
     */
    public UpdateHistCarburantResponse createUpdateHistCarburantResponse() {
        return new UpdateHistCarburantResponse();
    }

    /**
     * Create an instance of {@link HistCarburant }
     * 
     */
    public HistCarburant createHistCarburant() {
        return new HistCarburant();
    }

    /**
     * Create an instance of {@link Date }
     * 
     */
    public Date createDate() {
        return new Date();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddHistCarburant }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddHistCarburant }{@code >}
     */
    @XmlElementDecl(namespace = "http://Ws.fstt.ma/", name = "addHistCarburant")
    public JAXBElement<AddHistCarburant> createAddHistCarburant(AddHistCarburant value) {
        return new JAXBElement<AddHistCarburant>(_AddHistCarburant_QNAME, AddHistCarburant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddHistCarburantResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddHistCarburantResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Ws.fstt.ma/", name = "addHistCarburantResponse")
    public JAXBElement<AddHistCarburantResponse> createAddHistCarburantResponse(AddHistCarburantResponse value) {
        return new JAXBElement<AddHistCarburantResponse>(_AddHistCarburantResponse_QNAME, AddHistCarburantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteHistCarburant }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteHistCarburant }{@code >}
     */
    @XmlElementDecl(namespace = "http://Ws.fstt.ma/", name = "deleteHistCarburant")
    public JAXBElement<DeleteHistCarburant> createDeleteHistCarburant(DeleteHistCarburant value) {
        return new JAXBElement<DeleteHistCarburant>(_DeleteHistCarburant_QNAME, DeleteHistCarburant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteHistCarburantResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteHistCarburantResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Ws.fstt.ma/", name = "deleteHistCarburantResponse")
    public JAXBElement<DeleteHistCarburantResponse> createDeleteHistCarburantResponse(DeleteHistCarburantResponse value) {
        return new JAXBElement<DeleteHistCarburantResponse>(_DeleteHistCarburantResponse_QNAME, DeleteHistCarburantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHistCarburants }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetHistCarburants }{@code >}
     */
    @XmlElementDecl(namespace = "http://Ws.fstt.ma/", name = "getHistCarburants")
    public JAXBElement<GetHistCarburants> createGetHistCarburants(GetHistCarburants value) {
        return new JAXBElement<GetHistCarburants>(_GetHistCarburants_QNAME, GetHistCarburants.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHistCarburantsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetHistCarburantsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Ws.fstt.ma/", name = "getHistCarburantsResponse")
    public JAXBElement<GetHistCarburantsResponse> createGetHistCarburantsResponse(GetHistCarburantsResponse value) {
        return new JAXBElement<GetHistCarburantsResponse>(_GetHistCarburantsResponse_QNAME, GetHistCarburantsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPrices }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPrices }{@code >}
     */
    @XmlElementDecl(namespace = "http://Ws.fstt.ma/", name = "getPrices")
    public JAXBElement<GetPrices> createGetPrices(GetPrices value) {
        return new JAXBElement<GetPrices>(_GetPrices_QNAME, GetPrices.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPricesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPricesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Ws.fstt.ma/", name = "getPricesResponse")
    public JAXBElement<GetPricesResponse> createGetPricesResponse(GetPricesResponse value) {
        return new JAXBElement<GetPricesResponse>(_GetPricesResponse_QNAME, GetPricesResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateHistCarburant }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateHistCarburant }{@code >}
     */
    @XmlElementDecl(namespace = "http://Ws.fstt.ma/", name = "updateHistCarburant")
    public JAXBElement<UpdateHistCarburant> createUpdateHistCarburant(UpdateHistCarburant value) {
        return new JAXBElement<UpdateHistCarburant>(_UpdateHistCarburant_QNAME, UpdateHistCarburant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateHistCarburantResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateHistCarburantResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Ws.fstt.ma/", name = "updateHistCarburantResponse")
    public JAXBElement<UpdateHistCarburantResponse> createUpdateHistCarburantResponse(UpdateHistCarburantResponse value) {
        return new JAXBElement<UpdateHistCarburantResponse>(_UpdateHistCarburantResponse_QNAME, UpdateHistCarburantResponse.class, null, value);
    }

}

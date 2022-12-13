
package ma.fstt.ws.station;

import javax.xml.namespace.QName;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ma.fstt.ws.station package. 
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

    private final static QName _AddStation_QNAME = new QName("http://Ws.fstt.ma/", "addStation");
    private final static QName _AddStationResponse_QNAME = new QName("http://Ws.fstt.ma/", "addStationResponse");
    private final static QName _DeleteStation_QNAME = new QName("http://Ws.fstt.ma/", "deleteStation");
    private final static QName _DeleteStationResponse_QNAME = new QName("http://Ws.fstt.ma/", "deleteStationResponse");
    private final static QName _GetStations_QNAME = new QName("http://Ws.fstt.ma/", "getStations");
    private final static QName _GetStationsResponse_QNAME = new QName("http://Ws.fstt.ma/", "getStationsResponse");
    private final static QName _TrouverById_QNAME = new QName("http://Ws.fstt.ma/", "trouverById");
    private final static QName _TrouverByIdResponse_QNAME = new QName("http://Ws.fstt.ma/", "trouverByIdResponse");
    private final static QName _UpdateStation_QNAME = new QName("http://Ws.fstt.ma/", "updateStation");
    private final static QName _UpdateStationResponse_QNAME = new QName("http://Ws.fstt.ma/", "updateStationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ma.fstt.ws.station
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddStation }
     * 
     */
    public AddStation createAddStation() {
        return new AddStation();
    }

    /**
     * Create an instance of {@link AddStationResponse }
     * 
     */
    public AddStationResponse createAddStationResponse() {
        return new AddStationResponse();
    }

    /**
     * Create an instance of {@link DeleteStation }
     * 
     */
    public DeleteStation createDeleteStation() {
        return new DeleteStation();
    }

    /**
     * Create an instance of {@link DeleteStationResponse }
     * 
     */
    public DeleteStationResponse createDeleteStationResponse() {
        return new DeleteStationResponse();
    }

    /**
     * Create an instance of {@link GetStations }
     * 
     */
    public GetStations createGetStations() {
        return new GetStations();
    }

    /**
     * Create an instance of {@link GetStationsResponse }
     * 
     */
    public GetStationsResponse createGetStationsResponse() {
        return new GetStationsResponse();
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
     * Create an instance of {@link UpdateStation }
     * 
     */
    public UpdateStation createUpdateStation() {
        return new UpdateStation();
    }

    /**
     * Create an instance of {@link UpdateStationResponse }
     * 
     */
    public UpdateStationResponse createUpdateStationResponse() {
        return new UpdateStationResponse();
    }

    /**
     * Create an instance of {@link Station }
     * 
     */
    public Station createStation() {
        return new Station();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddStation }{@code >}
     */
    @XmlElementDecl(namespace = "http://Ws.fstt.ma/", name = "addStation")
    public JAXBElement<AddStation> createAddStation(AddStation value) {
        return new JAXBElement<AddStation>(_AddStation_QNAME, AddStation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddStationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Ws.fstt.ma/", name = "addStationResponse")
    public JAXBElement<AddStationResponse> createAddStationResponse(AddStationResponse value) {
        return new JAXBElement<AddStationResponse>(_AddStationResponse_QNAME, AddStationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteStation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteStation }{@code >}
     */
    @XmlElementDecl(namespace = "http://Ws.fstt.ma/", name = "deleteStation")
    public JAXBElement<DeleteStation> createDeleteStation(DeleteStation value) {
        return new JAXBElement<DeleteStation>(_DeleteStation_QNAME, DeleteStation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteStationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteStationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Ws.fstt.ma/", name = "deleteStationResponse")
    public JAXBElement<DeleteStationResponse> createDeleteStationResponse(DeleteStationResponse value) {
        return new JAXBElement<DeleteStationResponse>(_DeleteStationResponse_QNAME, DeleteStationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStations }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStations }{@code >}
     */
    @XmlElementDecl(namespace = "http://Ws.fstt.ma/", name = "getStations")
    public JAXBElement<GetStations> createGetStations(GetStations value) {
        return new JAXBElement<GetStations>(_GetStations_QNAME, GetStations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStationsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStationsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Ws.fstt.ma/", name = "getStationsResponse")
    public JAXBElement<GetStationsResponse> createGetStationsResponse(GetStationsResponse value) {
        return new JAXBElement<GetStationsResponse>(_GetStationsResponse_QNAME, GetStationsResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateStation }{@code >}
     */
    @XmlElementDecl(namespace = "http://Ws.fstt.ma/", name = "updateStation")
    public JAXBElement<UpdateStation> createUpdateStation(UpdateStation value) {
        return new JAXBElement<UpdateStation>(_UpdateStation_QNAME, UpdateStation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateStationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Ws.fstt.ma/", name = "updateStationResponse")
    public JAXBElement<UpdateStationResponse> createUpdateStationResponse(UpdateStationResponse value) {
        return new JAXBElement<UpdateStationResponse>(_UpdateStationResponse_QNAME, UpdateStationResponse.class, null, value);
    }

}

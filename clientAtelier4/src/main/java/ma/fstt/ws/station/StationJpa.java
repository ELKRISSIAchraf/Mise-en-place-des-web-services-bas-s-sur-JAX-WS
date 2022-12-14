
package ma.fstt.ws.station;

import java.util.List;



import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.2
 * Generated source version: 3.0
 * 
 */
@WebService(name = "StationJpa", targetNamespace = "http://Ws.fstt.ma/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface StationJpa {


    /**
     * 
     * @return
     *     returns java.util.List<ma.fstt.ws.station.Station>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStations", targetNamespace = "http://Ws.fstt.ma/", className = "ma.fstt.ws.station.GetStations")
    @ResponseWrapper(localName = "getStationsResponse", targetNamespace = "http://Ws.fstt.ma/", className = "ma.fstt.ws.station.GetStationsResponse")
    @Action(input = "http://Ws.fstt.ma/StationJpa/getStationsRequest", output = "http://Ws.fstt.ma/StationJpa/getStationsResponse")
    public List<Station> getStations();

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "deleteStation", targetNamespace = "http://Ws.fstt.ma/", className = "ma.fstt.ws.station.DeleteStation")
    @ResponseWrapper(localName = "deleteStationResponse", targetNamespace = "http://Ws.fstt.ma/", className = "ma.fstt.ws.station.DeleteStationResponse")
    @Action(input = "http://Ws.fstt.ma/StationJpa/deleteStationRequest", output = "http://Ws.fstt.ma/StationJpa/deleteStationResponse")
    public void deleteStation(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "updateStation", targetNamespace = "http://Ws.fstt.ma/", className = "ma.fstt.ws.station.UpdateStation")
    @ResponseWrapper(localName = "updateStationResponse", targetNamespace = "http://Ws.fstt.ma/", className = "ma.fstt.ws.station.UpdateStationResponse")
    @Action(input = "http://Ws.fstt.ma/StationJpa/updateStationRequest", output = "http://Ws.fstt.ma/StationJpa/updateStationResponse")
    public void updateStation(
        @WebParam(name = "arg0", targetNamespace = "")
        Station arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "addStation", targetNamespace = "http://Ws.fstt.ma/", className = "ma.fstt.ws.station.AddStation")
    @ResponseWrapper(localName = "addStationResponse", targetNamespace = "http://Ws.fstt.ma/", className = "ma.fstt.ws.station.AddStationResponse")
    @Action(input = "http://Ws.fstt.ma/StationJpa/addStationRequest", output = "http://Ws.fstt.ma/StationJpa/addStationResponse")
    public void addStation(
        @WebParam(name = "arg0", targetNamespace = "")
        Station arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns ma.fstt.ws.station.Station
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "trouverById", targetNamespace = "http://Ws.fstt.ma/", className = "ma.fstt.ws.station.TrouverById")
    @ResponseWrapper(localName = "trouverByIdResponse", targetNamespace = "http://Ws.fstt.ma/", className = "ma.fstt.ws.station.TrouverByIdResponse")
    @Action(input = "http://Ws.fstt.ma/StationJpa/trouverByIdRequest", output = "http://Ws.fstt.ma/StationJpa/trouverByIdResponse")
    public Station trouverById(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0);

}

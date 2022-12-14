
package ma.fstt.ws.carburant;

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
@WebService(name = "CarburantJpa", targetNamespace = "http://Ws.fstt.ma/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CarburantJpa {


    /**
     * 
     * @return
     *     returns java.util.List<ma.fstt.ws.carburant.Carburant>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCarburants", targetNamespace = "http://Ws.fstt.ma/", className = "ma.fstt.ws.carburant.GetCarburants")
    @ResponseWrapper(localName = "getCarburantsResponse", targetNamespace = "http://Ws.fstt.ma/", className = "ma.fstt.ws.carburant.GetCarburantsResponse")
    @Action(input = "http://Ws.fstt.ma/CarburantJpa/getCarburantsRequest", output = "http://Ws.fstt.ma/CarburantJpa/getCarburantsResponse")
    public List<Carburant> getCarburants();

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "updateCarburant", targetNamespace = "http://Ws.fstt.ma/", className = "ma.fstt.ws.carburant.UpdateCarburant")
    @ResponseWrapper(localName = "updateCarburantResponse", targetNamespace = "http://Ws.fstt.ma/", className = "ma.fstt.ws.carburant.UpdateCarburantResponse")
    @Action(input = "http://Ws.fstt.ma/CarburantJpa/updateCarburantRequest", output = "http://Ws.fstt.ma/CarburantJpa/updateCarburantResponse")
    public void updateCarburant(
        @WebParam(name = "arg0", targetNamespace = "")
        Carburant arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "deleteCarburant", targetNamespace = "http://Ws.fstt.ma/", className = "ma.fstt.ws.carburant.DeleteCarburant")
    @ResponseWrapper(localName = "deleteCarburantResponse", targetNamespace = "http://Ws.fstt.ma/", className = "ma.fstt.ws.carburant.DeleteCarburantResponse")
    @Action(input = "http://Ws.fstt.ma/CarburantJpa/deleteCarburantRequest", output = "http://Ws.fstt.ma/CarburantJpa/deleteCarburantResponse")
    public void deleteCarburant(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns ma.fstt.ws.carburant.Carburant
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "trouverById", targetNamespace = "http://Ws.fstt.ma/", className = "ma.fstt.ws.carburant.TrouverById")
    @ResponseWrapper(localName = "trouverByIdResponse", targetNamespace = "http://Ws.fstt.ma/", className = "ma.fstt.ws.carburant.TrouverByIdResponse")
    @Action(input = "http://Ws.fstt.ma/CarburantJpa/trouverByIdRequest", output = "http://Ws.fstt.ma/CarburantJpa/trouverByIdResponse")
    public Carburant trouverById(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "addCarburant", targetNamespace = "http://Ws.fstt.ma/", className = "ma.fstt.ws.carburant.AddCarburant")
    @ResponseWrapper(localName = "addCarburantResponse", targetNamespace = "http://Ws.fstt.ma/", className = "ma.fstt.ws.carburant.AddCarburantResponse")
    @Action(input = "http://Ws.fstt.ma/CarburantJpa/addCarburantRequest", output = "http://Ws.fstt.ma/CarburantJpa/addCarburantResponse")
    public void addCarburant(
        @WebParam(name = "arg0", targetNamespace = "")
        Carburant arg0);

}

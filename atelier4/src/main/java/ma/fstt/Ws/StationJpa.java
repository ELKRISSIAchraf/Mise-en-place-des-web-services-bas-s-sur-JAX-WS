package ma.fstt.Ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import ma.fstt.entities.Station;
@WebService
@SOAPBinding(style =Style.DOCUMENT )
public interface StationJpa {
	@WebMethod
	public List<Station> getStations();
	@WebMethod
	public void addStation(Station station );
	@WebMethod
	public  void deleteStation(Long id);
	@WebMethod
	public void updateStation(Station station );
	@WebMethod
	public Station trouverById(Long id);
}



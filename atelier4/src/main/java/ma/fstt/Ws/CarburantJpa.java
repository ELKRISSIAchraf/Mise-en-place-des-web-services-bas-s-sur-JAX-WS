package ma.fstt.Ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import ma.fstt.entities.Carburant;

@WebService
@SOAPBinding(style =Style.DOCUMENT )
public interface CarburantJpa {
	@WebMethod
	public List<Carburant> getCarburants();
	@WebMethod
	public void addCarburant(Carburant carburant );
	@WebMethod
	public  void deleteCarburant(Long id);
	@WebMethod
	public void updateCarburant(Carburant carburant );
	@WebMethod
	public Carburant trouverById(Long id);
}

package ma.fstt.Ws;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import ma.fstt.entities.HistCarburant;

@WebService
@SOAPBinding(style =Style.DOCUMENT )
public interface HistCarburantJpa {
	@WebMethod
	public List<HistCarburant> getHistCarburants();
	@WebMethod
	public void addHistCarburant(HistCarburant histcarburant );
	@WebMethod
	public  void deleteHistCarburant(Long id);
	@WebMethod
	public void updateHistCarburant(HistCarburant histcarburant );
	@WebMethod
	public HistCarburant trouverById(Long id);
	@WebMethod
public List<String> getPrices(String name_station,Date date);
}

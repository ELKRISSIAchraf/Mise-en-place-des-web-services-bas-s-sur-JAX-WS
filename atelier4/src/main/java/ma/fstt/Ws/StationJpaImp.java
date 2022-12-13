package ma.fstt.Ws;

import java.util.List;


import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import ma.fstt.entities.Station;
@WebService(endpointInterface = "ma.fstt.Ws.StationJpa")  
public class StationJpaImp implements StationJpa {
	private static final String PERSISTENCE_UNIT_NAME = "unit";	
	private static EntityManager entityMgrObj = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME).createEntityManager();
	private static EntityTransaction transactionObj = entityMgrObj.getTransaction();
	@Override
	public List<Station> getStations() {
		// TODO Auto-generated method stub
		javax.persistence.Query queryObj =  entityMgrObj.createQuery("SELECT e FROM Station e");
	@SuppressWarnings("unchecked")
	List<Station> lList = ((javax.persistence.Query) queryObj).getResultList();
	if (lList != null && lList.size() > 0) {			
		return lList;
	} else {
		return null;
	}
	}

	@Override
	public void addStation(Station station) {
		// TODO Auto-generated method stub
		if(!transactionObj.isActive()) {
			transactionObj.begin();
		}
        String nom = station.getNom();
        String adresse =station.getAdresse();
        String ville =station.getVille();
        Station sta = new Station(0L,nom, ville,adresse);	
		entityMgrObj.persist(sta);
		transactionObj.commit();
	}

	@Override
	public void deleteStation(Long id) {
		// TODO Auto-generated method stub
		if(!transactionObj.isActive()) {
			transactionObj.begin();
		}
		Station u =entityMgrObj.find(Station.class, id);
		entityMgrObj.remove(u);
		transactionObj.commit();	
	}

	@Override
	public void updateStation(Station station) {
		// TODO Auto-generated method stub
		Station u =entityMgrObj.find(Station.class, station.getId_sta());
		u.setNom(station.getNom());
		u.setVille(station.getVille());
		u.setAdresse(station.getAdresse());


	}
	public Station trouverById(Long id)  {if(!transactionObj.isActive()) {
		transactionObj.begin();
	}
	return entityMgrObj.find(Station.class,id);}
	public String test() {return "ca maaaaaaaaaaaaaaaaaaaaaaaaaaarche ";}
	
}

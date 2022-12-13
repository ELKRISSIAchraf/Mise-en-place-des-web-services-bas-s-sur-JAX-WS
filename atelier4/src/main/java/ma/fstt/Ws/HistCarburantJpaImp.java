package ma.fstt.Ws;


import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import ma.fstt.entities.Carburant;
import ma.fstt.entities.HistCarburant;
import ma.fstt.entities.Station;
@WebService(endpointInterface = "ma.fstt.Ws.HistCarburantJpa") 
public class HistCarburantJpaImp implements HistCarburantJpa {
	private static final String PERSISTENCE_UNIT_NAME = "unit";	
	private static EntityManager entityMgrObj = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME).createEntityManager();
	private static EntityTransaction transactionObj = entityMgrObj.getTransaction();
	@Override
	public List<HistCarburant> getHistCarburants() {
		// TODO Auto-generated method stub
		javax.persistence.Query queryObj =  entityMgrObj.createQuery("SELECT e FROM HistCarburant e");
		@SuppressWarnings("unchecked")
		List<HistCarburant> lList = ((javax.persistence.Query) queryObj).getResultList();
		if (lList != null && lList.size() > 0) {			
			return lList;
		} else {
			return null;
		}
	}
	@Override
	public void addHistCarburant(HistCarburant histcarburant) {
		// TODO Auto-generated method stub
		if(!transactionObj.isActive()) {
			transactionObj.begin();
		}
      Date date =histcarburant.getDate();
      Long id_car=histcarburant.getId_car();
      Long id_sta =histcarburant.getId_sta();
        Double prix =histcarburant.getPrix();
        HistCarburant car = new HistCarburant(0L,id_car, id_sta,date,prix);	
		entityMgrObj.persist(car);
		transactionObj.commit();
	}
	@Override
	public void deleteHistCarburant(Long id) {
		// TODO Auto-generated method stub
		if(!transactionObj.isActive()) {
			transactionObj.begin();
		}
		HistCarburant u =entityMgrObj.find(HistCarburant.class, id);
		entityMgrObj.remove(u);
		transactionObj.commit();
	}
	@Override
	public void updateHistCarburant(HistCarburant histcarburant) {
		// TODO Auto-generated method stub
		HistCarburant u =entityMgrObj.find(HistCarburant.class, histcarburant.getId_histcar());
		u.setPrix(histcarburant.getPrix());
		u.setDate(histcarburant.getDate());
		u.setId_car(histcarburant.getId_car());
		u.setId_sta(histcarburant.getId_sta());
	}
	public HistCarburant trouverById(Long id)  {if(!transactionObj.isActive()) {
		transactionObj.begin();
	}
	return entityMgrObj.find(HistCarburant.class,id);
}
	@Override
	public List<String> getPrices(String name_station, Date date) {
		Station sta=getStationByname(name_station);
		List<HistCarburant> hiscar =getHistCarburants();
		List<String>  prices=new ArrayList();
		for (HistCarburant histCarburant : hiscar) {
			if(histCarburant.getDate()==date && histCarburant.getId_sta()==sta.getId_sta()) {
				     if(!transactionObj.isActive()) {
				         	transactionObj.begin();
				     }
				     prices.add(entityMgrObj.find(Carburant.class,histCarburant.getId_car()).getNom()+" : "+histCarburant.getPrix());
			}
		}
		if (prices != null && prices.size() > 0) {			
			return prices;
		} else {
			return null;
		}
		
	}
public Station getStationByname(String name) {
	javax.persistence.Query queryObj =  entityMgrObj.createQuery("SELECT e FROM Station e where e.nom=:name").setParameter("name", name);
	
	Station stat =  (Station) ((javax.persistence.Query) queryObj).getSingleResult();
	if (stat != null ) {			
		return stat;
	} else {
		return null;
	}
}

}

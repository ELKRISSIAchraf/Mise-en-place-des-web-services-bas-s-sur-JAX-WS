package ma.fstt.Ws;

import java.util.List;


import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import ma.fstt.entities.Carburant;

@WebService(endpointInterface = "ma.fstt.Ws.CarburantJpa")  
public class CarburantJpaImp implements CarburantJpa{
	private static final String PERSISTENCE_UNIT_NAME = "unit";	
	private static EntityManager entityMgrObj = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME).createEntityManager();
	private static EntityTransaction transactionObj = entityMgrObj.getTransaction();
	@Override
	public List<Carburant> getCarburants() {
		// TODO Auto-generated method stub
		javax.persistence.Query queryObj =  entityMgrObj.createQuery("SELECT e FROM Carburant e");
		@SuppressWarnings("unchecked")
		List<Carburant> lList = ((javax.persistence.Query) queryObj).getResultList();
		if (lList != null && lList.size() > 0) {			
			return lList;
		} else {
			return null;
		}
	}
	@Override
	public void addCarburant(Carburant carburant) {
		// TODO Auto-generated method stub
		if(!transactionObj.isActive()) {
			transactionObj.begin();
		}
        String nom =carburant.getNom();
        String desc =carburant.getDescription();
        Carburant car = new Carburant(0L,nom, desc);	
		entityMgrObj.persist(car);
		transactionObj.commit();
	}
	@Override
	public void deleteCarburant(Long id) {
		// TODO Auto-generated method stub
		if(!transactionObj.isActive()) {
			transactionObj.begin();
		}
		Carburant u =entityMgrObj.find(Carburant.class, id);
		entityMgrObj.remove(u);
		transactionObj.commit();	
	}
	@Override
	public void updateCarburant(Carburant carburant) {
		// TODO Auto-generated method stub
		Carburant u =entityMgrObj.find(Carburant.class, carburant.getId_car());
		u.setNom(carburant.getNom());
		u.setDescription(carburant.getDescription());
	}
	public Carburant trouverById(Long id)  {if(!transactionObj.isActive()) {
		transactionObj.begin();
	}
	return entityMgrObj.find(Carburant.class,id);
}
}
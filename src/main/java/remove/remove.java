package remove;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entit_classes.Pancard;
import entit_classes.Person;

public class remove {
	public static void main(String[] args) {
		
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernate_one_to_one_uni");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	Person p=em.find(Person.class, 3);
	Pancard pan=p.getPancard();
	p.setPancard(null);
	
	et.begin();
	em.merge(p);
	em.remove(pan);
	et.commit();
	
	}
}

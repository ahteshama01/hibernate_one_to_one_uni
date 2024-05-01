package merge;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entit_classes.Pancard;
import entit_classes.Person;

public class Merge {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernate_one_to_one_uni");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	
	Person p3=em.find(Person.class, 3);
	Pancard pan3=em.find(Pancard.class, 104);
	
	p3.setPancard(pan3);
	
	et.begin();
	em.merge(pan3);
	et.commit();
  }
}

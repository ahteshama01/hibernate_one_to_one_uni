package fetch;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entit_classes.Pancard;
import entit_classes.Person;

public class fetch {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernate_one_to_one_uni");
		EntityManager em=emf.createEntityManager();
		
		Person p=em.find(Person.class, 1);
		System.out.println(p);
		
		Pancard pan=p.getPancard();
		System.out.println(pan);
	}
}

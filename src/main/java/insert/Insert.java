package insert;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entit_classes.Pancard;
import entit_classes.Person;

public class Insert {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernate_one_to_one_uni");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		
		
	Pancard pan1=new Pancard(101,"Delhi","1 jan 2020");
	Person p1=new Person(1,"shubham","111",pan1);		
	Pancard pan2=new Pancard(102,"Maharastra","10 Sep 1997");
	Person p2=new Person(2,"shubham","222",pan2);
		
		
		Pancard pan3=new Pancard(103,"Karnataka","10 Feb 1998");
		Person p3=new Person(3,"Ganesh","333",null);
		
		et.begin();
		em.persist(pan1);
		em.persist(p1);
		em.persist(pan2);
		em.persist(p2);
		em.persist(pan3);
		em.persist(p3);
		et.commit();
		
	}
}

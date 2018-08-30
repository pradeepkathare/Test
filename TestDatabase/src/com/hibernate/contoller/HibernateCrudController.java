package com.hibernate.contoller;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

/*
 * Pradeep.kathare
 * 
 */
public class HibernateCrudController {

	public static void main(String[] args) {

		SessionFactory sessionFactory =   new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		tx.begin();
		//Create operation : 
		
		/*
		 * HQL Insert 
		 */
		
		//session.save(); -- performed in previous 
		//String insert = "INSERT INTO employee1(name,department)values('kathare.kathare2','wibmo')";
		String insert = "INSERT INTO Employee1 ";
		System.out.println(insert);
		Query query  =  session.createQuery(insert);//--sql types  session.createSQLQuery(insert);
		
		query.executeUpdate();
		tx.commit();
		session.close();
		
		
		/*
		 * 
		 */
		
	}
}

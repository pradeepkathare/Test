package com.hibernate.contoller;

/*
 * Pradeep.kathare :
 * 
 * Watch videos from java-brains for hibernate
 * same example are prepared by dineshOnJava website for hibernate
 * https://www.dineshonjava.com/hibernate/
 */


import java.lang.reflect.Array;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
//import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Address;
import com.hibernate.entity.Employee1;
import com.hibernate.entity.InheritanceHibernateChild1;
import com.hibernate.entity.InheritanceHibernateChild2;
import com.hibernate.entity.InheritanceHibernateParent;
import com.hibernate.entity.Vehicle;

public class HibernateConfiguration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory sessionFactory = new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		//tx.begin();
		tx.begin();
		Employee1 emp1 = new Employee1();
		Address add1 = new Address();
		add1.setAddress("Hospet");
		add1.setDoorNo(1);
		
		emp1.setDepartment("Accosa");
		emp1.setName("Pradeep1");
		emp1.setAddress(add1);
		emp1.getList().add("pradeep.kathare");
		emp1.getList().add("pavan.katahre");
		emp1.getListOfAddress().add(add1);
		
		
		
	/*	Employee1 emp2 = new Employee1();	
		emp2.setDepartment("Accosa");
		emp2.setName("Pradeepkathare");
		emp1 = (Employee1)session.get(Employee1.class, 15);
		System.out.println("emp1 : fetched :"+emp1.getDepartment()+emp1.getId());
		emp1.setDepartment("Wibmo");
		session.update(emp1)*/;
		
		//session.delete(emp1);
		
		//session.save(emp1);	
		
		//session.save(emp2);
		
		
		tx.commit();	
		session.close();
		
		//get function 
		/*Session session1 = sessionFactory.openSession();
		Transaction tx1 = session1.beginTransaction();
		*/
		
		/*
		 * Proxy ,Eager fetch and lazy fetch
		 * lazy fetch : by default from hb3 :It loads the collections objects only when we call
		 * emp.getList method 
		 * Eager Fetch : It is 
		 */
		/*session = sessionFactory.openSession();
		session.beginTransaction();
		Employee1 emp2 = (Employee1)session.get(Employee1.class, 1);
		session.close();*/
		//check lazy loading ..no list of address are added it will throw lazy exception
		//because we have closed session 
		//Lazy means it will pick data from database when will call getListOfAddress
		//System.out.println("Lazy Loading : "+emp2.getListOfAddress().size());
		
		//System.out.println(list1);
		//session.close();
		
		/*
		 * One - one mapping : add vehicle object in emp and call one-to one mapping 
		 * When ever 2 entity classes are present then we have 2 tables created seperately to map 
		 * each table we need foriegn key between them
		 * so to do so we have to create 1-1 mapping
		 */
		
		
		/*
		Address add3 = new Address();
		add3.setAddress("VijayNagar");
		add3.setDoorNo(3435);
		
		Employee1 emp3 = new Employee1();
		emp3.setName("one-one mapping");
		emp3.setDepartment("Hibernate");
		emp3.setAddress(add3);
		emp3.getList().add("kathare123");
		
		emp3.getListOfAddress().add(add3);
		emp3.getListOfAddress().add(add1); // seperate table is created with all fields of address object along with pk of emp 
	
		
		Vehicle v3 = new Vehicle();
		
		v3.setVehicleName("car_maruthi"); 
		
		emp3.setVehicle(v3); //one-to-one example -->one fk vehicle_id will be created 
		emp3.getListOfVehicle().add(v3); //one to many example -->seperate table with 2 columns vehile-id 
		//and emp-id is created because both are entity classes
		
		Session session1 = sessionFactory.openSession();
		Transaction tx2 = session1.beginTransaction();
		
		session1.save(emp3);
		session1.save(v3);
		
		
		
		tx2.commit();
		session1.close();
		
*/
		
		/*
		 * Inheritance -hierarchy
		 */
		
		InheritanceHibernateParent iparent = new InheritanceHibernateParent();
		iparent.setParentName("parent1");
		
		InheritanceHibernateChild1 child1 = new InheritanceHibernateChild1();
		child1.setChildAddress("child1 is child1");
		child1.setChildName("child1");
		child1.setChildID1(1);
		
		InheritanceHibernateChild2 ichild2 = new InheritanceHibernateChild2();
		ichild2.setChildAddress("child2 is child2");
		ichild2.setChildName("kathare");
		ichild2.setChildID2(2);
		
		Session session1 = sessionFactory.openSession();
		Transaction tx2 = session1.beginTransaction();
		
		session1.save(child1);
		session1.save(ichild2);
		session1.save(iparent);
		
		System.out.println("From parent object fetching child value : "+ichild2.getParentName());
		
		
		tx2.commit();
		session1.close();
		
		
		
		
		
	}

}

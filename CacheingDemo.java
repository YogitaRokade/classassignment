package com.hibe;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CacheingDemo {
	public static void main(String args[])
	{
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").
				buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		/*  Person p1=new Person();
		p1.setName("yogita");
		p1.setAddress("pune");
		
		Person p2=new Person();
		p1.setName("divya");
		p1.setAddress("raygad");
		
		Person p3=new Person();
		p1.setName("veera");
		p1.setAddress("mumbai");
		
		session.save(p1);
		session.save(p2);
		session.save(p3);
		
	tx.commit();
		
		*/
		System.out.println("session 1:");
		Person p1=session.get(Person.class, 1);
		System.out.println("ID:"+p1.getId()+" name:"+p1.getName()+" Address:"+p1.getAddress());
		
		System.out.println("session 2:");
		Person p2=session.get(Person.class, 1);
		System.out.println("ID:"+p2.getId()+" name:"+p2.getName()+" Address:"+p2.getAddress());
		
		session.close();
		
		Session session2=factory.openSession();
		System.out.println("session 2:");
		Person p3=session2.get(Person.class, 1);
		System.out.println("ID:"+p3.getId()+" name: "+p3.getName()+" Address: "+p3.getAddress());
		
		
		
		session2.close();

		factory.close();
		
		
	}

}

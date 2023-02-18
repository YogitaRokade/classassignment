package com.hibe;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
/**
 * Hello world!
 *
 */
public class App 
{ public static void main( String[] args )
{
//  Configuration cfg=new Configuration();
//  cfg.configure("hibernate.cfg.xml");
//  SessionFactory factory=cfg.buildSessionFactory();
  
  SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").
		   buildSessionFactory();
  Session session=factory.openSession();
  
  Transaction tx=session.beginTransaction();
  
  
 // Employee emp5=new Employee();
 // emp5.setName("nikhil");
  //emp5.setAddress("mumbai");
 // emp5.setSalary(70000);
  
  //Employee emp4=new Employee();
 //emp4.setName("yogita");
  //emp4.setAddress("pune");
  //emp4.setSalary(35000);
  
  //session.save(emp5);
 // session.save(emp4);
  
  //fetch object using get() method
  Employee e=(Employee)session.load(Employee.class,1);
  //system.out.println("Id:"+e.getId()+"Name:"+e.getName());
  System.out.println(e);
  
//fetch object using get() method
  Employee e1=(Employee)session.load(Employee.class,1);
  //system.out.println("Id:"+e.getId()+"Name:"+e.getName());
  System.out.println(e1);
  
  Employee e2=(Employee)session.load(Employee.class,3);
  //system.out.println("Id:"+e.getId()+"Name:"+e.getName());
  System.out.println(e2);
  
  Employee e3=(Employee)session.load(Employee.class,3);
  //system.out.println("Id:"+e.getId()+"Name:"+e.getName());
  System.out.println(e3);
  
  
  
  tx.commit();
  session.close();
  factory.close();
}
    
    
   
    
}

package com.hql;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.List;
import org.hibernate.query.Query;



public class HqlDemo 
{
	public static void main(String args[])
	{
	SessionFactory factory=new Configuration().
			configure("hibernate.cfg.xml").buildSessionFactory();
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	
	// Transaction tx=session.beginTransaction();
	 /*
	Product p1=new Product();
	 
	p1.setProductName("mobile");
	p1.setProductPrice(34000);
	
	Product p2=new Product();
	p2.setProductName("tv");
	p2.setProductPrice(55000);
	
	Product p3=new Product();
	p3.setProductName("fridge");
	p3.setProductPrice(65000);
	
	session.save(p1);
	session.save(p2);
	session.save(p3);
	session.save(p3);
	
	tx.commit();
	
	
	//hql for select query
	String query="from Product where productId=1 and productName=x";//product is a persistance 
	Query q=session.createQuery(query);
	q.setParameter("i",2);	q.setParameter("x","Mobile");
	Product p=(Product)q.uniqueResult();
	System.out.println(p);
	
	
		System.out.println("product Id:"+p.getProductId()+"Product Name:"
	+p.getProductName()+"Product Price"+p.getProductPrice());
	
	*/
 //hql for delete query
	Query q=session.createQuery("delete from product p where p.productId=:c");
	q.setParameter("c", 2);
	int row=q.executeUpdate();
	
	System.out.println(row+"row deleted");
	
	
	session.close();
	factory.close();
}

	
}

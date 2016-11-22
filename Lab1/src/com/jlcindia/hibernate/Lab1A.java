package com.jlcindia.hibernate;

import org.hibernate.*;

public class Lab1A {
public static void main(String args[]){
	Transaction tx=null;
	try{
		SessionFactory sf=CHibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		tx=session.beginTransaction();
		//Customer cust=new Customer("sri","sri@jlc",1234,"hyd",4000.0);
		Customer cust = new Customer("abhay","abc@gmail.com", 7777, "bnglr",5590.0);
		//Customer cust=new Customer("dev","dev@jlc",12345,"blore",2500.0);
		session.save(cust);
		tx.commit();
		session.close();
		System.out.println("Record Inserted");
	}catch(Exception e){
		e.printStackTrace();
		if(tx!=null)
			tx.rollback();
	}
}
}

package com.sathya.test;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.sathya.entity.Item;

class InsertItem {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Configuration conf= new Configuration();
		conf.configure("com/sathya/config/hibernate.cfg.xml");
		SessionFactory factory= conf.buildSessionFactory();
		Session session=factory.openSession();
		Item item=new Item(1001,"sony",12000);
		Transaction tx=session.beginTransaction();
		session.save(item);
		tx.commit();
		session.close();
		factory.close();

	}

}


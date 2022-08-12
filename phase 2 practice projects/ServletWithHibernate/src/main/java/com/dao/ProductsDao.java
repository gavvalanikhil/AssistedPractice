package com.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Products;

public class ProductsDao {
	public int storeProduct(Products product) {
	try {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml"); //loading xml
		SessionFactory sf = con.buildSessionFactory();
		
		Session session = sf.openSession();            
		
		Transaction tran = session.getTransaction(); //transaction is used to commit changes for DML statements
		tran.begin();
				session.save(product); // .save method used to insert
		tran.commit();
		return 1;
	} catch (Exception e) {
		System.out.println(e);
		return 0;
	}

	}
}

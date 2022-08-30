package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.feedback;

@Repository
public class feedbackDao {
	@Autowired
	EntityManagerFactory emf;       //it will do di for application.properties
	
	
	public int storeFeedback(feedback feed) {
		try {
			EntityManager manager = emf.createEntityManager();
			EntityTransaction tran = manager.getTransaction();
			tran.begin();
			     manager.persist(feed);         //session.save(feed)
			tran.commit();
			return 1;
		}catch(Exception e) {
			System.out.println(e);
			return 0;
		}

	}
}

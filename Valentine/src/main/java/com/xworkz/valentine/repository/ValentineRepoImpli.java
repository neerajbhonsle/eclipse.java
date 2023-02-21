package com.xworkz.valentine.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.valentine.Entity.ValentineEntity;

@Repository
public class ValentineRepoImpli implements ValentineRepo {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public ValentineRepoImpli() {
		System.out.println("Created:" + getClass().getSimpleName());
	}

	@Override
	public boolean save(ValentineEntity entity) {
		System.out.println("Running ValentineEntity in repoImpli");
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();
		return false;
	}

}

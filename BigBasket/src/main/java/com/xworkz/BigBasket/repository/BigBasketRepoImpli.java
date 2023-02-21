package com.xworkz.BigBasket.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.BigBasket.Entity.BigBasketEntity;

@Repository
public class BigBasketRepoImpli implements BigBasketRepo {
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public BigBasketRepoImpli() {
		System.out.println("Created:" + getClass().getSimpleName());
	}

	@Override
	public boolean save(BigBasketEntity entity) {
		System.out.println("Running save in BigBasketRepoImpli"+entity);
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();
		return true;
	}

	@Override
	public BigBasketEntity findById(int id) {
		System.out.println("find by id in repoimpli");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		BigBasketEntity fromdb = entityManager.find(BigBasketEntity.class, id);
		entityManager.close();
		return fromdb;

	}

}

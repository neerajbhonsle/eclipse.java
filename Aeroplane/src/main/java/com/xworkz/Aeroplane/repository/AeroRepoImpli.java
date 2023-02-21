package com.xworkz.Aeroplane.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.Aeroplane.Entity.AeroEntity;

@Repository
public class AeroRepoImpli implements AeroRepo {
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public AeroRepoImpli() {
		System.out.println("created:" + getClass().getSimpleName());
	}

	@Override
	public boolean save(AeroEntity entity) {
		System.out.println("Running Save in AeroRepoImpli" + entity);
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();
		return true;
	}

	@Override
	public AeroEntity findById(int id) {
		System.out.println("Find by Id in repoImpli");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		AeroEntity entity = entityManager.find(AeroEntity.class, id);
		entityManager.close();
		return entity;
	}

}

package com.xworkz.Xworkz.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.Xworkz.entity.NeerajEntity;

@Repository
public class NeerajRepoImpli implements NeerajRepo {
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public NeerajRepoImpli() {
		System.out.println("created:" + getClass().getSimpleName());
	}

	@Override
	public boolean save(NeerajEntity entity) {
		System.out.println("Running save in NeerajEntity" + entity);
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();
		return true;
	}

	@Override
	public NeerajEntity findById(int id) {
		// TODO Auto-generated method stub

		EntityManager manager = this.entityManagerFactory.createEntityManager();
		NeerajEntity entity = manager.find(NeerajEntity.class, id);
		manager.close();

		return entity;
	}

	@Override
	public List<NeerajEntity> findByBrand(String brand) {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByBrand");
			query.setParameter("brands", brand);
			List<NeerajEntity> list = query.getResultList();

			return list;
		} finally {
			manager.close();
		}

	}

	@Override
	public boolean update(NeerajEntity entity) {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.merge(entity);
			transaction.commit();
			return true;
		} finally {
			manager.close();
		}
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		System.out.println("Running delete");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction transaction = entityManager.getTransaction();
			NeerajEntity delete = entityManager.find(NeerajEntity.class, id);
			transaction.begin();
			entityManager.remove(delete);
			transaction.commit();
			return true;
		} finally {
			entityManager.close();
		}

	}
}

package com.xworkz.Xworkz.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.Xworkz.entity.NeerajEntity;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class NeerajRepoImpli implements NeerajRepo {
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public NeerajRepoImpli() {
		log.info("created:" + getClass().getSimpleName());
	}

	@Override
	public boolean save(NeerajEntity entity) {
		log.info("Running save in NeerajEntity" + entity);
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
		log.info("Running delete");
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

	@Override
	public List<NeerajEntity> findAll() {
		log.info("Running findAll in repo");
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findAll");
			List<NeerajEntity> list = query.getResultList();
			return list;
		} finally {
			manager.close();
		}
	}

	@Override
	public List<NeerajEntity> findByCost(Double cost) {
		log.info("Running findByCost");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		try {
		Query query = entityManager.createNamedQuery("findByCost");
		query.setParameter("cost", cost);
		List<NeerajEntity> costList = query.getResultList();
		return costList;

	}finally {
		entityManager.close();
	}
	}

	@Override
	public List<NeerajEntity> findByBrandAndCost(String brand, Double cost) {
		log.info("Running findByBrandAndCost in repo");
		EntityManager manager = this.entityManagerFactory.createEntityManager();
	try {
		Query query = manager.createNamedQuery("findByBrandAndCost");
		query.setParameter("brands", brand);
		query.setParameter("cost", cost);
		List<NeerajEntity> entities = query.getResultList();
	return entities;
	
		
	}finally {
		manager.close();
	}
}
}

package com.xworkz.Xworkz.repository;

import java.util.Collections;
import java.util.List;
import com.xworkz.Xworkz.entity.NeerajEntity;

public interface NeerajRepo {
	boolean save(NeerajEntity entity);

	boolean update(NeerajEntity entity);

	boolean delete(int id);

	default NeerajEntity findById(int id) {
		return null;
	}

	default List<NeerajEntity> findByBrand(String brand) {
		return Collections.emptyList();
	}

	default List<NeerajEntity> findAll() {
		return Collections.emptyList();
	}

	default List<NeerajEntity> findByCost(Double cost) {
		return Collections.emptyList();

	}

	default List<NeerajEntity> findByBrandAndCost(String brand, Double cost) {
		return Collections.emptyList();
	}

}

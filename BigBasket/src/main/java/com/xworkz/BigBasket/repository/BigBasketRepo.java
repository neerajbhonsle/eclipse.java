package com.xworkz.BigBasket.repository;

import com.xworkz.BigBasket.Entity.BigBasketEntity;

public interface BigBasketRepo {
	boolean save(BigBasketEntity entity);

	default BigBasketEntity findById(int id) {
		return null;
	}
}

package com.xworkz.Aeroplane.repository;

import com.xworkz.Aeroplane.Entity.AeroEntity;

public interface AeroRepo {
	boolean save(AeroEntity entity);

	default AeroEntity findById(int id) {
		return null;
	}
}

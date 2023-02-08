package com.xworkz.Bakery.respository;

import org.springframework.stereotype.Repository;

import com.xworkz.Bakery.dto.BakeryDTO;

@Repository
public class BakeryRepoImpli implements BakeryRepo {

	public BakeryRepoImpli() {
		System.out.println("created:" + getClass().getSimpleName());
	}

	@Override
	public boolean save(BakeryDTO dto) {
		System.out.println("save");
		return false;
	}

}

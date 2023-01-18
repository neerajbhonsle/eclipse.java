package com.xworkz.soldier.Repo;

import com.xworkz.soldier.DTO.SoldierDTO;

public class SoldierRepoImpli implements SoldierRepo {
	public SoldierRepoImpli() {
		System.out.println("creating SoldierRepoImpli using no arg const");
	}

	@Override
	public boolean save(SoldierDTO dto) {
		System.out.println("Running save");
		System.out.println("DTO " + dto);
		return false;
	}

}

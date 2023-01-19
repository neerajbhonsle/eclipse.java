package com.xworkz.soldier.Repo;

import org.springframework.stereotype.Component;

import com.xworkz.soldier.DTO.MissileDTO;

@Component

public class MissileRepoImpli implements MissileRepo {

	public MissileRepoImpli() {

		System.out.println("creating " + getClass().getSimpleName());
	}

	@Override
	public boolean save3(MissileDTO dto) {
		System.out.println("Running save");
		System.out.println("DTO " + dto);
		return true;
	}

}

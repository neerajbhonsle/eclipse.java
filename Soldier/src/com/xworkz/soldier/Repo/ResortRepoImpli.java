package com.xworkz.soldier.Repo;

import org.springframework.stereotype.Component;

import com.xworkz.soldier.DTO.ResortDTO;
@Component
public class ResortRepoImpli implements ResortRepo {
	public ResortRepoImpli() {
		System.out.println("creating " + getClass().getSimpleName());
	}

	@Override
	public boolean save1(ResortDTO dto) {

		System.out.println("Running save");
		System.out.println("DTO " + dto);
		return true;
	}

}

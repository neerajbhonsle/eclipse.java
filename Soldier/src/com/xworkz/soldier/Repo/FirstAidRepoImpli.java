package com.xworkz.soldier.Repo;

import org.springframework.stereotype.Component;

import com.xworkz.soldier.DTO.FirstAidDTO;

@Component
public class FirstAidRepoImpli implements FirstAidRepo {
	public FirstAidRepoImpli() {
		System.out.println("creating " + getClass().getSimpleName());
	}

	@Override
	public boolean save(FirstAidDTO aid) {
		System.out.println("Running save");
		System.out.println("DTO " + aid);
		return false;
	}

}

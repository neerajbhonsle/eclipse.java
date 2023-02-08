package com.xworkz.Bakery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.Bakery.dto.BakeryDTO;
import com.xworkz.Bakery.respository.BakeryRepo;

@Service
public class BakeryServiceImpli implements BakeryService {
	@Autowired
	private BakeryRepo bakeryRepo;

	public BakeryServiceImpli() {
		System.out.println("created:" + getClass().getSimpleName());
	}

	@Override
	public boolean validateAndSave(BakeryDTO dto) {
		System.out.println("validateAndSave");
		boolean saved = bakeryRepo.save(dto);
		System.out.println("saved in repo" + saved);
		return false;
	}

}

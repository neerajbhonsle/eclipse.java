package com.xworkz.soldier.Service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.soldier.DTO.MissileDTO;
import com.xworkz.soldier.Repo.MissileRepo;

@Component

public class MissileServiceImpli implements MissileService {
	@Autowired
	private Validator validator;
	private MissileRepo missileRepo;

	public MissileServiceImpli(MissileRepo missileRepo) {
		this.missileRepo = missileRepo;
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean validateAndSave(MissileDTO dto) {

		Set<ConstraintViolation<MissileDTO>> violation = this.validator.validate(dto);
		System.out.println("Running validate and save");
		System.out.println("ResortDTO " + dto);
		if (!violation.isEmpty()) {
			violation.forEach((e -> {
				System.err.println("violation message:" + e.getMessage());
			}));
			return false;
		} else {
			System.out.println("data entried is valid");

			boolean saved3 = missileRepo.save3(dto);
			System.out.println(saved3);
			return saved3;
		}

	}

}

package com.xworkz.soldier.Service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.soldier.DTO.SoldierDTO;
import com.xworkz.soldier.Repo.SoldierRepo;

public class SoldierServiceImpli implements SoldierService {
	private SoldierRepo repo;

	public SoldierServiceImpli() {
		System.out.println("creating SoldierServiceImpli using no arg const");
	}

	public void setRepo(SoldierRepo repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(SoldierDTO dto) {
		System.out.println("starting validationAndSave");
		System.out.println("dto passed :" + dto);

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SoldierDTO>> violations = validator.validate(dto);
		if (!violations.isEmpty()) {
			System.err.println("there are validation error");
			violations.forEach(v -> {
				System.err.println("violating message: " + v.getMessage());
			}
			);
			return false;
		} else {
			System.out.println("data entried is valid");
			boolean saved = repo.save(dto);
			System.out.println("DTO saved using repo " + saved);
			return saved;
		}

	}

}

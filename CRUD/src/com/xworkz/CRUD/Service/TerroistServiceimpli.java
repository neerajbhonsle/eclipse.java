package com.xworkz.CRUD.Service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.CRUD.DTO.TerroristDTO;

public class TerroistServiceimpli implements TerroistService {
	public TerroistServiceimpli() {
		System.out.println("created terroistServiceImpli using no-arg const");
	}

	@Override
	public boolean validateAndSave(TerroristDTO dto) {
		System.out.println("excuting validate and save start");
		System.out.println("DTO passed : " + dto);
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<TerroristDTO>> violations = validator.validate(dto);
		if (!violations.isEmpty()) {
			System.err.println("Error is there!!!!");
			violations.forEach(c -> System.err.println(c.getMessage()));
			return false;
		}
		System.out.println("No validation errors");
		return true;
	}

}

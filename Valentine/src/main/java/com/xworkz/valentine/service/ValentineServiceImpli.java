package com.xworkz.valentine.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.valentine.DTO.ValentineDTO;
import com.xworkz.valentine.Entity.ValentineEntity;
import com.xworkz.valentine.repository.ValentineRepo;

@Service
public class ValentineServiceImpli implements ValentineService {
	@Autowired
	private ValentineRepo valentineRepo;

	public ValentineServiceImpli() {
		System.out.println("created:" + getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<ValentineDTO>> validateAndSave(ValentineDTO dto) {
		System.out.println("Running validateAndSave");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<ValentineDTO>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("violation is dto" + dto);
			return violations;
		} else {
			System.out.println("violation is not there in dto can save");
			ValentineEntity entity = new ValentineEntity();
			entity.setName(dto.getName());
			entity.setValentineName(dto.getValentineName());
			entity.setGifts(dto.getGifts());
			entity.setPlaces(dto.getPlaces());
			boolean saved = this.valentineRepo.save(entity);
			System.out.println("saved" + saved);
			return Collections.emptySet();

		}

	}

}

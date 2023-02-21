package com.xworkz.Aeroplane.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.Aeroplane.DTO.AeroDTO;
import com.xworkz.Aeroplane.Entity.AeroEntity;
import com.xworkz.Aeroplane.repository.AeroRepo;

@Service
public class AeroServiceImpli implements AeroService {
	@Autowired
	private AeroRepo aeroRepo;

	public AeroServiceImpli() {
		System.out.println("created:" + getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<AeroDTO>> validateAndSave(AeroDTO dto) {
		System.out.println("Running validateAndSave in serviceImpli");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<AeroDTO>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("violations in dto");
			return violations;

		} else {
			System.out.println("violations is not there,can save");
			AeroEntity entity = new AeroEntity();
			entity.setCompany(dto.getCompany());
			entity.setName(dto.getName());
			entity.setCost(dto.getCost());
			entity.setCountry(dto.getCountry());
			entity.setType(dto.getType());
			boolean saved = this.aeroRepo.save(entity);
			return Collections.emptySet();
		}
	}

	@Override
	public AeroDTO findById(int id) {
		if (id > 0) {
			AeroEntity entity = this.aeroRepo.findById(id);
			if (entity != null) {
				System.out.println("entity is found in service for id");
				AeroDTO dto = new AeroDTO();
				dto.setCompany(entity.getCompany());
				dto.setName(entity.getName());
				dto.setCost(entity.getCost());
				dto.setType(entity.getType());
				dto.setCountry(entity.getCountry());
				return dto;
			}

		}
		return AeroService.super.findById(id);
	}

}

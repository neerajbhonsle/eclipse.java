package com.xworkz.BigBasket.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.BigBasket.DTO.BigBasketDTO;
import com.xworkz.BigBasket.Entity.BigBasketEntity;
import com.xworkz.BigBasket.repository.BigBasketRepo;

@Service
public class BigBasketServiceImpli implements BigBasketService {
	@Autowired
	private BigBasketRepo basketRepo;

	public BigBasketServiceImpli() {
		System.out.println("Created:" + getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<BigBasketDTO>> validateAndSave(BigBasketDTO dto) {
		System.out.println("Running validateAndSave in ServiceImpli");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<BigBasketDTO>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("violations in dto" + dto);

			return violations;

		} else {
			System.out.println("violations is not there in dto,can save");
			BigBasketEntity entity = new BigBasketEntity();
			entity.setName(dto.getName());
			entity.setPhoneNumber(dto.getPhoneNumber());
			entity.setEmailAddress(dto.getEmailAddress());
			entity.setPassword(dto.getPassword());
			entity.setWifeName(dto.getWifeName());
			entity.setFood(dto.getFood());
			entity.setArea(dto.getArea());
			entity.setOwnerName(dto.getOwnerName());
			entity.setOwnerWifeName(dto.getOwnerWifeName());
			boolean saved = this.basketRepo.save(entity);
			System.out.println("saved" + saved);
			return Collections.emptySet();
		}

	}

	@Override
	public BigBasketDTO findById(int id) {
		if (id > 0) {
			BigBasketEntity entity = this.basketRepo.findById(id);
			if (entity != null) {
				System.out.println("Entity is found in service for id" + id);
				BigBasketDTO dto = new BigBasketDTO();
				dto.setName(entity.getName());
				dto.setPhoneNumber(entity.getPhoneNumber());
				dto.setEmailAddress(entity.getEmailAddress());
				dto.setPassword(entity.getPassword());
				dto.setWifeName(entity.getWifeName());
				dto.setFood(entity.getFood());
				dto.setArea(entity.getArea());
				dto.setPrice(entity.getPrice());
				dto.setOwnerName(entity.getOwnerName());
				dto.setOwnerWifeName(entity.getOwnerWifeName());
				return dto;

			}

		}
		return BigBasketService.super.findById(id);

	}

}

package com.xworkz.Xworkz.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.Xworkz.DTO.NeerajDTO;
import com.xworkz.Xworkz.entity.NeerajEntity;
import com.xworkz.Xworkz.repository.NeerajRepo;

@Service
public class NeerajServiceImpli implements NeerajService {
	@Autowired
	private NeerajRepo neerajRepo;

	public NeerajServiceImpli() {
		System.out.println("created:" + getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<NeerajDTO>> validateAndSave(NeerajDTO dto) {
		System.out.println("Running validateAndSave in serviceImpli");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<NeerajDTO>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("violations in dto");
			return violations;
		} else {
			System.out.println("violations is not there,can save");
			NeerajEntity entity = new NeerajEntity();
			entity.setBrand(dto.getBrand());
			entity.setName(dto.getName());
			entity.setCost(dto.getCost());
			entity.setType(dto.getType());
			entity.setMadeIn(dto.getMadeIn());
			entity.setId(dto.getId());
			boolean saved = this.neerajRepo.save(entity);
			System.out.println(saved);
			return Collections.emptySet();

		}

	}

	@Override
	public NeerajDTO findById(int id) {
		if (id > 0) {
			NeerajEntity entity = this.neerajRepo.findById(id);
			if (entity != null) {
				System.out.println("entity is found in service for id");
				NeerajDTO dto = new NeerajDTO();
				dto.setBrand(entity.getBrand());
				dto.setName(entity.getName());
				dto.setCost(entity.getCost());
				dto.setType(entity.getType());
				dto.setMadeIn(entity.getMadeIn());
				dto.setId(entity.getId());
				return dto;
			}
		}
		return NeerajService.super.findById(id);
	}

	@Override
	public List<NeerajDTO> findByBrand(String brand) {
		System.out.println("brand is valid");
		if (brand != null && !brand.isEmpty()) {
			List<NeerajEntity> entities = this.neerajRepo.findByBrand(brand);

			List<NeerajDTO> dtos = new ArrayList<NeerajDTO>();

			for (NeerajEntity neerajEntity : entities) {
				NeerajDTO dto = new NeerajDTO();
				dto.setId(neerajEntity.getId());
				dto.setBrand(neerajEntity.getBrand());
				dto.setName(neerajEntity.getName());
				dto.setType(neerajEntity.getType());
				dto.setCost(neerajEntity.getCost());
				dto.setMadeIn(neerajEntity.getMadeIn());
				dtos.add(dto);
			}
			System.out.println("size of dtos" + dtos.size());
			System.out.println("size of entities" + entities.size());
			return dtos;

		} else {
			System.err.println("brand is invalid");
		}
		return NeerajService.super.findByBrand(brand);
	}

	@Override
	public Set<ConstraintViolation<NeerajDTO>> validateAndUpdate(NeerajDTO dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<NeerajDTO>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("violations in dto");
			return violations;
		} else {
			System.out.println("violations is not there,can save");
			NeerajEntity entity = new NeerajEntity();
			entity.setBrand(dto.getBrand());
			entity.setName(dto.getName());
			entity.setCost(dto.getCost());
			entity.setType(dto.getType());
			entity.setMadeIn(dto.getMadeIn());
			entity.setId(dto.getId());

			boolean saved = this.neerajRepo.update(entity);
			System.out.println(saved);
			return Collections.emptySet();

		}

	}

	@Override
	public boolean validateAndDelete(int id) {
		// TODO Auto-generated method stub
		System.out.println("Running validateAndDelete");
		if (id < 0) {
			return false;
		} else {
			boolean deleted = this.neerajRepo.delete(id);
			System.out.println("delete" + deleted);
			return deleted;
		}

	}

}

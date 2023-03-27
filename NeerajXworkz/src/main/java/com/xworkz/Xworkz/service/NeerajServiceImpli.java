package com.xworkz.Xworkz.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.Xworkz.DTO.NeerajDTO;
import com.xworkz.Xworkz.entity.NeerajEntity;
import com.xworkz.Xworkz.repository.NeerajRepo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class NeerajServiceImpli implements NeerajService {
	@Autowired
	private NeerajRepo neerajRepo;

	public NeerajServiceImpli() {
		log.info("created:" + getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<NeerajDTO>> validateAndSave(NeerajDTO dto) {
		log.info("Running validateAndSave in serviceImpli");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<NeerajDTO>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("violations in dto");
			return violations;
		} else {
			log.info("violations is not there,can save");
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
				log.info("entity is found in service for id");
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
		log.info("brand is valid");
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
			log.info("size of dtos" + dtos.size());
			log.info("size of entities" + entities.size());
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
			log.info("violations is not there,can save");
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
		log.info("Running validateAndDelete");
		if (id < 0) {
			return false;
		} else {
			boolean deleted = this.neerajRepo.delete(id);
			log.info("delete" + deleted);
			return deleted;
		}

	}

	@Override
	public List<NeerajDTO> findAll() {
		log.info("Running findall in service");
		List<NeerajEntity> entities = this.neerajRepo.findAll();
		List listDtos = new ArrayList<NeerajDTO>();
		for (NeerajEntity entity : entities) {
			NeerajDTO dto = new NeerajDTO();
			BeanUtils.copyProperties(entity, dto);
			listDtos.add(dto);
		}
		return listDtos;
	}

	@Override
	public List<NeerajDTO> validateAndFindByCost(Double cost) {
		log.info("Running validateAndFindByCost");
		if (cost > 0) {
			List<NeerajEntity> entities = this.neerajRepo.findByCost(cost);
			List<NeerajDTO> dto = new ArrayList<NeerajDTO>();
			for (NeerajEntity ent : entities) {
				NeerajDTO dtos = new NeerajDTO();
				BeanUtils.copyProperties(ent, dtos);
				dto.add(dtos);
			}
			return dto;
		}
		log.info("cost is invalid");
		return null;
	}

	@Override
	public List<NeerajDTO> findByBrandAndCost(String brand, Double cost) {
		log.info("Running findByBrandAndCost in service");
		if (brand != null && cost != 0) {
			List<NeerajEntity> entities = this.neerajRepo.findByBrandAndCost(brand, cost);
			List<NeerajDTO> dtos = new ArrayList<NeerajDTO>();
			for (NeerajEntity neerajEntity : entities) {
				NeerajDTO neerajDTO = new NeerajDTO();
			
				BeanUtils.copyProperties(neerajEntity, neerajDTO);
				dtos.add(neerajDTO);
			}
			return dtos;
		}
		log.info("data is not valid");
		return NeerajService.super.findByBrandAndCost(brand, cost);
	}

}

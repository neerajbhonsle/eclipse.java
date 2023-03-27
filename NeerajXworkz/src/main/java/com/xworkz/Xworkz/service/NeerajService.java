package com.xworkz.Xworkz.service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.Xworkz.DTO.NeerajDTO;
import com.xworkz.Xworkz.entity.NeerajEntity;

public interface NeerajService {
	Set<ConstraintViolation<NeerajDTO>> validateAndSave(NeerajDTO dto);

	default NeerajDTO findById(int id) {
		return null;
	}

	default List<NeerajDTO> findByBrand(String brand) {
		return Collections.emptyList();
	}

	Set<ConstraintViolation<NeerajDTO>> validateAndUpdate(NeerajDTO dto);

	default boolean validateAndDelete(int id) {
		return false;
	}

	default List<NeerajDTO> findAll() {
		return Collections.emptyList();
	}

	default List<NeerajDTO> validateAndFindByCost(Double cost) {
		return Collections.emptyList();

	}

	default List<NeerajDTO> findByBrandAndCost(String brand, Double cost) {
		return Collections.emptyList();
	}
}

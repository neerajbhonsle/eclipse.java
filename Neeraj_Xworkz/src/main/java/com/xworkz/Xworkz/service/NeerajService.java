package com.xworkz.Xworkz.service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.Xworkz.DTO.NeerajDTO;

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
}

package com.xworkz.Aeroplane.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.Aeroplane.DTO.AeroDTO;

public interface AeroService {
	Set<ConstraintViolation<AeroDTO>> validateAndSave(AeroDTO dto);

	default AeroDTO findById(int id) {
		return null;
	}

}

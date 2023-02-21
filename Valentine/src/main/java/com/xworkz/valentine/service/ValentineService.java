package com.xworkz.valentine.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.valentine.DTO.ValentineDTO;

public interface ValentineService {
	Set<ConstraintViolation<ValentineDTO>> validateAndSave(ValentineDTO dto);
}

package com.xworkz.BigBasket.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.BigBasket.DTO.BigBasketDTO;

public interface BigBasketService {
	Set<ConstraintViolation<BigBasketDTO>> validateAndSave(BigBasketDTO dto);

	default BigBasketDTO findById(int id) {
		return null;
	}

}

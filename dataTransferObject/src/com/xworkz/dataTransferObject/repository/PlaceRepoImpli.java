package com.xworkz.dataTransferObject.repository;

import com.xworkz.dataTransferObject.dto.PlaceDTO;
import com.xworkz.dataTransferObject.exception.SizeExceedException;

public class PlaceRepoImpli implements PlaceRepo {
	private PlaceDTO[] dtos = new PlaceDTO[5];
	private int index = 0;

	@Override
	public boolean store(PlaceDTO dto) throws SizeExceedException {
		if (index >= dtos.length) {
			System.out.println("DTO size is full..........");
			throw new SizeExceedException("new place cannot be added.....");
		}
		this.dtos[this.index] = dto;
		this.index++;
		return true;
	}

}

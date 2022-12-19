package com.xworkz.dataTransferObject.repository;

import com.xworkz.dataTransferObject.dto.TheaterDTO;
import com.xworkz.dataTransferObject.exception.SizeExceedException;

public class TheaterRepoImpli implements TheaterRepo {
	private TheaterDTO[] dtos = new TheaterDTO[5];
	private int index = 0;

	@Override
	public boolean store(TheaterDTO dto) throws SizeExceedException {
		if (index >= dtos.length) {
			System.out.println("DTO size is full......");
			throw new SizeExceedException("new theater cannot be added");
		}
		this.dtos[this.index] = dto;
		this.index++;
		return true;
	}

}

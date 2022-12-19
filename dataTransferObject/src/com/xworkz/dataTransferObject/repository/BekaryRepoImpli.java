package com.xworkz.dataTransferObject.repository;

import com.xworkz.dataTransferObject.dto.BekaryDTO;
import com.xworkz.dataTransferObject.exception.SizeExceedException;

public class BekaryRepoImpli implements BekaryRepo {
	private BekaryDTO[] dtos = new BekaryDTO[5];
	private int index = 0;

	@Override
	public boolean store(BekaryDTO dto) throws SizeExceedException {
		if (index >= dtos.length) {
			System.out.println("DTO size is full...");
			throw new SizeExceedException("new bekary cannot be added");

		}
		this.dtos[this.index] = dto;
		this.index++;
		return true;
	}

}

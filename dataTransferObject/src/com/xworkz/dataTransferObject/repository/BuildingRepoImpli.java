package com.xworkz.dataTransferObject.repository;

import com.xworkz.dataTransferObject.dto.BuildingDTO;
import com.xworkz.dataTransferObject.exception.SizeExceedException;

public class BuildingRepoImpli implements BuildingRepo {
	private BuildingDTO[] dtos = new BuildingDTO[5];
	private int index = 0;

	@Override
	public boolean store(BuildingDTO dto) throws SizeExceedException {
		if (index >= dtos.length) {
			System.out.println("DTO size is full..........");
			throw new SizeExceedException("new Building cannot be added.....");
		}
		this.dtos[this.index] = dto;
		this.index++;
		return true;
	}

}

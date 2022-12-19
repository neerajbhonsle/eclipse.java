package com.xworkz.dataTransferObject.repository;

import com.xworkz.dataTransferObject.dto.RailwayDTO;
import com.xworkz.dataTransferObject.exception.SizeExceedException;

public class RailwayRepoImpli implements RailwayRepo {
	private RailwayDTO[] dtos = new RailwayDTO[5];
	private int index = 0;

	@Override
	public boolean store(RailwayDTO dto) throws SizeExceedException {
		if (index >= dtos.length) {
			System.out.println("DTO size is full......");
			throw new SizeExceedException("new Railways cannot be added");
		}
		this.dtos[this.index] = dto;
		this.index++;
		return true;
	}

}

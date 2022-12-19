package com.xworkz.dataTransferObject.service;

import com.xworkz.dataTransferObject.dto.TheaterDTO;
import com.xworkz.dataTransferObject.exception.DataInvalidException;
import com.xworkz.dataTransferObject.repository.TheaterRepo;

public class TheaterServiceImpli implements TheaterService {
	private TheaterRepo repo;

	public TheaterServiceImpli(TheaterRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public boolean validAndSave(TheaterDTO dto) throws DataInvalidException {
		double id = dto.getId();
		String name = dto.getName();
		String brand = dto.getBrand();
		double seats = dto.getSeats();

		boolean validId = false;
		boolean validName = false;
		boolean validBrand = false;
		boolean validSeats = false;

		if (id > 4) {
			System.out.println("id is valid " + id);
			validId = true;
		} else {
			System.err.println("id is invalid " + id);
		}
		if (name != null && name.length() >= 3 && name.length() <= 20) {
			System.out.println("name is valid " + name);
			validName = true;
		} else {
			System.err.println("name is invalid " + name);
		}
		if (brand != null && brand.length() >= 2 && brand.length() <= 5) {
			System.out.println("brand is valid " + brand);
			validBrand = true;
		} else {
			System.err.println("brand is invalid " + brand);
		}
		if (seats >= 200) {
			System.out.println("seats are valid " + seats);
			validSeats = true;
		} else {
			System.err.println("seats are invalid " + seats);
		}
		if (validId && validName && validBrand && validSeats) {
			System.out.println("validation sucessfully");
			boolean save = repo.store(dto);
			System.out.println("data has been Stored " + save);
			return save;
		}
		throw new DataInvalidException("please enter valid data");
	}

}

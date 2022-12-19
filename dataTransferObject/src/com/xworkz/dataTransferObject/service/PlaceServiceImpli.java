package com.xworkz.dataTransferObject.service;

import com.xworkz.dataTransferObject.dto.PlaceDTO;
import com.xworkz.dataTransferObject.exception.DataInvalidException;
import com.xworkz.dataTransferObject.repository.PlaceRepo;

public class PlaceServiceImpli implements PlaceService {
	private PlaceRepo repo;

	public PlaceServiceImpli(PlaceRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public boolean validAndSave(PlaceDTO dto) throws DataInvalidException {
		String name = dto.getName();
		String famousFor = dto.getFamousFor();
		String dist = dto.getDist();
		String state = dto.getState();

		boolean validname = false;
		boolean validFamousFor = false;
		boolean validdist = false;
		boolean validState = false;

		if (name != null && name.length() >= 3 && name.length() <= 20) {
			System.out.println("name is valid " + name);
			validname = true;
		} else {
			System.err.println("name is invalid " + name);
		}
		if (famousFor != null) {
			System.out.println("place is famous for is valid " + famousFor);
			validFamousFor = true;
		} else {
			System.err.println("place is famous for is invalid " + famousFor);
		}
		if (dist != null) {
			System.out.println("dist is valid " + dist);
			validdist = true;
		} else {
			System.err.println("dist is invalid " + dist);
		}
		if (state != null) {
			System.out.println("state is valid " + state);
			validState = true;
		} else {
			System.err.println("state is invalid " + state);
		}
		if (validname && validFamousFor && validdist && validState) {
			System.out.println("validation succesfully");
			boolean save = repo.store(dto);
			System.out.println("data has been stored " + save);
			return true;
		}
		throw new DataInvalidException("please enter valid data");
	}

}

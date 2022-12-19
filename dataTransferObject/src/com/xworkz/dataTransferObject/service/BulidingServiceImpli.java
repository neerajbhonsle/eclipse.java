package com.xworkz.dataTransferObject.service;

import com.xworkz.dataTransferObject.dto.BuildingDTO;
import com.xworkz.dataTransferObject.exception.DataInvalidException;
import com.xworkz.dataTransferObject.repository.BuildingRepo;

public class BulidingServiceImpli implements BuildingService {
	private BuildingRepo repo;

	public BulidingServiceImpli(BuildingRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public boolean validAndStore(BuildingDTO dto) throws DataInvalidException {
		int no = dto.getNo();
		String name = dto.getName();
		int noOfFloor = dto.getNoOfFloor();
		boolean lift = dto.isLift();
		boolean parking = dto.isParking();
		String type = dto.getType();

		boolean validNo = false;
		boolean validName = false;
		boolean validNoOfFloor = false;
		boolean validLift = false;
		boolean validParking = false;
		boolean validType = false;

		if (no > 2) {
			System.out.println("building no is valid " + no);
			validNo = true;
		} else {
			System.err.println("building no is invalid " + no);
		}
		if (name != null && name.length() >= 3 && name.length() <= 20) {
			System.out.println("name is valid " + name);
			validName = true;
		} else {
			System.err.println("name is invalid " + name);
		}
		if (noOfFloor > 2) {
			System.out.println("number of floor in building is valid " + noOfFloor);
			validNoOfFloor = true;
		} else {
			System.err.println("number of floor in building is invalid " + noOfFloor);
		}
		if (lift == true) {
			System.out.println("building lift is valid " + lift);
			validLift = true;
		} else {
			System.err.println("building lift is invaild " + lift);
		}
		if (parking == true) {
			System.out.println("building parking is valid " + parking);
			validParking = true;
		} else {
			System.err.println("building parking is valid " + parking);
		}
		if (type != null && type.length() >= 2 && type.length() <= 20) {
			System.out.println("building is valid " + validType);
			validType = true;
		} else {
			System.err.println("building is invalid " + validType);
		}
		if (validNo && validName && validNoOfFloor && validLift && validParking && validType) {
			System.out.println("validation sucessfully");
			boolean save = repo.store(dto);
			System.out.println("data has been stored " + save);
			return true;
		}
		throw new DataInvalidException("please enter valid data");
	}

}

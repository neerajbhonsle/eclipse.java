package com.xworkz.dataTransferObject.service;

import com.xworkz.dataTransferObject.dto.RailwayDTO;
import com.xworkz.dataTransferObject.exception.DataInvalidException;
import com.xworkz.dataTransferObject.repository.RailwayRepo;

public class RailwayServiceImpli implements RailwayService {
	private RailwayRepo repo;

	public RailwayServiceImpli(RailwayRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public boolean validAndSave(RailwayDTO dto) throws DataInvalidException {
		String name = dto.getName();
		int noOfPlatforms = dto.getNoOfPlatforms();
		String area = dto.getArea();
		float platformTicketPrice = dto.getPlatformTicketPrice();

		boolean validName = false;
		boolean validNoOfPlatforms = false;
		boolean validArea = false;
		boolean validPlatformTicketPrice = false;

		if (name != null && name.length() >= 3 && name.length() <= 30) {
			System.out.println("name is valid " + name);
			validName = true;
		} else {
			System.err.println("name is invalid " + name);
		}
		if (noOfPlatforms > 0) {
			System.out.println("noOfPlatforms is valid " + noOfPlatforms);
			validNoOfPlatforms = true;
		} else {
			System.err.println("noOfPlatforms is invalid " + noOfPlatforms);
		}
		if (area != null && area.length() >= 3 && area.length() <= 20) {
			System.out.println("area is valid " + area);
			validArea = true;
		} else {
			System.err.println("area is invalid " + area);
		}
		if (platformTicketPrice > 10) {
			System.out.println("platformTicketPrice is valid " + platformTicketPrice);
			validPlatformTicketPrice = true;

		} else {
			System.err.println("platformTicketPrice is invalid " + platformTicketPrice);
		}
		if (validName && validNoOfPlatforms && validArea && validPlatformTicketPrice) {
			System.out.println("validation sucessfully");
			boolean save = repo.store(dto);
			System.out.println("data has been stored " + save);
			return true;
		}
		throw new DataInvalidException("please enter valid data");
	}

}

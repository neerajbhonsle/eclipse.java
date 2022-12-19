package com.xworkz.dataTransferObject.service;

import com.xworkz.dataTransferObject.dto.BekaryDTO;
import com.xworkz.dataTransferObject.exception.DataInvalidException;
import com.xworkz.dataTransferObject.repository.BekaryRepo;

public class BekaryServiceImpli implements BekaryService {
	private BekaryRepo repo;

	public BekaryServiceImpli(BekaryRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public boolean validAndStore(BekaryDTO dto) throws DataInvalidException {
		String name = dto.getName();
		String location = dto.getLocation();
		String ownerName = dto.getOwnerName();
		long contactNo = dto.getContactNo();

		boolean validName = false;
		boolean validLocation = false;
		boolean validOwnerName = false;
		boolean validContactNo = false;

		if (name != null && name.length() >= 3 && name.length() <= 20) {
			System.out.println("name is valid " + name);
			validName = true;
		} else {
			System.err.println("name is invalid " + name);
		}
		if (location != null && location.length() >= 3 && location.length() <= 20) {
			System.out.println("location is valid " + location);
			validLocation = true;
		} else {
			System.err.println("location is invaild " + location);
		}
		if (ownerName != null && ownerName.length() >= 3 && ownerName.length() <= 20) {
			System.out.println("ownerName is valid " + ownerName);
			validOwnerName = true;
		} else {
			System.err.println("ownerName is invalid " + ownerName);
		}
		if (contactNo >= 10) {
			System.out.println("contact number is valid " + contactNo);
			validContactNo = true;
		} else {
			System.err.println("contact number is invalid " + contactNo);
		}
		if (validName && validLocation && validOwnerName && validContactNo) {
			System.out.println("validation successfully");
			boolean save = repo.store(dto);
			System.out.println("data has been Stored " + save);
			return save;
		}
		throw new DataInvalidException("please enter valid data");
	}

}

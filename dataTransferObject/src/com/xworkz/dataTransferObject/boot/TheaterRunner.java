package com.xworkz.dataTransferObject.boot;

import com.xworkz.dataTransferObject.dto.TheaterDTO;
import com.xworkz.dataTransferObject.exception.DataInvalidException;
import com.xworkz.dataTransferObject.exception.SizeExceedException;
import com.xworkz.dataTransferObject.repository.TheaterRepo;
import com.xworkz.dataTransferObject.repository.TheaterRepoImpli;
import com.xworkz.dataTransferObject.service.TheaterService;
import com.xworkz.dataTransferObject.service.TheaterServiceImpli;

public class TheaterRunner {

	public static void main(String[] args) {
		TheaterDTO dto = new TheaterDTO(45689, "Ganesha", "PVR", 400);
		TheaterDTO dto1 = new TheaterDTO(55859, "Adarsha", "PVR", 420);
		TheaterDTO dto2 = new TheaterDTO(74683, "Jayatha", "PVR", 440);
		TheaterDTO dto3 = new TheaterDTO(897624, "Sai", "PVR", 450);
		TheaterDTO dto4 = new TheaterDTO(598756, "Punitha", "PVR", 500);

		TheaterRepo theater = new TheaterRepoImpli();
		TheaterService service = new TheaterServiceImpli(theater);
		try {
			boolean store = service.validAndSave(dto);
			System.out.println(store);
			boolean store1 = service.validAndSave(dto1);
			System.out.println(store1);
			boolean store2 = service.validAndSave(dto2);
			System.out.println(store2);
			boolean store3 = service.validAndSave(dto3);
			System.out.println(store3);
			boolean store4 = service.validAndSave(dto4);
			System.out.println(store4);
		} catch (DataInvalidException e) {
			System.err.println(e.getMessage());
		} catch (SizeExceedException f) {
			System.err.println(f.getMessage());
		}

	}

}

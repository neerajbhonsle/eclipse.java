package com.xworkz.dataTransferObject.boot;

import com.xworkz.dataTransferObject.dto.BuildingDTO;
import com.xworkz.dataTransferObject.exception.DataInvalidException;
import com.xworkz.dataTransferObject.exception.SizeExceedException;
import com.xworkz.dataTransferObject.repository.BuildingRepo;
import com.xworkz.dataTransferObject.repository.BuildingRepoImpli;
import com.xworkz.dataTransferObject.service.BuildingService;
import com.xworkz.dataTransferObject.service.BulidingServiceImpli;

public class BuildingRunner {

	public static void main(String[] args) {
		BuildingDTO dto = new BuildingDTO(4561, "xworkz", 3, true, true, "education");
		BuildingDTO dto1 = new BuildingDTO(8523, "kodnet", 4, true, true, "education");
		BuildingDTO dto2 = new BuildingDTO(9874, "jspider", 5, true, true, "education");
		BuildingDTO dto3 = new BuildingDTO(6542, "qspider", 3, true, true, "education");
		BuildingDTO dto4 = new BuildingDTO(9513, "upskill", 3, true, true, "education");
		BuildingRepo build = new BuildingRepoImpli();
		BuildingService service = new BulidingServiceImpli(build);
		try {
			boolean store = service.validAndStore(dto);
			System.out.println(store);
			boolean store1 = service.validAndStore(dto1);
			System.out.println(store1);
			boolean store2 = service.validAndStore(dto2);
			System.out.println(store2);
			boolean store3 = service.validAndStore(dto3);
			System.out.println(store3);
			boolean store4 = service.validAndStore(dto4);
			System.out.println(store4);
		} catch (DataInvalidException r) {
			System.err.println(r.getMessage());
		} catch (SizeExceedException n) {
			System.err.println(n.getMessage());
		}
	}

}

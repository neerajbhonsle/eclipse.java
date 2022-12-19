package com.xworkz.dataTransferObject.boot;

import com.xworkz.dataTransferObject.dto.RailwayDTO;
import com.xworkz.dataTransferObject.exception.DataInvalidException;
import com.xworkz.dataTransferObject.exception.SizeExceedException;
import com.xworkz.dataTransferObject.repository.RailwayRepo;
import com.xworkz.dataTransferObject.repository.RailwayRepoImpli;
import com.xworkz.dataTransferObject.service.RailwayService;
import com.xworkz.dataTransferObject.service.RailwayServiceImpli;

public class RailwayRunner {

	public static void main(String[] args) {
		RailwayDTO dto = new RailwayDTO("YeshwanthpuraRailwayStation", 10, "Yeshwanthpura", 20);
		RailwayDTO dto1 = new RailwayDTO("YeshwanthnagarRailwayStation", 1, "Yeshwanthnagar", 20);
		RailwayDTO dto2 = new RailwayDTO("HospetRailwayStation", 6, "hospet", 20);
		RailwayDTO dto3 = new RailwayDTO("BellariRailwayStation", 8, "Bellari", 20);
		RailwayDTO dto4 = new RailwayDTO("HubliRailwayStation", 10, "hubli", 20);
		RailwayRepo railway = new RailwayRepoImpli();
		RailwayService service = new RailwayServiceImpli(railway);
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
		} catch (SizeExceedException x) {
			System.err.println(x.getMessage());
		}
	}

}

package com.xworkz.dataTransferObject.boot;

import com.xworkz.dataTransferObject.dto.BekaryDTO;
import com.xworkz.dataTransferObject.exception.DataInvalidException;
import com.xworkz.dataTransferObject.exception.SizeExceedException;
import com.xworkz.dataTransferObject.repository.BekaryRepo;
import com.xworkz.dataTransferObject.repository.BekaryRepoImpli;
import com.xworkz.dataTransferObject.service.BekaryService;
import com.xworkz.dataTransferObject.service.BekaryServiceImpli;

public class BakeryRunner {

	public static void main(String[] args) {
		BekaryDTO dto = new BekaryDTO("GaneshBekary", "Ganesh", "sandur", 784584564);
		BekaryDTO dto1 = new BekaryDTO("AdarshBekary", "Adarsh", "sandur", 768942464);
		BekaryDTO dto2 = new BekaryDTO("JayathBekary", "Jayath", "hassan", 987564564);
		BekaryDTO dto3 = new BekaryDTO("PunithBekary", "Punith", "sandur", 875484564);
		BekaryDTO dto4 = new BekaryDTO("DiniBekary", "Dinesh", "hospet", 658984564);

		BekaryRepo bekary = new BekaryRepoImpli();
		BekaryService service = new BekaryServiceImpli(bekary);
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

		} catch (DataInvalidException e) {
			System.err.println(e.getMessage());
		} catch (SizeExceedException f) {
			System.err.println(f.getMessage());

		}
	}

}

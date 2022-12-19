package com.xworkz.dataTransferObject.boot;

import com.xworkz.dataTransferObject.dto.PlaceDTO;
import com.xworkz.dataTransferObject.exception.DataInvalidException;
import com.xworkz.dataTransferObject.exception.SizeExceedException;
import com.xworkz.dataTransferObject.repository.PlaceRepo;
import com.xworkz.dataTransferObject.repository.PlaceRepoImpli;
import com.xworkz.dataTransferObject.service.PlaceService;
import com.xworkz.dataTransferObject.service.PlaceServiceImpli;

public class PlaceRunner {

	public static void main(String[] args) {
		PlaceDTO dto = new PlaceDTO("Sandur", "IronOre", "bellari", "Karnataka");
		PlaceRepo place = new PlaceRepoImpli();
		PlaceService service = new PlaceServiceImpli(place);
		try {
			boolean store = service.validAndSave(dto);
			System.out.println(store);
		} catch (DataInvalidException q) {
			System.err.println(q.getMessage());
		} catch (SizeExceedException w) {
			System.err.println(w.getMessage());
		}

	}

}

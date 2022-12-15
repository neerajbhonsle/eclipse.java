package com.xworkz.pizza.boot;

import java.time.LocalDateTime;

import com.xworkz.pizza.DTO.HelmetDTO;
import com.xworkz.pizza.Repo.HelmetRepo;
import com.xworkz.pizza.Repo.HelmetRepoImpli;
import com.xworkz.pizza.constant.Color;
import com.xworkz.pizza.constant.HelmetType;
import com.xworkz.pizza.service.HelmetService;
import com.xworkz.pizza.service.HelmetServiceImpli;

public class HelmetRunner {

	public static void main(String[] args) {
		HelmetDTO dto = new HelmetDTO("ThunderBird", HelmetType.full, 5000D, Color.white, "Me", LocalDateTime.now(),
				"me", LocalDateTime.now());
		HelmetRepo repo = new HelmetRepoImpli();
		HelmetService service = new HelmetServiceImpli(repo);
		boolean success = service.validateAndSave(dto);
		System.out.println("Success " + success);

	}

}

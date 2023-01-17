package com.xworkz.CRUD.Boot;

import com.xworkz.CRUD.DTO.TerroristDTO;
import com.xworkz.CRUD.Service.TerroistService;
import com.xworkz.CRUD.Service.TerroistServiceimpli;

public class TerroristRunner {

	public static void main(String[] args) {
		TerroristDTO dto = new TerroristDTO();
		dto.setName("vinoda");
		dto.setAge(25);
		dto.setCountry("india");
		dto.setAlive(true);
		dto.setPrison(false);
		dto.setSpecialization("Giving task");
		dto.setOrganization("xworkz");
		System.out.println(dto);

		TerroistService service = new TerroistServiceimpli();
		service.validateAndSave(dto);

	}

}

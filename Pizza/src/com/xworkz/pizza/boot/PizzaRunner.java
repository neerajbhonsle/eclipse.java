package com.xworkz.pizza.boot;

import java.time.LocalDateTime;

import com.xworkz.pizza.DTO.PizzaDTO;
import com.xworkz.pizza.constant.PizzaSize;
import com.xworkz.pizza.service.PizzaService;
import com.xworkz.pizza.service.PizzaServiceImpli;

public class PizzaRunner {

	public static void main(String[] args) {
		PizzaDTO dto = new PizzaDTO();
		dto.setName("veg fully loaded");
		dto.setCompany("Dominos");
		dto.setCheese(true);
		dto.setSize(PizzaSize.large);
		dto.setFlavour("Spicy");
		dto.setType("veg");
		dto.setPrice(600);
		dto.setCreatedBy("ME");
		dto.setCreatedDate(LocalDateTime.of(2022, 12, 14, 8, 30));
		dto.setUpadatedBy("ME");
		dto.setUpadatedDate(LocalDateTime.now());
		PizzaService serve = new PizzaServiceImpli();
		boolean saved = serve.validateAndSave(dto);
		System.out.println(saved);

	}

}

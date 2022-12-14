package com.xworkz.pizza.service;

import com.xworkz.pizza.DTO.PizzaDTO;
import com.xworkz.pizza.constant.PizzaSize;

public class PizzaServiceImpli implements PizzaService {

	@Override
	public boolean validateAndSave(PizzaDTO pizzadto) {
		System.out.println("Running ValidateAndSave");
		String name = pizzadto.getName();
		String company = pizzadto.getCompany();
		PizzaSize size = pizzadto.getSize();
		double price = pizzadto.getPrice();
		String flavour = pizzadto.getFlavour();
		String type = pizzadto.getType();
		boolean validName, validCompany, validFlavour, validType, validSize, validPrice = false;
		if (name != null && name.length() >= 4 && name.length() <= 20) {
			System.out.println("valid pizza name " + name);
			validName = true;
		} else {
			System.err.println("pizza name is not valid " + name);
		}
		if (company != null && company.length() >= 4 && company.length() <= 20) {
			System.out.println("valid pizza company " + company);
		} else {
			System.err.println("not a valid company " + company);
		}
		if (flavour != null && flavour.length() >= 3 && flavour.length() <= 20) {
			System.out.println("valid pizza flavour " + flavour);
		} else {
			System.err.println("not a valid flavour " + flavour);
		}
		if (type != null && type == "veg" || type == "nonveg") {
			System.out.println("valid pizza type " + type);
		} else {
			System.err.println("not a valid pizza type " + type);
		}
		if (size != null) {
			System.out.println("valid pizza size " + size);
		} else {
			System.err.println("not a valid pizza size " + size);
		}
		if (price >= 50 && price <= 12000) {
			System.out.println("valid pizza price " + price);
		} else {
			System.err.println("not a valid pizza price " + price);
		}

		return false;
	}

}

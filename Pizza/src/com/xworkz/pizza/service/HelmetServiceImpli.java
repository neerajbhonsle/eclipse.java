package com.xworkz.pizza.service;

import com.xworkz.pizza.DTO.HelmetDTO;
import com.xworkz.pizza.Repo.HelmetRepo;
import com.xworkz.pizza.constant.Color;
import com.xworkz.pizza.constant.HelmetType;

public class HelmetServiceImpli implements HelmetService {
	private HelmetRepo helmetrepository;

	public HelmetServiceImpli(HelmetRepo helmetrepository) {
		this.helmetrepository = helmetrepository;
	}

	@Override
	public boolean validateAndSave(HelmetDTO dto) {
		System.out.println("Running validate & save " + dto);
		String brand = dto.getBrand();
		HelmetType type = dto.getType();
		Double price = dto.getPrice();
		Color color = dto.getColor();
		boolean validbrand = false, validtype = false, validprice = false, validcolor = false;
		if (brand != null && brand.length() >= 4 && brand.length() <= 20) {
			System.out.println("valid helmet brand " + brand);
			validbrand = true;
		} else {
			System.err.println("invalid brand " + brand);
		}
		if (type != null) {
			System.out.println("valid helmet type " + type);
			validtype = true;
		} else {
			System.err.println("invalid helmet type " + type);
		}
		if (price != null && price >= 500 && price <= 10000) {
			System.out.println("valid price of helmet " + price);
			validprice = true;
		} else {
			System.err.println("invalid price of helmet " + price);
		}
		if (color != null) {
			System.out.println("valid color of helmet " + color);
			validcolor = true;
		} else {
			System.err.println("invalid color of helmet " + color);
		}
		if (validbrand && validtype && validprice && validcolor) {
			System.out.println("helmet is valid & can save using repository");
			boolean saved = this.helmetrepository.save(dto);
			System.out.println("helmet DTO is saved " + saved);
			return saved;
		}
		return false;
	}

}

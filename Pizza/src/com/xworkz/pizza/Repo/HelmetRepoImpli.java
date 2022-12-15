package com.xworkz.pizza.Repo;

import com.xworkz.pizza.DTO.HelmetDTO;

public class HelmetRepoImpli implements HelmetRepo {
	private HelmetDTO[] helmet = new HelmetDTO[5];
	private int currentIndex = 0;

	@Override
	public boolean save(HelmetDTO dto) {
		System.out.println("Running save from HelmetServiceImpli");
		if (this.currentIndex >= helmet.length) {

		}
		this.helmet[currentIndex] = dto;
		System.out.println("Saved to " + dto + " at index " + currentIndex);
		this.currentIndex++;
		return true;
	}

}

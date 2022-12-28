package com.xworkz.Collection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.Collection.DTO.AirportDTO;

public class AirportRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AirportDTO airport = new AirportDTO("Kempegowda", "International", 2);
		AirportDTO airport1 = new AirportDTO("Mumbai", "International", 4);
		AirportDTO airport2 = new AirportDTO("Kolkata", "International", 3);
		AirportDTO airport3 = new AirportDTO("Delhi", "International", 5);
		AirportDTO airport4 = new AirportDTO("TamilNadu", "International", 4);

		boolean equals = airport1.equals(airport3);
		System.out.println(airport1.getName().equals(airport3.getName()));
		Collection<AirportDTO> air = new ArrayList<AirportDTO>();
		air.add(airport1);
		air.add(airport3);
		boolean stores = air.contains(airport3);
		System.out.println(stores);

	}

}

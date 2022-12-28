package com.xworkz.Collection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.Collection.DTO.PlaceDTO;

public class PlaceRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlaceDTO place = new PlaceDTO("sandur", "iron ore", 583119);
		PlaceDTO place1 = new PlaceDTO("bangaluru", "IT", 583119);
		PlaceDTO place2 = new PlaceDTO("mumbai", "vada pav", 583119);
		PlaceDTO place3 = new PlaceDTO("kolkata", "rasagula", 583119);
		PlaceDTO place4 = new PlaceDTO("goa", "party", 583119);

		boolean equals = place1.equals(place3);
		System.out.println(place1.getFamousFor().equals(place3.getFamousFor()));
		Collection<PlaceDTO> play = new ArrayList<PlaceDTO>();
		play.add(place1);
		play.add(place3);
		boolean contains = play.contains(place3);
		System.out.println(contains);
	}

}

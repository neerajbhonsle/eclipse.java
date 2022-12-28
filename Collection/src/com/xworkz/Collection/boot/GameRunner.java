package com.xworkz.Collection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.Collection.DTO.GameDTO;

public class GameRunner {

	public static void main(String[] args) {

		GameDTO gameDTO1 = new GameDTO("Kabadi", "Indoor", 7);

		GameDTO gameDTO2 = new GameDTO("Chowkabara", "Indoor", 4);
		GameDTO gameDTO3 = new GameDTO("Kabadi", null, 0);
		// this.gameDTO3
		boolean equals = gameDTO1.equals(gameDTO3);
		System.out.println(gameDTO1.getName().equals(gameDTO3.getName()));
		Collection<GameDTO> games = new ArrayList<GameDTO>();
		games.add(gameDTO1);
		games.add(gameDTO2);
		
		boolean contains=games.contains(gameDTO3);
		System.out.println("contains "+contains);

	}

}

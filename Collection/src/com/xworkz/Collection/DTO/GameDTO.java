package com.xworkz.Collection.DTO;

import java.io.Serializable;

public class GameDTO implements Serializable {

	private String name;
	private String type;
	private Integer totalPlayers;

	public GameDTO() {
		// TODO Auto-generated constructor stub
	}

	public GameDTO(String name, String type, Integer totalPlayers) {
		super();
		this.name = name;
		this.type = type;
		this.totalPlayers = totalPlayers;
	}

	@Override
	public boolean equals(Object reference) {
		System.out.println("running equals from gameDTO");
		if (reference != null) {
			if (reference instanceof GameDTO) {
				GameDTO dto = (GameDTO) reference;
				if (dto.name.equals(this.name)) {
					System.out.println("name is matching " + dto.name);
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "GameDTO [name=" + name + ", type=" + type + ", totalPlayers=" + totalPlayers + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getTotalPlayers() {
		return totalPlayers;
	}

	public void setTotalPlayers(Integer totalPlayers) {
		this.totalPlayers = totalPlayers;
	}

}

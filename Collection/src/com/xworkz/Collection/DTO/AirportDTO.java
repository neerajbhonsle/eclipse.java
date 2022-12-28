package com.xworkz.Collection.DTO;

import java.io.Serializable;

public class AirportDTO implements Serializable {
	private String name;
	private String type;
	private Integer totalTerminals;

	public AirportDTO() {
		// TODO Auto-generated constructor stub
	}

	public AirportDTO(String name, String type, Integer totalTerminals) {
		super();
		this.name = name;
		this.type = type;
		this.totalTerminals = totalTerminals;
	}

	@Override
	public boolean equals(Object ref) {
		System.out.println("running equals from airportDTO");
		if (ref != null) {
			if (ref instanceof AirportDTO) {
				AirportDTO dto = (AirportDTO) ref;
				if (dto.name.equals(name)) {
					System.out.println("name is matching " + dto.name);
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "AirportDTO [name=" + name + ", type=" + type + ", totalTerminals=" + totalTerminals + "]";
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

	public Integer getTotalTerminals() {
		return totalTerminals;
	}

	public void setTotalTerminals(Integer totalTerminals) {
		this.totalTerminals = totalTerminals;
	}

}

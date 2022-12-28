package com.xworkz.Collection.DTO;

import java.io.Serializable;

public class PlaceDTO implements Serializable {
	private String name;
	private String famousFor;
	private int pincode;

	public PlaceDTO() {
		// TODO Auto-generated constructor stub
	}

	public PlaceDTO(String name, String famousFor, int pincode) {
		super();
		this.name = name;
		this.famousFor = famousFor;
		this.pincode = pincode;
	}
	@Override
	public boolean equals(Object ref) {
		System.out.println("placeDTO");
		if(ref!=null) {
			if(ref instanceof PlaceDTO) {
				PlaceDTO dto=(PlaceDTO)ref;
				if(dto.famousFor.equals(this.famousFor)) {
					System.out.println("its matching "+dto.famousFor);
					
				}
			}
		}
		return false;
	}
	@Override
	public String toString() {
		return "PlaceDTO [name=" + name + ", famousFor=" + famousFor + ", pincode=" + pincode + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

}

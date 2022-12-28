package com.xworkz.Collection.DTO;

import java.io.Serializable;

public class CalendarDTO implements Serializable {
	private String name;
	private int price;
	private String type;

	public CalendarDTO() {
		// TODO Auto-generated constructor stub
	}

	public CalendarDTO(String name, int price, String type) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
	}

	@Override
	public boolean equals(Object reference) {
		System.out.println("running equals from CalendarDTO");
		if (reference != null) {
			if (reference instanceof CalendarDTO) {
				CalendarDTO dto = (CalendarDTO) reference;
				if (dto.name.equals(this.name)) {
					System.out.println("name is matching " + dto.name);
					return true;
				}
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "CalendarDTO [name=" + name + ", price=" + price + ", type=" + type + "]";
	}

}

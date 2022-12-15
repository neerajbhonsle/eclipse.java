package com.xworkz.pizza.DTO;

import java.time.LocalDateTime;

import com.xworkz.pizza.constant.Color;
import com.xworkz.pizza.constant.HelmetType;

public class HelmetDTO extends AbstractAudit {
	private String brand;
	private HelmetType type;
	private Double price;
	private Color color;

	public HelmetDTO() {
		System.out.println("Running helmetDTO constr");
	}

	@Override
	public String toString() {
		return "HelmetDTO [brand=" + brand + ", type=" + type + ", price=" + price + ", color=" + color
				+ ", toString()=" + super.toString() + "]";
	}

	public HelmetDTO(String brand, HelmetType type, Double price, Color color, String createdBy,
			LocalDateTime createdDate, String upadatedBy, LocalDateTime upadatedDate) {
		super(createdBy, createdDate, upadatedBy, upadatedDate);
		this.brand = brand;
		this.type = type;
		this.price = price;
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public HelmetType getType() {
		return type;
	}

	public void setType(HelmetType type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}

package com.xworkz.Collection.DTO;

import java.io.Serializable;
import java.time.LocalDate;
import com.xworkz.Collection.WeaponType;

public class WeaponDTO implements Serializable, Comparable<WeaponDTO> {
	private String name;
	private String madeBy;
	private LocalDate madeOn;
	private Double price;
	private WeaponType type;

	public WeaponDTO() {
		// TODO Auto-generated constructor stub
	}

	public WeaponDTO(String name, String madeBy, LocalDate madeOn, Double price, WeaponType type) {
		super();
		this.name = name;
		this.madeBy = madeBy;
		this.madeOn = madeOn;
		this.price = price;
		this.type = type;
	}

	@Override
	public String toString() {
		return "WeaponDTO [name=" + name + ", madeBy=" + madeBy + ", madeOn=" + madeOn + ", price=" + price + ", type="
				+ type + "]";
	}

	@Override
	public int hashCode() {

		return 69;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals from WeaponDTO");
		if (obj != null) {
			if (obj instanceof WeaponDTO) {
				WeaponDTO dto = (WeaponDTO) obj;
				if (dto.name.equals(name) && dto.type.equals(type)) {
					return true;
				}
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public String getMadeBy() {
		return madeBy;
	}

	public LocalDate getMadeOn() {
		return madeOn;
	}

	public Double getPrice() {
		return price;
	}

	public WeaponType getType() {
		return type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}

	public void setMadeOn(LocalDate madeOn) {
		this.madeOn = madeOn;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setType(WeaponType type) {
		this.type = type;
	}

	@Override
	public int compareTo(WeaponDTO o) {

		return o.name.compareTo(this.name);
	}

}

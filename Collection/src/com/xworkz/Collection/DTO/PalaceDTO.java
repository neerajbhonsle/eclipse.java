package com.xworkz.Collection.DTO;

import java.io.Serializable;

public class PalaceDTO implements Serializable {
	private String name;
	private String location;
	private String builtBy;
	private boolean destroyed;
	private int visitingFee;

	public PalaceDTO() {
		// TODO Auto-generated constructor stub
	}

	public PalaceDTO(String name, String location, String builtBy, boolean destroyed, int visitingFee) {
		super();
		this.name = name;
		this.location = location;
		this.builtBy = builtBy;
		this.destroyed = destroyed;
		this.visitingFee = visitingFee;
	}

	@Override
	public String toString() {
		return "PalaceDTO [name=" + name + ", location=" + location + ", builtBy=" + builtBy + ", destroyed="
				+ destroyed + ", visitingFee=" + visitingFee + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getBuiltBy() {
		return builtBy;
	}

	public void setBuiltBy(String builtBy) {
		this.builtBy = builtBy;
	}

	public boolean isDestroyed() {
		return destroyed;
	}

	public void setDestroyed(boolean destroyed) {
		this.destroyed = destroyed;
	}

	public int getVisitingFee() {
		return visitingFee;
	}

	public void setVisitingFee(int visitingFee) {
		this.visitingFee = visitingFee;
	}

}

package com.xworkz.dataTransferObject.dto;

public class BuildingDTO extends AbstractAudit {
	private int no;
	private String name;
	private int noOfFloor;
	private boolean lift;
	private boolean parking;
	private String type;

	public BuildingDTO() {
		// TODO Auto-generated constructor stub
	}

	public BuildingDTO(int no, String name, int noOfFloor, boolean lift, boolean parking, String type) {
		super();
		this.no = no;
		this.name = name;
		this.noOfFloor = noOfFloor;
		this.lift = lift;
		this.parking = parking;
		this.type = type;
	}

	@Override
	public String toString() {
		return "BuildingDTO [no=" + no + ", name=" + name + ", noOfFloor=" + noOfFloor + ", lift=" + lift + ", parking="
				+ parking + ", type=" + type + ", toString()=" + super.toString() + "]";
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfFloor() {
		return noOfFloor;
	}

	public void setNoOfFloor(int noOfFloor) {
		this.noOfFloor = noOfFloor;
	}

	public boolean isLift() {
		return lift;
	}

	public void setLift(boolean lift) {
		this.lift = lift;
	}

	public boolean isParking() {
		return parking;
	}

	public void setParking(boolean parking) {
		this.parking = parking;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}

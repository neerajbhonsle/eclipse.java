package com.xworkz.dataTransferObject.dto;

public class RailwayDTO extends AbstractAudit {
	private String name;
	private int noOfPlatforms;
	private String area;
	private float platformTicketPrice;

	public RailwayDTO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "RailwayDTO [name=" + name + ", noOfPlatforms=" + noOfPlatforms + ", area=" + area
				+ ", platformTicketPrice=" + platformTicketPrice + ", toString()=" + super.toString() + "]";
	}

	public RailwayDTO(String name, int noOfPlatforms, String area, float platformTicketPrice) {
		super();
		this.name = name;
		this.noOfPlatforms = noOfPlatforms;
		this.area = area;
		this.platformTicketPrice = platformTicketPrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfPlatforms() {
		return noOfPlatforms;
	}

	public void setNoOfPlatforms(int noOfPlatforms) {
		this.noOfPlatforms = noOfPlatforms;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public float getPlatformTicketPrice() {
		return platformTicketPrice;
	}

	public void setPlatformTicketPrice(float platformTicketPrice) {
		this.platformTicketPrice = platformTicketPrice;
	}

}

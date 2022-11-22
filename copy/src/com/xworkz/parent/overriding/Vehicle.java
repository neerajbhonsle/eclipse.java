package com.xworkz.parent.overriding;

public class Vehicle {
	private String brand;
	private String model;
	private String colour;
	private String type;
	private long price;
	private boolean working;
	private int cc;
	private String originOfCompany;
	private String showRoomName;
	private String areaOfShowRoom;
	
	public Vehicle(String brand,String model,String colour,String type,long price,boolean working,int cc,
			String originOfCompany,String showRoomName,String areaOfShowRoom) {
		super();
		this.brand=brand;
		this.model=model;
		this.colour=colour;
		this.type=type;
		this.price=price;
		this.working=working;
		this.cc=cc;
		this.originOfCompany=originOfCompany;
		this.showRoomName=showRoomName;
		this.areaOfShowRoom=areaOfShowRoom;

	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public boolean isWorking() {
		return working;
	}
	public void setWorking(boolean working) {
		this.working = working;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public String getOriginOfCompany() {
		return originOfCompany;
	}
	public void setOriginOfCompany(String originOfCompany) {
		this.originOfCompany = originOfCompany;
	}
	public String getShowRoomName() {
		return showRoomName;
	}
	public void setShowRoomName(String showRoomName) {
		this.showRoomName = showRoomName;
	}
	public String getAreaOfShowRoom() {
		return areaOfShowRoom;
	}
	public void setAreaOfShowRoom(String areaOfShowRoom) {
		this.areaOfShowRoom = areaOfShowRoom;
	}

	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", model=" + model + ", colour=" + colour + ", type=" + type + ", price="
				+ price + ", working=" + working + ", cc=" + cc + ", originOfCompany=" + originOfCompany
				+ ", showRoomName=" + showRoomName + ", areaOfShowRoom=" + areaOfShowRoom + "]";
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Vehicle) {
			Vehicle casted = (Vehicle)obj;
			if (this.brand.equals(brand)&& this.colour.equals(colour)) {
				System.out.println("brand and colour is  equal");
				return true;
			}
		} else {
			System.err.println("brand and colour is not equal");
		}
		return false;
	}
	
}

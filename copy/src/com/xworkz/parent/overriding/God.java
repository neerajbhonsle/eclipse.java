package com.xworkz.parent.overriding;

public class God {
	private String name;
	private String parents;
	private int noOfFaces;
	private int noOfHands;
	private int noOfWeapons;
	private String vehicle;
	private int noOfFest;
	private String week;
	private String brothers;
	private String placeOfTemple;
	public God(String name,String parents,int noOfFaces,int noOfHands,int noOfWeapons,
			String vehicle,int noOfFest,String week,String brothers,
			String placeOfTemple) {
		super();
		this.name=name;
		this.parents=parents;
		this.noOfFaces=noOfFaces;
		this.noOfHands=noOfHands;
		this.noOfWeapons=noOfWeapons;
		this.vehicle=vehicle;
		this.noOfFest=noOfFest;
		this.week=week;
		this.brothers=brothers;
		this.placeOfTemple=placeOfTemple;

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getParents() {
		return parents;
	}
	public void setParents(String parents) {
		this.parents = parents;
	}
	public int getNoOfFaces() {
		return noOfFaces;
	}
	public void setNoOfFaces(int noOfFaces) {
		this.noOfFaces = noOfFaces;
	}
	public int getNoOfHands() {
		return noOfHands;
	}
	public void setNoOfHands(int noOfHands) {
		this.noOfHands = noOfHands;
	}
	public int getNoOfWeapons() {
		return noOfWeapons;
	}
	public void setNoOfWeapons(int noOfWeapons) {
		this.noOfWeapons = noOfWeapons;
	}
	public String getVehicle() {
		return vehicle;
	}
	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}
	public int getNoOfFest() {
		return noOfFest;
	}
	public void setNoOfFest(int noOfFest) {
		this.noOfFest = noOfFest;
	}
	public String getWeek() {
		return week;
	}
	public void setWeek(String week) {
		this.week = week;
	}
	public String getBrothers() {
		return brothers;
	}
	public void setBrothers(String brothers) {
		this.brothers = brothers;
	}
	public String getPlaceOfTemple() {
		return placeOfTemple;
	}
	public void setPlaceOfTemple(String placeOfTemple) {
		this.placeOfTemple = placeOfTemple;
	}
	@Override
	public String toString() {
		return "God [name=" + name + ", parents=" + parents + ", noOfFaces=" + noOfFaces + ", noOfHands=" + noOfHands
				+ ", noOfWeapons=" + noOfWeapons + ", vehicle=" + vehicle + ", noOfFest=" + noOfFest + ", week=" + week
				+ ", brothers=" + brothers + ", placeOfTemple=" + placeOfTemple + "]";
	}
	
	public boolean equals(Object rr) {
		if (rr instanceof God) {
			God casted = (God)rr;
			if(this.name.equals(name)&&this.parents.equals(parents)&&this.placeOfTemple.equals(placeOfTemple)&&this.vehicle.equals(vehicle)&&this.week.equals(week)) {
				System.out.println("name,parents,placeoftemple,vehicle & week are equal");
				return true;
			}
		}else {
			System.err.println("they are not equal");
		}
		return false;
	}
}

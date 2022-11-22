package com.xworkz.parent.overriding;

public class Currency {
	private String name;
	private String countryName;
	private int highestAmount;
	private String colour;
	private String photo;
	private int lowestAmount;
	private int onedollar;
	private boolean valid;
	private int yearOfPrinting;
	private String type;
	public Currency(String name,String countryName,int highestAmount,String colour,
			String photo,int lowestAmount,int onedollar,boolean valid,
			int yearOfPrinting,String type) {
		super();
		this.name=name;
		this.countryName=countryName;
		this.highestAmount=highestAmount;
		this.colour=colour;
		this.photo=photo;
		this.lowestAmount=lowestAmount;
		this.onedollar=onedollar;
		this.valid=valid;
		this.yearOfPrinting=yearOfPrinting;
		this.type=type;

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public int getHighestAmount() {
		return highestAmount;
	}
	public void setHighestAmount(int highestAmount) {
		this.highestAmount = highestAmount;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public int getLowestAmount() {
		return lowestAmount;
	}
	public void setLowestAmount(int lowestAmount) {
		this.lowestAmount = lowestAmount;
	}
	public int getOnedollar() {
		return onedollar;
	}
	public void setOnedollar(int onedollar) {
		this.onedollar = onedollar;
	}
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	public int getYearOfPrinting() {
		return yearOfPrinting;
	}
	public void setYearOfPrinting(int yearOfPrinting) {
		this.yearOfPrinting = yearOfPrinting;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Currency [name=" + name + ", countryName=" + countryName + ", highestAmount=" + highestAmount
				+ ", colour=" + colour + ", photo=" + photo + ", lowestAmount=" + lowestAmount + ", onedollar="
				+ onedollar + ", valid=" + valid + ", yearOfPrinting=" + yearOfPrinting + ", type=" + type + "]";
	}
	public boolean equals(Object ee) {
		if(ee instanceof Currency) {
			Currency casted = (Currency)ee;
			if (this.name.equals(name)&&this.countryName.equals(countryName)&&this.photo.equals(photo)&&this.type.equals(type)) {
				System.out.println("name,countryname,photo & type are equal");
				return true;
			}
		}else {
			System.err.println("they are not equal");
		}
		return false;
	}
	

}

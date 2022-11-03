package com.xworkz.association;

public class Syrup {
	public String BrandName ="morstella";
	private String Name ="Dextromethorphan HBr";
	boolean taste;
	String Usedfor="cough";
	int price=110;
	int MfgDate=2/2022;
	int ExpDate=1/2024;
	int Qty=100;
	int Hydrobromide=10;
	int Hydrochloride=5;
	int Maleate=2;
	String colour="sunset yellow";

	public String getName() {
		return this.Name;
		
	}
	public String getBrandName() {
		return this.BrandName;
		
	}
	public boolean gettaste() {
		return this.taste;
		
	}
	public String getUsedfor() {
		return this.Usedfor;
		
	}
	public int  getMfgDate() {
		return this.MfgDate;
		
	}
	public int  getQty() {
		return this.Qty;
		
	}
	public int getExpDate() {
		return this.ExpDate;
		
	}
	public int  getHydrobromide() {
		return this.Hydrobromide;
		
	}
	public int  getHydrochloride() {
		return this.Hydrochloride;
		
	}
	public int  getMaleate() {
		return this.Maleate;
		
	}
	public String  getcolour() {
		return this.colour;
		
	}
	public int getPrice() {
		return price;
	}
	public void setName(String name) {
		this.Name=name;
	}
	public String setBrandName(String BrandName) {
		return this.BrandName;
		
	}
	public boolean settaste(boolean taste) {
		return this.taste;
		
	}
	public String setUsedfor(String Usedfor) {
		return this.Usedfor;
		
	}
	public int  setMfgDate(int MfgDate) {
		return this.MfgDate;
		
	}
	public int  setQty(int Qty) {
		return this.Qty;
		
	}
	public int setExpDate(int ExpDate) {
		return this.ExpDate;
		
	}
	public int  setHydrobromide(int Hydrobromide ) {
		return this.Hydrobromide;
		
	}
	public int  setHydrochloride(int Hydrochloride ) {
		return this.Hydrochloride;
		
	}
	public int  setMaleate(int Maleate) {
		return this.Maleate;
		
	}
	public String  setcolour(String colour) {
		return this.colour;
		
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}

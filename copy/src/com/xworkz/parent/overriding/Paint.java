package com.xworkz.parent.overriding;

public class Paint {

	private String brand;
	private String colour;
	private int qty;
	private double price;
	private String type;
	private boolean ecofriendly;
	private boolean quality;
	private long mtgdate;
	private long expdate;
	private boolean oilpaint;

	public Paint(String brand, String colour, int qty, double price, String type, boolean ecofriendly, boolean quality,
			long mtgdate, long expdate, boolean oilpaint) {
		super();
		this.brand = brand;
		this.colour = colour;
		this.qty = qty;
		this.price = price;
		this.type = type;
		this.ecofriendly = ecofriendly;
		this.quality = quality;
		this.mtgdate = mtgdate;
		this.expdate = expdate;
		this.oilpaint = oilpaint;

	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isEcofriendly() {
		return ecofriendly;
	}

	public void setEcofriendly(boolean ecofriendly) {
		this.ecofriendly = ecofriendly;
	}

	public boolean isQuality() {
		return quality;
	}

	public void setQuality(boolean quality) {
		this.quality = quality;
	}

	public long getMtgdate() {
		return mtgdate;
	}

	public void setMtgdate(long mtgdate) {
		this.mtgdate = mtgdate;
	}

	public long getExpdate() {
		return expdate;
	}

	public void setExpdate(long expdate) {
		this.expdate = expdate;
	}

	public boolean isOilpaint() {
		return oilpaint;
	}

	public void setOilpaint(boolean oilpaint) {
		this.oilpaint = oilpaint;
	}

	@Override
	public String toString() {
		return "Paint [brand=" + brand + ", colour=" + colour + ", qty=" + qty + ", price=" + price + ", type=" + type
				+ ", ecofriendly=" + ecofriendly + ", quality=" + quality + ", mtgdate=" + mtgdate + ", expdate="
				+ expdate + ", oilpaint=" + oilpaint + "]";
	}

	public boolean equals(Object objt) {
		if (objt instanceof Paint) {
			Paint casted = (Paint) objt;
			if (this.brand.equals(casted.brand)) {
				System.out.println("brand is equal");
				return true;
			}
		} else {
			System.err.println("brand is  not equal");

		}
		return false;
	}

}

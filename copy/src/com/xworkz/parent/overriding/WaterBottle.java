package com.xworkz.parent.overriding;

public class WaterBottle {
	private String brand;
	private String genericName;
	private int qty;
	private boolean recycle;
	private boolean isi;
	private long customercare;
	private String countryOfOrigin;
	private int shelflife;
	private int price;
	private boolean quality;
	
	 public WaterBottle(String brand,String genericName,int qty,boolean recycle,
			 boolean isi,long customercare,String countryOfOrigin,int shelfLife,
			 int price,boolean quality) {
		 super();
		 this.brand=brand;
		 this.genericName=genericName;
		 this.qty=qty;
		 this.recycle=recycle;
		 this.isi=isi;
		 this.customercare=customercare;
		 this.countryOfOrigin=countryOfOrigin;
		 this.shelflife=shelfLife;
		 this.price=price;
		 this.quality=quality;
				 
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getGenericName() {
		return genericName;
	}

	public void setGenericName(String genericName) {
		this.genericName = genericName;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public boolean isRecycle() {
		return recycle;
	}

	public void setRecycle(boolean recycle) {
		this.recycle = recycle;
	}

	public boolean isIsi() {
		return isi;
	}

	public void setIsi(boolean isi) {
		this.isi = isi;
	}

	public long getCustomercare() {
		return customercare;
	}

	public void setCustomercare(long customercare) {
		this.customercare = customercare;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	public int getShelflife() {
		return shelflife;
	}

	public void setShelflife(int shelflife) {
		this.shelflife = shelflife;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isQuality() {
		return quality;
	}

	public void setQuality(boolean quality) {
		this.quality = quality;
	}

	@Override
	public String toString() {
		return "WaterBottle [brand=" + brand + ", genericName=" + genericName + ", qty=" + qty + ", recycle=" + recycle
				+ ", isi=" + isi + ", customercare=" + customercare + ", countryOfOrigin=" + countryOfOrigin
				+ ", shelflife=" + shelflife + ", price=" + price + ", quality=" + quality + "]";
	}
	 
	public boolean equals(Object nn) {
		if (nn instanceof WaterBottle) {
			WaterBottle casted = (WaterBottle)nn;
			if (this.brand.equals(brand)&& this.genericName.equals(genericName)&& this.countryOfOrigin.equals(countryOfOrigin)) {
				System.out.println("brand,genericname & countryoforigin is equal");
				return true;
			}
		}else {
			System.err.println("brand,genericname & countryoforigin is not equal ");
		}
		return false;
	}

}

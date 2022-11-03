package com.xworkz.association;

public class WashingMachine {
	
		private String Brand="SAMSUNG";
		String modelName = "WA65A4002VS/TL";
		String functionType ="Fully Automatic Top Load";
		String washingMethod="Pulsator";
		float washingCapacity=6.5f;
		float height=90.6f;
		float weight=29.5f;
		float depth=56.8f;
		double width=54;
		double price=15000;
		double maxSpinSpeed=680;
		public WashingMachine() {
		}
		public String getBrand() {
			return Brand;
		}
		public String getModelName() {
			return modelName;
		}
		public String getFunctionType() {
			return functionType;
		}
		public String getWashingMethod() {
			return washingMethod;
		}
		public float getWashingCapacity() {
			return washingCapacity;
		}
		public float getHeight() {
			return height;
		}
		public float getWeight() {
			return weight;
		}
		public float getDepth() {
			return depth;
		}
		public double getWidth() {
			return width;
		}
		public double getPrice() {
			return price;
		}
		public double getMaxSpinSpeed() {
			return maxSpinSpeed;
		}
		void setBrand(String brand) {
			Brand = brand;
		}
		void setModelName(String modelName) {
			this.modelName = modelName;
		}
		void setFunctionType(String functionType) {
			this.functionType = functionType;
		}
		void setWashingMethod(String washingMethod) {
			this.washingMethod = washingMethod;
		}
		void setWashingCapacity(float washingCapacity) {
			this.washingCapacity = washingCapacity;
		}
		void setHeight(float height) {
			this.height = height;
		}
		void setWeight(float weight) {
			this.weight = weight;
		}
		void setDepth(float depth) {
			this.depth = depth;
		}
		void setWidth(double width) {
			this.width = width;
		}
		void setPrice(double price) {
			this.price = price;
		}
		void setMaxSpinSpeed(double maxSpinSpeed) {
			this.maxSpinSpeed = maxSpinSpeed;
		}
	
}

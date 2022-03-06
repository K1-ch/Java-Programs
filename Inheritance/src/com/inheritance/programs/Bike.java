package com.inheritance.programs;
public class Bike extends Vehicle{
	private  String HelmetColor;
	public String getHelmetColor() {
		return HelmetColor;
	}
	
	public void setHelmetColor(String helmetColor) {
		HelmetColor = helmetColor;
	}

	@Override
	public String mileage() {
		return "The mileage of bike is 18km/l";
	}

	@Override
	public String maxSpeed() {
		return "The max speed of bike is 23km/hr";
	}

	@Override
	public String toString() {
		return "Bike [HelmetColor=" +HelmetColor  +  "]";
	}
}

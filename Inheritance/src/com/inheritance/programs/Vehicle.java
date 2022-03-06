package com.inheritance.programs;

public class Vehicle {

	private int tyre;
	private int gear;
	private String color;  //state
	

	public int getTyre() {  
		return tyre;
	}

	public void setTyre(int tyre) {
		this.tyre = tyre;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String mileage() {  //behaviour
		return "The Mileage of vehicle is";
	}

	public String maxSpeed() {
		return "The Max Speed of vehicle is";
	}

	@Override
	public String toString() {
		return "Vehicle [tyre=" + tyre + ", gear=" + gear + ", color=" + color + "]";
	}
	

}
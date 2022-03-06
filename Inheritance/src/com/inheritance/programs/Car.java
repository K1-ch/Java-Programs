package com.inheritance.programs;
public class Car extends Vehicle {
	private String soundSystem;
	private int windSheild;

	public String getSoundSystem() {
		return soundSystem;
	}

	public void setSoundSystem(String soundSystem) {
		this.soundSystem = soundSystem;
	}

	public int getWindSheild() {
		return windSheild;
	}

	public void setWindSheild(int windSheild) {
		this.windSheild = windSheild;
	}

	@Override
	public String mileage() {
		return "The mileage of car is 75km/l";
	}

	@Override
	public String maxSpeed() {
		return "The max speed of car is 90km/hr";
	}

	@Override
	public String toString() {
		return "Car [soundSystem=" + soundSystem + ", windSheild=" + windSheild + "]";
	}

	
}

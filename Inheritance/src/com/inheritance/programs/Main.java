package com.inheritance.programs;

public class Main {
	public static void main(String[] args) {
		Car vehicle = new Car();
		vehicle.setColor("Red");
		vehicle.setGear(1);
		vehicle.setTyre(4);
		vehicle.setSoundSystem("Bose");
		vehicle.setWindSheild(1);
		System.out.println(vehicle);
		System.out.println(vehicle.getColor());
		System.out.println(vehicle.getGear());
		System.out.println(vehicle.getTyre());
		System.out.println(vehicle.mileage());
		System.out.println(vehicle.maxSpeed());
     Bike bike=new Bike();
     bike.setColor("Orange");
     bike.setGear(1);
     bike.setTyre(2);
     bike.setHelmetColor("black");
     System.out.println(bike.getColor());
     System.out.println(bike.getGear());
     System.out.println(bike.getTyre());
    System.out.println(bike.mileage());
    System.out.println(bike.maxSpeed());
    System.out.println(bike.getHelmetColor());
	}
}

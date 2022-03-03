package com.inheritance.example;

public class Main {
	public static void main(String[] args) {
		Potato potato = new Potato();
		potato.setState("Himachal Pradesh");
		potato.setSoil_type("Brown Soil");
		potato.setSeed_rate(12);
		System.out.println(potato.getState());
		System.out.println(potato.rank_state());
		System.out.println(potato.getSeed_rate());
		System.out.println(potato.getSoil_type());
	}

}

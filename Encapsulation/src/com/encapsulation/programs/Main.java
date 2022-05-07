package com.encapsulation.programs;

public class Main {
	public static void main(String[] args) {
		DataHiding s = new DataHiding();
		s.setId(10);
		System.out.println(s.getId());
		s.setName("parul");
		System.out.println(s.getName());
	}

}

package com.encapsulation.programs;

public class Implementation extends Encapsulate {
	public void validation() {
		String m = "kiran.2124mca1090@kiet.edu";
		String k = "12&65";
		if (getEmail().compareTo(m) == 0 && getPassword().compareTo(k) == 0)
			System.out.println("Your balance is 10000 rs");

	}
}

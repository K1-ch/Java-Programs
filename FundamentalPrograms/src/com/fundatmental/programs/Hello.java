package com.fundatmental.programs;

class NameException extends Exception {
	NameException(String x) {
		super(x);
	}
}

public class Hello {

	public static void main(String[] args) {
		try {
			throw new NameException("17");
		} catch (NameException e) {
			System.out.println("caught Exception");
			System.out.println(e.getMessage());
		}
	}

}

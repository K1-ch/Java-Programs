package com.polymorphism.programs;

//overloading is having method with diff arguments types
//it is also called as complie tym or static polymorphism or early data binding
class Overloading {
	void sum(int a, int b) {
		System.out.println(a + b);
	}

	void sum(String a, String b) {
		System.out.println(a + b);
	}

	void sum(double a, double b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		Overloading t = new Overloading();
		t.sum(10, 20);
		t.sum("Radhe", "Shyam");
		t.sum(56.89, 20.03456);
	}
}

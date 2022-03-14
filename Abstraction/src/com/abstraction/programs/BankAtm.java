package com.abstraction.programs;

//abstract method is used when we want to show only essential feature to user
abstract class BankAtm {
	int a = 1000;

	abstract void password();

	public void printReciept() {
		System.out.println("Printing reciept" + a);
	}

	// implementation of abstract method is responsibility of child class

}
//when a class has atleast one abstract method then the class must have declared as 
//abstract because we can't create obj for abstract class it is bcz there
//is not any implementation for abstract method so there is no meaning 
//of creating object bcz it will nt implement 

abstract class Match {
	void m1() {
		// a abstract class can contain zero abstract method
	}
}
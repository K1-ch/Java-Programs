package kiet.edu;

import program.SumNum;

class F {

     //constructor
	F() {
		System.out.println("Tundla");
	}
	
	// Non static block
	{
		System.out.println("hello");
	}
	static {

		System.out.println("i am first");

	}
}

public class AvrProgram {

	public static void main(String[] args) {
		F s = new F();
		
	}

}

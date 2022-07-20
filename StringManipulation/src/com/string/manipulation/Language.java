package com.string.manipulation;

import java.math.BigInteger;
import java.util.Arrays;

class Main {
	int roll ;
	String name ;

	void style(int roll, String name) {
        roll=roll;
        name=name;
		

	}
	void print() {
		System.out.println(roll + " "+name);
	}

}

public class Language {
	public static void main(String[] args) {
		Main s = new Main();
        s.style(0, "ramesh");
		s.print();
	}

}

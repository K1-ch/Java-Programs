package com.fun.programs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Sum s=new Sum();
		//define q as 1 for sum and 2 as product
	    System.out.println(s.sumOrProduct(17, 1));
		System.out.println(s.sumOrProduct(23, 1));
		System.out.println(s.sumOrProduct(23, 2));
		System.out.println(s.sumOrProduct(21, 1));
		System.out.println(s.sumOrProduct(11, 2));
		System.out.println(s.sumOrProduct(16, 1));
	}

}

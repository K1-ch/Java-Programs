package com.javaprograms;
//find square root of a number and print floor value if not perfect square
import java.util.Scanner;

public class SquareRoot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long res = (int) Math.sqrt(Math.floor(n));
		System.out.println(res);
	}

}

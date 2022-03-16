//Program to find string palindrome using method
package com.function.programs;

import java.util.Scanner;

class String1 {
	static void rev() {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char p[] = new char[s.length()];
		int m = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			p[m] = s.charAt(i);
			m++;
		}
		String str = new String(p);
		if (s.compareTo(str) == 0)
			System.out.println("Palindrome string ");
		else
			System.out.println("Not palindrome string");

	}
}

public class StringRev {

	public static void main(String[] args) {
		String1 m = new String1();
		m.rev();

	}

}

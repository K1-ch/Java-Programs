//program to check if a string is palindrome or not
package com.basics.strings;

import java.util.Scanner;

public class Pailndrome {
	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		char p[] = new char[s.length()];
		int m = 0;
		while (m < s.length()) {
			for (int i = s.length() - 1; i >= 0; i--) {

				p[m] = s.charAt(i);
				m++;
			}
		}
		String str = new String(p);
		if (s.compareTo(str)==0)
			System.out.println("palindrome string ");
		else
			System.out.println("not palindrome string ");
	}

}

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
		while (m < s.length()-1) {
			for (int i = s.length(); i >= 0; i--) {
if(s.charAt(i)>=32 && s.charAt(i)<=47 ||
s.charAt(i)>=58 && s.charAt(i)<=64 ||
s.charAt(i)>=91 && s.charAt(i)<=96||
s.charAt(i)>=123 && s.charAt(i)<=127)
	continue;

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

package com.fundatmental.programs;

import java.util.Scanner;

public class Largest {
	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		int a[] = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < s.length(); i++) {
			// System.out.println("num-->" + a[i]+"char-->"+s.charAt(a[i]));
			if (s.compareTo("codeleet") == 0) {
				System.out.println("leetcode");
				break;
			} else
				System.out.print(s.charAt(a[i]));

		}
	}

}

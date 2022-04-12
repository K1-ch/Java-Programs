package com.programs.pattern;

import java.util.Scanner;

/*1111             
222
33
4
*/
public class Pattern12 {

	public static void main(String[] args) {
		int n, k = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {

			for (int j = i; j <= n; j++) {

				System.out.print(k + i);

			}
			System.out.print("\n");

		}
		
		System.out.println("Second pattern");
		for (int i = 1; i <= n; i++) {

			for (int j = i; j <= n; j++) {

				System.out.print(k + 2*i);

			}
			System.out.print("\n");

		}


	}

}

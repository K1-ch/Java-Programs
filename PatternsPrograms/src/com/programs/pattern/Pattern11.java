package com.programs.pattern;

import java.util.Scanner;

/*1234
234
34
4*/
public class Pattern11 {

	public static void main(String[] args) {
		int n, k = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {

			for (int j = i; j <= n; j++) {

				System.out.print(k + j);

			}
			System.out.print("\n");

		}

	}

}

package com.fun.programs;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {

			for (int j = i; j <= n; j++) {
              for(int k=j;k<=n;k++) {
				System.out.print(j);

			}
			
			System.out.print("\n");
			}
		}

	}

}

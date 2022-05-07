package com.codechef;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T != 0) {
			int N = sc.nextInt();// num of obj ques
			int X = sc.nextInt();// marks
			int a = 0, b = 0, c = 0;

			if (X % 3 == 0) {
				a = a + (X / 3);
			} else if (X % 3 == 1) {
				a = a + (X / 3) + 1;
				b = b + 2;
			} else if (X % 3 == 2) {
				a = a + (X / 3) + 1;
				b = b + 1;
			}

			if (a + b <= N) {
				System.out.println("Yes");
				System.out.println(a + " " + b + " " + (N - a - b));
			} else
				System.out.println("No");
			T--;

		}
	}

}

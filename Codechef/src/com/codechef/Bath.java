package com.codechef;

import java.util.Scanner;

public class Bath {

	public static void main(String[] args) {
		int T;
		Scanner sc=new Scanner(System.in);
		T=sc.nextInt();
		while(T!=0) {
			int water=sc.nextInt();
			int bucket=sc.nextInt();
			int s=water/(2*bucket);
			System.out.println(s);
			T--;
		}

	}

}

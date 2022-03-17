package com.fun.programs;
//Program to rotate an array by given number
import java.util.Scanner;

public class Rotate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		int k = sc.nextInt();
		for (int i = k; i < n; i++)
			System.out.print(a[i] + " ");
		for (int j = 0; j < k; j++)
			System.out.print(a[j] + " ");

	}

}

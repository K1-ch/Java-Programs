/*Program to print transpose of array using methods */
package com.function.programs;

import java.util.*;

public class Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sizeRow = sc.nextInt();
		int sizeCol = sc.nextInt();
		int a[][] = new int[sizeRow][sizeCol];
		InputArr(sizeRow, sizeCol, a);
		OutputArr(sizeRow, sizeCol, a);
		TransposeArr(sizeRow, sizeCol, a);
	}

	static void InputArr(int sizeRow, int sizeCol, int a[][]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter " + sizeRow * sizeCol + " Elements");
		for (int i = 0; i < sizeRow; i++)
			for (int j = 0; j < sizeCol; j++) {
				a[i][j] = sc.nextInt();
			}
	}

	static void OutputArr(int sizeRow, int sizeCol, int a[][]) {
		System.out.println("The array is::");
		for (int i = 0; i < sizeRow; i++) {
			for (int j = 0; j < sizeCol; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	static void TransposeArr(int sizeRow, int sizeCol, int a[][]) {
		System.out.println("The transpose of array is::");
		for (int i = 0; i < sizeRow; i++) {
			for (int j = 0; j < sizeCol; j++) {
				System.out.print(a[j][i] + " ");
			}
			System.out.println();
		}

	}
}

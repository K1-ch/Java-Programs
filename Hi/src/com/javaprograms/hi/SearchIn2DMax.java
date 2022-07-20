package com.javaprograms.hi;

import java.util.Arrays;

public class SearchIn2DMax {
	public static void main(String[] args) {
		int matrix[][] = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
		for (int x[] : matrix) {
			for (int y : x) {
				if (y == 13) {
					System.out.println(true);
				}
			}
		}
		
			System.out.println(false);
		

	}
}

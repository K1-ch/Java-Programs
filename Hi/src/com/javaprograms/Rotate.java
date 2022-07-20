package com.javaprograms;

public class Rotate {
	public static void main(String[] args) {
		int k = 3;

		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		int temp[] = new int[a.length];
		while (k != 0) {
			if (k % 2 == 0) {
				for (int i = a.length - 1; i >= 0; i--) {
					temp[i] = a[i];
				}
			} else {
				for (int i = 0; i < a.length; i++) {
					temp[i] = a[i];

				}

			}

			k--;
		}
		System.out.print("[");
		for(int x:temp) {
			System.out.print(x+",");
			
		}
		System.out.print("]");
	}
}

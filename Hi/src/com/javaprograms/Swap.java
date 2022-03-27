//Swap two values without third variables
package com.javaprograms;

import java.util.Scanner;
class Solution {
	public static void swapNumber(int x, int y) {
		x = x + y;
		y = x - y;
		x = x - y;
		int a[] = new int[2];
		a[0] = x;
		a[1] = y;
		System.out.println("After swapping values are:");
		System.out.print(a[0] + " " + a[1]);
	}
}
public class Swap {
	public static void main(String[] args) {
		Solution p = new Solution();

		p.swapNumber(20, -10);

	}

}

//Program to check if a number is a power of four or not
package com.leetcode.programs;

public class PowerOfFour {
	public boolean isPowerOfFour(int n) {
		if (n == 0)
			return false;
		while (n != 1) {
			if (n % 4 != 0)
				return false;
			n = n / 4;
		}
		return true;
	}

	public static void main(String[] args) {
		PowerOfFour s = new PowerOfFour();
		System.out.println(s.isPowerOfFour(1024));

	}
}

package com.leetcode.programs;

class Reverse {
	public boolean isPalindrome(int x) {
		int rem, rev = 0;
		int temp = x;
		while (x != 0) {
			rem = x % 10;
			rev = rev * 10 + rem;
			x = x / 10;
		}
		if (rev == temp && rev >= 0)
			return true;
		else
			return false;
	}
}

public class ReverseBool {
	public static void main(String[] args) {
		Reverse s = new Reverse();
		System.out.println(s.isPalindrome(-121));
	}
}

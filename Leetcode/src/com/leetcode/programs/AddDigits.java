package com.leetcode.programs;

class Add {
	public int addDigits(int num) {
		int sum = 0, rem;
		while (num != 0) {
			rem = num % 10;
			num = num / 10;
			sum += rem;

		}
		return sum;
	}
}

public class AddDigits {

	public static void main(String[] args) {
		Add d = new Add();
		System.out.println(d.addDigits(38));
	}

}

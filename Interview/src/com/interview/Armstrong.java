package com.interview;

class ArmstrongNumber {
	boolean armstrong(int number) {
		int temp = number, rem, sum = 0, count = 0;
		while (number != 0) {
			number /= 10;
			count++;
		}
		int temp1 = temp;
		while (temp != 0) {
			rem = temp % 10;
			sum += (int) Math.pow(rem, count);
			temp /= 10;
		}
		if (temp1 == sum)
			return true;
		return false;
	}
}

public class Armstrong {

	public static void main(String[] args) {
		ArmstrongNumber s = new ArmstrongNumber();
		System.out.println(s.armstrong(371));

	}

}

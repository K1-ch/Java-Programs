package com.fun.programs;

public class Sum {

	public static long sumOrProduct(int n, int q) {
		long sum = 0, mul = 1;
		long modulo = 1000000007l;
		if (q == 1) {
			while (n != 0) {
				sum += n;
				n--;
			}
			return sum;
		} else {
			while (n != 1) {
				mul =(mul*n)% modulo;
				n--;
			}
			return mul;
		}
	}
}

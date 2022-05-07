package com.fun.programs;

import java.util.ArrayList;
import java.util.List;

// [1 2 3 4 ]=[1 2 3 5]
class SumFun {
	public int[] plusOne(int[] digits) {
		digits[digits.length - 1] += 1;
		return digits;
	}
}

public class OddEvenSum {
	public static void main(String[] args) {
		int[] digits = { 1, 2, 3, 4 };
		SumFun s = new SumFun();
		s.plusOne(digits);
		List<Integer> lst = new ArrayList<>();
		for(int a:digits) {
			lst.add(a);
		}
		System.out.println(lst);
	}
}

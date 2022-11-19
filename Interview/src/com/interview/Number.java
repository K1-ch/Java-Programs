package com.interview;

public class Number {

	public static void main(String[] args) {
		int arr[] = { 3, 10, 12, 10, 7, 4 };
		int i = arr.length / 2;
		int sum = 0, sum1 = 0, res;
		for (int j = 0; j <i; j++) {
			sum += arr[j];
		}
		for (int j = i - 1; j < arr.length; j++) {
			sum1 += arr[j];
		}
		res = sum * sum1;
       System.out.println(sum +" "+sum1);

	}

}

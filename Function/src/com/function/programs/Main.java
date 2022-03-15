package com.function.programs;

import java.util.Arrays;

public class Main {
	static int[] a = { 1, 5, 2, 5, 9, 10 };
	public static void main(String[] args) {
		callMethod();
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

	public int[] sortArray(int[] a) {
		Arrays.sort(a);
		return a;
	}

	public static void callMethod() {
       Main main = new Main();
       main.sortArray(a);
	}

}

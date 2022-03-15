package com.function.programs;

public class Sum {
	public int sum(int a, int b) {
		return a + b;
	}

	public int sub(int c, int d) {
		return c - d;
	}

	public static void main(String[] args) {
		Sum s = new Sum();
		System.out.println(s.sum(30, 30));
		System.out.println(s.sub(90, 78));

	}
}

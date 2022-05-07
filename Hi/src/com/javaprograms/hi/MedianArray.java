package com.javaprograms.hi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MedianArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float median = 0;
		String a = sc.nextLine();
		String b = sc.nextLine();
		String arr1[] = a.split(" ");
		String arr2[] = b.split(" ");
		String cs = a + " " + b;
		String arr3[] = cs.split(" ");
		List<Integer> u = new ArrayList<>();
		for (int i = 0; i < arr3.length; i++) {
			u.add(Integer.parseInt(arr3[i]));
		}
		if (u.size() % 2 != 0) {
			median = u.get((u.size() + 1) / 2);
		} else {
			median = (u.get(u.size() / 2) + u.get((u.size() + 1) / 2)) / 2;
		}
		System.out.println(String.format("%.4f", median));

		sc.close();

	}

}

package com.fun.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sorted_Array {

	public static void main(String[] args) {
		ABC s = new ABC();
		ArrayList<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of list");
		int n = sc.nextInt();
		System.out.println("Enter elements of list");
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		System.out.println("Enter element to find in list");
		int k = sc.nextInt();
		s.firstAndLastPosition(list, n, k);

	}

}

class ABC {
	public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
		System.out.println(arr);
		return null;

	}
}

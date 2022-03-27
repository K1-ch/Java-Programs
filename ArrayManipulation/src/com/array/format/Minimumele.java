//minimum ele in  an array
package com.array.format;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Minimumele {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		a = performOperations(a, n, k);
		for (int x : a) {
			System.out.print(x + " ");
		}
	}

	static int[] performOperations(int a[], int n, int k) {

		while (k != 0) {
			List<Integer> list = new ArrayList<>();
			Arrays.stream(a).forEach(list::add);
			int MAX = list.stream().sorted().collect(Collectors.toList()).get(n - 1);
			a = list.stream().map(x -> MAX - x).mapToInt(Integer::intValue).toArray();
			k--;
		}

		return a;

	}
}

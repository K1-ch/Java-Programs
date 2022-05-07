package com.javaprograms.hi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main1 {
	public static int sockMerchant(int n, List<Integer> ar) {
		List<Integer> distinctValues = ar.stream().distinct().collect(Collectors.toList());
		int count = 0;
		for (int a : distinctValues) {
			int countVal = (int) ar.stream().filter(i -> i.intValue() == a).count();
			if (countVal > 1) {
				int rem = countVal / 2;
				count += rem;
			}
		}

		return count;

	}

}

public class Socks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> s = new ArrayList<>();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			s.add(sc.nextInt());
		}
		Main1 p = new Main1();
		System.out.println(p.sockMerchant(n, s));
	}
}

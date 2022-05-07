package com.basics.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		String s,t;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		t= sc.nextLine();
		char [] a=s.toCharArray();
		char [] b=t.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		if(String.valueOf(a).equals(String.valueOf(b)))
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
	}

}

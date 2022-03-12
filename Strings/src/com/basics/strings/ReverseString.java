//Program to Reverse a String
package com.basics.strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
          
	}

}

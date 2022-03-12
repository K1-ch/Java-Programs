//using string manipulation functions
package com.basics.strings;

import java.util.Scanner;

public class StringFun {

	public static void main(String[] args) {
		String s, p = "chauhan";
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		/* (1). */ System.out.println(s.endsWith("*"));
		// return true if ends with *
		/* (2). */ System.out.println(s.startsWith("mango"));
		// return true if starts with *
		/* (3). */System.out.println(s.concat(p));
		// concatenates two strings
		/*(4).*/System.out.println(s.trim());
		//remove extra white spaces from start and end
		/*(5).*/System.out.println(s.replace('a', 'l'));
		//repalce the first string or char with second
		/*(6).*/System.out.println(s.lastIndexOf("ram"));
		//returns the last index of string or char
			}

}

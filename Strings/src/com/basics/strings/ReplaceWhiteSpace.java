//Replace White Spaces with specific char
package com.basics.strings;

import java.util.Scanner;

public class ReplaceWhiteSpace {

	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		System.out.println(s.replace(' ', '&'));

	}

}

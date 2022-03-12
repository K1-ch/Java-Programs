//divide a string into n equal parts
package com.basics.strings;

import java.util.Scanner;

public class DivideString {
	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		int l = s.length();//saves the length of string
		int m, temp = 0;

		m = sc.nextInt();//parts 
		int chars = l / m;//chars save num of character in each substring
		System.out.println("num of character in each substring="+chars);
		String[] equalStr = new String[m];//string arr to save diff strings
		if (l % m != 0)
			System.out.println("String can't be divided into " + m + " equal parts");
		else {
			for (int i = 0; i < l; i = i + chars) {
				String part = s.substring(i, i+chars);
				//here substring length will be last value-start value
				equalStr[temp] = part;
				temp++;
			}
			System.out.println(m + " equal parts of given string are ");
			for (int i = 0; i < equalStr.length; i++) {
				System.out.println(equalStr[i]);
			}
		}

	}

}

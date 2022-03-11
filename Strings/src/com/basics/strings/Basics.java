package com.basics.strings;
import java.util.Scanner;
public class Basics {
	public static void main(String[] args) {
		String s;
		int count=1;
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ')
				count++;
		}
        System.out.println("Number of words in string are::"+count);
	}

}

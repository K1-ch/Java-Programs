//Remove whitespaces from a string
package com.basics.strings;
import java.util.Scanner;
public class SmallAndLarg {
	public static void main(String[] args) {
		String s;
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ')
				continue;
			System.out.print(s.charAt(i));
		}

	}

}

// Count Lower & Upper charcaters in string
package com.basics.strings;
import java.util.Scanner;
public class CountLowerUpper {
	public static void main(String[] args) {
		String s;
		char temp;
		int upper=0,lower=0;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>=65 && s.charAt(i)<=90)
				upper++;
			else if(s.charAt(i)>=97 && s.charAt(i)<=122)
				lower++;
		}
		System.out.println("Lower charcaters in string="+lower);
		System.out.println("Upper charcaters in string="+upper);
	}

}

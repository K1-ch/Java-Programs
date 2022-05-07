package com.string.manipulation;
import java.util.Scanner;
public class BadString {
	public static void main(String[] args) {
		String s;
		int count=0;
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
				if(s.charAt(i+1)=='a'||s.charAt(i+1)=='e'||s.charAt(i+1)=='i'||s.charAt(i+1)=='o'||s.charAt(i+1)=='u')
					if(s.charAt(i+2)=='a'||s.charAt(i+2)=='e'||s.charAt(i+2)=='i'||s.charAt(i+2)=='o'||s.charAt(i+2)=='u')
			count++;
		}
		if(count>3)
	System.out.println(1);
		else
			System.out.println(0);
			}

}

package com.string.manipulation;
import java.util.Scanner;
public class CamelCase {
	public static void main(String[] args) {
		String input="",input1 = null;
		int count=0;
		Scanner sc=new Scanner(System.in);
		  input=sc.nextLine();
		    for(int i=0;i<input.length();i++)
		    	count++;
		  int m=(int)Math.pow(2,count);
	for(int i=0;i<m-1;i++) {
		for(int j=1;j<m-1;j++) {
			input1+=input.charAt(i);
					}
	}
	for(int i=0;i<m-1;i++) {
	System.out.print(input);
	}
	  }
}

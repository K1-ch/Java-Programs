package com.basics.strings;
import java.util.*;
 public class WordToUpper {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		 String s=sc.nextLine();
		 int a[]=new int[4];
		 int count1=0,count2=0;
		 for(int i=0;i<4;i++) 
	     a[i]=sc.nextInt();			 
		 
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)!=s.charAt(i+1))
				count1++;
		if(s.charAt(i+2)!=s.charAt(i+3))
			count2++;
		}
		System.out.println(count1+"\n"+count2);
		
	}

}

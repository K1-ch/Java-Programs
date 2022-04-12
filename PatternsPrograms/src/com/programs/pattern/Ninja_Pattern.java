package com.programs.pattern;

import java.util.Scanner;

public class Ninja_Pattern {
public static void main(String[] args) {
	int i,j,n,p;
	 Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the no of lines");
	 n=sc.nextInt();
	     for(i=1;i<=n;i++)
	     {
	 p=i;
	 for(int k=n;k>=i;k--){ 
         System.out.print(" ");
    }
	         for(j=1;j<=i;j++,p++)
	         {
	             System.out.print(p);
	         }
	 
	         System.out.println();
	     }
 }
}

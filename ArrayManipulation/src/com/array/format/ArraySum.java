package com.array.format;
import java.util.Scanner;
public class ArraySum {
	public static void main(String[] args) {
		  int n;
	         Scanner sc=new Scanner(System.in);
	        n=sc.nextInt();
	        int a[]=new int [n];
	    int sum=0;
	   
	    for(int i=0;i<n;i++) {
	        a[i]=sc.nextInt();
	    }
	for(int i=0;i<n;i++) {
	    sum+=a[i];
	}
	System.out.println(sum);
	/*
	 * if(sum%2==0) System.out.println(2); else System.out.println(1);
	 * 
	 */	}

}

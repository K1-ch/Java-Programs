package com.fundatmental.programs;
import java.util.Scanner;
public class Ball {

	public static void main(String[] args) {
		  int n;
	        Scanner sc = new Scanner(System.in);
	        n = sc.nextInt();
	        int a[]=new int[n];
	        for(int i=0;i<n;i++)
	            a[i]=sc.nextInt();
              for(int i=0;i<n;i++) {
            	  for(int j=0;j<n;j++) {
            		  a[i]=a[i]/10;
            		  
            	  }
              }
	        }

}

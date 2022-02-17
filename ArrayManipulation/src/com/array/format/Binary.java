// series of odd numbers until nth term
package com.array.format;
import java.util.Scanner;
public class Binary {
	public static void main(String[] args) {
		int N,count=-1;
	       Scanner sc=new Scanner(System.in);
	       N=sc.nextInt();
	       for(int j=1;j<=N;j++) {
	    	   	       count+=2;
	       	    	   System.out.println(count); 
	       }
	}
}

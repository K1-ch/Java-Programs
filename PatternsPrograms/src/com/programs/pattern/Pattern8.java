package com.programs.pattern;
import java.util.*;
public class Pattern8 {
public static void main(String[] args) {
	int n;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	System.out.println("First pattern::\n");
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			System.out.print(" ");
			System.out.print(j);
		}
		System.out.println();
	}
	System.out.println("Second pattern::\n");
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			System.out.print(" ");
			System.out.print(i);
		}
		System.out.println();
	}
}
}

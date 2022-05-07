package com.javaprograms;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	int a;
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	int m[]=new int[a];
	for(int i=0;i<a;i++)
		m[i]=sc.nextInt();
	while(a>0) {
		System.out.println(m[a-1]);
		a--;
	}
}
}

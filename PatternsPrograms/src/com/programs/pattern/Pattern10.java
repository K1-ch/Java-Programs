package com.programs.pattern;
import java.util.Scanner;
public class Pattern10 {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n*i+2;j++) {
				System.out.print(" ");
				System.out.print("*");
			}
			System.out.println();
		}

	}
}

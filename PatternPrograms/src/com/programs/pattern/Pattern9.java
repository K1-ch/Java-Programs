package com.programs.pattern;
import java.util.Scanner;
public class Pattern9 {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print(" ");
				System.out.print(j);
			}
			System.out.println();
		}

	}
}

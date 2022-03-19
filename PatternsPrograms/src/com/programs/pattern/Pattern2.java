package com.programs.pattern;
import java.util.*;
class Pattern2{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	for (int i = 0; i <=n; i++) {
		
		for (int j = i; j > 0; j--) {
			System.out.print(" ");
			System.out.print("*");
		}

		System.out.print("\n");
	}

 }}
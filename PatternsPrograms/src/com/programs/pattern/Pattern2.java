package com.programs.pattern;
import java.util.*;
class Pattern2{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	char m=65;
	int n = sc.nextInt();
	for (int i = 0; i <n; i++) {
		
		for (int j = i; j >=0; j--) {
			
			System.out.print(m);
		
					}
				System.out.print("\n");
				m++;

	}

 }}
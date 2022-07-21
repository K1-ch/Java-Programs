package com.leetcode.programs;
//printing a array with rotating it
// { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }
//rotating 
//{{7,4,1},{8,5,2},{9,6,3}}

import java.util.Arrays;

public class RotateClass {

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int res[][] = new int[a.length][a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = a.length - 1; j >= 0; j--) {
				res[i][j] = a[j][i]; 
				//res[0][2] =a[2][0]//7
				//res[0][1]=a[1][0]//4
				//res[0][0]=a[0][0]//1
				//res[1][2]=a[2][1]//8
				//res[1][1]=a[1][1]//5
				//res[1][0]=a[0][1]//2
				//res[2][2]=a[1][2]//9
				//res[2][1]=a[1][2]//6
				//res[2][0]=a[0][2]//3
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][a.length - 1 - j] = res[i][j];
				//a[0][2]=a[0][0]//1
				//a[0][1]=a[0][1]//4
				//a[0][0]=a[0][2]//7
				//a[1][2]=a[1][0]//2
				//a[0][2]=a[0][0]//1
				//similary
			}
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]);
			}
		}
	}

}

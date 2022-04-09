package com.function.programs;

//Program to print array by using method
class Solution {
	public static int maxMatch(int[][] mat) {
		for(int[] x:mat) {
			for(int m:x)
				System.out.print(m+" ");
		}
			
		return 0;
	}

}


public class Array_By_Function {

	public static void main(String[] args) {
		Solution s=new Solution();
		int mat[][]= {{1,0,0},{0,1,0}};
		s.maxMatch(mat);

	}

}

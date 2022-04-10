package com.fun.programs;
//transpose a Matrix by method
 class Solution {

	public static int[][] transpose(int m, int n, int[][] mat) {
		int transpose[][]=new int[n][m];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				transpose[j][i]=mat[i][j];
			}
		}
		for(int x[]:transpose) {
			for(int p:x) {
				System.out.print(p+" ");
			}
			System.out.println();
		}
		return transpose;
	}

}

public class TransposeMatrix {

	public static void main(String[] args) {
		Solution s=new Solution();
		int mat[][]= {{1,8,0},{2,7,9}};
		s.transpose(2,3,mat);
		
			}

}

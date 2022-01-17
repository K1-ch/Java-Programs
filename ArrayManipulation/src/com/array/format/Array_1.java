package com.array.format;
public class Array_1 {
	public static void main(String[] args) {
		int x[][]= {{1,2,3},{9,0,3}};
		int y[][]= {{2,8,0},{1,0,8}};
		int z[][] = new int[3][3];
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				z[i][j]=x[i][j]+y[i][j];
			}
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(z[i][j]+" ");    
			}    
			System.out.println();//new line    
			}    	
	}

}

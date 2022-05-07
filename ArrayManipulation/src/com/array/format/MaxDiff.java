package com.array.format;
import java.util.Scanner;
public class MaxDiff {
	public static void main(String[] args) {
		int T ;
		Scanner sc=new Scanner(System.in);
		T=sc.nextInt();
		for(int i=0;i<T;i++) {
			int Rows=sc.nextInt();
			int Columns=sc.nextInt();
			int Array[][]=new int [Rows][Columns];
			for(int j=0;j<Rows;j++)
				for(int k=0;k<Columns;k++)
				Array[j][k]=sc.nextInt();	
			for(int l=1;l<Rows;l++) {
				for(int m=1;m<Columns;m++) {	
					int min=Array[0][0];
			    	   if(Array[l][m]<min) {
			    		   min=Array[l][m];
			       }			       		       	 
		           System.out.println(min);
			      	       }}
		}
		}
}

package com.array.format;
import java.util.Scanner;
//Array assignment and promotion
public class Array_Assign {
	public static void main(String[] args) {
		int x[] = new int[5];
			  
			   x[1]='a';//this will promoted to integer 
		//bt promotion is allowed only within the range of declared data type of array
			   //x[2]=10l;->This is not allowed bcz long range is higher then integer   
			   short l=30;
			   byte b=12;
			   int a[]={10,'a',l,b};
			   for(int x1:a)
				   System.out.println(x1);
			   
	}

}

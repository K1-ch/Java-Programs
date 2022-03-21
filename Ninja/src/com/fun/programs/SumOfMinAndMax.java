package com.fun.programs;
//program to add max and min element in array
import java.util.Arrays;
import java.util.Scanner;

public class SumOfMinAndMax {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int arr[]=new int[k];
		for(int i=0;i<k;i++)
			arr[i]=sc.nextInt();
		Arrays.sort(arr);
		int sum=arr[0]+arr[k-1];
		System.out.println(sum);

	}

}

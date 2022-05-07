package com.array.format;
import java.util.Scanner;
public class Queries {
	public static void main(String[] args) {
		int N, Q;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		Q = sc.nextInt();
		int a[] = new int[N];
		for (int i = 0;i<N;i++)
			a[i] = sc.nextInt();
		for (int j = 0; j < Q; j++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			int x = sc.nextInt();
			int count=0;
			for (int k =l-1; k<r; k++) {
				 if(a[k]>=x) 
					 count++;	 
			}
			 System.out.println(count);
		}
	}

}

package com.fun.programs;

import java.util.Arrays;

class Greatest {
	public static int[] Klargest(int[] a, int k, int n) {
		int p=a.length-1;
		Arrays.sort(a);
      int b[]=new int[a.length];
		for(int i=0;i<n;i++) {
			b[i]=a[p];
			System.out.println(b[i]);
			p--;
		}
		
		return b;
	}
}

public class KthLargestEle {

	public static void main(String[] args) {
		Greatest s = new Greatest();
		int a[] = {-2, 12 ,-1, 1, 20, 1 };
		s.Klargest(a, 5, 2);

	}

}

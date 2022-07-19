package com.javaprograms.hi;

import java.util.*;

class Result {
	public double lastlength(int nums1[], int nums2[]) {				
		ArrayList<Integer> s = new ArrayList<>();
		for (int x : nums1)
			s.add(x);
		for (int x : nums2)
			s.add(x);

		Collections.sort(s);
		
		int l=s.size();
		double d=0;
		
		if(l%2==0) {
		 d=(s.get((l/2)-1)+s.get(l/2))/2.0;
		
		 
			return d;
		}
		d=s.get(l/2);
		return d;
				
	}

}

public class Solution {
	public static void main(String[] args) {
		Result s = new Result();
		int a[] = { 1,2 };
		int b[] = { 3,4 };
		System.out.println(s.lastlength(a, b));
		
	}
}

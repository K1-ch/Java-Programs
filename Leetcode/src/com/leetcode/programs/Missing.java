package com.leetcode.programs;

class Solution {
	public boolean isIsomorphic(String s, String t) {
		char[] A = s.toCharArray();
		int m = A.length;
		char[]B=t.toCharArray();
		int p = 0;
		char l;
		while (m != 0) {
			l = A[p];
			A[p] = B[p];
		B[p]=l;
			m--;
			p++;
		}

		System.out.println(A);
		System.out.println(s);
		if (A.equals(s))
			return true;
		return false;
	}
}

public class Missing {
	public static void main(String[] args) {

		Solution s = new Solution();
		System.out.println(s.isIsomorphic("egg", "faa"));
	}
}
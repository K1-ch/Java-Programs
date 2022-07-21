package com.leetcode.programs;

class Solution1 {
	public int maxProfit(int[] prices) {
	
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;

		for(int i=0; i<prices.length; i++){
			minPrice = Math.min(minPrice , prices[i]);
			maxProfit = Math.max(maxProfit , prices[i] - minPrice);
		}

		return maxProfit;
		}
}

public class Substr {
	public static void main(String[] args) {
		Solution1 s = new Solution1();
		int prices[] = { 2, 4, 1 };

		System.out.println(s.maxProfit(prices));

	}
}
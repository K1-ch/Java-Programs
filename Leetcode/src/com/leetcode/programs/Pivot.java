package com.leetcode.programs;

class Sum {
	public int pivotIndex(int[] nums) {
		int suml = 0, sumr = 0, pivot = 0;
		if (pivot == 0) {
			suml = nums[0];

			for (int i = 1; i < nums.length; i++) {
				sumr += nums[i];
			}

			if (sumr == suml)
				return pivot;
		}

		pivot++;
		suml=0;
		while (pivot != nums.length - 1) {
			for (int i = 0; i < pivot; i++) {
				suml += nums[i];
				System.out.println(suml);
			}

			for (int i = pivot + 1; i < nums.length; i++) {
				sumr += nums[i];
			}
			if (sumr == suml)
				return pivot;

			pivot++;

		}

		return -1;
	}
}

public class Pivot {

	public static void main(String[] args) {
		Sum s = new Sum();
		int nums[] = { 1, 7, 3, 6, 5, 6 };
		System.out.println(s.pivotIndex(nums));
	}

}

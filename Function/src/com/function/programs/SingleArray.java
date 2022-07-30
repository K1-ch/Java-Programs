package com.function.programs;

import java.util.*;
import java.util.Map.Entry;

class Solution2 {
	public int singleNumber(int[] nums) {
		HashMap<Integer, Integer> s = new HashMap<>();
		for (int x : nums) {
			if (s.containsKey(x)) {
				s.put(x, s.get(x) + 1);
			} else {
				s.put(x, 1);
			}
		}
		int single = Collections.min(s.values());
		int result=0;
		for(Entry<Integer,Integer> e: s.entrySet()) {
			if(e.getValue()==single) {
				result=e.getKey();
			}
		}
		return result;
	}

}

public class SingleArray {

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		int a[] = { 1, 4, 4, 4, 2,2,1,-3 };
		System.out.println(s.singleNumber(a));

	}

}

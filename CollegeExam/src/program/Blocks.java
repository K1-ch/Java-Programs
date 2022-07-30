package program;

import java.util.*;

class Solution {
	public List<String> wordSubsets(String[] words1, String[] words2) {
		List<String> s = new ArrayList<>();
		List<String> s1 = new ArrayList<>();
		List<String> s2 = new ArrayList<>();
		List<String> s3 = new ArrayList<>();

		int i = 0;
		for (String x : words1) {
			s1.add(x);

		}

		for (String y : words2) {
			s2.add(y);
		}

		while (i != s1.size()) {
			for (String y : s2) {
				if (!(s1.get(i).contains(y)))
					s.add(s1.get(i));
			}
			i++;
		}
		System.out.println(s);
		for (String x : s1) {
			if (!(s.contains(x)))
				s3.add(x);
		}
		return s3;
	}
}

public class Blocks {

	public static void main(String[] args) {
		Solution s = new Solution();
		String words1[] = { "amazon", "apple", "facebook", "google", "leetcode" };
		String words2[] = { "lo", "eo" };
		System.out.println(s.wordSubsets(words1, words2));
	}

}

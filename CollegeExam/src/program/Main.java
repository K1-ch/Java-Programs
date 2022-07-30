package program;

import java.util.*;

class Solution21 {
	public void moveZeroes(int[] nums) {
		List<Integer> s = new ArrayList<>();
		int count = 0;
		for (int x : nums) {
			if (x == 0) {
				count++;
			} else {
				s.add(x);
			}
		}
		while (count != 0) {
			s.add(0);
			count--;
		}
		for(int i=0;i<s.size();i++) {
			nums[i]=s.get(i);
		}
		System.out.println(Arrays.toString(nums));
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution21 s = new Solution21();
		int a[] = { 0,1,0,3,12};
		s.moveZeroes(a);

	}

}

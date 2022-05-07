package com.javaprograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Solution1{

	public static int maxMatch(int[][] mat) {
        int count=0;
       for(int x[]:mat) {
           List<Integer> s=new ArrayList<>();
           for(int m:x) {
        	   s.add(m);
           }
           Collections.sort(s);
                  }
		return count;	
	}
}

public class Placement1 {

	public static void main(String[] args) {

		Solution1 s = new Solution1();
		int mat[][] = { { 0 ,0, 1, 1 }, {1 ,1, 1, 1},{0, 0, 0, 1},{1 ,0 ,0, 0} };
		System.out.println(s.maxMatch(mat));

	}

}

package com.string.manipulation;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Main{
	 public int majorityElement(int[] nums) {
		 String k=Arrays.toString(nums);
		 char l[]=k.toCharArray();
	 
		 public static <Character> Map<Character, Long >  frequencyMap(Stream<Character> elements) {
		        return elements.collect(
		            Collectors.groupingBy(
		            Function.identity(),
		            HashMap::new, // can be skipped
		            Collectors.counting()
		            )
		        );
		 }
	        
	    }
	 
}
public class Language {
	public static void main(String[] args) {
		Main s=new Main();
		int a[]= {1,1,1,1,2,2,3};
		System.out.println(s.majorityElement(a));
	}

}

package com.basics.strings;

import java.util.ArrayList;
import java.util.List;

class Sol {

	public static long repeatedString(String s, long n) {
		// Write your code here
		int i;
		List <Character> str=new ArrayList<> ();
		while(str.size()!=n) {
		for( i=0;i<s.length();i++) {
			char c=s.charAt(i);
			str.add(c);
			
		}
		if(str.size()!=n) {
			i=0;
		}
		}
		System.out.println(str);
				return 0;

	}
}

public class ReverseByWords {

	public static void main(String[] args) {

		Sol s = new Sol();
		s.repeatedString("aba", 10);
	}

}

package com.basics.strings;
//if character is in lower change to upper if in upper change to lower

class Main {

	public char[] call(String s) {
		char A[] = new char[s.length()];
		A = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if(!(A[i]>='a' && A[i]<='z')) {
				A[i]+=32;
			}
			else {
				if(!(A[i]>='A' && A[i]<='A')) {
					A[i]-=32;
				}

			}
		}
		return A;
	}
}

public class CountUpperLower {

	public static void main(String[] args) {
		Main s = new Main();
		System.out.println(s.call("Kalle"));

	}

}

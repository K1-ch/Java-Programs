package com.function.programs;
//taking a char array , rev it & return a string
class Rev {
	String revString(char[] string) {
		char str[] = new char[string.length];
		int m = 0;
		for (int i = string.length - 1; i >= 0; i--) {
			str[m] = string[i];
			m++;
		}

		return String.valueOf(str);//convert char array to string 
	}
}

public class MainRev {

	public static void main(String[] args) {
		Rev t = new Rev();
		System.out.println(t.revString("Naman".toCharArray()));
	}

}

package com.string.manipulation;
import java.util.Scanner;
public class Password {

	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		if (s.length() >= 10) {
			for (int i = 0; i < s.length(); i++) {
				if ((s.charAt(i) == '#' || s.charAt(i) == '@' || s.charAt(i) == '%' || s.charAt(i) == '&'
						|| s.charAt(i) == '&') && (s.charAt(i) >= 0 && s.charAt(i) <= 9)
						&& (s.charAt(i) >= 65 && s.charAt(i) <= 90) && (s.charAt(i) >= 97) && s.charAt(i) <= 122)
					System.out.println("Yes");

			}
		} else
			System.out.println("No");
	}

}

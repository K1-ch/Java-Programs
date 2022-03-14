package com.abstraction.programs;

import java.util.Scanner;

public class BalanceEnqiry extends BankAtm {
	void password() {
		System.out.println("Enter password");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

	}

	void show() {
		System.out.println("Your balance is 5000 rs");
	}
}

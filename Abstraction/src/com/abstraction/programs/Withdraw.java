package com.abstraction.programs;

import java.util.*;

public class Withdraw extends BankAtm {
	void password() {
		System.out.println("Enter password");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

	}

	void amount() {
		System.out.println("Enter Amount in multiples of 100");
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
       System.out.println("Processing");
       System.out.println("Collect cash");
       System.out.println("Take card");
	}
	 void viewBalance() {
   	  System.out.println("select yes if show balance");
     }
}

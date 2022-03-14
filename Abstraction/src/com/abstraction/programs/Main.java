package com.abstraction.programs;

public class Main {

	public static void main(String[] args) {
		Withdraw cash = new Withdraw();
		cash.password();
		cash.amount();
		cash.viewBalance();
		cash.printReciept();
		BalanceEnqiry savings = new BalanceEnqiry();
		savings.password();
		savings.show();
		savings.printReciept();
	}

}

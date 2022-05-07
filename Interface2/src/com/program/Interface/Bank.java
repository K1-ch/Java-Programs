package com.program.Interface;

//here we have to override the methods and provide them implementation
public class Bank implements BankService {

	@Override
	public void withdrawal() {
		System.out.println("Withdrwal is 2000");

	}

	@Override
	public void transfer() {

		System.out.println("Transfer is of 6750");
	}

	@Override
	public void deposit() {

		System.out.println("deposit of 9000");
	}

	public static void main(String[] args) {
		BankService b = new Bank();
		b.withdrwal();
		b.transfer();
		b.deposit();
	}
}

package com.array.format;

import java.util.*;

class Storage {
	static int num;
}

class Counter extends Thread {
	@Override
	public void run() {
		super.run();
		int i = 0;
		while (true) {
			Storage.num = i;
		}
	}
}

class Printer extends Thread {
	@Override
	public void run() {
		super.run();
		while (true) {
			System.out.println(Storage.num + "\n");
		}
	}
}

public class Program {
	public static void main(String[] args) {
		Counter c = new Counter();
		Storage store = new Storage();
		Printer print = new Printer();
		c.start();
		print.start();
	}
}
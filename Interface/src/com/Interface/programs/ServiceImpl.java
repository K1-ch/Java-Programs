package com.Interface.programs;

public class ServiceImpl implements Service {

	@Override
	public void count() {
		System.out.println("The Count is 30");
	}

	public static void main(String[] args) {
		Service service = new ServiceImpl();
		service.count();

	}

}

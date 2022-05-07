package com.aggregration.programs;

public class Main {
	public static void main(String[] args) {

		Address address = new Address();
		address.setLine1("Plot818, First Floor");
		address.setLine2("Vasundhara, Sector3");
		address.setCity("Ghaziabad");
		address.setDistrict("Ghaziabad");
		address.setState("Uttar Pradesh");
		address.setCountry("India");
		address.setPincode("201012");
		Student student = new Student();
		student.setId(1);
		student.setName("Kiran");
		student.setAddress(address);
		System.out.println("\n"+student);
	}
}

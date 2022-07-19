package employee.details.com;

import java.util.Scanner;

public class OrganizationSet {
	public static void main(String[] args) {
		System.out.println("Enter the company name");

		Scanner sc = new Scanner(System.in);
		String company_name = sc.nextLine();
		Employee s = new Employee();
		s.EmpName();
		s.employeeId();
		s.work();
		Project s1 = new Project();
		s1.setProName("shopping cart");
		System.out.println("The project name is:" + s1.getProName());
		s1.setId("12303");
		System.out.println("The project id is:" + s1.getId());

	}

}

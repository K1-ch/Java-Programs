package employee.details.com;

import java.util.Scanner;

/*Full name.
Address and phone number.
Social Security Number (SSN).
Spouse information.
Position and department.
Start date.
Salary.
Emergency contact information.
*/

public class Employee extends Organization {

	@Override
	void EmpName() {
		String name = "Varun";
		System.out.println("Employee name=" + name);
	}

	@Override
	void employeeId() {
		String empId = "0s230kie";
		System.out.println("Employee Id=" + empId);
	}

	@Override
	void work() {
		String work = "Testing";
		System.out.println("Work of Employee=" + work);
	}
	
	   


}

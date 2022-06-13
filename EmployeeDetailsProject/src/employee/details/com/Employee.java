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
		System.out.println("EmpName: Sumit");
	}

	@Override
	void employeeId() {
		System.out.println("EmpID : E1012");
	}

	@Override
	void work() {
		System.out.println("Designation : Engineer");

	}

}

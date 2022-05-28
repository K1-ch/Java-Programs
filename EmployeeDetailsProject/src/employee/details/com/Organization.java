package employee.details.com;

//abstraction
//inheritance
//encapsulation
import java.util.*;

abstract public class Organization {
	
	void Organize() {
		System.out.println("Enter the company name");

		Scanner sc = new Scanner(System.in);
		String company_name = sc.nextLine();
	}

	abstract void EmpName();

	abstract void employeeId();

	abstract void work();
	
	
	}

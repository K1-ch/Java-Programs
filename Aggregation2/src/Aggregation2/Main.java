package Aggregation2;

public class Main {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Kiran");
		Salary salary = new Salary();
		salary.setPf(100);
		salary.setHealth(200);
		salary.setSales_tax(100);
		salary.setGst(300);
		emp.setSalary(salary);
		System.out.println(emp);

	}

}

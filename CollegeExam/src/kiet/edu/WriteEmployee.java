package kiet.edu;

import java.util.*;

class Employee {
	private int empNo;

	private String empName;

	private int empBasic;

	Employee(int empNo, String empName, int empBasic) {
		this.empNo = empNo;
		this.empName = empName;
		this.empBasic = empBasic;

	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpBasic(int empBasic) {
		this.empBasic = empBasic;
	}

	public int getEmpNo() {
		return empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public int getEmpBasic() {
		return empBasic;
	}

}

public class WriteEmployee {
	public static void main(String[] args) {
		int Num, Basic;
		String Name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the empid,name,basic of the Employee");
		Num = sc.nextInt();
		Name = sc.next();
		Basic = sc.nextInt();
		Employee s = new Employee(Num, Name, Basic);
		System.out.println("empid  ==  " + s.getEmpNo());
		System.out.println("name ==  " + s.getEmpName());
		System.out.println("basic of the Employee  ==  " + s.getEmpBasic());

	}
}
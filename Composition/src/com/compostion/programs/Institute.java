package com.compostion.programs;

public class Institute {
	Department department;

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public static void main(String[] args) {
		Institute ins = new Institute();
		Department dep = ins.new Department();
		dep.setName("IT");
		ins.setDepartment(dep);
		System.out.println(ins.getDepartment().getName());
	}

	class Department {
		String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}
}

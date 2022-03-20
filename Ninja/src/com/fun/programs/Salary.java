package com.fun.programs;
//program to print round salary of an employee by formula
//total salary=basic+hr+da+allowance-pf
public class Salary {

	public static void main(String[] args) {
		int basic = 4567;
		char grade = 'B';
		double hra = (double) (20 * basic) / 100;

		double da = (double) (50 * basic) / 100;
		double pf = (double) (11 * basic) / 100;
		int allowance;
		if (grade == 'A')
			allowance = 1700;
		else if (grade == 'B')
			allowance = 1500;
		else
			allowance = 1300;

		System.out.println(hra);
		System.out.println(da);
		System.out.println(pf);

		System.out.println(allowance);
		double total = basic + hra + da + allowance - pf;
		System.out.println(Math.round(total));
		System.out.println((int)total);
	
	}

}

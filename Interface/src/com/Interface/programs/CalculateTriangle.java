package com.Interface.programs;

import p1.*;
import java.util.*;

class Calculate implements Triangle{

	@Override
	public void calculate() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base and height");
		int height=sc.nextInt();
		int base=sc.nextInt();
		double result=(base * height)*1/2;
		System.out.println("Area "+ result);
		
	}
	
}
public class CalculateTriangle{

	public static void main(String[] args) {
		Calculate s=new Calculate();
		s.calculate();

	}

}

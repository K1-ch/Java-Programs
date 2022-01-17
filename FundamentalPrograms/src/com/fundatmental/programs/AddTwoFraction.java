package com.fundatmental.programs;
import java.util.Scanner;
public class AddTwoFraction {
	public static void main(String[] args) {
		int num1, den1, num2, den2, numf = 0, mul = 1,gcd=1,a,b;
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		den1 = sc.nextInt();
		num2 = sc.nextInt();
		den2 = sc.nextInt();
		if(den1==den2) {
		numf += num1 + num2;
		for (int j = 1; j <= den1; j++) {
			if (numf % j == 0 && den1 % j == 0)
				mul = j;
		int n = numf / mul;
		int m = den1 / mul;
		System.out.println(n + "/" + m);
		}}
		 else { 
			 for(int i = 1; i <= den1 && i <= den2; i++) {
				 if(den1 % i == 0 && den2% i == 0) 
					 gcd = i; 
				 } 
			 int lcm = (den1 * den2) / gcd; 
			 a=(lcm/den1)*num1;
		 b=(lcm/den2)*num2;
		 numf+= a+b; 
		 for(int j = 1; j <= den1; j++) { 
			 if(numf% j == 0 && den1% j == 0) 
				 mul=j;
			 } 
		 int n=numf/mul; 
		 int m=lcm/mul;
		 System.out.println(n+"/"+m);
		 }
		  }

}

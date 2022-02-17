//difficult problem bet the problem whose submissions are minimum is  said to be difficult
package com.array.format;
import java.util.Scanner;
public class HardestProblem {
	public static void main(String[] args) {
		int T,A,B,C;
	       Scanner sc=new Scanner(System.in);
	       T=sc.nextInt();
	       for(int i=0;i<T;i++) {
	       A=sc.nextInt();
	       B=sc.nextInt();
	       C=sc.nextInt();
	       if((A<B ) && (A<C))
	    	   System.out.println("Draw");
	       else  if(B<C && B<A) 
	    	   System.out.println("Bob");
	       else  if(C<A) 
	    	   System.out.println("Alice");

	       }

	}

}

//reverse num
package com.number.program;
import java.util.*;
public class num2 {
	public static void main(String[] args) {
		int n,rem,rev=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int tmp=n;
		while(1>0) {
			while(n!=0) {
				rem=n%10;
				rev=rev*10+rem;
				n=n/10;
			}
			if(rev!=tmp) {
				n=tmp+rev;
				tmp=n;
				rev=0;	
			}else {
				System.out.println("Palindrome-->"+tmp);
				break;
			}
		}
		
		
	}
	

}

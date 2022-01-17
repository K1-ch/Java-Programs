package com.number.program;
import java.util.*;
public class Num5 {
public static void main(String[] args) {
	int n,rem,count=0;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	while(n!=0) {
		rem=n%10;
		n=n/10;
		count++;
	}
	System.out.println(count);
        }
}

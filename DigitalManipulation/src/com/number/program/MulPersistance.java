package com.number.program;
import java.util.Scanner;
public class MulPersistance {
	public static void main(String[] args) {
	int n,count=0,i=0,count1=0,mul=1,k=0;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int temp=n;
	while(n!=0) {
		n=n/10;
		count++;
	}
    int rem[]=new int[count];
       while(temp!=0) {
    	rem[i]=temp%10;
    	temp/=10;
    	i++;
    	    }
       for(int j=0;j<count;j++)
    	   mul*=rem[j];
       System.out.println(mul);
       int temp1=mul;
      
      	}

}

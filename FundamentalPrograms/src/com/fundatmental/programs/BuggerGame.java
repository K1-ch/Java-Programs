package com.fundatmental.programs;
import java.util.Scanner;
public class BuggerGame {
	public static void main(String[] args) {
		String input="";
	    Scanner sc=new Scanner(System.in);
	    int sum1=0,sum2=0;
	    input=sc.nextLine();
	    String n[]=input.split(" ");//input string
	    if(n.length%2!=0) {
	     int m=n.length/2;
	     for(int i=m+1;i<n.length;i++) {
	    	 sum2+=Integer.parseInt(n[i]);//convert string to integer
	     }
	     for(int i=0;i<m;i++) {
	    	sum1+=Integer.parseInt(n[i]);
	     }
	    if(sum1==sum2)
	    	System.out.println(1);
	    else
	    	System.out.println(0);
	    }
	    else
	    	System.out.println(0);
	   	           
		
					 
	}

}

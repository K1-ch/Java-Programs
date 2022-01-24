//Add left & right array and multiply them
package com.array.format;
import java.util.*;
public class SumLR {
	public static void main(String[] args) {
	       String input="";
	    Scanner sc=new Scanner(System.in);
	    int sum1=0,sum2=0;
	    input=sc.nextLine();
	    String n[]=input.split(" ");//input string
	     int m=n.length/2;
	     for(int i=m;i<n.length;i++) {
	    	 sum2+=Integer.parseInt(n[i]);//convert string to integer
	     }
	     for(int i=0;i<m;i++) {
	    	sum1+=Integer.parseInt(n[i]);
	     }
	     System.out.println(sum1*sum2);
	   
	    	}

}

package com.string.manipulation;
import java.util.Scanner;
public class RunLength {
	public static void main(String[] args) {
	  int m;
	  Scanner sc=new Scanner(System.in);
	  m=sc.nextInt();
           String bin = Integer.toBinaryString(m);
      for(int i=0;i<bin.length()-1;i++) {  
    	  if(bin.charAt(i)==bin.charAt(i+1))
    		  System.out.println(0);
	}
      //System.out.println(1);
	}
}

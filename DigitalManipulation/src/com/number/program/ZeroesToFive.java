package com.number.program;
import java.util.*;
public class ZeroesToFive {
public static void main(String[] args) {

	Integer n;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	System.out.println(n.toString().replaceAll("0", "5"));
	
}
}

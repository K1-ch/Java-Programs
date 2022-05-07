package com.javaprograms;

import java.util.*;

class Method{
	void encode() {
	Scanner sc=new Scanner(System.in);
	int N=sc.nextInt();
	int A=sc.nextInt();
	int R=sc.nextInt();
	long res=A*(int)Math.pow(R, N-1);
	final long M = 1000000007;
	System.out.println(res%M);
	}
}
public  class Program{

	public static void main(String[] args) {
	Method s=new Method();
	s.encode();
}}

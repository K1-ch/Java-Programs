package com.javaprograms.hi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
class Sum{
	String name;
	int roll;
	//this
	Sum() {//this is called no argument constructor
		System.out.println("hii"); //now the constructor is nt default
	}
	 Sum (String n,int r){
		 this.name=n;
		 this.roll=r;
	 }
			}

public class Same {
	public static void main(String[] args) {
		Sum s=new Sum(); //this will call 
		Sum s2=new Sum("Ravi",10);//parameterized constructor
		System.out.println(s2.name+" "+s2.roll);
					}
}

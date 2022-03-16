package com.inheritance.programs;
//program to check whic method will implement 
class Parent  {
   void Property() {
   	System.out.println("Bunglow+Cash+Gold");
   }
   void Marry() {
   	System.out.println("Kavita");
   }
}
class Child extends  Parent{
	void Add() {
		System.out.println("Car");
	}
	void Marry() {
		System.out.println("Priya");
	}
}
public class MainInherit{
public static void main(String[] args) {
	Parent p=new Parent();
	p.Property();
	p.Marry();
	//p.Add(); This will give error bcz parent doesn't have child methods 
	Child c=new Child();
	c.Property();
	c.Add();
	c.Marry();//child will have all its parent method and its own method
	//bt if there is an overriden method its always implements child method
	Parent s=new Child();
	s.Property();
	s.Marry();//this will implement parent method
}}

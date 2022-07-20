package com.inheritance.programs;

 interface A{
	 static int p=20;
   void p();
}
 class M implements A{

	@Override
	public void p() {
		
		System.out.println(p);
	}
	 
 }
public class Inherit {

	public static void main(String[] args) {
		M s=new M();
		s.p();
	}

}

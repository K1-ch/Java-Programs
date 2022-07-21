package com.leetcode.programs;
//cloneable
class Power implements Cloneable {
	int m;
	String s;

	Power(int m, String s) {
		this.m = m;
		this.s = s;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}

}

public class Power1 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Power s=new Power(10,"Kamal");
		Power s1=(Power)s.clone();
		System.out.println(s.m +" " + " "+s.s);
		System.out.println(s1.m +" " + " "+s1.s);
	}

}

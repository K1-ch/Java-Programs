package com.leetcode.programs;

class Divide{
    public int divide(int dividend, int divisor) {
        int x=(int)dividend/divisor;
        if(x>=Math.pow(2, 31)-1) {
       
        return (int)(Math.pow(2, 31));
        }
        else if(x<=Math.pow(-2, 31)) {
        	
       
        return (int)(Math.pow(2, 31)-1);
        }
        else
        	return x;
    }
}
public class DivideTwoIntegers {

	public static void main(String[] args) {
		Divide s=new Divide();
		System.out.println(s.divide(2147483647,1));
		//System.out.println((int)(Math.pow(2, 31)-1));

	}

}

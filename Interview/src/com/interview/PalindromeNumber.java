package com.interview;

class Palindrome{
	 boolean palindrome(int number) {
		int temp=number,rem,rev=0;
		while(number!=0) {
			rem=number%10;
			rev*=10+rem;
			number/=10;
		}
		
		if(temp==rev)return true;
		return false;
	}
}
public class PalindromeNumber {

	public static void main(String[] args) {
		Palindrome s=new Palindrome();
		System.out.println(s.palindrome(-121));

	}

}

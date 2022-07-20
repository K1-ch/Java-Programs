package com.javaprograms.hi;
//compareto Method returns int value and compare first String to the another
public class Check {

	public static void main(String[] args) {
    String s="abcde";
    String t="quie";
    String k="abcde";

    System.out.println(s.compareTo(t));//t is smaller return <0 value
    System.out.println(s.compareTo(k));//return 0 bcz both equal
    System.out.println(t.compareTo(k));//return >0 bcz k is greater
    
    
    String myStr = "Hello planet earth, you are a great planet.";
    System.out.println("Value "+myStr.indexOf("ladoo"));
    
    System.out.println("Value "+myStr.indexOf("great"));

    
	}

}

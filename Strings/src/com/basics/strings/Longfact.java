//find factorial of very large number
package com.basics.strings;

import java.math.BigInteger;

class Solution {
	public static String calculateFactorial(int n) {
       BigInteger fact= new BigInteger("1");
       BigInteger i =new BigInteger("1");
       BigInteger one =new BigInteger("1");
while(i.intValue()<=n){
    fact=fact.multiply(i);
    i=i.add(one);
}
      return fact.toString();  
	}
}

public class Longfact {
public static void main(String[] args) {
	Solution s=new Solution();
	System.out.println(s.calculateFactorial(72));
	}
}

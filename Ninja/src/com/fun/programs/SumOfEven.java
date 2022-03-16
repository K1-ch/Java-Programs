package com.fun.programs;
//program to provide sum of even integers until n
public class SumOfEven {
	public long evenSumTillN(int n) {
        long sum=0;
		while(n!=0){
            if(n%2==0)
               sum+=n;
            n--;
        }
        return sum;
	}
}

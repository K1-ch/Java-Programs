package com.array.format;
import java.util.*;
public class RepeatChef {
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    int t = sc.nextInt();
		while(t>0)
		{
		   int N = sc.nextInt();
		   int K = sc.nextInt();
		   int S = sc.nextInt();
		   int sum =0;
		   int n = N;
		   int odd = 1;
		   while(n>0)
		   {
		       sum += odd;
		       odd+=2;
		       n--;
		   }
		   int temp = S - sum;
		   n = N;
		   odd = 1;
		   while(n>0)
		   {
		       if(temp == odd*(K-1))
		       {
		           System.out.println(odd);
		           break;
		       }
		       odd+=2;
		       n--;
		   }
		   t--;
		}
	}

}

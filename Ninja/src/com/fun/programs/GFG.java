package com.fun.programs;

import java.io.*;

public class GFG {
     
    // Function to find no. of elements
    // to be added to get s
    static int findS(int s)
    {
        int l = 1, r = (s / 2) + 1;
     
        // Apply Binary search
        while (l <= r) {
     
            // Find mid
            int mid = (l + r) / 2;
     
            // find sum of 1 to mid natural
            // numbers using formula
            int sum = mid * (mid + 1) / 2;
     
            // If sum is equal to n
            // return mid
            if (sum == s)
                return mid;
     
            // If greater than n
            // do r = mid-1
            else if (sum > s)
                r = mid - 1;
     
            // else do l = mid + 1
            else
                l = mid + 1;
        }
     
               return -1;
    }
     
    
    static public void main (String[] args)
    {
        int s = 15;
        int n = findS(s);
         
        if(n==-1)
            System.out.println("-1");
        else
            System.out.println(n);
    }
}
 
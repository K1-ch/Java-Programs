package com.programs.pattern;
import java.util.*;
class Pattern4{ 
    public static void main(String [] args){
    int n;
    
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
//    for(i=n;i>=1;i--){
//        for(j=i;j>=1;j--) {
//           System.out.print("  ");
//        }
//        for(j=((2*n)-(2*i-1));j>=1;j--){
//        	System.out.print(" ");
//            System.out.print("*");
//        }
//         System.out.print("\n");
    for(int row=1;row<=n;row++)

    {

        for(int col=1;col<=n*2-1;col++)

        {

            if(col>=(n+1-row) && col<=(n-1+row))

                System.out.print("*");

             else  

                 System.out.print(" ");

        }

        System.out.println();;

    }

 }
}


package com.programs.pattern;
import java.util.*;
class Pattern4{ 
    public static void main(String [] args){
    int n,i,j;
    System.out.println("Enter the no. of lines");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    for(i=1;i<=n;i++){
        for(j=1;j<=i;j++){
            System.out.print("  ");
        }
        for(j=1;j<=((2*n)-(2*i-1));j++){
        	System.out.print(" ");
            System.out.print("*");
        }
         System.out.print("\n");
    }}
}
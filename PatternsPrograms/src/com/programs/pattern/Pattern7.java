package com.programs.pattern;
import java.util.*;

class Pattern7{
    public static void main(String [] args){
        int n,i,sum=0;
        System.out.println("Enter the no. of lines");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
       for(i=1;i<=n;i++){
          sum=sum+(int)Math.pow(i, i);
       }
 System.out.print(sum);
       }
    }

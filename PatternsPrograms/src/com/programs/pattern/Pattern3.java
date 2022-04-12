package com.programs.pattern;
import java.util.*;
class Pattern3{
    public static void main(String [] args){
     int m,i,j,k;
     System.out.println("Enter the no. of lines");
     Scanner sc=new Scanner(System.in);
     m=sc.nextInt();
     for(i=1;i<=m;i++){        
        for(k=m;k>=i;k--){ 
             System.out.print(" ");
        }
           for(j=1;j<=i;j++){   
             System.out.print(k);
                     }
       System.out.print("\n");
     }

    }
}
  
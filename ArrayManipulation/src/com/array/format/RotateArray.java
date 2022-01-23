//rotate array
package com.array.format;
import java.util.*;
public class RotateArray{
  public static void main(String[] args){
    int n,m;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    m=sc.nextInt();
    int a[]=new int [n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
     for(int i=m;i<n;i++)
     System.out.print(a[i]+" ");
     for(int i=0;i<m;i++)
     System.out.print(a[i]+" ");
    }
}
//Reversing the elements of an array
package com.array.format;
import java.util.*;
public class RevArr{
  public static void main(String[] args){
    int n,rem,rev;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int a[]=new int [n];
    int b[]=new int [n];
    for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
    for(int i=0;i<n;i++){
        rev=0;
    while(a[i]!=0){
        rem=a[i]%10;
        rev=rev*10+rem;
        a[i]/=10;
    }
b[i]=rev;
    }
     for(int i=0;i<n;i++)
     System.out.print(b[i]+" ");
    }}

//minimum ele in  an array
package com.array.format;
import java.util.Scanner;
public class Minimumele{
 public static void main(String[] args) {
	  int n,tmp;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++){
          a[i]=sc.nextInt();
      }
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(a[i]>a[j]){
                tmp=a[i];
                a[i]=a[j];
                a[j]=tmp;
            }
        }
        System.out.println(n-1);
	}             }
}

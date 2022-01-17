//sorting the max element in an array
package com.number.program;
import java.util.Scanner;
public class Num4 {
	public static void main(String[] args) {
		int n,tmp;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		   for(int i=0;i<n;i++) {
			   a[i]=sc.nextInt();
		   }
		   for(int i=0;i<n;i++) {
			   for(int j=i+1;j<n-1;j++)  {
			if(a[j]>a[j+1]) {
				tmp=a[j];
				a[j]=a[j+1];
				a[j+1]=tmp;
			}   
			   }
			 		   }
		   System.out.println(a[n-1]);
		}
}
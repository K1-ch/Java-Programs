//jumbling digits of a num(456 to 564)
package com.number.program;
import java.util.*;
public class JumbledNum {
public static void main(String[] args) {
	int n,count=0,i=0,b;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int tmp=n;
	while(n!=0) {
		n=n/10;
		count++;
	}
	int a[]=new int[count];
	n=tmp;
	while(tmp!=0) {
		a[i]=tmp%10;
				tmp/=10;
				System.out.println(a[i]);
           i++;
	}
	if(a[0]!=a[1]) {
		b=a[0];
		a[0]=a[1];
		a[1]=b;
	}
	for(int m=0;m<count;m++)
		System.out.print(a[m]);

		  }
}

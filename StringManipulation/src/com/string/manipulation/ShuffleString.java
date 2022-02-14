//Shuffle String according to array
package com.string.manipulation;
import java.util.*;
public class ShuffleString {
public static void main(String[] args) {
	String s,newString="";
	char tmp;
	Scanner sc=new Scanner(System.in) ;
	s=sc.nextLine();
	char[] arr=s.toCharArray();
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
		if((int)arr[i]>(int)arr[j]) {
			tmp=arr[i];
			arr[i]=arr[j];
			arr[j]=tmp;
		}
		}
	}
	
    for(int i =0;i<arr.length;i++) {
    	newString=newString+arr[i];
    }
		System.out.println(newString);
	
}
}

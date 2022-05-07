package com.javaprograms.hi;

import com.javaprograms.B;

class Main{
	public static int[] termsOfAP(int x){
		
		int a[]=new int [x];
		
		for(int i=0;i<=x;i++){
			int res=3*(i+1)+2;
			if(res%4!=0){
				a[i]=res;
							}
			else continue;
			System.out.println(a[i]);
			

		}
		return a;
	}
}
public class C {
	
	public static void main(String[] args) {
		
		Main s=new Main();
		
	     s.termsOfAP(5);
		
	}

}

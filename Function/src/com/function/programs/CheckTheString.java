package com.function.programs;

class Main2{
	int checkRes(String s) {
		int c1=0,c2=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='#')c1++;
			else c2++;
		}
		if(c1==c2)
	return 0;
		else if(c1>c2)
			return c1-c2;
		return c2-c1;
	}
	
}
public class CheckTheString {

	public static void main(String[] args) {
		Main2 s11=new Main2();
		System.out.println(s11.checkRes("###******"));
		

	}

}

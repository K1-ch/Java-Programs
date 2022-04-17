package com.array.format;
import java.util.Scanner;
//changing var arg of main method
public class Args {
	public static void main(String[] args1) {
		String args[]= {"x","y","z"};
		args1=args;
		for(String s:args)
			System.out.println(s);
		
	}

}

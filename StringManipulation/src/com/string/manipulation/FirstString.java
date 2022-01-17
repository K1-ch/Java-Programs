//program to concatenate first letter of every word
package com.string.manipulation;
import java.util.*;
public class FirstString {
	public static void main(String[] args) {
         String str ;
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
      char c[] = str.toCharArray();
      for (int i=0; i < c.length; i++) {
         if(c[i] != ' ' && (i == 0 || c[i-1] == ' ')) {
            System.out.print(c[i]);
         }
      }
    }
}
				


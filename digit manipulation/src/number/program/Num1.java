package number.program;

import java.util.Scanner;

public class Num1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc=new Scanner(System.in);
		i=sc.nextInt();	
		String intString=Integer.toString(i);
		String binaryString=Integer.toBinaryString(i);
		boolean decimalPalindrome=isPalindrome(intString);
		boolean binaryPalindrome=isPalindrome(binaryString);	
		if(decimalPalindrome && binaryPalindrome) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
	public static boolean isPalindrome(String str) {
		String revString="";
		for(int j=str.length()-1;j>=0;j--) {	
			revString+=str.charAt(j);	
		}
		return str.compareTo(revString.toString())==0?true : false;
		
		
	}
		

}

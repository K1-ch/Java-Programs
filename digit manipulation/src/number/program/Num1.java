package number.program;

import java.util.Scanner;

public class Num1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,rem=0;
		Scanner sc=new Scanner(System.in);
		i=sc.nextInt();
		while(i!=0) {
			i=i%10;
			rem=rem+rem*10;
			i=i/10;
		}
		if(rem==i)
			System.out.println("palindrome num");
		else
			System.out.println(" not palindrome num");

	}

}

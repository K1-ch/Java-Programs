package ExceptionHandle;

import java.util.Scanner;

class Exception{
	int a, b;
	Exception(int a,int b){
		this.a=a;
		this.b=b;
	}
	void exception() {
		System.out.println("This is starting of Division");
		try {
		int res=a/b;
		System.out.println("division result is="+res);
		}
		catch(ArithmeticException ae) {
			
			System.out.println(ae.getMessage());
			
			System.out.println("Divide by Zero");
		}
		finally {
			System.out.println("I am in Finally Block");
		}
		System.out.println("This is ending of division function");
		
		
	}
}
public class Handle {

	public static void main(String[] args) {
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		Exception s=new Exception(num1,num2);
		s.exception();
		sc.close();
		

	}

}

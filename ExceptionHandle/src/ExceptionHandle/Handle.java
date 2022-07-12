package ExceptionHandle;

import java.util.InputMismatchException;
import java.util.Scanner;

class ExceptionEx {
	int a, b;
	Scanner sc = new Scanner(System.in);

	
	void exception() {
			try {
			System.out.println("Enter values");
			a = sc.nextInt();
			b = sc.nextInt();
			int res = a / b;
			System.out.println("division result is=" + res);
		} catch (ArithmeticException ae) {

			System.out.println(ae.getMessage());

			
		} catch (Throwable ae) {
			System.out.println(ae.getMessage());
			System.out.println("Enter any integer value");

		} finally {
			System.out.println("final block");
			sc.close();
		}
		
	}
}

public class Handle {

	public static void main(String[] args) {
		ExceptionEx s = new ExceptionEx();
		s.exception();

	}

}

package edu.kiet.assignment;
 //Program of command Line argument
public class Program2 {
	public static void main(String args[]) {
		int sum = 0;
		if (args.length > 0) {
			for (int i = 0; i < args.length; i++) {
				sum = sum + Integer.parseInt(args[i]);
			}

			System.out.printf("Sum = %d", sum);
		} else {
			
			System.out.println("No Arguments Passed\n");
		}

	}

}
package kiet.edu;
//Parameterized Constructor
class Main {
	private int a;
	int b;

	Main(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int sum() {
		return a + b;
	}
	
	public int getA() {
		return this.a;
	}
	
	}

public class Construct {

	public static void main(String[] args) {
		Main s = new Main(10, 20);
		
		System.out.println(s.getA());
	}

}

package kiet.edu;

abstract class Desktop {
	abstract void security();

	void print() {
		System.out.println("Desktop will print");
	}

	abstract void dataEntry();
}

class Start extends Desktop {
	void security() {
		
		System.out.println("Desktop will secure ");
	}

	
	void dataEntry() {
		System.out.println("Desktop will enter data");
	}
}

public class Main2 {

	public static void main(String[] args) {
		Start s=new Start();
		s.dataEntry();
		s.security();
        s.print();
	}

}

package kiet.edu;

//specific task -> by static method
//need to run first something then -> static block
//need to create a single copy for every object like college name-> is called static variable

class Sol{
	//Instance Method can be called by object only
	 int x=10;
	 
	void call() {
    System.out.println("Hello\n");
	}
	//this will execute first at the tym of class loading
	static {
		System.out.println("Hii");
	}
	static void print() {
		System.out.println("This is a static method call");
	 }
	}
public class StaticKeyword{

	public static void main(String[] args) {
		Sol s=new Sol();
		s.call();//normal method  call
		Sol.print();//directly call by class no need to create object
 	}

}
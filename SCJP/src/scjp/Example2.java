package scjp;
import com.polymorphism.programs.*;
class A {
	void p() {
		System.out.println("Namaste");
	}
}

public class Example2 {

	public static void main(String[] args) {
		A s=new A();
		s.p();
		Overloading m=new Overloading();
		m.main(args);
	}

}

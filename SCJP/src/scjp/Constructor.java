package scjp;

//Use of final before reference variable 
//maintain the object association with class
class A1 {
	int a;

	A1() {
		System.out.println("Hello");
	}
}

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final A1 s = new A1();
		s.a = 10;
		System.out.println(s.a);
		s.a = 20;
		System.out.println(s.a);

	}

}

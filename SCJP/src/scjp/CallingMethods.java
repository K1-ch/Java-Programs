package scjp;

class Method{
	protected int x=30;
	void g1() {
		System.out.println("what is this");
	}
	void go() {
		System.out.println("hello");
		g1();//accessing method declared in same class
	}
	
	
}
class Method2 extends Method{
		int  play() {
			x=45;
			return x;
		}
}
public class CallingMethods {
public static void main(String[] args) {
	Method s=new Method();
	s.go();//accessing mehod using refrence of the class
	Method2 s1=new Method2();
	s1.go();
	System.out.println(s1.play());


}
}

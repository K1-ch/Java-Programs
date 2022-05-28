
package kiet.edu;

interface A1{
	void fun1();
}
interface B1 extends A1{
	void fun2();
}
interface C extends A1,B1{
	void fun3();
}
class M implements A1,B1,C{

	@Override
	public void fun1() {
		System.out.println("This is fun1");		
	}

	@Override
	public void fun3() {
		
		System.out.println("This is fun3");
	}

	@Override
	public void fun2() {
		System.out.println("This is fun2");
		
	}
	
}
public class L {
public static void main(String[] args) {
	M s=new M();
	s.fun1();
	s.fun2();
	s.fun3();
}
}

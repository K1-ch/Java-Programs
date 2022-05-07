package kiet.edu;
class A {
	void show() {
		System.out.println("java");
	}
	final void clear() {
		System.out.println("This is final");
	}
}

class B extends A{
void print() {
	System.out.println("123");
}
	@Override
	void show() {
		super.show();//using super the parent method can also accesed by child 
    System.out.println("child show");
	}
	
	
}

public class MethodOverride {
public static void main(String[] args) {
	//if parent type refrence refers to parent refrence then parent method will be called
	A s =new A();
	s.show();
	s.clear();
	//if parent type refrence refers to child refrence then child method will be called
	A s1=new B();
	s1.show();
	
	B p=new B();
	p.print();
	
 }
}

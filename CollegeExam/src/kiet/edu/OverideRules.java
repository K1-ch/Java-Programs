package kiet.edu;

class Parent {
	protected void show() {
		System.out.println("Hello");
	}
}

class Child extends Parent {

	@Override
	protected void show() {
		System.out.println("Hii");
		}

	
}

public class OverideRules {

	public static void main(String[] args) {
		// If a Parent type reference refers
        // to a Parent object, then Parent's
        // show is called
		Parent s = new Parent();
		s.show();
		// If a Parent type reference refers
        // to a Child object Child's show()
        // is called. This is called RUN TIME
        // POLYMORPHISM.
		Parent s1 = new Child();
		s1.show();
	}

}

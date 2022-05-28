package kiet.edu;
class Outer{
	int x;
	static class Inner{
		int y;
	}
	
}
public class NestedClass {

	public static void main(String[] args) {
		Outer m=new Outer();
		m.x=40;
		Outer.Inner s=new Outer.Inner();
		s.y=20;
	  
		System.out.println(m.x+s.y);
	}

}

package kiet.edu;
//Use of super() 
class UseSuper{
	UseSuper(){
		System.out.println("Hello how r u");
	}
}
class UseSuper1 extends UseSuper{
	UseSuper1(){
	super();
	System.out.println("I m fine");
	}
	
}
public class Super1 {

	public static void main(String[] args) {
		UseSuper1 s=new  UseSuper1();
		}

}

package scjp;
//Using and accessing enum outside of class
enum month{
	jan,feb,mar,apr,may,jun
	//this cannot be protected or private outside of class
}
class A2{
	month p;
}
class P{
	enum planet{
		mercury,ven,earth,mars,jupiter
	}
	planet plan;
}
public class UseEnum {

	public static void main(String[] args) {
		A2 s=new A2();
	
		s.p=month.feb;
		System.out.println(s.p);
		
		P s1=new P();
		s1.plan=P.planet.mercury;
		System.out.println(s1.plan);
		
	}

}

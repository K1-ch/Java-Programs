package kiet.edu;
//Object cloning
class Clone{
	int x,y;
	Clone(){
		x=30;
		y=50;
	}
}
public class Clon {

	public static void main(String[] args) {
	Clone s=new Clone();
	Clone s1=s;
	System.out.println(s.x + " "+s.y);
       s1.x=200;
       s1.y=34;
    System.out.println(s.x+ " " +s.y);

    System.out.println(s1.x + " " +s1.y);
	}

}

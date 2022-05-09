package kiet.edu;
//usage of this()
class Info {
	private int id;
	private String name;
	
	Info(){
		this("Arun");
	}
	
	Info(String name){
		this(45);
		System.out.println("student name is:"+name);
	}
	Info(int id){
		System.out.println("The student id is:"+id);
	}
}
public class Student{
public static void main(String[] args) {
	Info s=new Info();
}
}

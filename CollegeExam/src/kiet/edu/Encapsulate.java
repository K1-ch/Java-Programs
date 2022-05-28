package kiet.edu;

class Encapsule {
private int id;
private String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
public class Encapsulate {

	public static void main(String[] args) {
		Encapsule s=new Encapsule ();
		s.setId(10);
		s.setName("arun");
		System.out.println(s.getId());
		System.out.println(s.getName());
	}

}


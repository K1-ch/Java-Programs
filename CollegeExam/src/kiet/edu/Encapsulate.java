package kiet.edu;

class Encapsule{
	private int id;
	private String name;
	public void  setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
}
public class Encapsulate{
	public static void main(String[] args) {
		Encapsule s=new Encapsule();
		s.setId(10);
		s.setName("Duvidha");
		System.out.println(s.getId());
		System.out.println(s.getName());
	}
}
	
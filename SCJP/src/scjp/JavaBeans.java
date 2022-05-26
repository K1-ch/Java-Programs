package scjp;

class Solution1{
	
	private  char m;
	
	 void setM(char m) {
		this.m=m;
	}
	
	char getM() {
		return m;
	}
}

public class JavaBeans {

	public static void main(String[] args) {
		Solution1 s=new Solution1();
		s.setM('c');
		System.out.println(s.getM());
	}

}

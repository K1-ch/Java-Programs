package kiet.edu;

class Main1{
	int num1,num2,res;
	
	void getDivide(int num1,int num2) {
		try {
		 res=num1/num2;
		 System.out.println("This is the result "+res);
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
}
public class FirstProgram {

	public static void main(String[] args) {
         Main1 s=new Main1();
         s.getDivide(10, 0);
         
         
	}

}

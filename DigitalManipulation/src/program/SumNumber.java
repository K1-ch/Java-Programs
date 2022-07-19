package program;

class Sum{
	void Sum(int a,int b) {
		System.out.println("sum="+(a+b));
	}
}
public class SumNumber {

	public static void main(String[] args) {
		Sum s=new Sum();
		s.Sum(10, 20);
	}

}

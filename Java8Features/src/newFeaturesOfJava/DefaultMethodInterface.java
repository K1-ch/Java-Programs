package newFeaturesOfJava;

interface defMethod {
	void withdraw();

	void deposit();

	default void balance() {
		System.out.println("Do u want to check ur balance");
	}
}

class defWork implements defMethod {

	@Override
	public void withdraw() {

	}

	@Override
	public void deposit() {

	}
	

}

public class DefaultMethodInterface {

	public static void main(String[] args) {
      defWork s=new defWork();
      s.deposit();
      s.balance();
      
	}

}

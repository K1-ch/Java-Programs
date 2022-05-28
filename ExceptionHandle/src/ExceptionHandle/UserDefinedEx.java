package ExceptionHandle;

class NewException extends Exception {

	NewException(String x) {
		super(x);
	}

}

public class UserDefinedEx {

	public static void main(String[] args) {

		try {
			
				throw new NewException("18");

		} catch (Throwable e) {
			System.out.println("Message in catch");
			System.out.println(e.getMessage());
		}
	}
}

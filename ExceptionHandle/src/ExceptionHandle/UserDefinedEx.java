package ExceptionHandle;

class NewException extends Exception {

	int x;

	public NewException(int y) {
		x = y;
	}

	public String toString() {
		return ("Exception value =  " + x);
	}

}

public class UserDefinedEx {

	public static void main(String[] args) {

		try {

			throw new NewException(5);

		} catch (NewException e) {

			System.out.println(e);
		}
	}
}

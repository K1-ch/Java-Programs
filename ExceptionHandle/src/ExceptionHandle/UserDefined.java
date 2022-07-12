package ExceptionHandle;

class Vote{
	int age;
	Vote(int age){
		this.age=age;
	}
	void cast() throws Throwable{
		try {
		if(age<18) {
			throw new Throwable("Age must be greater then 18");
		}}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
public class UserDefined {

	public static void main(String[] args) throws Throwable {
		Vote m=new Vote(10);
		m.cast();
	}

}

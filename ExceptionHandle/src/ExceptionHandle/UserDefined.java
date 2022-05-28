package ExceptionHandle;

class Vote{
	int age;
	Vote(int age){
		this.age=age;
	}
	void cast() throws Throwable{
		if(age<18) {
			throw new Throwable("U cant vote");
		}
	}
}
public class UserDefined {

	public static void main(String[] args) {
		Vote m=new Vote(20);
		
	}

}

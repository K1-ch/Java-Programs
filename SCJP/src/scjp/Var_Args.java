package scjp;
//Using of var arguments
//int x... this is wrong naming convention
class Sum{
	void sum(String c,int... x) {
		//void sum(int... x,String c)the variable that is taking  var-arg
		//should be the last parameter and only one var-arg can be used at a tym
		int sum=0;
	for(int y:x) {
		sum+=y;
	   }
	System.out.print(c+" ");
	System.out.println(sum);
	}
}
public class Var_Args {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Sum s=new Sum();
        s.sum("Hello",10,20,-10);
        s.sum("namaste",10,89);
        s.sum("How are u",34);
        s.sum("I am fine",3,10,89,2);
        
	}

}

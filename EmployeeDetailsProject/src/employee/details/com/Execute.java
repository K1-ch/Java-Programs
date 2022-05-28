package employee.details.com;
/* Class
Object 
Method and method passing
Pillars of OOPS
Abstraction
Encapsulation
Inheritance
Polymorphism
Compile-time polymorphism
Run-time polymorphism
*/
public class Execute {

	public static void main(String[] args) {
		Employee s=new Employee();
		s.Organize();
		s.EmpName();
		s.employeeId();
		s.work();
		Project s1=new Project();
		s1.setProName("shopping cart");
		System.out.println("The project name is:"+s1.getProName());
		s1.setId("12303");
		System.out.println("The project id is:"+s1.getId());


	}

}

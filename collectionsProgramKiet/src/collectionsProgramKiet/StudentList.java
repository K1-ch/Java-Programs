package collectionsProgramKiet;
//m/m allocation runtym pr ho isliye arraylist use hoga
//set m duplicate value add ho skti h
import java.util.ArrayList;
import java.util.Iterator;
//java 1.5 generic doesnt req rhs object name
public class StudentList {
 ArrayList <Student> student=new ArrayList<>();
 Student s1=new Student();
 s1.setRollNo(100);
 s1.setName("Op");
 Student s2=new Student();
 s2.setRollNo(120);
 s2.setName("Komal");
student.add(s1);
student.add(s2);
 Iterator <Student> itr=student.iterator() ;
 while(itr.hasNext()) {
	 Student s=itr.next();
	 System.out.println(s.getRollNo());
	 System.out.println(s.getName());
 }
 Collections.sort(names);
 
}

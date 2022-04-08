package list.programs.com;
//Adding and removing Elements in a String List
import java.util.ArrayList;
import java.util.List;

class CharList{
	void data() {
	List <String> s=new ArrayList<>();
	s.add("Kiran");//adding Strings in List
	s.add("Pooja");
	s.add("Laxmi");
	s.add("Rahul");

	s.remove(0);//remove an element in List
		System.out.println(s);
	s.forEach(System.out::println);
		}
}
public class StringClass {

	public static void main(String[] args) {
	CharList s=new CharList();
	s.data();
	}

}

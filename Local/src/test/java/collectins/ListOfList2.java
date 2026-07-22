package collectins;

import java.util.List;
import java.util.ArrayList;

public class ListOfList2 {

	public static void main(String[] args) {
		
		Student s1 = new Student("Alice", 20, "A");
		Student s2 = new Student("Bob", 22, "B");
		Student s3 = new Student("Charlie", 21, "C");
		
		List<Student> l1 = new ArrayList<Student>();
		l1.add(s1);
		l1.add(s2);
		l1.add(s3);

		System.out.println(l1.get(0).grade);
		System.out.println(l1.get(1).name);
		System.out.println(l1.get(2).age);	
		}

}		
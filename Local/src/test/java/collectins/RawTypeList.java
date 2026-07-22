package collectins;

import java.util.ArrayList;

public class RawTypeList {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add("Hello");
		list1.add(123);
		list1.add(45.67);
		list1.add(true);
		
		System.err.println("Raw Type List: " + list1);
		System.out.println(list1.size());
		System.out.println(list1.get(2));
		list1.remove(1);
		list1.clear();
		
		
		
		
	}

}

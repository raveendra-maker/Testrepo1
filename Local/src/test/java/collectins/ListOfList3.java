package collectins;

import java.util.Arrays;
import java.util.List;

public class ListOfList3 {

	public static void main(String[] args) {
		List<String> l1=Arrays.asList("Selenium", "appium","playright","c++");
		System.out.println(l1);
		System.out.println(l1.get(2));
		//l1.add("Java");
		l1.remove(0);
		
		//Arrays.asList(12,24,54,78,90);
		List<Integer> l2=Arrays.asList(12,24,54,78,90);
		
		System.out.println(l2.get(3));
	}

}

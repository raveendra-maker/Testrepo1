package collectins;

import java.util.ArrayList;
import java.util.List;

public class BoxingAndUnboxing {

	public static void main(String[] args) {
		 //collection works with group of objects
		 //primitive data types are not objects
		List<Integer> list4 = new ArrayList<Integer>();
		
		Integer v1=20; 
		list4.add(v1);//boxing
		list4.add(30); 
		list4.add(40);
		
		System.out.println(list4);
		System.out.println(list4.get(1)); //unboxing	;
		
		List<Double> list5 = new ArrayList<Double>();
		Double d1=3.14;
		list5.add(d1);
		list5.add(2.718);
		list5.add(1.618);
		
		System.out.println(list5);
	}

}

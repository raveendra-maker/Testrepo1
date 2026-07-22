package collectins;

import java.util.List;
import java.util.ArrayList;

public class ListOfList {

	public static void main(String[] args) {
		
		ArrayList< String> morning=new ArrayList<String>();
		morning.add("Renu");
		morning.add("Ritu");
		morning.add("Riya");
		
		ArrayList <String > evening=new ArrayList<String>();
		evening.add("Renu");
		evening.add("Ritu");
		evening.add("Riya");
		
		ArrayList<String> weekend=new ArrayList<String>();
		weekend.add("sushma");
		weekend.add("sneha");
		weekend.add("Rajani");
		
		List<List<String>> masterlist=new ArrayList<List<String>>();
		List<List<String>> masterlist1=new ArrayList<List<String>>();
		masterlist.add(weekend);
		masterlist.add(morning);
		masterlist.add(evening);
		
		//System.out.println(masterlist);
		System.out.println(masterlist.get(1).get(2));
		
		List<String> l1=masterlist.get(0);
		String value=l1.get(1);
		
		System.out.println("value: " +value);
		masterlist.get(2).add("Rohini");
		System.out.println(masterlist);
		
		 
		

	}

}

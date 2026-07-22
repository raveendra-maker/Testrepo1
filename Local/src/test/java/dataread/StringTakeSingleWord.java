package dataread;

import org.testng.Assert;

public class StringTakeSingleWord {

	public static void main(String[] args) {
		String s1="The order number is AB2345";
		String part[]=s1.split("is ");
		System.out.println(part[1]);
		
		String[] part1=s1.split(" ");
		for(String w:part1) {
			System.out.println(w);
			
			
		
	}


	}
}

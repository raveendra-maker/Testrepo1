
package day;

import java.lang.reflect.Array;
import java.util.HashMap;

public class CountCharInString {

	public static void main(String[] args) {
		
			String str="raveendra";
			System.out.println("The original String:" +str);
			
			char[] array=str.toCharArray(); //character array
						
			int count=0;
			
			HashMap<Character, Integer> ms= new HashMap<>();
			
			for (int i=0; i< array.length; i++) {
				count=0;
				for (int j=0; j < array.length; j++) {
					if(array[i]==array[j]) {
							count++;
					
					}
					}
				
				ms.put(array[i], count);
				
			}
			System.out.println(ms);
		}

}
			
			
			


	



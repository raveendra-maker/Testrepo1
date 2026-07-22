package day;

import java.util.HashMap;
import java.util.Map;

public class CountWordsOccuranceInSentence {

	public static void main(String[] args) {
		String str="ravi login success to login success to java";
		String words[]=str.split(" ");
		HashMap<String, Integer> map= new HashMap<>();
		
		for(int i=0; i<words.length; i++) {
			int count=0;
			
			for(int j=0; j<words.length; j++) {
				
				if(words[i].equals(words[j])) {
					count++;
				}
				}
			map.put(words[i], count);			
		}
		System.out.println(map);
		
	}

}

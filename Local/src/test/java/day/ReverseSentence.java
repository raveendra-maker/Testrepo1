
package day;

public class ReverseSentence {

	public static void main(String[] args) {
		
	        String str = "welcome to java";
	        System.out.println(str.length());
	        String words[] = str.split(" ");   // Split into words
	        String reversedSentence = "";
	      
	        // Loop backwards through the words
	        for (int i = words.length - 1; i >= 0; i--) {
	        		            
	        	reversedSentence = reversedSentence + (words[i]+" ");

	        }
	        System.out.println(words.length);

	        System.out.println("Reversed by words: " +reversedSentence.trim());
	    }


	}



package day;

public class ReverseEachWordString {

	public static void main(String[] args) {
		String str="welcome to java";
		String words[]= str.split(" ");
		String Reversestring="";
		
		for(String w: words) {
			String reverseword="";
			System.out.println("The length of the word is: "+w.length());			
			for(int i=w.length()-1; i>=0; i--) {
				
				reverseword=reverseword+w.charAt(i);
				
			}
			System.out.println("The reverse of the word is: "+reverseword);
			Reversestring=Reversestring+reverseword+" ";
			}
		
			System.out.println(Reversestring);

	
	}
	}



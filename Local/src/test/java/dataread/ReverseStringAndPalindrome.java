package dataread;

public class ReverseStringAndPalindrome {

	public static void main(String[] args) {
		String s1="Madam";				//5,5-1=4
		String rev="";
		System.out.println("The length of the string is: " +s1.length());
		for(int i=s1.length(); i>=0; i--) { //i=4,,4>=0
			rev=rev+s1.charAt(i);
		}
		System.out.println("Reverse of the string is:        " +rev);
		
		if(s1.equalsIgnoreCase(rev)) {
			System.out.println("The given string is palindrome:  " +rev);
		}
		else {
			System.out.println("The given string is not palindrome: " +rev);
		}

	}

}

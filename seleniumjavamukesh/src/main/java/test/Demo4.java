package test;

public class Demo4 {

	public static void main(String[] args) {
		
		String input ="8939988331";
		
		String output=input.substring(0, 3)+"-"+input.substring(3, 6)+"-"+input.substring(7);
		System.out.println(output);
	}

}

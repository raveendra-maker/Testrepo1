package demo;

public class Test1 {

	public static void main(String[] args) {
		String s1 = "The order of the string is ABC124";
		s1.substring(27, 33);
		System.out.println(s1.substring(27, 33));

		
		String s2 = "The order of the string is ABC124";
		String[] parts = s1.split("is ");
		String result = parts[1];

(result); // Output: ABC124

	}

}

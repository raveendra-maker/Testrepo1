package dataread;

import java.util.regex.Pattern;

public class EmailValidation {

	public static void main(String[] args) {
		String email = "test@example.com";
		boolean isValid = Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$", email);
		System.out.println(isValid); // true


	}

}

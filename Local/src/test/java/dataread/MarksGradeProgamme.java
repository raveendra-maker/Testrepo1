package dataread;

import java.util.Scanner;

public class MarksGradeProgamme {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks:");
		
		int marks=sc.nextInt();
		
		if(marks>=75) {
			System.out.println("Distinction ");
		}else if(marks>=60) {
			System.out.println("First class ");
		}else if(marks>=50) {
			System.out.println("Second class ");
		}else {
		System.out.println("Fail");
		}
		
	}

}

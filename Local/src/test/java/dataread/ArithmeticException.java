package dataread;

import java.util.Scanner;

public class ArithmeticException {

	public static void main(String[] args) {
			System.out.println("Program starts");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number: ");
				try{
				int num1=sc.nextInt();
			System.out.println("Enter another number: ");
				int num2=sc.nextInt();
						
				int num3=num1/num2;
				System.out.println("The result is: " +num3);
				}
				catch(java.lang.ArithmeticException e) {
					System.out.println("Cannot divide by zero");
				}
				catch(java.util.InputMismatchException e) {
					System.out.println("Invalid input. Please enter an integer.");
				}
				catch(Exception e) {
					System.out.println("Something went wrong: " + e.getMessage());
				}
								
				System.out.println("Program ends");}
	

}

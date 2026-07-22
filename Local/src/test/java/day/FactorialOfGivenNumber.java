package day;

public class FactorialOfGivenNumber {

	public static void main(String[] args) {
		
		int num=3;
		int fact=1;
		for(int i=1;i<=num; i++) {
			fact=fact*i;
		}
		
			System.out.println("Factorial of "+num+" is: " +fact);
					
		}

	}




package dataread;

public class DivideWithoutOperator {

	public static void main(String[] args) {
		int a = 10;
        int b = 5;

        int quotient = 0;
        int dividend = a;
        int divisor = b;

        // Repeated subtraction method
        while (dividend >= divisor) {
            dividend = dividend - divisor; //or dividend -= divisor;
            quotient++;
        }

        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + dividend);
    }


	}



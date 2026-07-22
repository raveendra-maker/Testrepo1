package day;

public class FibonacciIterative {

	public static void main(String[] args) {
		int n = 10; // number of terms
        int first = 0, second = 1;

        System.out.print("Fibonacci Series: " + first + " " + second);

        for (int i = 2; i < n; i++) {
            int next = first + second; //1+1=2, 1+2=3 , 2+3=5 
            System.out.print(" " + next);
            first = second; //1, 1, 2
            second = next; //1, 2, 3
            
        }


	}

}

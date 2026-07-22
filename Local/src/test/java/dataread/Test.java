package dataread;

public class Test {

	public static void main(String[] args) {
	
		int a= 10;
		int b= 0;
		
		try {
		int c=a/b;
		}
		catch(java.lang.ArithmeticException e) {
			System.out.println("cannot divide by Zero:" +e.getMessage());
		}
		System.out.println(c);
		}
	
}

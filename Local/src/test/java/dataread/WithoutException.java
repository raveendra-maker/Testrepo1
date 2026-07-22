package dataread;

public class WithoutException {
	public static void main(String[] args) {
		
		int [] a= {1, 3, 5, 7, 9};
		try {
		System.out.println(a[5]);
		}
		catch(Exception e)
		{
			System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
		}
		finally {
			System.out.println("This block always executes.");
		}
	}

}

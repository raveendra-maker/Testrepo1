package Day1;

public class Swapping2Numbers {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		//First Login
		System.out.println("Before swapping: a="+a+" b="+b);
			
		//Swapping logic
		int temp=a; //temp=10
		a=b; //a=20
		b=temp; //b=10
		
		System.out.println("After swapping: a="+a+" b="+b);
		
		//Second logic without using temp variable
		a=a+b; //10+20=a=30
		b=a-b; //30-20=10
		a=a-b; //30-20=20
		System.out.println("After swapping without using the temp: a="+a+" b="+b);
		
	}

}

package dataread;

import java.util.Scanner;

public class ArrrayIndexOutOfBoundException {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			int arr[]=new int[5];
			System.out.println("Enter the array elements");
			try {
			System.out.println("Enter the position to access the element");
			int pos=sc.nextInt();
			
			System.out.println("Enter the value:");
			int value=sc.nextInt();
			
			arr[pos]=value;
			System.out.println("The value at position "+pos+" is "+arr[pos]);
			}
			catch(java.lang.ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Invalid position. Please provide a position between 0 and 4: " +e.getMessage());
						
			}
			
		
				
	}
	}



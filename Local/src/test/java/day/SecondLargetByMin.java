
package day;

public class SecondLargetByMin {

	public static void main(String[] args) {
		 int arr[] = {10, 20, 4, 50, 60, 99};

	        int largest = Integer.MIN_VALUE; //- This ensures that any number in the array will be greater than 
	        								 // 	this initial value, 
	        								 // This is a constant in Java that represents the smallest possible integer value.
	        								 //- Initializes it with the smallest possible integer.

	        int second_largest = Integer.MIN_VALUE;

	        for (int i=0; i<arr.length; i++) {
	            if (arr[i] > largest) {
	                second_largest = largest;
	                largest = arr[i];
	            } else if (arr[i] > second_largest && arr[i] != largest) {
	                second_largest = arr[i];
	            }
	        }

	        System.out.println("Second Largest: " + second_largest);


	}

}

package Day1;

public class MissingNumber {

	public static void main(String[] args) {
		int[] arr = {101, 102, 104, 105, 107, 108, 110};

        // Find the minimum and maximum values in the array
        int min = arr[0];
        int max = arr[arr.length - 1];
   
        System.out.println("Missing numbers in the array:");
        for (int i = min; i <= max; i++) {
            if (!contains(arr, i)) {
                System.out.println(i);
            }
        }

	}
	// Helper method to check if a number exists in the array
    private static boolean contains(int[] arr, int num) {
        for (int value : arr) {
            if (value == num) {
                return true;
            }
        }
        return false;

	}
}



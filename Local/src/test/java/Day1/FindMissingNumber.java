package Day1;

public class FindMissingNumber {

	public static void main(String[] args) {
		int[] arr = {101, 105, 107, 109, 111};

		for (int i = 0; i < arr.length - 1; i++) {
		    int current = arr[i];
		    int next = arr[i + 1];

		    // Check if there’s a gap
		    if (next - current > 1) {
		        for (int j = current + 1; j < next; j++) {
		            System.out.println("Missing number: " + j);
		        }

	}

    }
	}
    }

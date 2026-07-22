package collectins;



public class Test1 {
	
	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4, 5};
		try {
		System.out.println(array[5]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid position. use the correct position between 0 and 4: " + e.getMessage());
		}
	}
	}



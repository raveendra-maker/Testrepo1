package day;

public class CharCountWithoutMap {

	public static void main(String[] args) {
		 String str = "raveendra";
	        System.out.println("Original String: " + str);

	        char[] array = str.toCharArray();
	        boolean[] visited = new boolean[array.length]; // track already counted chars

	        for (int i = 0; i < array.length; i++) {
	            if (visited[i]) {
	                continue; // skip if already counted
	            }

	            int count = 1; // current character itself
	            for (int j = i + 1; j < array.length; j++) {
	                if (array[i] == array[j]) {
	                    count++;
	                    visited[j] = true; // mark duplicate as counted
	                }
	            }

	            System.out.println(array[i] + " occurs " + count + " times");
	        }
	    }


	}



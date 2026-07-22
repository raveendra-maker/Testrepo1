package day;

import java.sql.Array;

public class ReverseArray {

	public static void main(String[] args) {
		int[] a = {10, 45, 3, 5, 11};

        int start = 0;
        int end = a.length - 1;

        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            
            
            start++;
            end--;
        }

        // Print reversed array
        for (int num : a) {
        	
            System.out.print(num + " ");
        }
    }


	}



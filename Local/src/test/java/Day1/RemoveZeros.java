package Day1;

import java.util.Arrays;
/*- Arrays.stream(a) → Converts the array into a stream (a sequence of elements you can process).
  - .filter(num -> num != 0) → Keeps only numbers that are not equal to zero.
  - This is a lambda expression: for each num, check if it’s not zero.
  - .toArray() → Collects the filtered stream back into a new array called result.
  - So result will contain only the non-zero elements: [9, 8, 1, 10, 11].*/

public class RemoveZeros {

public static void main(String[] args) {
int[] a = {9, 0, 8, 1, 0, 10, 11, 0};

//- int[] result-->This means you want to assign the output of the stream back into an integer array.

int[] result = Arrays.stream(a)               //- Converts the array into a stream (a sequence of elements you can process).
                     .filter(num -> num != 0) //.filter(num -> num != 0) → Keeps only numbers that are not equal to zero.
                             				  //- This is a lambda expression: for each num, check if it’s not zero.
                     .toArray();              //Collects the filtered stream back into a new array called result.

  System.out.println(Arrays.toString(result));//- Converts the array result into a readable string using Arrays.toString()

                 
    }
	}



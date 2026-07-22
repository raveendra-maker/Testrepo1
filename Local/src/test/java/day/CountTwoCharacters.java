package day;

public class CountTwoCharacters {

	public static void main(String[] args) {
		String str = "raveendra";
        char char1 = 'e'; // first character to count
        char char2 = 'v'; // second character to count
        char char3 = 'a'; // third character to count
        int count1 = 0, count2 = 0, count3 = 0;

        // loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current == char1) {
                count1++;
            }
            if (current == char2) {
                count2++;
            }
             if (current == char3) {
				count3++;
			}
        }

        System.out.println("The character " + char1 + " appears " + count1 + " times in "+str+"");
        System.out.println("The character '" + char2 + "' appears " + count2 + " times in \"" + str + "\".");
        System.out.println("The character '" + char3 + "' appears " + count3 + " times in \"" + str + "\".");
	}


	}



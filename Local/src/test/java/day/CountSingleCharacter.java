package day;

public class CountSingleCharacter {

	public static void main(String[] args) {
		String str = "raveendra";
        char target = 'e'; // character to count
        int count = 0;

        // loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            if ( target == str.charAt(i)) {
                count++;
                
            }
        }

        System.out.println("The character '" + target + "' appears " + count + " times in \"" + str + "\".");
        //System.out.println("The character '"+target +"' appear '"+count+"' times in "+str+" );
    }


	

}

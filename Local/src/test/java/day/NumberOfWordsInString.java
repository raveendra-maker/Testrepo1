package day;

import java.util.Scanner;

public class NumberOfWordsInString {

	public static void main(String[] args) {
			System.out.println("Enter the String:");
			Scanner sc=new Scanner(System.in);
					String s=sc.nextLine();
					int count=1;
					
					for(int i=0; i<s.length();i++) {
						
					if(s.charAt(i)==' ' && s.charAt(i+1)!=' ') {
						count++;
					}
					
					}
					System.out.println("The number of words in the string is:" +count);
					

	}

	}
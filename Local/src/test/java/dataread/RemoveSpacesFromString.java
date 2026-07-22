package dataread;

import org.apache.commons.lang3.StringUtils;

public class RemoveSpacesFromString {

	/**
	 * Write a Java program to remove all spaces from a given string.
	 * @param args
	 */
	
	public static void main(String[] args) {
	String str="    welcome to java   ";
	System.out.println(str);
	String noWhiteSpaceString="";
	for(int i=0;i<str.length(); i++) {
	if((str.charAt(i)!=' ') && (str.charAt(i)!='\t')) {
		noWhiteSpaceString=noWhiteSpaceString+str.charAt(i);
	}
	}
	System.out.println(noWhiteSpaceString);
	
	}
		
	//System.out.println(str.trim()); // removes leading and trailing spaces-->welcome to java
	//System.out.println(str.replaceAll("\\s+","")); // removes all spaces from the string-->welcometojava, '+' collect all spaces and remove
	
	//Using StringUtils
	//String remString= StringUtils.deleteWhitespace(str); // removes all spaces from the string-->welcometojava, need to add dependency for this method
										//StringUtils class defines certain words related to String handling.
	//System.out.println(remString);

	//without using any built in fucntion
	
	
	}




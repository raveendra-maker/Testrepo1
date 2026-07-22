package day;

public class FindDublicateString {

	public static void main(String[] args) {
					
			String str[] = {"java","c", "c++", "java"};
					
			for(int i=0; i<str.length; i++) {
				
				for(int j=i+1; j<str.length; j++) {
					
					if(str[i]==str[j]) {
						
						System.out.println("The dublicate string is:" +str[i]);
					}
				}
			}


	}

}

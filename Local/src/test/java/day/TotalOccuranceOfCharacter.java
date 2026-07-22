package day;

public class TotalOccuranceOfCharacter {

	public static void main(String[] args) {
		
		String str="java programming";
		int totalcount=str.length();
		int totacount_Afterremovinga=str.replace("r","").length();
		
		int count=totalcount-totacount_Afterremovinga;
		
		System.out.println("Number of occurance of M:" +count);

	}

}

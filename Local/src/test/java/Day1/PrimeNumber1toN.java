
package Day1;

import java.util.Scanner;

public class PrimeNumber1toN {
	
	public static void main(String[] args) {
	//Scanner sc=new Scanner(System.in);
	//System.out.println("Enter the number:");
	//int num=sc.nextInt();
	int num=20;
	
	for (int i=0; i<=num; i++) { // to generate the numbers from 2 to num
		int count=0;
			for(int j=1; j<=num; j++) {// to generate the numbers from 1 to num
				if(i%j==0) 
				count++;
			}
			if(count==2) 
			
			System.out.println("The prime numbers between 1 and 20 are:" +i);
			
			}
			
			}
			}
	


	
	



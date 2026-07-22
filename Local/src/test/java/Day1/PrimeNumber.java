package Day1;

//Natural numbers are those numbers which are greater than 1 and are not divisible by any other number except 1 and itself.
//Natural number  > 1
//which has only two factors 1 and itself
//19 is a prime number because it is only divisible by 1 and 19.
//10 is not a prime number because it is divisible by 1, 2, 5 and 10.
public class PrimeNumber {

	public static void main(String[] args) {
	
		int num=5;
		int count=0;
		
		if(num>1) {
			for(int i=1; i<=num; i++) {
				if(num%i==0) {
					count++;
				}
				}
			if(count==2) {
				System.out.println(num+" is a prime number");
			}else {
				System.out.println(num+" is not a prime number");
			}
			}
		else {
			System.out.println(num+" is not a prime number");
		}
	}

    }

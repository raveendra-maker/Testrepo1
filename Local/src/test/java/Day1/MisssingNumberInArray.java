package Day1;

public class MisssingNumberInArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,6};
		
		int sum1=0;
		for(int i=0; i<a.length; i++) {
			sum1=sum1+a[i];
		}
		System.out.println("The sum of the array is :"+sum1);

		int sum2=0;
		for(int i=1; i<=6; i++) {
		
			sum2=sum2+i;
		}
		System.out.println("The sum of the numbers from 1 to 6 is :"+sum2);
		System.out.println("The missing number in the array is :" +(sum2-sum1));
		}
		
		}


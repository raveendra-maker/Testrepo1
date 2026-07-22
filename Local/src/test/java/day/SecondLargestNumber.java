
package day;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int[] a= {10,20,40,80,70};
		
		int temp=0;
		for(int i=0; i<a.length; i++) {
			
			for(int j=i+1; j<a.length;j++) {
				
				if(a[i]<a[j]) {
					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				}
				}
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("The second larget number is:  "+a[1]);

	}

}

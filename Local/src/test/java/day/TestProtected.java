package day;

class Animal {
	protected String type ="Mammal";
}

 class dog extends Animal{
	 public void printType() {
		// Accessing protected variable directly
	     System.out.println("Dog is a " + type);

	 }
	 
 }
public class TestProtected {

	public static void main(String[] args) {
		dog d=new dog();
		d.printType();

	}

}

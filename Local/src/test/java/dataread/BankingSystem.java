package dataread;

public class BankingSystem {

	public static void main(String[] args) {
		//Scenario 1			           
										   //parent reference and child class object
										   //parent reference and parent class object
										   //child reference and child class object	
		//Scenario 1					   //child class reference and child class object
		HDFCBank obj1 = new HDFCBank();    
		obj1.kyc(); 
		obj1.deposit();
		obj1.withdraw();
		obj1.personalLoan();
		obj1.educationLoan();
		System.out.println("-----------------------------");
				
		//Scenario 2 parent class reference and parent class object
		//we can only access the parent class methods and variables
		RBIBank obj2= new RBIBank();
		obj2.kyc();
		obj2.deposit();
		obj2.deposit();
		
		System.out.println("-----------------------------");
		//scenario 3 parent class reference and child class object
		//If you have some method which is overridden then overridden method given the preference will be given
		//This used mostly in case of abstract class and interface
		RBIBank obj3 = new HDFCBank();
		obj3.kyc();
		obj3.deposit();
		obj3.withdraw();
		
		
		//scenario 4 invalid child class reference and parent class object
		//HDFCBank obj4 = new RBIBank();
		
		
		
		
		
	}
	
	

}

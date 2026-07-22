package dataread;

public class HDFCBank extends RBIBank {
	
	public void kyc() {
		//super.kyc();   // to call parent class method
		System.out.println("c-KYC is mandatory from hdfc child class");
	}
	
	public void personalLoan() {
		System.out.println("customer can avail persoanl loan");
	}
	public void educationLoan() {
		System.out.println("customer can avail education loan");
	}

}

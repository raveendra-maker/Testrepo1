package collectins;

public class ConstructorOverLoading {
	
	String name;
	int EmpID;
	int salary;
	
	//Constructor is a special method that is used to initialize the object of a class. It has the same name as the class and does not have a return type.
	//Rule1- Constructor name should be same as class name
	//Rule2- Constructor should not have return type
	//rule3- Constructor is called automatically when an object is created
	
	public ConstructorOverLoading(String Ename,int EEmpID,int Esalary) {
	name=Ename;
	EmpID=EEmpID;
	salary=Esalary;
	}
	public ConstructorOverLoading(String Ename,int EEmpID) {
	name=Ename;
	EmpID=EEmpID;
	}	
	public ConstructorOverLoading(String Ename) {
	name=Ename;
	}		
	public static void main(String[] args) {
		
		ConstructorOverLoading c1=new ConstructorOverLoading("John",12345,50000);
		ConstructorOverLoading c2=new ConstructorOverLoading("Alice",67890,60000);
		ConstructorOverLoading c3=new ConstructorOverLoading("Bob");
		
		c3.display();
		
	}
	public void display() {
		System.out.println("Employee Name: " +name);
		System.out.println("Employee ID: " +EmpID);
		System.out.println("Employee Salary: " +salary);
	}
	

}

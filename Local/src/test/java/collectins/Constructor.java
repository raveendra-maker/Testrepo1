package collectins;

public class Constructor {
	
	String name;
	int EmpID;
	int salary;
	
	//Constructor is a special method that is used to initialize the object of a class. It has the same name as the class and does not have a return type.
	//Rule1- Constructor name should be same as class name
	//Rule2- Constructor should not have return type
	//rule3- Constructor is called automatically when an object is created
	
	public Constructor(String Ename,int EEmpID,int Esalary) {
	name=Ename;
	EmpID=EEmpID;
	salary=Esalary;
	}
	
	public static void main(String[] args) {
		
		Constructor c1=new Constructor("John",12345,50000);
		Constructor c2=new Constructor("Alice",67890,60000);
		c1.display();
		
	}
	public void display() {
		System.out.println("Employee Name: " +name);
		System.out.println("Employee ID: " +EmpID);
		System.out.println("Employee Salary: " +salary);
	}

}

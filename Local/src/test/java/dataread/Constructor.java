package dataread;

public class Constructor {
	String mailId;
	int empid;
	double salary;
	
	public Constructor(String emailId, int employeeId, double empSalary) {
		System.out.println("Constructor is called");
		mailId = emailId;
		empid = employeeId;
		salary = empSalary;
		
	}
	public static void main(String[] args) {
		
Constructor c = new Constructor("ravi@gmail.com", 101, 50000);
			c.empid=102;
			c.mailId="ravi@gmail.com";
			c.salary=50000;

			System.out.println("Employee id is :"+c.empid);

	}

	}

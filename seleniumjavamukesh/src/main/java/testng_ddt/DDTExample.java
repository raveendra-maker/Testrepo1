package testng_ddt;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDTExample {
	
	@Test(dataProvider = "getData")
	public void test1(String p1, String p2) {
		System.out.println("Parameter 1:" +p1);
		System.out.println("Parameter 2:" +p2);
				
	}
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] arr = new Object[3][2];
		
		arr[0][0] = "Mukesh";
		arr[0][1] = "Selenium";
		
		arr[1][0] = "Ravi";
		arr[1][1] = "Appium";
		
		arr[2][0] = "Suresh";
		arr[2][1] = "RestAssured";
		
			
		return arr;
		
	}
	

}

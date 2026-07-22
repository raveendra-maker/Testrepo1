package testng_ddt;

import org.testng.annotations.DataProvider;

public class DataProviderFactory {
	
	@DataProvider
	public static Object[][] getData() {
		
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

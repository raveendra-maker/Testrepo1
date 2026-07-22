package testng_ddt;

import org.testng.annotations.Test;


public class DDTExample {
	
	@Test(dataProvider = "getData",dataProviderClass = DataProviderFactory.class)
	public void test1(String p1, String p2) {
		System.out.println("Parameter 1:" +p1);
		System.out.println("Parameter 2:" +p2);
				
	}
	
	

}

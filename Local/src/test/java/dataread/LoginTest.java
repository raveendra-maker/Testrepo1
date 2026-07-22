package dataread;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {

	WebDriver driver;
	@BeforeClass
	void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
		
	@Test
	void testLogin()
	{
		LoginPage p1=new LoginPage(driver);
		p1.setUserName("Admin");
		p1.setUserPassword("admin123");
		p1.clickLogin();
		
	}
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}
}



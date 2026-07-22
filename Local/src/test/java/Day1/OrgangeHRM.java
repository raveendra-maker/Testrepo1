package Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OrgangeHRM {

	WebDriver driver;
	@BeforeClass
	void setup()
	{
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	void testlogo()
	{
		boolean status = driver.findElement(By.xpath("//img[contains(@alt,'logo')]")).isDisplayed();
		Assert.assertEquals(status, true);
		
	}	
	
	@Test(priority=2)
	
	void testHomePageUrl()
	{
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getCurrentUrl());
	}
	
	@Test(priority = 3, dependsOnMethods= {"testHomePageUrl"})
	void testHomePageTitle()
	{
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		System.out.println(driver.getTitle());
	}
	
	@AfterClass
	void tearDown()
	{
		driver.close();
	}
	}
	
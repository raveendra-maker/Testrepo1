package testngparameter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngParameter {
	@Parameters("Browser")
	@Test
	public void test1(String Browser) {
		WebDriver driver = null;
		if (Browser.contains("chrome")) {
			System.out.println("Run with chrome");
			driver=new ChromeDriver();
		 }
		else if (Browser.contains("edge")) {
			System.out.println("Run with edge");
			driver=new EdgeDriver();
		}
		else if(Browser.contains("Firefox")) {
			System.out.println("with with Firefox");
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(15));
		driver.get("https://freelance-learn-automation.vercel.app/login");
		Assert.assertTrue(driver.getTitle().contains("Courses"));
		
		}

}

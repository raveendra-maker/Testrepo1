package Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//WebElement select = driver.findElement(By.id("colors"));
		Thread.sleep(5000);
		//WebElement select = driver.findElement(By.id("colors"));
		//System.out.println(select);
		//Multi select drop down
		Select s=new Select(driver.findElement(By.id("colors")));
		Thread.sleep(5000);
		s.selectByVisibleText("Green");
		s.selectByVisibleText("Red");
		
		

	}

}

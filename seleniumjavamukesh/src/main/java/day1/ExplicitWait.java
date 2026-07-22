package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	//handle snyc issue
	//Handle dynamic with wait 
	//handle dynamic element with wait
	//
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://seleniumpractise.blogspot.com/2025/08/loader-demo.html");
		
		driver.findElement(By.xpath(".//button[text()='Start with Slow Loader']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(120));
		
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@id='la-loader-spin']")));
		//or
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath("//p[text()='Still working on it... (slow loader)']"), "Still working on it... (slow loader)"));
		driver.findElement(By.xpath("//input[@id='la-name']")).sendKeys("Raveendra");
		
		
	}
}

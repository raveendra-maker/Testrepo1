package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Helper;

public class ExplicitWaitByUsingHelperClass {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://seleniumpractise.blogspot.com/2025/08/loader-demo.html");
		
		driver.findElement(By.xpath(".//button[text()='Start with Slow Loader']")).click();
		
		//Helper.waitForElementToBeInvisible(driver, "//div[@id='la-loader-spin']"); 
		Helper.waitForElementToBeInvisible(driver, 120, "//div[@id='la-loader-spin']");
		driver.findElement(By.xpath("//input[@id='la-name']")).sendKeys("Raveendra");}

}

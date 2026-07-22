package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


public class JavaScriptExecutor3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://freelance-learn-automation.vercel.app/signup");
		
		JavaScriptExecutor3 js=(JavaScriptExecutor3)driver;
		WebElement passwordField=driver.findElement(By.id("pass"));
		js.executeScript("arguments[0].value=arguments[1]", passwordField,"seleium");
		
	}

	
}

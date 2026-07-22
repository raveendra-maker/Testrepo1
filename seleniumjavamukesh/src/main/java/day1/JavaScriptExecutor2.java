package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


public class JavaScriptExecutor2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		JavaScriptExecutor2 js=(JavaScriptExecutor2)driver;
		WebElement passwordField=driver.findElement(By.id("pass"));
		js.executeScript("arguments[0].value=arguments[1]", passwordField,"seleium");
		
	}

	
}

package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsCommands {

	public static void main(String[] args) {
		
//relative locator for selenium 4
		//above
		//below
		//toLeftOf
		//toRightOf
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://freelance-learn-automation.vercel.app/login");
		WebElement username= driver.findElement(By.id("email1"));	
		String attValue=username.getAttribute("placeholder");
		System.out.println(attValue);
		if(attValue.equalsIgnoreCase("Enter Email"))
		{
			System.out.println("The placeholder value is correct");
		}
		else
		{
			System.out.println("The placeholder value is incorrect");
		}
		//driver.quit();
		}
 
}

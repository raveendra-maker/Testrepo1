package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsCommands1 {

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
		driver.findElement(By.name("email1")).sendKeys("ravi@gmail.com");
		driver.findElement(By.className("submit-btn")).click();
		
		String error = driver.findElement(By.className("errorMessage")).getText();
		
		System.out.println(error);
		if(error.equalsIgnoreCase("Password is required"))
		{
			System.out.println("Error message is correct");
		}
		else
		{
			System.out.println("Error message is not correct");
		}
		    
		driver.quit();
		}
		}
		
        

        				

	

		

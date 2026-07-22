
package dataread;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException {

	public static void main(String[] args) throws InterruptedException  {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.target.com/");
		driver.manage().window().maximize();
		
		
		WebElement link=driver.findElement(By.xpath("//a[text()='Target Circle™']"));
		link.click();
		driver.navigate().back();
		try {
		link.click();
		}
		catch(org.openqa.selenium.StaleElementReferenceException e){
			System.out.println("StaleElementReferenceException is handled:" +e.getMessage());
		}
		
	}}


		    
			
			



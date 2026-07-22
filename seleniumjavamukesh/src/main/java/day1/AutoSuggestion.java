package day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5));
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		Thread.sleep(5000);
		
		List<WebElement> allsuggestions=driver.findElements(By.xpath(".//ul[@role='listbox']//li[@role'presentation']"));
		Thread.sleep(5000);
		
		System.out.println("Total Suggestions:" +allsuggestions.size());
		
		for(WebElement ele:allsuggestions) {
			String text=ele.getText();
			System.out.println(" values are:" +text);
			
			if(text.contains("selenium testing")) {
				ele.click();
				break;
			
			}
			
			
			
		}
	}
}
		
		
	




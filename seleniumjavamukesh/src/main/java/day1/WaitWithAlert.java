package day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitWithAlert {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		for(int i=0; i<30; i++) {
			Alert alt=null;
			try {
				alt= driver.switchTo().alert();
				String allertmessge= alt.getText();
				System.out.println("allertmessge:" +allertmessge);
				alt.accept();
				break;
			}
			catch(NoAlertPresentException e) {
				System.out.println("Alert is not present");
			}
		}
		
		
	}

}

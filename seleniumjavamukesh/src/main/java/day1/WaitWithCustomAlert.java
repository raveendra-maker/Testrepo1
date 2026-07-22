package day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitWithCustomAlert {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		Alert alert=wait.until(ExpectedConditions.alertIsPresent());
		String alertmessage=alert.getText();
		System.out.println("Alert Message:" +alertmessage);
		alert.accept();
		
		
	}

}

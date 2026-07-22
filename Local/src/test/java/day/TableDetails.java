package day;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDetails {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	
		
		String str=driver.getTitle();
        System.out.println(str);	
        
        String str1=driver.getCurrentUrl();
        System.out.println(str1);
        
        String str2=driver.getPageSource();
        System.out.println(str2);
        
		driver.findElement(By.xpath("//a[text()='Learn HTML']")).click();
		driver.findElement(By.xpath("//a[contains(@class,'header')][4]")).click();
		
		

	}

}

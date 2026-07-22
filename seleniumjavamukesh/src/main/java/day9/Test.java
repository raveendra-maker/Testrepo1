package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/reg/?entry_point=logged_out_dialog&next=%2FOrangeHRM%2F");
		
		driver.findElement(By.xpath("//span[text()='I already have an account']")).click();
		
		
	}

}

package day;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;



public class WebTableRow {
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	
		
		driver.findElement(By.xpath("//a[text()='Learn HTML']")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'HTML Tables')])[1]")).click();
		
				        				
		List<WebElement> rows= driver.findElements(By.xpath("//table[@id='customers']//tbody//tr"));
		System.out.println("Total rows:" +rows.size());
		
		List<WebElement> columns= driver.findElements(By.xpath("//table[@id='customers']//tbody//td"));
		System.out.println("Total columns:" +columns.size());
				
			for(int r=2; r<=rows.size(); r++) {
					WebElement text= driver.findElement(By.xpath("//table[@id='customers']//tbody//tr["+r+"]"));
					System.out.println(text.getText());
			}
			
					driver.quit();
			
	}
}



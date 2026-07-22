package day;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		driver.get("https://practice.expandtesting.com/dynamic-table");
		
		List<WebElement> row=driver.findElements(By.xpath("//table[@class='table table-striped']//tbody//tr"));
		System.out.println("Number of Rows:" +row.size());
		
		for(int r=1; r<=row.size(); r++) {
		WebElement name=driver.findElement(By.xpath("//table[@class='table table-striped']//tbody//tr["+r+"]//td[1]"));
		System.out.println(name.getText());
		
		if(name.getText().equals("Chrome")) {
			System.out.println("chrome is found");
			
			
			String cpuLoader=driver.findElement(By.xpath("//td[text()='Chrome']//following-sibling::*[contains(text(),'%')]")).getText();
			
			
		}
		
		
		
		
	}
	
	}
}
	
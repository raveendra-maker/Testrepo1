package day;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(15));
		driver.get("https://practice.expandtesting.com/dynamic-table");
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@class='table table-striped']//tbody//tr"));
		System.out.println("Total rows:" +rows.size());
		
		for(int r=1; r<=rows.size(); r++) {
			WebElement name=driver.findElement(By.xpath("//table[@class='table table-striped']//tbody//tr["+r+"]//td[1]"));
			System.out.println(name.getText());
		
			if(name.getText().equals("Chrome")) {
			System.out.println("Chrome row is found");
			String cpuLoader=driver.findElement(By.xpath("//td[text()='Chrome']//following-sibling::*[contains(text(),'%')]")).getText();
		    String GivenValue=driver.findElement(By.xpath("//P[@id='chrome-cpu']")).getText();
		    System.out.println("The cpu Loader:" +cpuLoader);
		    System.out.println("The GivenValue is:" +GivenValue);
		    if(GivenValue.contains(cpuLoader)) {
		    	System.out.println("CPU loader chrome value is equal");
		    }else {
		    	System.out.println("CPU loader chrome value is not equal");
		    }
		    break;
		    
			}
		}
		driver.quit();
	    }
}


			
	
	
	
		
		 
		
		
		
		
		

	


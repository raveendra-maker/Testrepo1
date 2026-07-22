package day;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDataRead {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(15));
		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
		
		List<WebElement> row=driver.findElements(By.xpath("//table[@class='table table-striped mt-3']//tbody//tr"));
		System.out.println("Totla rows:" +row.size());
		
		List<WebElement> column=driver.findElements(By.xpath("//table[@class='table table-striped mt-3']//tbody//td"));
		System.out.println("Total columns:" +column.size());
		
		for(WebElement ele:row) {
			String text=ele.getText();
			System.out.println("Row data:"   +text);
		}

	}

}

package Day1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDown {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
			driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://www.jquery-az.com/boots/demo.php?ex=63.0_2");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			
			

	}

}

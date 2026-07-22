package excelreading;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.Assert;
	import org.testng.annotations.Optional;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;

	/**
	 * This class demonstrates how to use TestNG Parameters to pass values from
	 * a testng.xml configuration file into your test methods at runtime.
	 *
	 * Instead of hardcoding a browser name or URL inside the test, you define
	 * them as parameters in testng.xml and TestNG injects them automatically.
	 * This makes the same test reusable across different browsers and environments
	 * without changing any Java code.
	 *
	 * How it works end-to-end:
	 *   1. You define <parameter name="Browser" value="Chrome"/> inside testng.xml.
	 *   2. TestNG reads those values before running the test.
	 *   3. The @Parameters annotation maps each XML parameter to a method argument.
	 *   4. The test method receives the values and uses them to decide which
	 *      browser to launch and which URL to open.
	 *
	 * Cross-browser testing benefit:
	 *   You can create multiple <test> blocks in testng.xml, each passing a
	 *   different browser name (Chrome, Firefox, Edge). TestNG will run this
	 *   single test method once per block, effectively giving you cross-browser
	 *   coverage with zero code duplication
	*/
	public class TestngParameter
	{
		/**
		 * Logs in to a web application using the browser and URL supplied as
		 * TestNG parameters, then verifies that the page title confirms a
		 * successful login.
		 *
		 * @Parameters annotation:
		 *   Lists the names of the XML parameters (in the same order as the
		 *   method arguments). TestNG uses these names to look up the matching
		 *   <parameter> tags in testng.xml and pass their values here.
		 *
		 * @Optional annotation:
		 *   Provides a fallback value for each parameter. If the parameter is
		 *   not defined in testng.xml at all, TestNG uses this default instead
		 *   of throwing an error. This is useful when you want the test to be
		 *   runnable even without an XML file (e.g., running directly from the IDE).
		 *
		 * @param browser  The name of the browser to launch (Chrome, Firefox, or Edge).
		 *                 Defaults to "Chrome" if not provided in testng.xml.
		 * @param url      The full URL of the login page to open.
		 *                 Defaults to the freelance automation demo app if not provided.
		 */
		@Parameters({"Browser","appurl"})
		@Test
		public void test1(@Optional("Chrome") String browser,@Optional("https://freelance-learn-automation.vercel.app/login") String url)
		{
			// Thread information helps you understand parallel test execution.
			// When TestNG runs tests in parallel, each test runs in its own thread.
			// Printing these details lets you confirm which thread handled which test.
			String nameOfThread=Thread.currentThread().getName();

			// The thread ID is a unique number assigned by the JVM to each thread.
			long idOfThread=Thread.currentThread().getId();

			// Priority (1-10) hints to the OS scheduler how much CPU time to give
			// this thread relative to others. The default is 5 (NORM_PRIORITY).
			int priority=Thread.currentThread().getPriority();

			System.out.println("Thread "+nameOfThread + " ID "+idOfThread + " Priority "+priority);

			// WebDriver is the interface that all browser-specific drivers implement.
			// Declaring it as null first lets us assign the correct driver inside
			// the if-else block based on the browser parameter.
			WebDriver driver = null;

			System.out.println("Running Test On "+browser);

			// equalsIgnoreCase() is used so the comparison works regardless of
			// whether the XML value is "chrome", "Chrome", or "CHROME".
			if(browser.equalsIgnoreCase("Chrome"))
			{
				// ChromeDriver launches and controls a real Chrome browser window.
				driver=new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("Firefox"))
			{
				// FirefoxDriver launches and controls a real Firefox browser window.
				driver=new FirefoxDriver();
			}
			else if(browser.equalsIgnoreCase("Edge"))
			{
				// EdgeDriver launches and controls a real Microsoft Edge browser window.
				driver=new EdgeDriver();
			}

			// Maximizing the window ensures all elements are visible and avoids
			// layout issues that can cause elements to be off-screen or hidden.
			driver.manage().window().maximize();

			// Navigate to the login page URL received from the testng.xml parameter.
			driver.get(url);

			// Fill in the email field using its HTML id attribute.
			driver.findElement(By.id("email1")).sendKeys("admin@email.com");

			// Fill in the password field using its HTML id attribute.
			driver.findElement(By.id("password1")).sendKeys("admin@123");

			// Click the submit button located by its CSS class name.
			driver.findElement(By.className("submit-btn")).click();

			// Assert that the page title after login contains the word "Automation".
			// If the title does not contain it, TestNG marks this test as FAILED
			// and records the mismatch in the report.
			
			Assert.assertTrue(driver.getTitle().contains("Automation"));
			Assert.assertEquals

			
			// Closes the browser and ends the WebDriver session cleanly.
			// Always call quit() (not close()) so that all associated windows
			// and the driver process are fully terminated after the test.
			driver.quit();
		}


	}



package day9;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	/**
	 * This class demonstrates how to handle multiple browser windows or tabs in Selenium WebDriver.
	 *
	 * When a web application opens a new tab or window (for example, clicking a social media link),
	 * Selenium does NOT automatically switch to that new tab. You must do it manually using window handles.
	 *
	 * A window handle is a unique string identifier that Selenium assigns to each open browser window or tab.
	 * Think of it like a name tag — each tab gets its own tag so Selenium knows which one to talk to.
	 *
	 * Concept Overview:
	 * <ul>
	 *   <li>driver.getWindowHandle()  — returns the handle of the currently active window (single String)</li>
	 *   <li>driver.getWindowHandles() — returns handles of ALL open windows (a Set of Strings)</li>
	 *   <li>driver.switchTo().window(handle) — switches Selenium's focus to the specified window</li>
	 *   <li>driver.close() — closes only the currently active window, session remains alive</li>
	 *   <li>driver.quit()  — closes ALL windows and ends the WebDriver session completely</li>
	 * </ul>
	 *
	 * Approach used here:
	 * Since getWindowHandles() returns a Set (which has no index), this class converts the Set
	 * into a List so that individual windows can be accessed by their position (index).
	 * Index 0 is the parent window, index 1 is the newly opened tab.
	 */
	public class HandleWindow
	{

		/**
		 * Entry point of the program.
		 *
		 * Steps performed:
		 * <ul>
		 *   <li>Open the login page and type the email address</li>
		 *   <li>Save the parent window handle before clicking anything</li>
		 *   <li>Click the Facebook social link, which opens a new tab</li>
		 *   <li>Collect all window handles and convert the Set to a List for index-based access</li>
		 *   <li>Switch to the new tab (index 1), read its title, and click "Create new account"</li>
		 *   <li>Close the new tab with driver.close() — only this tab is closed</li>
		 *   <li>Switch back to the parent window using the saved handle and continue typing</li>
		 *   <li>End the entire session with driver.quit()</li>
		 * </ul>
		 *
		 * @param args command-line arguments (not used)
		 */
		public static void main(String[] args)
		{

			WebDriver driver=new ChromeDriver();

			driver.get("https://freelance-learn-automation.vercel.app/login");

			driver.findElement(By.id("email1")).sendKeys("admin@email.com");

			// Save the current (parent) window handle BEFORE a new tab opens.
			// This is important so we can come back to this tab later.
			String parentHandle=driver.getWindowHandle(); // String

			System.out.println("Primary Handle "+parentHandle);

			// Clicking the Facebook link opens a new tab. Selenium stays on the parent tab.
			driver.findElement(By.xpath("//div[@class='social']//a[contains(@href,'facebook')]")).click();

			// Selenium uses LinkedHashSet internally, so insertion order is preserved.
			// getWindowHandles() returns a Set<String> containing handles of all open tabs.
			Set<String> allWindowHandles=driver.getWindowHandles(); //Set of String

			// A Set does not support index-based access, so convert it to a List.
			List<String> list1=new ArrayList<String>();

			list1.addAll(allWindowHandles);

			// Index 0 = parent window, Index 1 = the newly opened Facebook tab
			String newTab=list1.get(1);

			// Switch Selenium's focus to the new tab
			driver.switchTo().window(newTab);

			String newTitle=driver.getTitle();

			System.out.println("Title of new tab "+newTitle);

			driver.findElement(By.xpath("//span[text()='Create new account']")).click();

			// driver.close() closes ONLY the currently active tab (the Facebook tab).
			// The WebDriver session is still alive and the parent tab is still open.
			driver.close() ;// current active tab - maintains session id

			// After closing the Facebook tab, switch focus back to the parent window.
			driver.switchTo().window(parentHandle);

			driver.findElement(By.id("password1")).sendKeys("admin@123");

			// driver.quit() closes ALL open browser windows and kills the WebDriver session.
			// After this call, the driver object becomes invalid (session id is null).
			driver.quit(); // close all active tabs/session and keep session id as null
			
		}}
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		



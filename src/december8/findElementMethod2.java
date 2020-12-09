package december8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementMethod2 {

	public static void main(String[] args) throws InterruptedException {
		
		// 1. Go to google.com
		// 2. Type "how to make money" into a search bar
		// 3. Verify that the title contains the search term
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\browserDrivers\\chromedriver.exe");
		
		
		
		WebDriver driver = new ChromeDriver(); //create a session and open a new browser
		
		// WebDriver and WebElement are Selenium Interfaces
		
		
		driver.get("https://www.duotech.io/"); // navigate to indicated url
		
		// findElement locates the first element on the html document even though there may be more than one element meeting the search criteria
		
		
		driver.findElement(By.className("link11")).click();
		

	}

}

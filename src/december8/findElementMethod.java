package december8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementMethod {

	public static void main(String[] args) throws InterruptedException {
		
		// 1. Go to google.com
		// 2. Type "how to make money" into a search bar
		// 3. Verify that the title contains the search term
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\browserDrivers\\chromedriver.exe");
		
		
		
		WebDriver driver = new ChromeDriver(); //create a session and open a new browser
		
		// WebDriver and WebElement are Selenium Interfaces
		
		
		driver.get("https://google.com/"); // navigate to indicated url
		
		// locate the search bar
		
		By inputElement = By.name("q");  // By is an abstract class with static methods to locate an element that return By object
		
		WebElement searchBox = driver.findElement(inputElement); // we located the element
		
	//	searchBox.sendKeys("How to make money?" + Keys.ENTER);
		
		searchBox.sendKeys("How to make money?");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("btnK")).click();
		
		
		String expectedResult = "How to make money?" ;
		
		String actualResult = driver.getTitle();
		
		if(actualResult.contains(expectedResult)) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
		

	}

}

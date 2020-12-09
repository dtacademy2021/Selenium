package december8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\browserDrivers\\chromedriver.exe");
		
		
		
		WebDriver driver = new ChromeDriver(); //create a session and open a new browser
		
		
		
		driver.get("https://aws.amazon.com/"); // navigate to indicated url
		
		
		driver.get("https://www.google.com/");
		
		driver.navigate().back();
		
	//	driver.navigate().to("https://twitter.com/");
		
		
//		driver.navigate().back();
//		
//		driver.navigate().forward();
//		
//		driver.navigate().refresh();
		
		// difference between get() and navigate().to() -> get() method refreshes and re-loads the whole page whereas navigate() methods do not
		
		
		//get waits until the whole page loaded, navigate to not
		
		//navigate maintains browser history and cookies whereas get method doesn't
		
		

	}

}

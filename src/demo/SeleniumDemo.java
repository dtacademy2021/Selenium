package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {

	public static void main(String[] args) {


//		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumFiles\\browserDrivers\\geckodriver.exe");
//		
//		
//		WebDriver firefoxdriver = new FirefoxDriver();
//		
//		
//		firefoxdriver.get("https://google.com");
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\browserDrivers\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumFiles\\browserDrivers\\geckodriver.exe");
		
		
		WebDriver driver = new ChromeDriver(); //create a session and open a new browser
		
		
		
		driver.get("https://www.duotech.io"); // navigate to indicated url
		
		
		driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.com");
		
		
		//Test case:
		
//		1. Go to amazon.com
//		2. Verify that the url is "https://www.amazon.com/"
		
		
		String expectedURL = "https://www.amazon.com/";
		
		String actualURL = driver.getCurrentUrl();
		
		if(actualURL.equals(expectedURL)) {
			System.out.println("TEST PASSED. THE URL: " + actualURL);
		}else {
			System.err.println("TEST FAILED. THE URL: " + actualURL);
		}
		
		
		String expectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		
		String actualTitle = driver.getTitle();
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("TEST PASSED. THE TITLE: " + actualTitle);
		}else {
			System.err.println("TEST FAILED. THE TITLE: " + actualTitle);
		}
		
		
		String expectedKeyword 	= "Hello, Sign In";
		
		
		String pageSource = driver.getPageSource();
		
		if(pageSource.contains(expectedKeyword)) {
			System.out.println("TEST PASSED.");
		}else {
			System.err.println("TEST FAILED.");
		}
		
		

	}

}

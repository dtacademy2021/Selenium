package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVSClose {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\browserDrivers\\chromedriver.exe");
		
		
		
		WebDriver driver = new ChromeDriver(); //create a session and open a new browser
		
		
		
		driver.get("https://aws.amazon.com/"); // navigate to indicated url
		
//		driver.findElement(By.xpath("//i[@class='icon-twitter']")).click();
		
		
		
		
	//	driver.close(); // closes the current window but does not end the session
		
		
		driver.quit();
		
		
		
		
		

	}

}

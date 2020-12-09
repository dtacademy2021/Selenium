package december8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\browserDrivers\\chromedriver.exe");
				
		WebDriver driver = new ChromeDriver(); 
				
		driver.get("https://cnn.com/");
		
		
		String text = driver.findElement(By.id("account-icon-button")).getText();
		
		System.out.println(text);
		
		
		driver.get("https://www.quora.com/");
		
		driver.findElement(By.name("email")).sendKeys("duotech@gmail.com");
		
		

	}

}

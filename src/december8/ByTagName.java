package december8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByTagName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\browserDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
				
		driver.get("https://cnn.com/");
		
		List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
		
		
		System.out.println(iframes.size());

	}

}

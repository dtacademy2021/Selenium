package december8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementsMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\browserDrivers\\chromedriver.exe");
		
		
		
		WebDriver driver = new ChromeDriver(); //create a session and open a new browser
		
		
		
		
		driver.get("https://www.duotech.io/");
		
		driver.findElement(By.tagName("a")).click();
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		System.out.println(allLinks.size());
		
		for (WebElement webElement : allLinks) {
			System.out.println(webElement.getText());
		}
		
		
		List<WebElement> allIframes = driver.findElements(By.tagName("iframe"));
		
		System.out.println(allIframes.size());
		
	}

}

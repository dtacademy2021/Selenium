package december29;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PageScrolling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\browserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("http://duotech.io");
		
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		a.sendKeys(Keys.DOWN, Keys.DOWN, Keys.PAGE_DOWN).build().perform();

	}

}

package december29;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutorInterface {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\browserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("http://duotech.io");
		
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		
		js.executeScript("window.scrollBy(0,1200)");
		
		
		WebElement learnMore = driver.findElement(By.xpath("//a[@href='/software-qa-engineer'][@class='button w-button']"));

		
		js.executeScript("arguments[0].click();", learnMore);
		
		
	}

}

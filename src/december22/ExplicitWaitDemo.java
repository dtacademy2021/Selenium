package december22;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ul[@id='slot-words-list']//li[.='Change']
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\browserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	
		
		
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		
		driver.findElement(By.xpath("//input[@label='blah']")).click();
		
		driver.findElement(By.xpath("//button[.='Remove']")).click();
		
		WebDriverWait explictWait = new WebDriverWait(driver, 2);
		
		explictWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[@id='message']")));
		
		System.out.println(driver.findElement(By.xpath("//p[@id='message']")).getText());
		
		// TimeoutException: Expected condition failed: waiting for presence of element located by: 
		//By.xpath: //p[@id='message'] (tried for 1 second(s) with 500 milliseconds interval)
		
		//Fluent wait syntax	
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(1))
				.ignoring(NoSuchElementException.class);
 		
		
			
	}

}

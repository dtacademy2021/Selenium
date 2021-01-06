package december29;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\browserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://api.jquery.com/dblclick/");
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
		
		Actions actions = new Actions(driver); // Actions class requires that you end the method chaining with 
		                                       // build().perform();
//		System.out.println(driver.findElement(By.tagName("div")).getCssValue("background-color"));
		
		actions.doubleClick(driver.findElement(By.tagName("div"))).build().perform();
		
//		System.out.println(driver.findElement(By.tagName("div")).getCssValue("background-color"));
		
		String expected = "rgba(255, 255, 0, 1)";
		
		
		if(driver.findElement(By.tagName("div")).getCssValue("background-color").equals(expected)) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}

	}

}

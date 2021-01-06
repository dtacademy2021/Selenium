package december29;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\browserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("http://amazon.com");
		
		WebElement account = driver.findElement(By.id("nav-link-accountList"));
		
		Actions a = new Actions(driver);
		a.moveToElement(account).build().perform();
		
		driver.findElement(By.linkText("Amazon Credit Cards")).click();
		

	}

}

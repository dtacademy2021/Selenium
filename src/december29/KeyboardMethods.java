package december29;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\browserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("http://google.com");
		
		WebElement searchbox = driver.findElement(By.name("q"));
		Actions a = new Actions(driver);
		a.keyDown(Keys.LEFT_SHIFT).
		sendKeys("sbtrkt").sendKeys(Keys.ENTER).keyUp(Keys.LEFT_SHIFT).build().perform();
		
		driver.navigate().back();
		
		a.sendKeys("ussr").build().perform();
		

	}

}

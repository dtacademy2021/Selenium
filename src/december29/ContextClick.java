package december29;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\browserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		
		WebElement button = driver.findElement(By.xpath("//span[.='right click me']"));
		
		Actions a = new Actions(driver);
		
		a.contextClick(button).sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER).build().perform();

		String expected = "clicked: copy";
		
		String actual = driver.switchTo().alert().getText();
		
		driver.switchTo().alert().accept();
		
		if(actual.equals(expected)) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
		
		
	}

}

package december22;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsVsWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\browserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://jorisvoorn.com/");
		
		driver.findElement(By.xpath("//a[@href='//facebook.com/jorisvoorndj']")).
		sendKeys(Keys.chord(Keys.LEFT_SHIFT, Keys.ENTER));
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		
		Iterator<String> iterator = windowHandles.iterator();
		
		iterator.next();
		
		driver.switchTo().window(iterator.next());
		
		System.out.println(driver.getCurrentUrl());
		
		//In selenium tabs and separate windows are treated as same
		
		
		
		
		

		

	}

}

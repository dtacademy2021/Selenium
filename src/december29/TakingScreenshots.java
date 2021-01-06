package december29;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingScreenshots {

	public static void main(String[] args) throws IOException {
		// http://duobank-env.eba-bgkwzq3h.us-east-2.elasticbeanstalk.com/
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\browserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://www.lexus.com/");
		
//		driver.findElement(By.id("exampleInputEmail1")).sendKeys("info@duotech.io");
//		driver.findElement(By.id("exampleInputPassword1")).sendKeys("dt123");
//		driver.findElement(By.name("login")).click();
		
		if(driver.getTitle().equals("Welcome Page")) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
			// TakesScreenshot interface is used to take a screenshot in Selenium
			File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot, new File("screenshots/screenshot.png"));
			
		}
		
		


	}

}

package december29;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\browserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://www.lexus.com/");
		
//		driver.manage().window().fullscreen();
		
		driver.manage().window().maximize();
		
		Dimension d = new Dimension(600, 600);
		
		driver.manage().window().setSize(d);
		
		
		
		
		

	}

}

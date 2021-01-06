package december29;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		// http://tinyupload.com/
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\browserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("http://tinyupload.com/");
		
		
		driver.findElement(By.name("uploaded_file")).sendKeys("C:\\Users\\Duotech\\Downloads\\picture.jpg");
		
		driver.findElement(By.xpath("//img[@alt='Upload']")).click();

	}

}

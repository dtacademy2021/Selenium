package december8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\browserDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
				
		driver.get("https://cnn.com/");
		
	//	driver.findElement(By.xpath("/html/body/div[5]/div/div/header/div/div[1]/div/div[2]/nav/ul/li[5]/a")).click();
		
		driver.findElement(By.xpath("//a[ @href='/opinions'][@class='sc-fjdhpX sc-chPdSV lcJwCV']")).click();
		
		
		
		

	}

}

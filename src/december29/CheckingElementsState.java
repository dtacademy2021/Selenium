package december29;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckingElementsState {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\browserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		
		driver.findElement(By.tagName("button")).click();
		
		WebElement helloWorld = driver.findElement(By.xpath("//h4[.='Hello World!']"));
		
		
		System.out.println(helloWorld.isDisplayed());
		
//		while(!helloWorld.isDisplayed()) {  // java mechanism to wait till the element is displayed
//			
//		}
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS); // change implicit wait back to 0
		
		//EXPLICIT WAIT
//		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(helloWorld));
		
		new WebDriverWait(driver, 10).until(ExpectedConditions.attributeToBe(
				driver.findElement(By.id("finish")), "style", ""));
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  // change implicit wait back to 10 after using explicit wait
		
		if(helloWorld.getText().equals("Hello World!")) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
		
		
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		
		
		driver.findElement(By.xpath("//button[.='Enable']")).click();
		
		WebElement inputBox = driver.findElement(By.xpath("//input[@type='text']"));
		
		
		System.out.println(inputBox.isEnabled());
		
//		while(! inputBox.isEnabled()) {
//			
//		}
		
		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(inputBox));
		
		System.out.println(inputBox.isEnabled());
		
		inputBox.sendKeys("Hello World!");
		
		
		
		
		

	}

}

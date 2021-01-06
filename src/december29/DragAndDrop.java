package december29;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// 
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\browserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://javascript.info/mouse-drag-and-drop");
		
		System.out.println(driver.manage().window().getSize());
		
		driver.manage().window().maximize();
		
		System.out.println(driver.manage().window().getSize());
		
		driver.switchTo().frame(driver.
				findElement(By.xpath("//iframe[@src='/article/mouse-drag-and-drop/ball4/']")));
		
		
		
		
		Actions a = new Actions(driver);
		
		WebElement source = driver.findElement(By.id("ball"));
		WebElement target = driver.findElement(By.id("gate"));
		
	//	a.dragAndDrop(source, target).build().perform();
		
		//MoveTargetOutOfBoundsException - when drag and drop offsets are beyond the window limit
		a.dragAndDropBy(source, 300, -150).build().perform();
		
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(
				driver.findElement(By.xpath("//iframe[@src='https://en.js.cx/task/slider/solution/']")));
		
		
		
		a.clickAndHold(driver.findElement(By.xpath("//div[@class='thumb']"))).moveByOffset(100, 0).release().build().perform();
		
		
		

	}

}

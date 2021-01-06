package december22;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeWarmUp {
	
	static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://jorisvoorn.com/");
		
		
	
		//	driver.findElement(By.xpath("//a[@href='//facebook.com/jorisvoorndj']")).click();
		
		
		driver.switchTo().frame(
				driver.findElement(By.xpath("//iframe[@src='//www.youtube.com/embed/7ddMvp1hjxs']")));
		

		
		System.out.println(driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button']")).isEnabled());
		
		
		driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button']")).
		sendKeys(Keys.ENTER);;
		
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[@href='https://JorisVoorn.lnk.to/fourWE']")).click();
		
		// In order to work with another window, we need to switch to that window using its window handle
		
		
		String parentWindowHandle = driver.getWindowHandle();// returns the current active window's handle
		
		System.out.println(parentWindowHandle);
		
		Set<String> windowHandles = driver.getWindowHandles(); // returns all open windows' handles
		
		System.out.println(windowHandles.getClass());
		
		System.out.println(windowHandles);
		
		
		for (String handle : windowHandles) {
			if(!handle.equals(parentWindowHandle)) {
				driver.switchTo().window(handle);
			}
		}

		String streamWindowHandle = driver.getWindowHandle();
		
		
		
		if(driver.getCurrentUrl().equals("https://jorisvoorn.lnk.to/fourWE")) {
			System.out.println(driver.getCurrentUrl());
			System.out.println("PASS");
		}else {
			
			System.out.println(driver.getCurrentUrl());
			System.out.println("FAIL");
		}
		
		
		
		driver.switchTo().window(parentWindowHandle);
		
		driver.findElement(By.xpath("//a[@href='https://jorisvoorn.lnk.to/storeWE']")).click();
		
		// get all window handles for 3 windows once more
		windowHandles = driver.getWindowHandles();
		
		System.out.println(windowHandles);
		
		for (String handle : windowHandles) {
			if(!handle.equals(parentWindowHandle) &&
			   !handle.equals(streamWindowHandle) 	) {
			
				driver.switchTo().window(handle);
			}
		}
		
		if(driver.getTitle().contains("Joris Voorn Official Online Store")) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
				
		
		
		// If you have multiple windows (more than 3) we could create a re-usable method that switches to
		// a window by its title (your titles of the windows have to be different)
		
		
		driver.findElement(By.xpath("//a[@href='https://www.facebook.com/jorisvoorndj/']")).click();
		
		switchToWindow("Joris Voorn - Home | Facebook");
		
		if(driver.getCurrentUrl().equals("https://www.facebook.com/jorisvoorndj/")) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
		
		switchToWindow("Joris Voorn - \\\\\\\\ (Four)");
		
		
		if(driver.getCurrentUrl().equals("https://jorisvoorn.com/")) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
		

	}
	
	
	
	public static void switchToWindow (String expectedTitle) {
		
		String current = driver.getWindowHandle();
		Set<String> allWindowhandles = driver.getWindowHandles();
		
		for (String handle : allWindowhandles) {
			driver.switchTo().window(handle);
			if(driver.getTitle().equals(expectedTitle)) {
				return;
			}
		}
		
		driver.switchTo().window(current);
		
		
	}

}

package december22;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ImplicitWaitDemo2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\browserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cargurus.com");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// usually implicit wait is set in the beginning of the script once.
		// The implicit wait will apply during the lifetime of the Webdriver object
		// It is applicable to all elements, that is it is a global setting
        
		driver.findElement(By.xpath("//label[@for='usedSearch-tab-2']/span")).click();

       
        WebElement price = driver.findElement(By.xpath("//form[@id='dealFinderFormPrice']//select[@aria-label='Minimum price']"));
        Select from = new Select(price);
        from.selectByValue("10000");
        new Select(driver.findElement(By.xpath("//form[@id='dealFinderFormPrice']//select[@aria-label='Maximum price']"))).selectByValue("20000");
        driver.findElement(By.xpath("//input[@id='dealFinderZipUsedId_dealFinderFormPrice']")).sendKeys("76051");
        driver.findElement(By.xpath("//input[@id='dealFinderFormPrice_0']")).click();

        driver.findElement(By.id("maxMileage")).sendKeys("30000" + Keys.ENTER);

        WebElement coupe = driver.findElement(By.cssSelector("label[for='BODY_TYPE_GROUP-0']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);", coupe);
        coupe.click();

        WebElement great = driver.findElement(By.cssSelector("label[for='DEAL_RATING-GREAT_PRICE']"));
        js.executeScript("arguments[0].scrollIntoView(true);", great);
        great.click();

        List<WebElement> results = driver.findElements(By.cssSelector("div[data-cg-ft='srp-listing-blade-title']"));
        WebElement search = driver.findElement(By.xpath("//div[@class='_2jqs6z']/button[@type='submit']"));
        js.executeScript("arguments[0].scrollIntoView(true);", search);
        
        
//        for(WebElement w:results) {
//            System.out.println(w.getText());
//        }
        
        
        
    }
private static void smartWait(int time) {
    
    try {Thread.sleep(time);}
    catch(Exception e) {}
}

	

}

package december10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExpressionSyntax {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\browserDrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.quora.com/");
		
		
		driver.findElement(By.cssSelector("input[id^='__w2_w'][id$='20_email']")).sendKeys("dt@gmail.com");
		
		
		//div[@id='searchInput-div']//input[@class='form-control ng-tns-c31-0 ng-star-inserted']
		
		
		
		//input[@type='search'][@placeholder='Job title, skills or company'] -> Combine multiple attributes
		
		//img[@alt] -> Find all img's with alt attribute
		
		//p[.='Set your tech career in motion with Dice'] -> Exact text match
		
		//p[contains(  text() , 'tech career in'  )] -> Partial text match
		
		
		////a[@href='https://techhub.dice.com/2017-contact-us.html']/ancestor::li -> find the first ancestor of "a" that is "li"
		
		
		////li[@data-analytics-parent='For Employers']/following-sibling::li -> find the first "li" sibling of unique "li"
		

	}

}

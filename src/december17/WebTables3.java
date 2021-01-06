package december17;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebTables3 {

	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\browserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.bloomberg.com/markets/stocks");
//
//rgba(255, 225, 225, 1)
		int noOfRows = driver.findElements(By.xpath("(//table[@class='data-table'])[2]//tbody//tr")).size();
		
		boolean isCorrectColor = false;
		
		for (int i = 1; i <= noOfRows; i++) {
			
			WebElement cell = driver.findElement(By.xpath("(//table[@class='data-table'])[2]//tbody//tr["+i+"]//td[2]//span"));
			System.out.println(cell.getCssValue("background-color"));
			if(
					(cell.getText().charAt(0)== '-' && cell.getCssValue("background-color").equals("rgba(255, 225, 225, 1)") || 
			        (Double.parseDouble(cell.getText()) > 0 && cell.getCssValue("background-color").equals("rgba(255, 225, 225, 1)")))	
				) {
				    
				        isCorrectColor = true;
					
					}
				
			}
		
		if(isCorrectColor) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
			
		}
	
	
	   // Find the stock exchange name with the largest net change
		

	

}

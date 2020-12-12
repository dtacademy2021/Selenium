package december12;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {
		// https://www.cars.com/
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\browserDrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		
	
		
		driver.get("https://www.cars.com");
		
		
		
		WebElement usedCarDropdownBox = driver.findElement(By.name("stockType"));
		
		Select usedCars = new Select(usedCarDropdownBox);
		
		usedCars.selectByVisibleText("Used Cars");
		
		usedCars.selectByValue("28444");
		
		usedCars.selectByIndex(1);
		
		
		List<String> expectedOptions = Arrays.asList("New & Used Cars",
														"New Cars",
														"Used Cars",
														"Certified Cars");
		
		List<WebElement> options = usedCars.getOptions();
		
		
		boolean pass = true;
		
		for (int i = 0; i < options.size(); i++) {
			
			if(!options.get(i).getText().equals(expectedOptions.get(i))) {
				pass = false;
			}
			
		}
		
		if(pass) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
		
		
		List<WebElement> allSelectedOptions = usedCars.getAllSelectedOptions();
		
		
		for (WebElement webElement : allSelectedOptions) {
			System.out.println(webElement.getText());
		}
		

		WebElement option = usedCars.getFirstSelectedOption();
		
		System.out.println(option.getText());
		
		System.out.println(usedCars.isMultiple());
		
		
		
		
		
 
	}

}

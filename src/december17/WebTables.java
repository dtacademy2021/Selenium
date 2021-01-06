package december17;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebTables {

	public static String randomStr() {
		String str = "";
		for (int i = 0; i < 5; i++) {
			str += (char) ((int) (Math.random() * 26 + 65));
		}
		return str;
	}

	public static int randomNo() {
		int num = (int) (Math.random() * 3 + 1);
		return num;

	}

	public static String randomZip() {
		String empty = "";
		for (int i = 0; i < 5; i++) {
			empty += (int) (Math.random() * 9 + 1);
		}
		return empty;
	}

	public static String randomQuantity() {
		String empty = "";
		int quantity = (int) (Math.random() * 100 + 1);
		return empty + quantity;
	}

	public static String randomVisa() {
		String empty = "4";
		for (int i = 0; i < 15; i++) {
			empty += (int) (Math.random() * 10);
		}
		return empty;
	}

	public static String randomMaster() {
		String empty = "5";
		for (int i = 0; i < 15; i++) {
			empty += (int) (Math.random() * 10);
		}
		return empty;
	}

	public static String randomAmex() {
		String empty = "3";
		for (int i = 0; i < 14; i++) {
			empty += (int) (Math.random() * 10);
		}
		return empty;
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\browserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_username\"]")).sendKeys("Tester");
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_password\"]")).sendKeys("test");
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_login_button\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ctl00_menu\"]/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtQuantity\"]")).sendKeys(randomQuantity());
		String name = "John" + randomStr() + "Doe";
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtName\"]")).sendKeys(name);
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox2\"]"))
				.sendKeys("8607 Westwood Center Dr");
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox3\"]")).sendKeys("Vienna");
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox4\"]")).sendKeys("Virginia");

		String zip = randomZip();

		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox5\"]")).sendKeys(zip);

		WebElement visa = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_cardList_0\"]"));
		WebElement master = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_cardList_1\"]"));
		WebElement amex = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_cardList_2\"]"));

		if (randomNo() == 1) {
			visa.click();
		} else if (randomNo() == 2) {
			master.click();
		} else {
			amex.click();
		}

		WebElement cardNo = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox6\"]"));

		if (randomNo() == 1) {
			cardNo.sendKeys(randomVisa());
		} else if (randomNo() == 2) {
			cardNo.sendKeys(randomMaster());
		} else {
			cardNo.sendKeys(randomAmex());
		}

		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox1\"]")).sendKeys("01/21");
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_InsertButton\"]")).click();

		if (driver.getPageSource().contains("New order has been successfully added")) {
			System.out.println("TEST PASSED");
		} else
			System.out.println("TEST FAILED");

		driver.findElement(By.xpath("//a[@href='Default.aspx']")).click();

		List<WebElement> ths = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr[1]//th"));

		int indexOfName = -1;
		int indexOfZip = -1;

		for (int i = 0; i < ths.size(); i++) {

			if (ths.get(i).getText().equals("Name")) {

				indexOfName = i + 1;
			}

			if (ths.get(i).getText().equals("Zip")) {

				indexOfZip = i + 1;
			}

		}

		
		
		String xpathName = "//table[@id='ctl00_MainContent_orderGrid']//tr[2]//td["+indexOfName+"]";
		
		String actualName = driver.findElement(By.xpath(xpathName))
				.getText();

		if (actualName.equals(name)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		
		
		
		String xpathZip = "//table[@id='ctl00_MainContent_orderGrid']//tr[2]//td["+ indexOfZip +"]";
		
		String actualZip = driver.findElement(By.xpath(xpathZip))
				.getText();

		if (actualZip.equals(zip)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

	}

}

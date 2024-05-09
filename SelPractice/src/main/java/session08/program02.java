package session08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class program02 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");

		By countryDrop = By.id("Form_getForm_Country");
		doSelectDropdownByIndex(countryDrop, 5);
		Thread.sleep(2000);
		doSelectDropdownByValue(countryDrop,"Bermuda");
		Thread.sleep(2000);
		doSelectDropdownByText(countryDrop,"India");
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSelectDropdownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	public static void doSelectDropdownByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	public static void doSelectDropdownByText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	
}

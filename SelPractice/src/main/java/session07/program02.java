package session07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class program02 {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		By fn = By.name("firstname");
		String attr = getElementAttribute(fn, "placeholder");
		System.out.println(attr);
		driver.quit();
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static String getElementAttribute(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);

	}

}

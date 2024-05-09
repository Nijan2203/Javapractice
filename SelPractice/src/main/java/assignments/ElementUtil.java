package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	private WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}
	
	public  WebElement getElement(By locator) {

		return driver.findElement(locator);
	}

	public  void doSendkeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public  void doClick(By locator) {
		getElement(locator).click();
	}

	public  String doElementGetText(By locator) {
		return getElement(locator).getText();
	}

	public boolean doElementIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
		
	}


}

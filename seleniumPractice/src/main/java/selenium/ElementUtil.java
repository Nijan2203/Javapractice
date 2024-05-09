package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {

	WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public List<WebElement> getElements(By locator) {
		List<WebElement> getelms = driver.findElements(locator);
		System.out.println(getelms.size());
		return getelms;
	}

	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public void doclick(By locator) {
		getElement(locator).click();
	}

	public void doselect(By locator, String value) {
		Select dropdowm = new Select(getElement(locator));
		dropdowm.selectByVisibleText(value);
	}
	
	
	public String getElementText(By locator) {
		String txt = getElement(locator).getText();
		System.out.println(txt);
		return txt;
	}
	
	public void navigatebwd() {
		driver.navigate().back();
	}

	public void navigatefwd() {
		driver.navigate().forward();
	}
	
	public void refresh() {
		driver.navigate().refresh();
	}

}

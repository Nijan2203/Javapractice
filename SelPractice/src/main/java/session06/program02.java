package session06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program02 {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		By logoImg = By.className("img-responsive");
		By search = By.name("search");
		By searchIcon=By.cssSelector("#search > span > button");
		
		if(doElementIsDisplayed(logoImg)) {
		
			System.out.println("Image is present");
		}

		if(doElementIsDisplayed(search)) {
			System.out.println("Search is present");
			
			doSendkeys(search,"macbook");
			doClick(searchIcon);
		}
	}

	public static WebElement getElement(By locator) {

		return driver.findElement(locator);
	}

	public static boolean doElementIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
		
	}

	public static void doSendkeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	public static void doClick(By locator) {
		 getElement(locator).click();
		
	}

}

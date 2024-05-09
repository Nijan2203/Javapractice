package session04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program01 {

	static WebDriver driver;

	public static void main(String[] args) {
		// create a web element and then perform action(isDisplayed,sendkeys,click etc)

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// 1. id
		// 1st way
		driver.findElement(By.id("input-email")).sendKeys("surajjha.virat@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Surajjha@123");

		// 2nd way - reusability of code
		WebElement email = driver.findElement(By.id("input-email"));
		WebElement password = driver.findElement(By.id("input-password"));

		email.sendKeys("surajjha.virat@gmail.com");
		password.sendKeys("Surajjha@123");

		// 3rd: by locator
		By emailID = By.id("input-email");
		By pwd = By.id("input-password");

		WebElement eID = driver.findElement(emailID);
		WebElement epwd = driver.findElement(pwd);

		eID.sendKeys("surajjha.virat@gmail.com");
		epwd.sendKeys("Surajjha@123");
		
		//4th: By locator + generic method for web element
		
		By emailID1 = By.id("input-email");
		By pwd1 = By.id("input-password");
		
		getElement(emailID1).sendKeys("surajjha.virat@gmail.com");
		getElement(pwd1).sendKeys("Surajjha@123");
		
		//5th: By locator + generic method with action
		
		By emailID2 = By.id("input-email");
		By pwd2 = By.id("input-password");
		doSendKeys(emailID2,"surajjha.virat@gmail.com");
		doSendKeys(pwd2,"Surajjha@123");

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
}

/*

driver.findElement will hit the server

So in 2nd approach, we are hitting the server all the time
but in 3rd approach . we are hitting the server only when required
here 1st we are declaring all the web elements and then if required we are hitting the server.
but in 2nd approcah , we are hitting the server for declaring web elements

SO "By" locator approch is preferrable because the advantage of By locator is we are not hitting the server unnecessary
*/

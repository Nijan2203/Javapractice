package session32;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program02 {

	public static void main(String[] args) {
		// staleElementReferenceException handling

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		WebElement emailID = driver.findElement(By.id("input-email"));
		emailID.sendKeys("surajjha.virat@gmail.com");

		driver.navigate().refresh();
		emailID.sendKeys("suraj@123");

	}

}

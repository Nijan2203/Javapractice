package session07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program01 {

	static WebDriver driver;

	public static void main(String[] args) {
		// get attribute

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		String placeHolder = driver.findElement(By.name("firstname")).getAttribute("placeholder");
		System.out.println(placeHolder);
	}

}

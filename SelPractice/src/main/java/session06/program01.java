package session06;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;


public class program01 {

	static WebDriver driver;
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		boolean flagImg=driver.findElement(By.className("img-responsive")).isDisplayed();	// to check className is unique then search with ".img-responsive"
		if (flagImg) System.out.println("PASS");
		
		boolean flagSearch=driver.findElement(By.name("search")).isDisplayed();
		if (flagSearch) 
			{
			System.out.println("PASS");
			driver.findElement(By.name("search")).sendKeys("macbook");
	}
	}
}

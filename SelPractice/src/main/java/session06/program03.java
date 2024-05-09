package session06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program03 {

	static WebDriver driver;
	
	public static void main(String[] args) {
		// element not present
		driver =new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By logoImg = By.className("img-responsive1"); // deliberately making mistake
		By search = By.name("search");
		boolean flagImg=driver.findElement(logoImg).isDisplayed();
		// noSuchElementElement . exception is thrown by "findElement" method
		System.out.println(flagImg);

	}

}

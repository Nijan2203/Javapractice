package session07;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program06 {

	static WebDriver driver;

	public static void main(String[] args) {
// get elements from section

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		List<WebElement> rightPanelLinks = driver.findElements(By.xpath("//aside[@id='column-right']//a"));
		System.out.println(rightPanelLinks.size());

		for (WebElement e : rightPanelLinks) {

			String txt = e.getText();
			System.out.println(txt);
		}
		driver.quit();

	}

}

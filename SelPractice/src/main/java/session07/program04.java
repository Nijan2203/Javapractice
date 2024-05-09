package session07;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program04 {

	static WebDriver driver;
	
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		By linkTag=By.tagName("a");
		By imgTag=By.tagName("img");
		
		getElementAttributes(imgTag, "src");
		getElementAttributes(linkTag, "href");

	}
	
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static void getElementAttributes(By locator, String attrName) {
		
		List<WebElement> list=getElements(locator);
		for(WebElement e: list) {
			String val=e.getAttribute(attrName);
			System.out.println(val);
		}
		
	}

}

package session07;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program03 {

	static WebDriver driver;

	public static void main(String[] args) {
// links attribute
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		By linkTag=By.tagName("a");
		By imgTag=By.tagName("img");
		List<WebElement> linkList=getElements(linkTag);
		System.out.println(linkList.size());
		for(WebElement e:linkList) {
			String href=e.getAttribute("href");
			String text=e.getText();
			System.out.println(href+"::::::"+text);
		}
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

}

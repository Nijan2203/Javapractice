package session07;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program05 {

	static WebDriver driver;
	
	public static void main(String[] args) {
	
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		By linkTag=By.tagName("a");
	
		getTotalElementsCount(linkTag);		

	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	public static void getTotalElementsCount(By locator) {
		int eleCount=getElements(locator).size();
		System.out.println("total elements for:"+locator+"--->"+eleCount);
	}

}

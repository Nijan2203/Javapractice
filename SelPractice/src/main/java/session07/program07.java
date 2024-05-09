package session07;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program07 {

	static WebDriver driver;
	
	public static void main(String[] args) {
	
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By rightColumn=By.xpath("//aside[@id='column-right']//a"); // single slash for direct and double slash for indirect

		
		List<String> rightEleList=getElementTextList(rightColumn);
		System.out.println(rightEleList);
		driver.quit();
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static ArrayList<String> getElementTextList(By locator) {
		
		ArrayList<String> ar=new ArrayList<String>();
		
		List<WebElement> eleList=getElements(locator);
		for(WebElement e:eleList) {
			String text=e.getText();
			ar.add(text);
		}
		return ar;
		
	}
}

package session09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class program02 {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// capture links of footer
		
		driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		
		List<WebElement> footerList=driver.findElements(By.xpath("//div[@class='KxwPGc SSwjIe']/div/a"));
		System.out.println(footerList.size());
		
		List<WebElement> footerLeftList=driver.findElements(By.xpath("//div[@class='KxwPGc AghGtd']/a"));
		System.out.println(footerLeftList.size());
		
		List<WebElement> footerRightList=driver.findElements(By.xpath("//div[@class='KxwPGc iTjxkf']/a"));
		System.out.println(footerRightList.size());
		
		
	}

}

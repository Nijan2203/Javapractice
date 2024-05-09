package session09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class program04 {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		
		By googleSuggestLocator=By.xpath("//div[@class='wM6W7d']/span");
		doSearch(googleSuggestLocator,"naveen automation labs selenium");
	}
	
	public static void doSearch(By sugListLocator, String name) {
		List<WebElement> options2=driver.findElements(sugListLocator); 
		System.out.println(options2.size());
		
		for(WebElement e:options2) {
			String list=e.getText();
			System.out.println(list);
			if(list.contains(name)) {
				e.click();
				break;
			}
			
		}
	}
	
	

}

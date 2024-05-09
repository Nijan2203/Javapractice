package session09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class program01 {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		
		List<WebElement> langList=driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		System.out.println(langList.size());
		
		for(WebElement e:langList) {
			String list=e.getText();
			System.out.println(list);
			if(list.equals("मराठी")) {
				e.click();
				break;
			}
		}
		
	}

}

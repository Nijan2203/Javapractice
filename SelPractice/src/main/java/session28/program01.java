package session28;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class program01 {

	public static void main(String[] args) {
		
		// monkey testing: Scenario: randomly click the click
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		List<WebElement> footer=driver.findElements(By.cssSelector("div.navFooterVerticalRow li a"));
		
		int footerCount=footer.size();
		System.out.println("Total footer link count:"+footerCount);
		
		for(int i=0;i<footerCount-1;i++) {
			int randomIndex=(int) Math.floor(Math.random() * footerCount);
			System.out.println(randomIndex);
			WebElement e=footer.get(randomIndex);
			System.out.println(e.getText());
			e.click();
			driver.navigate().back();
			footer=driver.findElements(By.cssSelector("div.navFooterVerticalRow li a"));
			
		}
		

	}

}

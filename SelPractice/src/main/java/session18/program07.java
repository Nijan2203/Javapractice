package session18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class program07 {

	public static void main(String[] args) throws InterruptedException {
		// handling StaleElementRefException
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		Thread.sleep(10000);
		List<WebElement> list=driver.findElements(By.xpath("(//nav[@class='sc-662dedcb-0 fMAcTI']/div)[3]/ul/li"));
		
		for(int i=0;i<list.size();i++) {
			list.get(i).click();
			list=driver.findElements(By.xpath("(//nav[@class='sc-662dedcb-0 fMAcTI']/div)[3]/ul/li"));
		}
	}

}

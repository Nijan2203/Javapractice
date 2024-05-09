package session09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class program03 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Naveen automation labs");
		Thread.sleep(3000);
		
		List<WebElement> options=driver.findElements(By.xpath("//li[@role='presentation']//span"));
		System.out.println(options.size());
		// gives wrong answer
		
		List<WebElement> options1=driver.findElements(By.xpath("//li[@role='presentation']//div[@class='wM6W7d']/span"));
		System.out.println(options1.size());
		
		List<WebElement> options2=driver.findElements(By.xpath("//div[@class='wM6W7d']/span")); // alternate
		System.out.println(options2.size());
		
		for(WebElement e:options2) {
			String list=e.getText();
			if(list.length()>0) // to not print empty suggestions
			System.out.println(list);
			if(list.contains("naveen automation labs selenium")) {
				e.click();
				break;
			}
			
		}
		System.out.println("=======================");

	}

}

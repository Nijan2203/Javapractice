package session19;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class program03 {

	public static void main(String[] args) {
		// right click or Context click or context menu
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

		WebElement ele=driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act=new Actions(driver);
		act.contextClick(ele).build().perform();
		
	List<WebElement> rightContext=driver.findElements(By.cssSelector("ul.context-menu-list span"));
	System.out.println(rightContext.size());
	
	for(WebElement e:rightContext) {
		String list=e.getText();
		System.out.println(list);
		
		if(list.equals("Copy")) {
			e.click();
			Alert alert=driver.switchTo().alert();
			System.out.println(alert.getText());
			alert.accept();
		}
	}
	
	}

}

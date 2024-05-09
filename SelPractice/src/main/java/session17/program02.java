package session17;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class program02 {

	public static void main(String[] args) throws InterruptedException {
		// svg element : scaler vector graph . specially design for diagram purchage
		
/*
 Q1: to find total svg
 //*[local-name()='svg']
  
  //*[local-name()='svg' and @width='175']
  
  
  */
 		WebDriver driver=new ChromeDriver();
 		driver.get("https://petdiseasealerts.org/alerts-map/#/");
 		Thread.sleep(5000);
 		
 		List<WebElement> list=driver.findElements(By.xpath("//*[local-name()='svg' and @id='map-svg']/*[name()='g' and @id='features']/*[name()='g' and @id='states']//*[name()='path']"));
 		System.out.println(list.size());
 		
 		for(WebElement e:list) {
 			String states=e.getAttribute("name");
 			System.out.println(states);
 		}
 		
	}

}
